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
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                 hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...h!ih!ih!ih!i...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...h!ih!ih!ih!i..." + "'", str1, "...h!ih!ih!ih!i...");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("! I! I! I! I! I!");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "Ai", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", " ", "I", "!", " ", "I", "!", " ", "I", "!", " ", "I", "!", " ", "I", "!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "a###################################################################       ", (java.lang.CharSequence) "   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "!hi!hi!hi!hi!hi!hi...", 34);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("..aaaaaaaaaaaaaa!...", "               #################################################################hi               ###############################!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..aaaaaaaaaaaaaa!..." + "'", str2, "..aaaaaaaaaaaaaa!...");
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "##aa               Hii               a###########################################################################################                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      ", (java.lang.CharSequence) "I!h", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aa", 399, 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("##################################################################H                                ##################################################################", "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################H                                ##################################################################" + "'", str2, "##################################################################H                                ##################################################################");
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("########...", 2, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########..." + "'", str3, "########...");
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                       HI!HI!HI!H", 105, "4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444                                       HI!HI!HI!H" + "'", str3, "44444444444444444444444444444444444444444444444444444444                                       HI!HI!HI!H");
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        char[] charArray7 = new char[] { ' ', ' ', 'a', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H         ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a############################################H         a############################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { ' ', ' ', 'a', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         h", "! I! I! I! I! I! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         h" + "'", str2, "...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         h");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "                                                 hi!");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "!");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "                                                                                                    ");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa", strArray2, strArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa" + "'", str16, "A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "h         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("     ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                              ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!44444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 77 + "'", int3 == 77);
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "         I", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444444444444444444444444                                       HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!IHH!IH!I                                44444444IH!IH!IH", 72, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                              " + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                              ");
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "               ..................................................................I               ................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                 #                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                          ", 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 #                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                          " + "'", str3, "                                                 #                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                          ");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#HI!#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!ih 0 0.001 1- !ih 1-                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", " ", "0", " ", "0", ".", "001", " ", "1", "-", " ", "!", "ih", " ", "1", "-", "                  " });
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("III", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", 134);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "III" });
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                                  hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H" + "'", str2, "          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H");
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" });
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!HiHI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      ", 89);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hh!", "                                                                       ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                                                        ", ";GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCHHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444hiHHiHIHHIHHIHHIHHIHHIHHIHHIHHIiHH;;;;;;;;;;;;;;;;;;;;;;444444444444444444hhI" + "'", str3, "444444444444444444hiHHiHIHHIHHIHHIHHIHHIHHIHHIHHIiHH;;;;;;;;;;;;;;;;;;;;;;444444444444444444hhI");
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                 ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                 " });
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 70, 239);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 70 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444444444444444444444444444444444" });
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("clIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclI[[[", "A########################a########################a#######################hi!h h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "clIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclI[[[" + "'", str2, "clIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclI[[[");
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                 ", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                        " + "'", str2, "                                                                                                        ");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", (java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444################################       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1 HI! -1H", 7, "                                                                                                                                 ...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1 HI! -1H" + "'", str3, "-1 HI! -1H");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "-1 hi! -1 100.0 0                                                                                                                                                    ", (java.lang.CharSequence) "i", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "         II!HI!H...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                hiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              hiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[" + "'", str2, "                              hiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[");
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("###################################################################################################", "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHiaI                                                 #HiaIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHiaIa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################################################################################" + "'", str2, "###################################################################################################");
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...#############hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...##############", 122, "                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#############hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...##############                      " + "'", str3, "...#############hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...##############                      ");
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aA#################################################################################################AAA######################################################################################hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 96, 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###AAA###############" + "'", str3, "###AAA###############");
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { ";gnirts.gnal.avajl[", "ssalc;gnirts.gnal.avajl[", "ssalc;gnirts.gnal.avajl[", "ssalc", "hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." });
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                         C;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC", (java.lang.CharSequence) "Ha#################################################################################################aa               #################################################################hi               a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("#################################################################hi", "hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                             ################################   ", "HihihIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h444444", "Hi Hi Hi Hi Hi Hi HiAA###############################################################################################   i Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                             ################################   " + "'", str3, "                                                             ################################   ");
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HIHIHHI!HI!HI!HI!HI!HI...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHHIHIHHI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH!IH!IH!IHHIHIHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...IH!IH!IH!IH!IH!IHHIHIH" + "'", str1, "H!IH!IH!IH!IH!IHHIHIHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...IH!IH!IH!IH!IH!IHHIHIH");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!ih 0 0.001 1- !ih 1-                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH 0 0.001 1- !IH 1-                  " + "'", str1, "!IH 0 0.001 1- !IH 1-                  ");
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444", 57, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444" + "'", str3, "        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444");
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("        hI######Hi####################Hi####################Hi####################Hi#");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI######Hi####################Hi####################Hi####################Hi#" });
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 264 + "'", int1 == 264);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHi!Hi!Hi!HHI!HI!HI!Hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", charSequence1, 293);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ", (java.lang.CharSequence) "   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("               ..................................................................I               ................................A#################################################################################################AA ###", 123);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               ..................................................................I               .........................." + "'", str2, "               ..................................................................I               ..........................");
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A#################################################################################################aaHiia#################################################################################################aa", "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", 33);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A#################################################################################################", "", "", "", "", "", "#################################################################################################", "", "" });
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                   ##############", "-1 HI! -1H", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                   ##############" });
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "############################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", (java.lang.CharSequence) "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!          ..................................................................I               ................................A#################################################################################################AA ###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HI!HI!HI!HiI!HI!HI!!", (java.lang.CharSequence) "a###################################################################", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        byte[] byteArray5 = new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "########...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ########...");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 0, (byte) -1, (byte) 1, (byte) -1, (byte) 1 });
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "####################################################################A###################################################################       444444444444444444444444444####################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "a########################################################################################### Hii ##aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "A", (java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!!!!!!!!!!!!!!#################################################################hi!!!!!!!!!!!!!!!", "...                                                           class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i                                                           ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!!!!!!!!!!!!!!#################################################################", "", "!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!iH", 142, 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HiHiHiH", 87, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiHiHiHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiHiHiHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi..4h         44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi..4h         44444444444444444444444444444" + "'", str1, "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi..4h         44444444444444444444444444444");
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        byte[] byteArray0 = new byte[] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.toString(byteArray0, ".........................................................h         ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: .........................................................h         ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertArrayEquals(byteArray0, new byte[] {});
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi##################################################################################################", 9);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "  aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHa   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hi!hi..." + "'", str1, "!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                                                                 ...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!", 238, 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("i!HA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!HA" + "'", str1, "i!HA");
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       ", (java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 105 + "'", int2 == 105);
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   ", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "               ..................................................................I               ................................A#################################################################################################AA ###", 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", (java.lang.CharSequence) "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hii!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 483 + "'", int2 == 483);
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!H", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!H" + "'", str2, "444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                             hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                     ", "#################################################################################################aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                     " + "'", str2, "                                                                                                                                                             hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                     ");
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##############aa Hii", 99, "a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############aa Hiia##############################################################################" + "'", str3, "##############aa Hiia##############################################################################");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444", 297, "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "4444444444444444444444444444444444444444444444444                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", charSequence1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                 hi!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 hi!" + "'", str2, "                                                 hi!");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...h!ih!ih!ih!i...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                                    ", (java.lang.CharSequence) "AAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A..." + "'", str2, "A...");
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("               #################################################################hi               4444444444444444444444444444444444444444444444", "a############################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               #################################################################hi               4444444444444444444444444444444444444444444444" + "'", str2, "               #################################################################hi               4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h", "   AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h" });
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("A########################A########################A#######################", "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A########################A########################A#######################" });
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", "hIhIhI");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                     ...!AAAAAAAAAAAAAA...                                     aaaaaaaaaa");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "#################################################################hi               ################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', (int) (byte) 1, 58);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" });
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Ha################################################################Hi#############", (java.lang.CharSequence) "! I! I! I! I! I!                                   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Ha################################################################Hi#############" + "'", charSequence2, "Ha################################################################Hi#############");
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#################################################################", "################################       ", "hi!hi!hi!h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!44#################################################################################################4 ih################################################################# 44#################################################################################################4i44#################################################################################################4 ih################################################################# 44#################################################################################################4", (java.lang.CharSequence) ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!...", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("##aa               Hii               a#######...", 482, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...     AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!ih  4444444444444444444444444444444444444444444444444444444444                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("##aaHiia###########################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "h##h##h##h##h##h#...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         " + "'", str1, "...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         ");
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hihi!", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("i!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!#######################################################################################################################################################################################################################################################################################################################################################################################################################################################", strArray4, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#################################################################################################################################          ", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hihi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "i!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!#######################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str7, "!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!#######################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi", "#");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hhh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi" + "'", str5, "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                  I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI                   ", (int) (byte) 100, 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "   ################################    ", (java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "h class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "hI!                          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHa", (java.lang.CharSequence) "A...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        char[] charArray2 = new char[] { 'a', 'a' };
        char[] charArray5 = new char[] { 'a', 'a' };
        char[] charArray8 = new char[] { 'a', 'a' };
        char[] charArray11 = new char[] { 'a', 'a' };
        char[] charArray14 = new char[] { 'a', 'a' };
        char[][] charArray15 = new char[][] { charArray2, charArray5, charArray8, charArray11, charArray14 };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(charArray15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charArray15, "h", 482, 128);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join(charArray15);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { 'a', 'a' });
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444", "4444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444" + "'", str2, "hIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444");
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("I         I         I         I", 20, 201);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I         I         I         I" + "'", str3, "I         I         I         I");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "########!ih       ", (java.lang.CharSequence) "...i!H...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih#######################a########################a########################a                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str1, "IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                           hihi!", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    ..." + "'", str2, "                    ...");
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 165);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "                         ", "        hI######Hi####################Hi####################Hi####################Hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "... ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                       " });
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaH                                H                                Haaaaaaaaaaaaaaaa", 80, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaH                                H                                Haaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaH                                H                                Haaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("               #################################################################hi               ", "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHiaI                                                 #HiaIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHiaIa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               #################################################################hi               " + "'", str2, "               #################################################################hi               ");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 132, "##aa               Hii               a###########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AHI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AHI" });
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                     ...!AAAAAAAAAAAAAA...                                     ", (java.lang.CharSequence) "!ihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ..." + "'", str1, "h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                       ", "! I! I! I! I! I!                       ", "#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#HI!#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#.");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#########################################################");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 52, 5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hh!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "..........", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#########################################################" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "#########################################################" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "#########################################################" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "         ", (java.lang.CharSequence) "H class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "                                                 Hi", (java.lang.CharSequence) "Hi Hi Hi Hi Hi Hi HiAA###############################################################################################   i Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                h", 146, "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh                                h" + "'", str3, "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh                                h");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hIhIhI################################", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhIhI################################" + "'", str2, "hIhIhI################################");
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHa", "                          !ihih                          ", "H#################################################################################################               #################################################################hi               #################################################################################################i#################################################################################################               #################################################################hi               #################################################################################################!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("AHI", "############################4#i##i##i##44444444############;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH", (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "############################4#i##i##i##44444444############;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCHHI" + "'", str4, "############################4#i##i##i##44444444############;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCHHI");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               " + "'", str1, "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ");
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                                                                                                                                                                                                                                  I         I         I         I  ", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            " + "'", str2, "                                                                                            ");
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi", "ahi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "H" + "'", str6, "H");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                        44444444444444444IH4444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hii!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        44444444444444444IH4444444444444444" + "'", str2, "                                                                                        44444444444444444IH4444444444444444");
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", (java.lang.CharSequence) "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                               #   ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   #                               " + "'", str2, "   #                               ");
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h                                                                                                   ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          hc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         h", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", "... ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str2, "...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!hI!hI!hI!hI!hI!hI...", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("................................i..................................................................", "a############################################H         a########################Ha################################################################Hi###################", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "................................", ".................................................................." });
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                  I         I         I         I  ", (java.lang.CharSequence) "!iHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 124);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa!Ih!", (java.lang.CharSequence) "HiHiHHI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "    #       #       #       #   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "!!!!!!!!!!!!!!!#################################################################hi!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...##############                               ", "aaa                                                                 HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", 91);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...##############                               " });
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA", "A#################################################################################################AA               #################################################################HI               A#################################################################################################AA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "          ", (java.lang.CharSequence) ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("               ###############################################aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         ", "                           hi##############Hi#############                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               ###############################################a                                                                                                  " + "'", str3, "               ###############################################a                                                                                                  ");
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AHI", "", 21);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '4');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '4', 0, (int) (short) -1);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, "h                                ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", strArray8, strArray11);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "AHI" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h                                h                                h                                " + "'", str17, "h                                h                                h                                ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str18, "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str20, "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("I!I!I!I!I!I!I!I!I!I!", 63, 146);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!I!I!I!I!I!I!I!I!I!" + "'", str3, "I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aiii!ii!ii!i", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("-1 hi! -1 100.0 0 hi!", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Ahi!", 18, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "-1 hi! -1 100.0 0 hi!" });
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4", "                                                                                                                                 ...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4" });
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", (java.lang.CharSequence) "h...", 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("########################a########################a#######################hi!h h                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################a########################a#######################hi!h h                                                                                                                                                                                                                                                                                                                                                                                                 " + "'", str1, "########################a########################a#######################hi!h h                                                                                                                                                                                                                                                                                                                                                                                                 ");
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "#################################################################################################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." });
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!", 233);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", (java.lang.CharSequence) "HCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", 189);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" });
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "   #    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "CLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaai!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, 124);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("a444444444444444444444444444444444a########################a########################a#######################a4444444444444444444444444444444444", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a                                 a########################a########################a#######################a                                  " + "'", str3, "a                                 a########################a########################a#######################a                                  ");
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "clIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclIclI[[[");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("444444444444444444444444444444", "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444" + "'", str2, "444444444444444444444444444444");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "############################4#i##i##i##44444444############;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH", (java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                 hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("IhIhIhIhIA...HIhIhIhIhIh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hIhIhIhIhIH...AIhIhIhIhI" + "'", str1, "hIhIhIhIhIH...AIhIhIhIhI");
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                                                         ", "                                                                          I!I!I!I!I!I!I!I!I!I!", 39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                                                         " });
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHi!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444HIHHIH!HH!HH!HH!HH!HH!HH!HH!HH!IHH                      ", "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444HIHHIH!HH!HH!HH!HH!HH!HH!HH!HH!IHH                      " });
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          !ihih                          ", "CLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[                                   ", 49);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) ".........!aaaaaaaaaaaaaa....HIhIhI444444444444444444444444444444444444444444444444444444444...!aaaaaaaaaaaaaa......!aaaaaaaaaa...", (java.lang.CharSequence) "##################################################################################################a#H#iia#A##################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!..." + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!          ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!", (java.lang.CharSequence) "h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!                                hi!                                hi!", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hi!                                hi!                                hi!           " + "'", str2, "          hi!                                hi!                                hi!           ");
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "i!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence) "                                                       a###################################################################                ", 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hI!hI!hI!hhi!hi!hi!h", "##############AA               hII           ", 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!hI!hI!hhi!hi!hi!h" + "'", str3, "hI!hI!hI!hhi!hi!hi!h");
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                         ", (java.lang.CharSequence) "##aaHiia######################################################################################", 483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                                                                                                                                                         ", "hIhIhI                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "444444444444444444444444444444444444...##############                               ", (java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a########################a########################a#######################hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a", "########################", "a", "########################", "a", "#######################", "hi", "!" });
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "HiHiHHI!HI!HI!HI!HI!HI...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ihHiHiHHI!HI!HI!HI!HI!HI", "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str3, "               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "!IH 0 0.001 1- !IH 1-                  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "444444444444H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444       444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("444444444444444444HIHHIH!HH!HH!HH!HH!HH!HH!HH!HH!IHH                      ", "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444HIHHIH!HH!HH!HH!HH!HH!HH!HH!HH!IHH                      " + "'", str2, "444444444444444444HIHHIH!HH!HH!HH!HH!HH!HH!HH!HH!IHH                      ");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H", "aiii!ii!ii!i                            ", 99);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi...", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { ";GNIRTS.GNAL.AVAJL[", "SSALC;GNIRTS.GNAL.AVAJL[", "SSALC;GNIRTS.GNAL.AVAJL[", "SSALC", "H" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h                                                                                                   ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone(charSequence3, charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##aa               Hii               a#######...", "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##aa               Hii               a#######..." + "'", str2, "##aa               Hii               a#######...");
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "aa#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI######Hi####################Hi####################Hi####################Hi#", "hI######Hi####################Hi########4444444444" });
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                                                 hi!");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "!");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "                                                                                                    ");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "         I-1 HI! -1 100.0 0 HI!", (java.lang.CharSequence[]) strArray13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("a########################a########################a#######################hi!h h");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHiaI                                                 #HiaIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHiaIa", 233, 66);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a", "########################", "a", "########################", "a", "#######################", "hi", "!", "h", " ", "h" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a", "########################", "a", "########################", "a", "#######################", "", "", "", " ", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "a########################a########################a#######################hi!", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                          HI!HI!HI!H", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hIhIh", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...##################################hi               a#################################################################################################aaia################################################################################################...", "444444444444444444HHHHHHHHHHHHHHHHHHHHH                      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...##################################hi", "a#################################################################################################aaia################################################################################################..." });
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi##############Hi#############", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        char[] charArray2 = new char[] {};
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hI!                          ...                                    i!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHhI!                          ...                                     ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "               a###################################################################                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                              hiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!H");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HI!HI!H" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!H" + "'", str3, "HI!HI!HI!H");
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        byte[] byteArray5 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "4444444444444444hi44444444444444444                                                                                        ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: 4444444444444444hi44444444444444444                                                                                        ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 1, (byte) 100 });
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "i!Hi!Hi!Hi", 122);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" });
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                      ", 482);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 49, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                           hihi!", "##################################################################H                                ##################################################################", "h                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           hihi!" + "'", str3, "                                                                                           hihi!");
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "h                                h                                h                                                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("a##################################", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################" + "'", str2, "##################");
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!          ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###########", "!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...      Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                    ", "#################################                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str1, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str1, "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "###############################h                                ###############################", 32);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "###############################h                                ###############################");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "a###################################################a###################################################a###############44444444444444444444444444444444444aaaaaaaaaaaaaaaaaa###################################################a###################################################a################", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aiii!ii!ii!i                             ", strArray7, strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aiii!ii!ii!i                             " + "'", str12, "aiii!ii!ii!i                             ");
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!!!        hI######Hi####################Hi####################Hi####################Hi#!!!!", "###############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####Hi" + "'", str2, "#####Hi");
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("######Hi##############", "");
        java.lang.String[] strArray7 = new java.lang.String[] { "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi                                                             a########################a#############", "hi!hi!hi!hhi!hi!hi!h", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HIi!H", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "######Hi##############" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi                                                             a########################a#############", "hi!hi!hi!hhi!hi!hi!h", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ihihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!#################################################################                                ", 742);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("iHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 100, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "Hi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                                       ", "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h", 98, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hh                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str3, "hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("-1 hi! -1 100.0 0444444444444444444444444444444444444444444444444", "##################################################################H                                ##################################################################", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1 hi! -1 100.0 0444444444444444444444444444444444444444444444444" + "'", str3, "-1 hi! -1 100.0 0444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!...", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "    #I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    #");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A" + "'", str1, "A");
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                                          ", (java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi", 123);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h", "", 730);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h" + "'", str3, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h");
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(";GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      ;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH" + "'", str2, "                      ;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH");
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...!HI!HI!HI!HI!HI!HI!HI!HI!HI...", 247, 482);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ih", (java.lang.CharSequence) "!ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                          hi!hi!hi!h");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                          ", "hi", "!", "hi", "!", "hi", "!", "h" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...", (java.lang.CharSequence) "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!#################################################################", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#######" + "'", str2, "!#######");
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "A########################A########################A#######################", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!HI!H", 221, "AHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HI!HAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHI" + "'", str3, "!HI!HAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHIAHI");
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "Hi##############Hi#############");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("    ################################   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    ################################   " + "'", str1, "    ################################   ");
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("! I! I! I! I! I!                                   ", "                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                            " + "'", str2, "                                                                                                                            ");
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################hi", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!H", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I!HI!HI!", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", "444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444");
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                       hi!hi!hi!h", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "               a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!#################################################################                                ", 19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!IH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 57);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "####", (java.lang.CharSequence) "! I! I! I! I! I! ", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                   I!I!I!I!I!I!I!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   I!I!I!I!I!I!I!HI!" + "'", str1, "                                   I!I!I!I!I!I!I!HI!");
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                              a########################a########################a######################", (java.lang.CharSequence) "#################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                              ", "HI!HI!HI!H");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "i!hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!", "I!", "I!", "I!", "I!", "I!", "I!", "HI!                              " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi##############Hi##############HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!", "!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H" + "'", str1, "HH#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaa                                                                 HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", "hihi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi", "hIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##################################################################################################################################################################################################              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", "aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##################################################################################################################################################################################################              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" });
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("h                                h                                h                                                                                                                                                                                                     ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h                                h            ..." + "'", str2, "h                                h            ...");
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "...!aaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "cl", "ss [Lj", "v", "l", "ng", "String;cl", "ss [Lj", "v", "l", "ng", "String;cl", "ss [Lj", "v", "l", "ng", "String;cl", "ss [Lj", "v", "l", "ng", "String;" });
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("-1 HI! -1H", 124, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1 HI! -1H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "-1 HI! -1H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI", "ahaahaahaahaahaaha...", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI" });
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", "i!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h         class [Ljava.lang.Str", "ng;class [Ljava.lang.Str", "ng;class [Ljava.lang.Str", "ng;               " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi#                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi#" + "'", str1, "Hi#");
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "!Hi!Hi...", (java.lang.CharSequence) "HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     H!IH!IH!IH                     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################H!IH!IH!IH#####################" + "'", str3, "#####################H!IH!IH!IH#####################");
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!", (java.lang.CharSequence) "                                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444       ", (java.lang.CharSequence) "h                                h            ...", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", "H         ", (int) ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "###AAA###############");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!HHi!" + "'", str5, "###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!HHi!");
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "I!I!I!I!I!I!I!I!I!I!", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444H!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih", (java.lang.CharSequence) "################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("###############################H                                ###############################", "A#...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A#...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "A#...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aIahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahihihiaI                                                 #hiaIahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahihihiaIa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "a############################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 95, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!..." + "'", str1, "i!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                                                                                        ", (java.lang.CharSequence) "h         class [Ljava.lang.String;class hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                 ", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                 " + "'", str2, "                                                                                                                                 ");
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hIhIhI################################", "a########################a########################a#######################hi!h h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhIhI################################" + "'", str2, "hIhIhI################################");
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaahi!HI!HI!H...", (java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i!", 122);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i!" + "'", str2, "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i!");
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hH                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hH                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        java.lang.Object[] objArray12 = new java.lang.Object[] { (byte) -1, "hi!", (-1L), 100.0f, 0L, "hi!" };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join(objArray12, "", 35, (int) (byte) 0);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(objArray12, ' ');
        java.lang.Class<?> wildcardClass19 = objArray12.getClass();
        java.lang.Class[] classArray21 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray22 = (java.lang.Class<?>[]) classArray21;
        wildcardClassArray22[0] = wildcardClass4;
        wildcardClassArray22[1] = wildcardClass19;
        java.lang.String[] strArray29 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.stripAll(strArray29);
        java.lang.Class<?> wildcardClass31 = strArray30.getClass();
        java.lang.String[] strArray34 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        java.lang.Object[] objArray39 = new java.lang.Object[] { (byte) -1, "hi!", (-1L), 100.0f, 0L, "hi!" };
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.join(objArray39, "", 35, (int) (byte) 0);
        java.lang.String str45 = org.apache.commons.lang3.StringUtils.join(objArray39, ' ');
        java.lang.Class<?> wildcardClass46 = objArray39.getClass();
        java.lang.Class[] classArray48 = new java.lang.Class[2];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray49 = (java.lang.Class<?>[]) classArray48;
        wildcardClassArray49[0] = wildcardClass31;
        wildcardClassArray49[1] = wildcardClass46;
        java.lang.Class[][] classArray55 = new java.lang.Class[2][];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[][] wildcardClassArray56 = (java.lang.Class<?>[][]) classArray55;
        wildcardClassArray56[0] = wildcardClassArray22;
        wildcardClassArray56[1] = wildcardClassArray49;
        java.lang.String str61 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray56);
        java.lang.String str63 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) wildcardClassArray56, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1, hi!, -1, 100.0, 0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1, hi!, -1, 100.0, 0, hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1 hi! -1 100.0 0 hi!" + "'", str18, "-1 hi! -1 100.0 0 hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(classArray21);
        org.junit.Assert.assertArrayEquals(classArray21, new java.lang.Class[] { java.lang.String[].class, java.lang.Object[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray22);
        org.junit.Assert.assertArrayEquals(wildcardClassArray22, new java.lang.Class[] { java.lang.String[].class, java.lang.Object[].class });
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1, hi!, -1, 100.0, 0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1, hi!, -1, 100.0, 0, hi!]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "-1 hi! -1 100.0 0 hi!" + "'", str45, "-1 hi! -1 100.0 0 hi!");
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertArrayEquals(classArray48, new java.lang.Class[] { java.lang.String[].class, java.lang.Object[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray49);
        org.junit.Assert.assertArrayEquals(wildcardClassArray49, new java.lang.Class[] { java.lang.String[].class, java.lang.Object[].class });
        org.junit.Assert.assertNotNull(classArray55);
        org.junit.Assert.assertNotNull(wildcardClassArray56);
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 2, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "h", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "h         cl#ss [Lj#v#.l#ng.String;cl#ss hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#################################################################hi               4444444444444444444444444444444444444444444444", "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################hi               4444444444444444444444444444444444444444444444" + "'", str2, "#################################################################hi               4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" });
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "         H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", (java.lang.CharSequence) "##aa               Hii               a#######...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                                       ", "444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      ", 2, 238);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      " + "'", str4, "  444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      ");
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                                                                                                                      ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                      " + "'", str2, "                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi                                                             a########################a#############", (int) (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi                                                             a########################a#############" + "'", str3, "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi                                                             a########################a#############");
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4', 0, (int) (short) -1);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence[]) strArray6);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hi!hi!h", strArray2, strArray6);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "aaa" + "'", str13, "aaa");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!hi!h" + "'", str14, "hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################hi", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!H", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I!HI!HI!", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "     hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##aa               Hii               a#######...", (java.lang.CharSequence) "                                   I!I!I!I!I!I!I!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i" + "'", str2, "h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i");
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                 ", (java.lang.CharSequence) "###################################################################aaa                                                                 HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH###################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih", (java.lang.CharSequence) "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 264);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, 96, 742);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("ii!ii!ii!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ii!ii!ii!i" + "'", str1, "Ii!ii!ii!i");
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...aaaaaaaaaaaaaa!...", "#####Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaaaaaaaaaaaaa!..." + "'", str2, "...aaaaaaaaaaaaaa!...");
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                       hi!hi!hi!h", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##aa               Hii               a#######...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hIhIhI444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhIhI444444444444444444444444444444444444444444444444444444444" + "'", str2, "hIhIhI444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h                                h                                h                                ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h                                h                                h", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaa                                                              ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaa", (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", (java.lang.CharSequence) ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                     HI!HI!HI!H                     aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     HI!HI!HI!H                     aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi" + "'", str2, "                     HI!HI!HI!H                     aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("a########################a########################a#######################hi!h                                h", 297, 48);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("a", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "ai", (java.lang.CharSequence) "hI!                          ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                          ###################################################################################################", 239);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                          ###################################################################################################" + "'", str2, "                                                                                                                          ###################################################################################################");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("-1 HI! -1H", "###################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                 #                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiHiHiHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                                        ", 730, 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!Hi!H..");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "Hi", "!", "H", ".." });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!", "Hi", "!", "H", ".." });
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("##############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "##############################################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "              aaaaaaaaaaaaaaaaaaaaaaaaaH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA              ", "...i!h..");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!", "a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!" + "'", str2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!");
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("##################################               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...##################################", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...##################################" + "'", str2, "##################################               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...##################################");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!44444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!44444444444444444444444" + "'", str1, "4444444444444444444444i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!44444444444444444444444");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#h##h##h##h##h##h#...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#", "h", "##", "h", "##", "h", "##", "h", "##", "h", "##", "h", "#..." });
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("A########################a########################a#######################hi!h h", 85, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  A########################a########################a#######################hi!h h   " + "'", str3, "  A########################a########################a#######################hi!h h   ");
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################a", (java.lang.CharSequence) "AA###############################################################################################                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a########################a########################a#######################hi!h h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a', 100, 18);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Lj", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 105);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "I!hI!hI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", "-1 HI! -1H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" });
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!#################################################################", "                      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                       ...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h         class [Ljava.lang.String;class hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!                          ...                                     ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 66, 399);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih  4444444444444444444444444444444444444444444444444444444444                      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", "  ", "4444444444444444444444444444444444444444444444444444444444", "                      " });
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          " + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          ");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "               ..................................................................I               ................................");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444", 0, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444");
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a########################a########################a#######################", 509, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a########################a########################a#######################                                                                                                                                                                                                                                                                                                                                                                                                                                                   " + "'", str3, "a########################a########################a#######################                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                       HI!HI!HI!H", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "##################################################################################################iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "I!h", (java.lang.CharSequence) "                                                 #                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("##aaHiia###########################################################################################", 0, 248);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##aaHiia###########################################################################################" + "'", str3, "##aaHiia###########################################################################################");
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aaaaaaaaaaaaaaaaH                                H                                Haaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AIAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHIHIHI" + "'", str1, "AIAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHIHIHI");
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!!h", "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!!h" + "'", str2, "-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!!h");
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                        hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "..........", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!HI!HI!HI!HI..." + "'", str1, "!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444", "                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!" + "'", str5, "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#", "444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                                  hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", 34);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "a########################a########################a#######################hi!h h");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("A#################################################################################################AA #################################################################HI A#################################################################################################AA", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A" + "'", str2, "A");
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444       ", "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################ah", "h class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", "hI");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#####################################                                     ...!AAAAAAAAAAAAAA...                                     ", (int) (short) 0, 233);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               " });
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("AA###############################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA###############################################################################################" + "'", str1, "AA###############################################################################################");
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;               ", (java.lang.CharSequence) "! i! i! i! i! i! ", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("########...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########..." + "'", str1, "########...");
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("iiiiiiiiiiiii#################################################################iiiiiiiiiiiii", "                                                                                                      ", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "iiiiiiiiiiiii#################################################################iiiiiiiiiiiii" });
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 31, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "HI!HI!HI!" });
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "AA#                                                 4HiAA#", (java.lang.CharSequence) "                                                                                                                                 ...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#################################################################h", "A###################################################################       444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("I!HI!HI!", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!                        " + "'", str2, "I!HI!HI!                        ");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#######a########################a#######################hi!h                                h                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######a########################a#######################hi!h                                h                            " + "'", str1, "#######a########################a#######################hi!h                                h                            ");
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "AHI!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "44444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" + "'", str4, "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" + "'", str5, "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" });
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               #################################################################hi               ", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!H...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!HI!H...", "hIHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!H..." + "'", str2, "HI!HI!H...");
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("a#################################################################################################aa #################################################################hi A#################################################################################################aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a#################################################################################################aa#################################################################hiA#################################################################################################aa" + "'", str1, "a#################################################################################################aa#################################################################hiA#################################################################################################aa");
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Ii!ii!ii!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ii!ii!ii!i" + "'", str1, "Ii!ii!ii!i");
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "h class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i!", (java.lang.CharSequence) "aiii!ii!ii!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...                                                                                          ", (int) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...                                                                                          " + "'", str3, "                                                                                         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...                                                                                          ");
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "H!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4", "", 32);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4" + "'", str5, "4");
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                hi!", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaa...", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aA#################################################################################################AAA######################################################################################hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AA#################################################################################################AAA######################################################################################HI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "AA#################################################################################################AAA######################################################################################HI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("##aaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiia#######...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##aaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiia#######..." + "'", str1, "##aaiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiia#######...");
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "4444444444444444                                hiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[44444444444444444", (java.lang.CharSequence) "         I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" + "'", str4, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "A###################################################################       444444444444444444444444444", (java.lang.CharSequence) "h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;               ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!HHi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AHIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444" + "'", str2, "AHIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444");
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", 48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 100, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 48");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!HI!H", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!H" + "'", str2, "!HI!H");
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi", 293);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444" });
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "A########################A########################A#######################HI!H", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444444444444444", 484);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                     4444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                     4444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                     ");
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ha###############################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HA###############################################################################..." + "'", str1, "HA###############################################################################...");
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##################################               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...##################################", 57, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 1, 165);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, "I!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi#########################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("###################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################" + "'", str1, "###################################################");
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...###############################################H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###############################################H" + "'", str1, "...###############################################H");
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                      H!iIH!IH!IH!IH!IH!IH!IH!IH!IHiH!ih444444444444444444", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i44i444i4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...iH!iH!iH!iH!iH!iH!iH!iH                               ", 98, "#################################################################################################...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################...iH!iH!iH!iH!iH!iH!iH!iH                               #####################" + "'", str3, "####################...iH!iH!iH!iH!iH!iH!iH!iH                               #####################");
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) ";agnirtsa.agnala.aavajla[a assalca;agnirtsa.agnala.aavajla[a assalca;agnirtsa.agnala.aavajla[a assalca         ah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hi!hi!hi!hi!hi!hi!hi...44444444444444444444444444444444aaaa", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi...4444444" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi...4444444");
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "");
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "Hi##############Hi##############", (java.lang.CharSequence[]) strArray4);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "", 26, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("       ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "-1 hi! -1 100.0 0444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "i!H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                          hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hhi", "class [Ljava.lang.String;class [Ljava.lang.String;class [Lja###############################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hh" + "'", str2, "                          hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hh");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", 125, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h                                h                                h                                ", "..aaaaaaaaaaaaaa!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                         ", 103);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '#', 465, (int) (byte) 1);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strArray4, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 97 vs 50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str6, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("##aahiia###########################################################################################", "4444444444444444hi44444444444444444", "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h...!AAAAAAAAAAAAAA...                                     aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##aahiia###########################################################################################" + "'", str3, "##aahiia###########################################################################################");
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("##############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "##############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                               #   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               #   " + "'", str1, "                               #   ");
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aiii!ii!ii!i                             ", (java.lang.CharSequence) "a###################################################################       ", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", "                                hi!", (int) (short) -1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AA#                                                 4HiAA#", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h         ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################################################", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "               #################################################################hi               ################################", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                               ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "A#################################################################################################AA #################################################################HI A#################################################################################################AA", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("! I! I! I! I! I!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "! I! I! I! I! I!" + "'", str2, "! I! I! I! I! I!");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#" + "'", str1, "#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#");
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...44444444444444444444444444444444aaaa", (java.lang.CharSequence) "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) ".iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.Stri", (java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" + "'", str1, "              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("h                                h                                h                                                                                                    ", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         " + "'", str2, "                                         ");
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 19, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("A#...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A#...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "A#...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("         I44444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "4444444444444444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...!AAAAAAAAAAAAAA...                                     aaaaaaaaaa", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("! I! I! I! I! I!                                   ", "HiHiHiHiHiHiHiHiHiHiHi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiHiHiHiHiHiHiHiHiHiHi..." + "'", str2, "HiHiHiHiHiHiHiHiHiHiHi...");
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a########################a########################a#######################", "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", 129);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "a################################################################################################...", (java.lang.CharSequence[]) strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h", (java.lang.CharSequence[]) strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("IaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiH", strArray2, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                ", "H", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "a########################a########################a#######################" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "a########################a########################a#######################" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }
}

