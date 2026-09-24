package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 32);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############ih!ih###################################", "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 100);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("###############################################", strArray5, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, ' ');
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                    ", strArray16, strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("HHHHHHHHHHHHHHHHHH", strArray9, strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "############", "", "", "", "", "###################################" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "###############################################" + "'", str10, "###############################################");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "############aaaaa###################################" + "'", str12, "############aaaaa###################################");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                    " + "'", str22, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HHHHHHHHHHHHHHHHHH" + "'", str23, "HHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "IH!IHIH!IHIH!IHIHIH!IHIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IHIH!IHIHIH!IHIH!IH                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H", "......!ih!ih!ih!ih!ih!ih!ih", "  #############################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        char[] charArray10 = new char[] { 'a', '#', '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           HI!HI            ..", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI" + "'", str2, "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI");
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("###########HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########HI!" + "'", str1, "###########HI!");
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!HI!HIHI!HIH################################HI", "                                            HI!HI!HI!AA", (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                            HI!HI!HI!AA" + "'", str4, "                                            HI!HI!HI!AA");
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("......!IH!IH!IH!IH!IH!IH!IH", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "###############################################HI#!#HI#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...4444444444444444 hI!HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "4444444444444444", " ", "h", "I", "!", "HI" });
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaa" });
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!hi!hi!aa", "                     I  I                   ", "!  !              hi   hI!HIhI!HIh                 !  !  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H !hi!hi!aa" + "'", str3, "H !hi!hi!aa");
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("##############444hi!4444     ##############", "HI#HI      4444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444             #I#HI      #IH#IH4444444444444444444444444444444444444444444444   ##HI#HI                           #I#HI           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 17 + "'", int2 == 17);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444!ih444                                                                                  ", "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                    ", strArray5, strArray10);
        java.lang.String[] strArray13 = null;
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, "");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray13, strArray15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   ", strArray5, strArray15);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                    " + "'", str11, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                    " + "'", str17, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "H" + "'", str18, "H");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "   " + "'", str19, "   ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi! HI!HI                           hI!HI            hiHI!HI       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       IH!IHih            IH!Ih                           IH!IH !ih" + "'", str1, "       IH!IHih            IH!Ih                           IH!IH !ih");
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hiHI!HI                           hI!HI             ", "###################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hiHI!HI                           hI!HI             " });
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!", "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "h################################ hi#hi hi#hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h################################ hi#hi hi#hi" + "'", str1, "h################################ hi#hi hi#hi");
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI   Hi!hiHi!hiH    ", "I!HI                           HI!HI            HIHI!HI                           HI!H..", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("I!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "I!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("IH!IH##########Hi!hiHi!hiH##################################################", "                       4#############################################4hi4!4hi4                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH##########Hi!hiHi!hiH##################################################" + "'", str2, "IH!IH##########Hi!hiHi!hiH##################################################");
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "HI!HIHI!HIH################################", "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa#hi!hi#hihihi#haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi#h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#" + "'", str1, "hi#");
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "I                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i                    " + "'", str1, "i                    ");
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI                           HI!HI                           H################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI                           H################################" + "'", str1, "HI!HI                           HI!HI                           H################################");
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################" + "'", str2, "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!hi!hihi!hih################################hi", "!hi!hi                           Hi!hi            HIhi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!hi!hihi!hih################################hi4!", "I!HI                           hI!HI                           h################################", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                             !ihIH!Ih                                            !i", "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             !ihIH!Ih                                            !i" + "'", str2, "                                             !ihIH!Ih                                            !i");
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "ih!ih##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##", "                                    Hi                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##" + "'", str2, "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##");
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("####################################################################################################", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH            HI!HI", "4 4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#################################hi!                               #################################", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       ih!iH                           ih!ih", "                44HI!HI!4444HI!HI!4444HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       ih!iH                           ih!ih" + "'", str2, "       ih!iH                           ih!ih");
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                         HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  " + "'", str2, "                                                                                  ");
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hI#HHI   Hi!hiHi!hi", "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi", 132);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!                                                                                                 ", "                               ##################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#hi!hi#hihihi#");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#", "hi", "!", "hi", "#", "hihihi", "#" });
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444" + "'", str1, "444444444444444444444444");
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                               ", "                                                                                                                                         ", 865, 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                        " + "'", str4, "                                                                                                                                                                                        ");
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         H         H         H         H        HI!         H         H         H         H         ", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H        HI!         H         H         H         H         " + "'", str2, "         H        HI!         H         H         H         H         ");
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("ih!iH                           ih!ihIH            ih!iH                           ih!ih", "ihHI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                              ", "hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!HI!HI!HI!hi!HI!444hi!4444     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                              " });
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray16 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence5, charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444hi!4444     ", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaahI   Hi!hiHi!hiH               Hiaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################", "ihih ihih hi!hihi!hih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################" + "'", str2, "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!HIHI!HIH################################    ", "############444HI!4444     ###############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI             Hi!hi   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                          ...", "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hihi!hih################################                                                   A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                  ", "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ", 236);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hih!ihih!ih############################### hi#hi hi#hi", 248, "HI!HI                           HI!HI            ..##################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hih!ihih!ih############################### hi#hi hi#hiHI!HI                           HI!HI            ..###############################################################################################################################################" + "'", str3, "hih!ihih!ih############################### hi#hi hi#hiHI!HI                           HI!HI            ..###############################################################################################################################################");
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("iHi!hiH################################!HI#####4444444444444444444444444h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iHi!hiH################################!HI#####4444444444444444444444444h" + "'", str1, "iHi!hiH################################!HI#####4444444444444444444444444h");
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                   4444444                   4444444", "...             hI!HI            hiHI!HI    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444hi!4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Ih!iH                           ih!ihIH            ih!iH                        ...", "!                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                        ..." + "'", str2, "Ih!iH                           ih!ihIH            ih!iH                        ...");
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH" + "'", str2, "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("      HI!HI#################################hi!hi                        ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HI#################################hi!hi" });
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                               ", "!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!Haaaaaaa                         aaaaaaa     HI!H", "4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!Haaaaaaa                         aaaaaaa     HI!H", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!Haaaaaaa                         aaaaaaa     HI!H" + "'", str2, "HI!Haaaaaaa                         aaaaaaa     HI!H");
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                             I!HIhI!HIh################################                                                                                                              ", "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 0, 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("###################4444!ih444##############", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH", 237);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH                                                                                                    " + "'", str2, "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH                                                                                                    ");
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!         H         H         H         H         ", "###############################################hi#!#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!         H         H         H         H         " + "'", str2, "!         H         H         H         H         ");
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("h################################ Hi!hi h                                                                                              hi!hihi!hih################################                                                                                                   ", "Hi!hiHi!hiH#########################    #HI   Hi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "h#################################hi#hi#hi#hi", (java.lang.CharSequence) "  4444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "ih                       ih##################################ih                       ih##################################ih                       ih###############################hI                       HI                                         ih                       ih##################################ih                       ih##################################ih                       ih###############################", (-1), 78);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih                       ih##################################ih                       ih##################################ih                       ih###############################hI                       HI                                         ih                       ih##################################ih                       ih##################################ih                       ih###############################" + "'", str4, "ih                       ih##################################ih                       ih##################################ih                       ih###############################hI                       HI                                         ih                       ih##################################ih                       ih##################################ih                       ih###############################");
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                       A#############################################AHIA!AHIA                        ", "                                      ", 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  " + "'", str3, "                                                  ");
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                         !i!i", "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH", "hI   Hi!hiHi!hiH               Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hiHi!hiH#########################    #HI   Hi!hiHi!hiH", "hi!4444     ##############444hi!4444     ############################444hi!4444     ################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                                                                                                                                                             !hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hiHI!HI                           hI!HI", "                                                 !HIhI!HIh");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("ihHI!HI                           hI!HI            hiHI!HI                           hI!HI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hiHI!HI                           hI!HI" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############", 260);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray8, strArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("I!    ", strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach(" ", strArray2, strArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " " + "'", str12, " ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " " + "'", str14, " ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HI##########!##########HI##########!##########HI##########!##########HI" + "'", str17, "HI##########!##########HI##########!##########HI##########!##########HI");
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hihhihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hihhih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##############     4444!IH444##############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############444HI!4444     ##############" + "'", str1, "##############444HI!4444     ##############");
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi!4444", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "############ih!ih###################################", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "IH!IH#############################################", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("          i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!" + "'", str2, "          i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!");
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("I!HI   ", 41, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 I!HI                    " + "'", str3, "                 I!HI                    ");
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("HI!HI", "#############################################hi!hi");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!", strArray5, strArray9);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray22, strArray25);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray17, strArray22);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray30);
        java.lang.String str35 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray30, '#', (int) (short) 10, 5);
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                                                                                 ", strArray22, strArray30);
        boolean boolean37 = org.apache.commons.lang3.StringUtils.startsWithAny("                       #############################################hi!hi                        ", strArray22);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray9, strArray22);
        java.lang.String[] strArray40 = org.apache.commons.lang3.StringUtils.stripAll(strArray22, "H################################ hi#hi hi#hi");
        int int41 = org.apache.commons.lang3.StringUtils.indexOfAny("############################################################################################################################################################################################################################################", strArray40);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!hi!" + "'", str10, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " " + "'", str26, " ");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!                                " + "'", str27, "hi!                                ");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!                                                                                                 " + "'", str36, "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + " " + "'", str38, " ");
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertArrayEquals(strArray40, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!i!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!i!i!" + "'", str1, "!i!i!i!");
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444!hi!h444444444444444444444444444hi!h4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!hi!h444444444444444444444444444hi!h4444444444" + "'", str1, "444!hi!h444444444444444444444444444hi!h4444444444");
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi", "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("HhI!HI             ", strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str5, "########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI" + "'", str1, "HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI");
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#########################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################" + "'", str1, "#########################################");
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", 55, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!" + "'", str3, "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "!I", 30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                 444!   ", "        HI!         H         H         H         H");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hiaaaaaaaaaaaaaaaa", "hI!HI                           HI!HI            ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hiaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                           4            4                           ", "                         !i!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH", "       4444444444HI!HI!...        ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                       4#############################################4hi4!4hi4                        ", 33, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       4#############################################4hi4!4hi4                        " + "'", str3, "                       4#############################################4hi4!4hi4                        ");
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hI!HI                           hI!HI             hiHI!HIHI!HIH44444444444444444444444444444444H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HI                           HI!HI            HIHI!HI hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH            HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI            HIHI!HI hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH            HI!H" + "'", str1, "HI!HI                           HI!HI            HIHI!HI hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH            HI!H");
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444!   hi!hihi!hih###" + "'", str3, "44444444444444!   hi!hihi!hih###");
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 88, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("h    h    h    h    h    h                                             h    h    h    h    h    h   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h    h    h    h    h    h                                             h    h    h    h    h    h   " + "'", str1, "h    h    h    h    h    h                                             h    h    h    h    h    h   ");
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hi                           hi!hi            hihi!hi                           hi!hi           ", "HI!hi!hi!aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("###hiHI!HI###########################hI!HI##########", "aaaaaaaaaaaaaaaaaaaaHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHIHaaaaaaaaaaaaaaaaaaaaa", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI ", (java.lang.CharSequence) "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!h", "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                       #############################################", "H################################ hi#hi hi#hi", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("................AA", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                       hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444", "             HI   Hi!hiHi!hiH                 ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!hi!hi                           Hi!hi            HIhi!hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("     4444444444444444444444444444444444444444444444 Hi!hi                           ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("H  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("            HIHI!HI                          ", "ih!ihih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("i!HI                           hI!HI            hiHI!HI                           hI!H...", "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!HI                           hI!HI            hiHI!HI                           hI!H..." + "'", str2, "i!HI                           hI!HI            hiHI!HI                           hI!H...");
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!hi                           hi!hi       ...", "hi!hi                           hi!hi                           h################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("################################...######################################################             ih!ihIH            ih!iH                           ih!ih!HIHI!HI", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hI#HHI   Hi!hiHi!hiH################################", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#####################hi#!#hi", "h         h         h         h        hi!         h         h         h         h", "############444HI!4444     ###########################44HI#HI                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################hi#!#hi" + "'", str3, "#####################hi#!#hi");
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############################################################################################################################################################################################################################################", "444!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("#########                                              hI!HIhI!HIh################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("             hi   hI!HIhI!HIh                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        char[] charArray12 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "          ", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI   Hi!hiHi!hiH################################      hiHI!HI          ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i", (int) (byte) 1, 324);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i" + "'", str3, "I!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i");
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                             ##", "44444444444   HIhi!hi                           Hi!hi", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                                             ##" });
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HIHi!hiHi!hi#Hi!hiHi!hiHI", "                       ###############################################hi#!#hi#                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHI" + "'", str2, "HIHi!hiHi!hi#Hi!hiHi!hiHI");
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...#####################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#####################################################" + "'", str1, "...#####################################################");
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI             Hi!hi   ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI", "                                                                                  ", "4 4");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#### ######hi!hi", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi! ", "HI!HI                           HI!HI            HIHI!HI                           HI!HI           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                        ", 296);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        " + "'", str2, "                        ");
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("H     hi!hi", "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                              HI#HI                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#########################################", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HhI!HI             HhI!HI                                                                                                      !IHHhI!HI             HhI!HI      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI#HI", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         HI#HI" + "'", str2, "                                                         HI#HI");
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!HI                           hI!HI  444   4444hI!HI                           hI!HI ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI                           HI!HI  444   4444HI!HI                           HI!HI " + "'", str1, "!HI                           HI!HI  444   4444HI!HI                           HI!HI ");
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaHI#HIaaa", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", (java.lang.CharSequence) "  #  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("################################...", '4', 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", "!IHHI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!HIHI!HIH################################", 90, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444!HIHI!HIH################################4444444444444444444444444" + "'", str3, "444444444444444444444444!HIHI!HIH################################4444444444444444444444444");
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444", 7, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444" + "'", str3, "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444");
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI             Hi!hi   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI             Hi!hi   " + "'", str1, "                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI             Hi!hi   ");
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444!ih444", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444!ih444" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!ih" });
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!                                        " + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!                                        ");
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("H         H         H         H                    H         H         H         H");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "H", "H", "H", "H", "H", "H", "H" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!                                4444444444", "hI!HI            hiHI!HI                           hI#### ######hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                4444444444" + "'", str2, "hi!                                4444444444");
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("         H                      ", "hi!HI!HI!HI!HI!                              hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H                      " + "'", str2, "         H                      ");
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (short) 10, 5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 42, 21);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#hi!hi#hihihi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#hi!hi#hihihi#" + "'", str1, "#hi!hi#hihihi#");
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#############################################HI!HI", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...#I!HI", "H################################ hi#hi hi#hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                       ###############################################hi#!#hi#                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################hi#!#hi#" + "'", str1, "###############################################hi#!#hi#");
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "         H                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                                                                                                        #############################################hi!hi                        ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444", "                                                                                                                                                                                                                                                hihi#hi!hi#hihihi#hi!", 16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444" });
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("     4444444444444444444444444444444444444444444444      ", " hi!hi  ", "444!       H      H      H      H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "H!IHHI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "     4444444444444444444444444444444444444444444444                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#############################################hi!hi!#############################################", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                       a###                44hi!hi!4444hi!hi!4444hi!hi!44                       a###", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                          !444                 ", (java.lang.CharSequence) "#####hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444", "               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444" + "'", str2, "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444");
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HII!HI                                       hiHI!HI", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HII!HI                                       hiHI!HI" });
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", "                                    ih ih ih ih ih ih ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!" + "'", str2, "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("           hi!hi                                                                                                                                                                                            HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                            444!                                                                                                                                                                                                                                                   HIHI#HI!HI#HIHIHI#HI!", 342, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I!    ", "###################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!    " + "'", str2, "I!    ");
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!                                                                                                 ", (int) (short) 1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!aa", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "############aaaaa###################################");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!                 ", "                       ###############################################hi#!#hi#                        ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("    H  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!                 " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HhI!HI             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("IHI!HI!II!                IIHI!H", "HIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HIHIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "#############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI#HI", "         h", 52);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI#HI" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI#HI" + "'", str5, "HI#HI");
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "###############################################..##..#############################################", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi####");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###############################################..##..#############################################" + "'", charSequence2, "###############################################..##..#############################################");
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                                                                                     HI   Hi!hiHi!hiH################################", "HI!                                                                                                 ", 126);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("        ", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                       " + "'", str2, "                                                                       ");
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!hi!hi!aa", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!hi!hi!aa" + "'", str3, "HI!hi!hi!aa");
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!HHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "HI!HHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           Hi!hi      !ih!ih4444444444444444444444444444444444444444444444   HIhi!hi                           Hi!hi" + "'", str1, "hi!hi                           Hi!hi      !ih!ih4444444444444444444444444444444444444444444444   HIhi!hi                           Hi!hi");
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray12 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence6 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny(charSequence6, charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "####################################################################################################################################################################################################################################################################", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i!hihi!hi", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "HI!Haaaaaaa                         aaaaaaa     HI!H", "hi!hi                           hi!hi       ...", 47);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444", "ih#ih ih#ih ###############################hi!hihi!hih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444" + "'", str2, "444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444");
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("#############################################HI!HI!#############################################", "IhI!                                     HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################HI!HI!#############################################" + "'", str2, "#############################################HI!HI!#############################################");
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!hihi!hihihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hI!HI                           hI!HI                           h################################", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI                      ..." + "'", str2, "hI!HI                           hI!HI                      ...");
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ih!iH                           ih!ihIH            ih!iH                           ih!ih", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny(charSequence3, charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!  ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "             ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         H         H         H         H        4444444444444444444444444444444!   444hi!4444     H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "             ", "                                                                                                                                                                                                                                                hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#################################hi!ihi!aaaaaaaaaaaaaaaaa####################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ihaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          ", "HI!HI                           HI!HI            HIHI!HI hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH            HI!H", 31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI   Hi!hiHi!hiH################################      hiHI!HI          " });
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...                                !ih!ih!ih!ih!ih!ih!ih");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH#################4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "                                ", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                           h", "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI          HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "HI!hi!hi!44HI!hi!hi!44HI!hi!h.", 38);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                       IH!IHih                                       IH!I", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                44HI!HI!4444HI!HI!4444HI!HI!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                44HI!HI!4444HI!HI!4444HI!HI!44" + "'", str1, "                44HI!HI!4444HI!HI!4444HI!HI!44");
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI", '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("         h####################################", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI!HI!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "         h####################################" + "'", str7, "         h####################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!HI!HI!HI" + "'", str9, "HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!HI!HI!HI" + "'", str10, "HI!HI!HI!HI");
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444hi!4444     ", "           Hi!hi   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi", (int) '4', 324);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi" + "'", str3, "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi");
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hhi!hihi!hih################################    ", "", 13);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hhi!hihi!hih################################" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HHHHHHHHHHHi!hiHi!hiH", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HHHHHHHHHHHi!hiHi!hiH" });
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###############################################hi#!#hi##############################################", (int) 'a', "I!HI                           HI!HI            HIHI!HI                           HI!H..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################hi#!#hi##############################################" + "'", str3, "###############################################hi#!#hi##############################################");
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI#HI      4444444444444444444444444444444444444444444444444#44444444444444444444444444444444444444444444444444             #I#HI      #IH#IH4444444444444444444444444444444444444444444444   ##HI#HI                           #I#HI           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hI!HI4444444444444444444444444444444!444hi!4444hI!HI4444444444444444444444444444444!444hi!4444hI!HI44444444444444444444444444444I!HIhI!HIh################################", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                               HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 313 + "'", int3 == 313);
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4 4", "ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4 4" + "'", str2, "4 4");
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "H44H4h44H4hiH44H4h44H4H44H", "                                                       #############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("##################################hi!hi", "hihi#hi!hi#hihihi#hi!", "I!HIhI!HIh################################", 56);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "##################################hi!hi" + "'", str4, "##################################hi!hi");
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ih!ihih!ih", "!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih", "  hiHI!HI                           hI!HI           ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("##############444hi!4444     ##############", "               4               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                 !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                   4444444                   4444444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                       #############################################hi!hi                        ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                       ", "#############################################", "hi", "!", "hi", "                        " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                       ###############################################hi#!#hi#                        " + "'", str4, "                       ###############################################hi#!#hi#                        ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                       a#############################################ahia!ahia                        " + "'", str6, "                       a#############################################ahia!ahia                        ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                       4#############################################4hi4!4hi4                        " + "'", str8, "                       4#############################################4hi4!4hi4                        ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "HI##########!##########HI##########!##########HI##########!##########HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA", (java.lang.CharSequence) "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA" + "'", charSequence2, "A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA");
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!                                                                                                 ", "h################################ hI!HI HI!HI", 2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("################################", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                                 ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "I!                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I!                                                                                                 " + "'", str5, "I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                 I!                                                                                                 " + "'", str8, "                                                                                                 I!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH", "IH!IH##########Hi!hiHi!hiH##################################################", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "     4444444444444444444444444444444444444444444444 Hi!hi                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "################################...", "                                                                                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
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
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray41, "", 1, 2);
        int int57 = org.apache.commons.lang3.StringUtils.indexOfAny("HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", strArray41);
        boolean boolean58 = org.apache.commons.lang3.StringUtils.startsWithAny("  hiHI!HI                           hI!HI          ", strArray41);
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...44444444444444444HIHi!hiHi!h......444ih!ihih!ih...44444444444444444HIHi!hiHi!h......444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...44444444444444444HIHi!hiHi!h......444ih!ihih!ih...44444444444444444HIHi!hiHi!h......444" + "'", str2, "...44444444444444444HIHi!hiHi!h......444ih!ihih!ih...44444444444444444HIHi!hiHi!h......444");
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!HI                           hI!HI                           h################################", "!i!i", (int) (byte) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!IhI!aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!HI                           hI!HI                           h################################" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI                           hI!HI                           h################################" });
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444!", "                                                                                                 ", 232);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444!" });
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hih!ihih!ih############################### hi#hi hi#hi", (java.lang.CharSequence) "hi!hi                           hi!hi            ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("          ", "hi!hi                           hi!hi            hihi!hi                           hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi                           hi!hi            hihi!hi                           hi!hi" + "'", str2, "hi!hi                           hi!hi            hihi!hi                           hi!hi");
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("###################################hi!hi################", "                             ", "hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI4444444444444444444444444444444!   444hi!4444   hI!HI44444444444444444444444444444I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################hi!hi################" + "'", str3, "###################################hi!hi################");
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI", "############4444444444444444444444444444444444444444444444!hi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############                  ########                  #######HHHHH#################4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", '#', 232);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 232 + "'", int3 == 232);
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha...", "44hi!4444444hi!4444444hi!4444444hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha..." + "'", str2, "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha...");
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("           IH!Ih                           IH!IHih            IH!Ih                           IH!IH", '#', 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI", "Ih!iHi!444Ih!iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi#hi", "... ...                                !ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi#hi" });
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) " ######hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444444hi!h444" });
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444aaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 842 + "'", int2 == 842);
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                        hi!IhI!aaaaaaaaaaaaaaaaa                                                        ", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                        hi!IhI!aaaaaaaaaaaaaaaaa                                                        " + "'", str3, "                                                        hi!IhI!aaaaaaaaaaaaaaaaa                                                        ");
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HihiHihi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444!ih444444444444444444444444", "                                                                                                                                                                                         HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", 93);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                   4444444                                                                          ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444!ih444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                   4444444                                                                          " + "'", str9, "                   4444444                                                                          ");
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                                                                                 ", "HI!HI", 52);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("I!HI                           HI!HI            HIHI!HI                           HI!H...", 65, 85);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                        HI!HI            HIHI!HI                           HI!H..." + "'", str3, "...                        HI!HI            HIHI!HI                           HI!H...");
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" #############################################", "            hiHI!HI                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #############################################" + "'", str2, " #############################################");
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("IH!IHIH!IHIH!IHIHIH!IHIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IHIH!IHIHIH!IHIH!IH                                                                                                                                                                                                                                                                                               ", "......!ih!ih!ih!i", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                    hI   Hi!hiHi!hiH                                                                                                                                                                         ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI", "Hi!hiHi!hiH" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("       ih!iH                           ih!ih", "!ihaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hiHi!hiHIhi!hiHi!hi", "         h####################################", "IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                       ###############################################hi#!#hi#                        ", "I!HI                           hI!HI                           h################################", 57);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "    H                                      ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#', 29, 174);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 57 out of bounds for length 57");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############hi#!#hi#" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##############hi#!#hi#");
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("h################################ h                                                                           ###################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("################################HhI!HI            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################HhI!HI" + "'", str1, "################################HhI!HI");
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###########HI", "HI!HI                           HI!HI            ...", 3);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###########HI" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###########HI" + "'", str4, "###########HI");
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        java.lang.CharSequence charSequence0 = null;
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
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", charArray11);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, charArray11);
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
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "H         H         H         H         !IH        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!444", "HI!HI                           HI!HI                           H################################");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!444" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!IH!IH4444444444444444444444444444444444444444444444", 35, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH4444444444444444444444444444444444444444444444" + "'", str3, "!IH!IH4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444", 229, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", "444444444444444444444444hi!4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaahI!HIaaaaaaaaaaaahiHI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaahI!HI", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 77 + "'", int2 == 77);
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################HI!HI!##########################################...", "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HIH################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################HI", "HI", "##########################################..." });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence4, charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44444444", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "####################################################################################################################################################################################################################################################################", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                       HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         H", "Hi!hi                           Hi!hi                           H################################", 6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("HI!HI", "#############################################hi!hi");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!", strArray10, strArray14);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray27, strArray30);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray22, strArray27);
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray35);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray35, '#', (int) (short) 10, 5);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                                                                                 ", strArray27, strArray35);
        boolean boolean42 = org.apache.commons.lang3.StringUtils.startsWithAny("                       #############################################hi!hi                        ", strArray27);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray14, strArray27);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", strArray5, strArray27);
        java.lang.String[] strArray49 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        boolean boolean50 = org.apache.commons.lang3.StringUtils.startsWithAny("H!IH", strArray49);
        java.lang.String str51 = org.apache.commons.lang3.StringUtils.replaceEach("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHI IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH  II IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH", strArray27, strArray49);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "         H" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " " + "'", str31, " ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!                                " + "'", str32, "hi!                                ");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!                                                                                                 " + "'", str41, "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " " + "'", str43, " ");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!" + "'", str44, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHI IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH  II IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH" + "'", str51, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHIHHHHHHHHHHHHHHHI IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH  II IIHHHHHHHHHHHHHHHHHHHHHHHHHHH I IIHHHHHHHHHHHH");
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("             ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             " + "'", str2, "             ");
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444aaaaaaa", "    h     ", (int) (byte) -1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444aaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444aaaaaaa" + "'", str4, "4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444aaaaaaa");
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!         H         H         H         H         ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "       aaaaaaa", 33);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi" });
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("H", 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", "...                   4444444444444444444444444444444444444444444444HI!HI!...");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 !IH", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "H" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str8, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!IH!IH4444444444444444444444444444444444444444444444", "", 137);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH4444444444444444444444444444444444444444444444" + "'", str3, "!IH!IH4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###############################################hi#4#hi#############################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#4#hi#############################################" + "'", str2, "###############################################hi#4#hi#############################################");
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        char[] charArray8 = new char[] { 'a', '#', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!#######", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444", 0, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444..." + "'", str3, "444444...");
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#####################hi#!#hi", 874, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################hi#!#hi444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "#####################hi#!#hi444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("I!HI                           hI!HI            hiHI!HI                           hI!HI            #", "ih!ih#############################################", "                                                     ##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            #" + "'", str3, "I!HI                           hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###################", "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "   hi!hihi!hih################################hi4!  ", 11, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 11 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###################" });
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI                           HI!HI            ..##################################################################################################################################################################################################################", "               4               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        java.lang.String[] strArray3 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("HI ! HI ! HI ! HI", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI", strArray3, strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("################################", strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ", strArray12);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str7, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H" });
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                         HI#HI", "HIHi!hi!hihi!hih################################iHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                         " + "'", str2, "                                                         ");
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "  4444444444444444444444444444444444444444444444hI!HI  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "444444444444444444444444444444                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaHI#HIaahI!IIhI!IIhhI!IIhI!IIhhI!II", "4444444444444444444444444444444444444444444444hi!hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                       a#############################################ahia!ahia                        ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!444444444444444444444444444444444444444444444444444444444hihi#hi!hi#hihihi#hi!4444444                         aaaaaaa     ", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IAHI                           hIAHI            hAHIAHI                           hIAHI", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 7 vs 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                       ", "a", "#############################################", "ahia", "!", "ahia", "                        " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "hihi#hi!hi#hihihi#hi!", "                         aaaaaaa     " });
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("###############################################hi#!#hi#############################################", "HI!HI4444444444444444444444444444444444444444#############################################HI!HI", "        444hi!4444              ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##############     4444!IH444##############", "                           4            4                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444444444444444444444444444444444444444444444HIHHI HHHI HH44444444444444444444444444444444IHI444444444444444444444444444444 44444444444444444444444444444444444444444444444444", "  444!       H      H      H      H      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!HI4444444444444444444444444444444!444hi!4444hI!HI4444444444444444444444444444444!444hi!4444hI!HI44444444444444444444444444444I!HIhI!HIh################################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 127 + "'", int2 == 127);
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        char[] charArray16 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hI!HI               ", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ", charArray16);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaah", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!HIHI!HI", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA", "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray9, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray4, strArray9);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                                " + "'", str14, "hi!                                ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HihiHihi", 76);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HihiHihi                                                                    " + "'", str2, "HihiHihi                                                                    ");
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                          ###############################################                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          ###############################################                           " + "'", str1, "                          ###############################################                           ");
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!#######", "###############################################HI################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("IAHI                           hIAHI            hAHIAHI                           hIAHI", "                                                                                                                                                                                         HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                         HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA" + "'", str2, "                                                                                                                                                                                         HIHi!hiHi!hiHi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                          !444                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                          !444                 " + "'", str1, "                                                                                                                                          !444                 ");
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 58, 281);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                44hi!hi!4444hi!hi!4444hi!hi!44", (int) (byte) 1, "################################HHI!HI            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                44hi!hi!4444hi!hi!4444hi!hi!44" + "'", str3, "                44hi!hi!4444hi!hi!4444hi!hi!44");
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("     4444444444444444444444444444444444444444444444", "         h####################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("aaa", "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("......!IH!IH!IH!IH!IH!IH!IH", "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "......!IH!IH!IH!IH!IH!IH!I" + "'", str2, "......!IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "  44444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 40 + "'", int1 == 40);
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#####hi!hi", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444hi!4444", "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "IH!IH#############################################");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 236, 42);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444", "", "", "4444" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444", "", "", "4444" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("       ################################        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ################################       " + "'", str1, "       ################################       ");
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!HIHI!HIH################################    ", "                    HI#HI                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!  !              hi   hI!HIhI!HIh                 !  !", "                        hI!HI            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!  !              hi   hI!HIhI!HIh                 !  !" });
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                 A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                  ", "###################", "############...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IH!IH", "", 82);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IH!IH" });
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                HI!HI!HI!AA", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "                                                                           ###################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444444444444444444444444444444                                                                                                                                                                                                                                                                                                                            ", (java.lang.CharSequence) "    !I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hihi!hihihi!hihi!hi                                                                                                                                                                                                                                                                   ", "                                          444hi!4444I!HI!HI!HI!                              ", 84);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hihi!hihihi!hihi!hi                                                                                                                                                                                                                                                                   " });
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##############################################################################################################################################################################################################################################################################################################################################################", "                                                                    ", "4444444                   4444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HI#################################hi!hi444444444", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI#################################hi!h..." + "'", str2, "HI!HI#################################hi!h...");
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str1, "I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...#", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#" + "'", str2, "...#");
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                  ########                  ########", "...4444444444444444 hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444444444444 hI!HI" + "'", str2, "...4444444444444444 hI!HI");
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI   Hi!hiHi!hiH", "IH!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("..", "", "Ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ".." + "'", str4, "..");
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                  ################################hih################################hih!ihih!ih!4444444444444444444444444444444444444444444444IH!Ihih#############");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!HIHI!HIH################################    ", "aaaaaaaaaa", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                 !IH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 !IH" + "'", str2, "                                                                                                 !IH");
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444!", "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444   4444", "                                                 h                                                  ", 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444   4444" + "'", str3, "444   4444");
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###############################################hi#!#hi#", "444hi!4444", 10);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###############################################hi#!#hi#" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###############################################hi#!#hi#" + "'", str5, "###############################################hi#!#hi#");
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44hi!hi!4444hi!hi!4444hi!hi!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!4444hi!hi!4444hi!hi!44" + "'", str1, "44hi!hi!4444hi!hi!4444hi!hi!44");
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!HI                           hI!HI                           h################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  a#HI!hi!hi!aa       a###                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("###################################################H", "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIa", "4444444444HI!HI!...                    ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################" + "'", str1, "#############################################");
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        char[] charArray16 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray16);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray16);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray16);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hI!HI               ", charArray16);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray16);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaa                         aaaaaaa     ", charArray16);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 26 + "'", int23 == 26);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaa", "  hiHI!HI                           hI!HI          ", "hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444  aaaaaaa                         aaaaaaa     hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa" + "'", str3, "aaaaaaa");
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                 HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444 hI!HI                           ", "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaaha...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("   hi!hihi!hih################################hi4!  ", "   hi!hihi!hih################################hi4!  ", "                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444444444444!ih444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "!hihi!hi", 2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "#############################################################################################################################################################################################################################################");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                           hI!HI            hiHI!HI                           hI!HI             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI            hiHI!HI                           hI!HI" + "'", str1, "hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "  !4ih################################hih!ihih!ih   !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", "                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################" + "'", str3, "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH", "hi!hihi!hih#########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH" + "'", str2, "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH");
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi" + "'", str1, "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!HIHI!HIH################################    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HIHI!HIH################################" + "'", str1, "!HIHI!HIH################################");
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############444HI!4444     ###############", "HI#########################hi!                              HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI", 54);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("######################################");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI                                       hiHI!HI");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444!HI!HI" + "'", str2, "4444!HI!HI");
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HHHHHI!HHHH", "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHI!HHHH" + "'", str2, "HHHHHI!HHHH");
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                              ", "##!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                          !IHHI            ", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          !IHHI                                                                                                          " + "'", str2, "                          !IHHI                                                                                                          ");
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                                                            #####hi!hi                                                                                                                                                                                             ", "H!IHHI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                    ", "44HI444");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 19, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                    " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "I!                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           hI!HI            hiHI!HI                           hI!HI            #", "HI!HHHHHHHHHHHHHHHHHHHHHHH");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!hi                           hi!hi            hihi!hi                        ...", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                           h", "", "", "", "            hi", "", "", "", "", "                           h", "", "", "", "            #" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!hi                           hi!hi            hihi!hi                        ..." + "'", str7, "Hi!hi                           hi!hi            hihi!hi                        ...");
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("            hiHI!HI                           ", 998, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444            hiHI!HI                           " + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444            hiHI!HI                           ");
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("###############################################", 998);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ###############################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ###############################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444hihI!HIhI!HIh################################!hi###", "               hiHI!HI               4444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI             Hi!hi   ", "HI!HI                           HI!HI            HIHI!HI                           HI!HI", "HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI             Hi!hi   " + "'", str3, "                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI                                            HI!HI!HI             Hi!hi   ");
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", "      HI!HI#################################hi!hi                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                ", "                                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", "                        " });
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                       ######hi!hi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                       ######hi!hi" + "'", str2, "                                                                                                                                                                                                                                                       ######hi!hi");
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("  AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444" + "'", str2, "  AAAAAAA                         AAAAAAA     AAAAAAA                         AAAAAAA     AAAAAAA                 .........I#I#HIHI#H44444444444444444");
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#############################################HI!HI!#############################################", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ih!ih###################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444!       H      H      H      H   ", 258, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444!       H      H      H      H   " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444!       H      H      H      H   ");
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "", 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444HI!HI!...                    ", 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", "                                                                           ###################");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................", strArray1, strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "4444444444HI!HI!...                    " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................" + "'", str10, ".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................");
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI", "", "", "", "", "", "", "", "", "", "", "", "##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah" });
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("      ", "                                                                                                                                                                                                                                                             !hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("################################...######################################################             ih!ihIH            ih!iH                           ih!ih!HIHI!HI", "                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################...######################################################             ih!ihIH            ih!iH                           ih!ih!HIHI!HI" + "'", str2, "################################...######################################################             ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...#####################################################HIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHIHIHi!hiHi!hi#Hi!hiHi!hiHI", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!                                        " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!                                        ");
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, charSequence1);
        org.junit.Assert.assertNull(charSequence2);
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HIHi!hiHi!hi#Hi!hiHi!hiH", "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiH" + "'", str2, "HIHi!hiHi!hi#Hi!hiHi!hiH");
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...###################################hi#!#hi#", "                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444.." + "'", str1, "44444444444444444444444..");
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("H         H         H         H        hi!         H         H         H         H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         H         H         H        hi!         H         H         H         H" + "'", str1, "H         H         H         H        hi!         H         H         H         H");
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                    HI#HI                    ", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   " + "'", str2, "                   ");
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hiHi!hi!ih!ih4444444444444444444444444444444444444444444444HIhi!hiHi!hi", "hiHI!HI                           hI!HI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hI!HIhI!HIh", "444444444444444444444444hi!4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                  ", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  " + "'", str2, "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ");
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!HI                           hI!HI            hiHI!HI                           hI!H...", "hI!                               ", 71);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                 444!   ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("                                                                                        ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hi        ", strArray4, strArray10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!H..." });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!H..." + "'", str6, "I!HI                           hI!HI            hiHI!HI                           hI!H...");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!H..." });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi        " + "'", str11, "hi        ");
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!H444444HI!H444444HI!H444444HI!H444444H", " 444HI!H444  ", 21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!H444444HI!H444444HI!H444444HI!H444444H" });
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ###############################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ###############################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ###############################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI   Hi!hiHi!hiH    ", "......!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "I   H", "", "", "", "H", "", "", "", "H    " });
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44hi!hi!44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI#HI", "hi!                                ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI   HI!HIHI!HIH################################    ");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI#HI" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI#HI" + "'", str4, "HI#HI");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HIHI!HIH44444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...", "HihiHihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####..." + "'", str2, "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!  !              hi   hI!HIhI!HIh                 !  !  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                        hI!HI            ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                        ", "h", "I", "!", "HI", "            " });
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...", "I!HI", 86);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444..." });
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "#############################################HI!HI", (java.lang.CharSequence) "IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 875 + "'", int2 == 875);
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI   HI!HIHI!HIH################################    ", 14, "I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI   HI!HIHI!HIH################################    " + "'", str3, "HI   HI!HIHI!HIH################################    ");
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray15);
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "" };
        int int23 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray22);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray22, strArray30);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray15, strArray22);
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.stripAll(strArray15, "I!HIhI!HIh################################");
        int int35 = org.apache.commons.lang3.StringUtils.indexOfAny("###################################hi!hi################", strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str39 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, "...hi!444444444444...", (int) '4', 387);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "i", "", "", "i", "", "i" });
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         " + "'", str1, "         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H         ");
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###########HI!H", "          ", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("###################################hi!hi", "hi!hi                           hi!hi                           h################################");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "###########HI!H" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "###########HI!H" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "          i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!" + "'", str9, "          i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!");
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("################################4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################4444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "################################4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "####################################################", (java.lang.CharSequence) "                    HIaHI                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i", "############444HI!4444     ###############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i" + "'", str2, "ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i");
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaa                         aaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaa                         aaaaaaa" + "'", str2, "aaaaaaa                         aaaaaaa");
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444!HIHI!HIH################################4444444444444444444444444", "ih!ih#############################################", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("###############################################hi#4#hi#############################################", "i!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("               hiHI!HI               4444444444444444444", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             hiHI!HI               4444444444444444444" + "'", str2, "                                             hiHI!HI               4444444444444444444");
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                      " + "'", str1, "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                      ");
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "444444444444444444444444444444444444!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("################################hhi!hi            ##", "               4               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################hhi!hi            ##" + "'", str2, "################################hhi!hi            ##");
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!HI!HIHI!HIH################################HI", "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("444444444444444444444444444###############################################4444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                  ", "##############444hi!4444     ##############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ihHhihihihih################################hi", "HHHHHI!HHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihHhihihihih################################hi" + "'", str2, "ihHhihihihih################################hi");
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hhi!                               ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("################################4444444444444444444444444444444444444444444444444444444444444444444", 77, "I!HI                           hI!HI            hiHI!HI                           hI!H..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################4444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "################################4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#######HI!4444    ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######HI!44444444" + "'", str3, "#######HI!44444444");
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH");
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "                                                     ##########", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaHI#HIaaa                                           ", "############4444444444444444444444444444444444444444444444!hi!hihi!hi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaHIHIaaa                                           " + "'", str3, "aaHIHIaaa                                           ");
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hi                           hi!hi            hihi!hi                           hi!hi", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 82 + "'", int2 == 82);
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                 I!HI                    ", 75, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "...                                !ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi                           hi!hi                           h################################", "!ihhi                          hI!HI               ", 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
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
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "############ih!ih##################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!HI", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI" + "'", str3, "I!HI");
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!44...", 82, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!44...4444444444444444444444444444444444444444444444HI!HI!444444444444444444444444" + "'", str3, "!44...4444444444444444444444444444444444444444444444HI!HI!444444444444444444444444");
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "####################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       4444444444HI!HI!...        ", "44444444444444444444444444###############...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       4444444444HI!HI!...        " + "'", str2, "       4444444444HI!HI!...        ");
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ", 260);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         " + "'", str2, "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ");
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "           HI!HIhI!HIhiHI!HIhI!HIHI!H", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("##### ######hi!hi                            ", "!ihaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##### ######hi!hi                            " });
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                            ##################################hi!hi                             ", "HhI!HI             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################hi!hi" + "'", str2, "##################################hi!hi");
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        char[] charArray11 = new char[] {};
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi!4444", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "############ih!ih###################################", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "IH!IH#############################################", charArray11);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444  aaaaaaa                         aaaaaaa     hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444   ", charArray11);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        char[] charArray13 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hiHi!hiH########################", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                                                                                     HI   Hi!hiHi!hiH################################", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...!IH!IH4444444444444444444444444444444444444444444444                   ...", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 229 + "'", int19 == 229);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444", 43, "#############################################HI!HI!#############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444####################################" + "'", str3, "4444444####################################");
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#########h#####", "ih!ih##################################ih!ih##################################ih!ih###############################hI!HI                           ih!ih##################################ih!ih##################################ih!ih###############################", 43);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hI#HI!HI                           HI!HI            ..", "444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##################################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi#hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##################################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444" + "'", str1, "4444444444444444444444444444hihi#hi!hi#hihihi#hi!44444444444444444444444444444");
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("IH!IH##################################", "                           HI!HI                           H###############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi                           hi!hi                           h################################", '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "  hiHI!HI ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#', 258, 562);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 258 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi                           hi!hi                           h################################" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI!HI!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H" + "'", str7, "hI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!IIhI!I!H!H");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!HI!" + "'", str9, "HI!HI!");
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "IH!IHIH!IHIH!IHIHIH!IHIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IHIH!IHIHIH!IHIH!IH                                                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#############################################HI!HI", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                    ih ih ih ih ih ih ih", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444", charArray10);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#############################################hi!hi!#############################################", "         H         H         H         H                    H         H         H         H      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################hi!hi!#############################################" + "'", str2, "#############################################hi!hi!#############################################");
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44hh44h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hh44h" + "'", str1, "44hh44h");
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "hi!hiHih!ih##################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!", "                                                    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                            HI#HI                            ", "!HI                           hI!HI  444   4444hI!HI                           hI!HI ", 98);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                            HI#HI                            " });
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#############################################hi!hi!#############################################", "                                                                                                  ", "AA##############################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH" + "'", str1, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH");
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...                           hi!hi            hihi!hi                           hi!hi           ", "hi!IhI!aaaaaaaaaaaaaaaaa", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI", "!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "I", "HI                           ", "I", "HI  444   4444", "I", "HI                           ", "I", "HI" });
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hi", 387, 98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444hi" + "'", str3, "44444444444444444444444444444hi");
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H", "                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44" + "'", str2, "4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44");
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", "########################", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444!       H      H      H      H", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H", "4444444####################################", "      Hhi!                                     ", 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H" + "'", str4, "                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H");
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("I!HI                                       hiHI!HI", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                                       hiHI!HI" + "'", str2, "I!HI                                       hiHI!HI");
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI   " + "'", str2, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                44HI!HI!4444HI!HI!4444HI!HI!44", "aaaaaaaaaaaaaaaaaaaaa#IH#!#IH###############################################aaaaaaaaaaaaaaaaaaaa", "hiHI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                44HI!HI!4444HI!HI!4444HI!HI!44" + "'", str3, "                44HI!HI!4444HI!HI!4444HI!HI!44");
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HI#####!#####HI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIHI!HIH", "HI!HI4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444hI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI", "                                                                                                                                                                                                                                          ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("# Hi!hi hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "# Hi!hi hi!hi" + "'", str1, "# Hi!hi hi!hi");
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                       #############################################HI!HI                        ", "                                                                                                                                                        ##############################################                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                       #############################################HI!HI                        " });
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "           H44H4h44H4hiH44H4h44H4H44H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", (int) (short) -1, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                                                                             !hihi!hi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                             !hihi!hi" + "'", str2, "                                                                                                                                                                                                                                                             !hihi!hi");
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("......!ih!ih!ih!ih!ih!ih!ih", "h################################ h                                                                           ###################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "......!i", "!i", "!i", "!i", "!i", "!i", "!i" });
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444   HIhi!hi                           Hi!hi", "IAHI                           hIAHI            hAHIAHI                           hIAHI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444   HIhi!hi                           Hi!hi" });
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }
}

