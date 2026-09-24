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
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("014444444444!!!!!!!!!!!", "h00h00h        ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ih10hi!10hi!...1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1", "0000000000000000000000000000000000000aAAAAAAAAAAAAAAAA!ih!ih01!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!...1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1" + "'", str2, "!ih10hi!10hi!...1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "                                                                                                    ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("001001   01aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah00h00h00h00h00h00h00h00h00   ...001001   01", "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        char[] charArray8 = new char[] { '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("            00H00H00H00H00H00H00H00H00H             ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("11                                                                                         11111111                                                                                         1  ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("100                                                                                              ", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("###################################h##h##h##h##h##h#...#################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 98 + "'", int9 == 98);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444", "44444444104444444410444444441044444!ih!ih01!ih100.........................................");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444" });
    }

    @Test
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!ih10hi!10hi!...1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1", "1010hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                    ", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        int int1 = org.apache.commons.lang3.StringUtils.length("aahi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 16, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str3, "...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "11", "1", "11", "1", "11", "1", "11", "1", "11", "1" });
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("aahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                                                                                 ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                            HI!       ..                                                                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            HI!       ..                                                                                            " + "'", str2, "                                                                                            HI!       ..                                                                                            ");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("10HI! 1010 10", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1", "00");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", 104, 90);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("   11 1 11 1 11 1 11 1 11 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("..00h00h.000h!i", strArray3, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1" + "'", str10, "1");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "   ", "11", " ", "1", " ", "11", " ", "1", " ", "11", " ", "1", " ", "11", " ", "1", " ", "11", " " });
    }

    @Test
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                 ", "                                       10hi!10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("h10hI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray4, strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "hi!", 10, (int) (short) -1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00hi!", "");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "00hi!", (int) (short) 0);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("0000000000000000000000000000000000000000000000000000000000000000000000", strArray16, strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("0000000000000000000000000000000000000000000000000000000000000000000000", strArray5, strArray20);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "44444444444444AAA                                    44444444444444AAA                                    444444", 140, 20);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str21, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str22, "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!" });
    }

    @Test
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0404HI!...    ......    ......  ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("1                                                                                         11111111                                                                                         11", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!a...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         11111111                                                                                         " + "'", str2, "                                                                                         11111111                                                                                         ");
    }

    @Test
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ", "HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("1            00h00h00h00h0...", 17, 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0h00h00h0..." + "'", str3, "0h00h00h0...");
    }

    @Test
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...aaa", 180, "                                                                                                                                                                                   10hi 1010 10       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                              ...aaa" + "'", str3, "                                                                                                                                                                              ...aaa");
    }

    @Test
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("00H00H00H00H00H00H00H00H00H                                                                      ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...   00h00h", "... 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   00h00h" + "'", str2, "...   00h00h");
    }

    @Test
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("10                                                                      00h00h00h00h0!ih!ih01!ih010!", "...         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                      00h00h00h00h0!ih!ih01!ih010!" + "'", str2, "10                                                                      00h00h00h00h0!ih!ih01!ih010!");
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "...                                                                ...", 180);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("             ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                   ..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!h!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!hi!!IH10HI!10HI!HI!010HI!10HI!HI!!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                   .." });
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("10hi 1010 1", "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi 1010 1" + "'", str2, "10hi 1010 1");
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                                                                                               00h00h00h00h00h00h00h00h00h", "hi!       ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                 11                              ", "1                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaa4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "0hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                              0404101                                               ", "                      4444444                                    ..444444", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                            100                    ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!                                                ", 928, 67);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("                                              0404HI!              ..", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("00HI!              ..", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!              .." + "'", str2, "00HI!              ..");
    }

    @Test
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                            4444444444444444444444         ", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            4444444444444444444444         " + "'", str2, "                            4444444444444444444444         ");
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("   0444444", "00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                    144i!144i!4i!", "00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                 ", ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("144i!144i!4i!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!HI!HI!HI!HI!HI!HI!HI!Haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaHI!HI!HI!HI!HI!HI!HI!HI!H", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "#################################################################################################" + "'", str7, "#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...aaa00h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 52, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaa00h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str3, "...aaa00h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("00h00h00h00h00h00h00h00h00h", ".............................................................................................................", "aa1140144444444014444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str3, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                   1  I 1  I  I ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h00h00h00h00h00h00h00h                 ########################  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "                 ", "########################", "  " });
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("HI!000404HI!000404HI!000404HI!000404HI!00AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" 144I!144I!4I!", "#################################################################################################################################################         00h00h00h00h00h00");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " 144I!144I!4I!" });
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10                                                                                               1010", 104, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a10                                                                                               1010aa" + "'", str3, "a10                                                                                               1010aa");
    }

    @Test
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4444444aaa00h00");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("        1    IH0HI!HI!H00");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "1", "IH0HI!HI!H00" });
    }

    @Test
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                              ", 761);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              " + "'", str2, "                                              ");
    }

    @Test
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("HI!                                ", "0a0ahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...00h00h00h00h00h00h00h00h00h ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(" 144i!144i!4i!                                              0404HI!                                               ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444441044444444104                                                                 444444444444444444444444444...4444444410444444441044", "11#1#11#1#11#1#11#1#11#1", 9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444441044444444104                                                                 444444444444444444444444444...4444444410444444441044" });
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00H                                                                                                                                                                                     ", "                                            100                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   11 1 11 1 11 1 11 1 11 ", "HI!0404HI!0404HI!0404HI!0", "   0444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   11 1 11 1 11 1 11 1 11 " + "'", str3, "   11 1 11 1 11 1 11 1 11 ");
    }

    @Test
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#0404HI!##                                                                                                                                                                      ", "!ih10hi!10hi!  ...!ih10hi!10hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h", 206, "                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h" + "'", str3, "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaahhhhhhhh", "00H                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaahhhhhhhh" });
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("0000000000000000000000000000000000000aAAAAAAAAAAAAAAAA!ih!ih01!ih0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000000000000aAAAAAAAAAAAAAAAA!ih!ih01!ih0" + "'", str1, "0000000000000000000000000000000000000aAAAAAAAAAAAAAAAA!ih!ih01!ih0");
    }

    @Test
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                         11111111                                                                                         ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "11111111" });
    }

    @Test
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...00h00h00haaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...00h00h00haaa" + "'", str1, "...00h00h00haaa");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00H10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "iiiiiiiiii...", 156);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " });
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("10                                                                                               1010", "                                 00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                               " + "'", str2, "                                 00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                               ");
    }

    @Test
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str2, "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10hi", "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "1", 0, 20);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1111111111111111111" + "'", str7, "1111111111111111111");
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("10                                                                                               10100h00h00h00h00h00h00h00h00h       ", "                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 46 + "'", int2 == 46);
    }

    @Test
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("1111111111111", "############0000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111" + "'", str2, "1111111111111");
    }

    @Test
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#########################   ########################                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#########################", "", "", "########################", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444444444444444444444                                                                                                              ", "   00H00H00H00H00H00H00H0                                                ########################   #########################                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444444444104444444410411444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                       111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       111" + "'", str1, "                                       111");
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("######################### ########################", "...   0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444104444444410444444441044444!ih!ih01!ih100.........................................", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                             4444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                         ", "0404hi!010101!ih01000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444444         1                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         " + "'", str2, "                                                                                         ");
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0014444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("144I!1    ..aaaaaaaaaaaaaaaaa01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144i!1    ..AAAAAAAAAAAAAAAAA01 0101 !IH01       01 0101 !IH01       01 0101 !IH01       01 0101 !IH01       01 0101 !IH01       01 0" + "'", str1, "144i!1    ..AAAAAAAAAAAAAAAAA01 0101 !IH01       01 0101 !IH01       01 0101 !IH01       01 0101 !IH01       01 0101 !IH01       01 0");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("11", "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("0H00H00H00H00H00H00H00H00H", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!       ..4444444410", "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("..                                    !I!4H4H        ..", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("01", strArray4, strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "11" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "HI!       ..4444444410" });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "01" + "'", str11, "01");
    }

    @Test
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone("", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("10", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444104444444410444444441044444!IH!IH01!IH010!IH!IH01!IH01HI!44444444104444444410444444441044444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444104444444410444444441044444!IH!IH01!IH010!IH!IH01!IH01HI!4444444410444444441044444444104444" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444104444444410444444441044444!IH!IH01!IH010!IH!IH01!IH01HI!4444444410444444441044444444104444");
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                   ##                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                            00H!i", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!i" + "'", str2, "00H!i");
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa404!ih", "01 0101 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa404!ih" + "'", str2, "0aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa404!ih");
    }

    @Test
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!", 7, 167);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I" + "'", str3, "! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I");
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("144I!144I!4I!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("0!IH!IH01!IH010!IH!Iih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H  H  H  H  H  H  H  H  H             ", "11#1#11#1#11#1#11#1#11#1");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H  H  H  H  H  H  H  H  H             " });
    }

    @Test
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("..        0404HI!                                    .", 178, 544);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaHHHHHHHH", 198, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                       aaaaaaaHHHHHHHH" + "'", str3, "                                                                                                                                                                                       aaaaaaaHHHHHHHH");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!                                4444444", "11111111                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                                                                                                                                                                                              10HI!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("I", "100100100...", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!iH ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("144i!1", "4444444hI!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("..                                    !I!4H4H        ..", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "144i!1" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44...", "          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("iiiiiiiiii...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iiiiiiiiii..." + "'", str1, "iiiiiiiiii...");
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("...0h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        0..", "11!11!11!11!11!11!11!11!1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!                                4444444", 143, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11", "100                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!", "0000000000000000000000000                                                                        ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        char[] charArray7 = new char[] { 'a', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("                                       10hi!10", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("44...", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                                                                       aaaaaaaHHHHHHHH", "             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                       aaaaaaaHHHHHHHH" + "'", str2, "                                                                                                                                                                                       aaaaaaaHHHHHHHH");
    }

    @Test
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        char[] charArray14 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("00HI!              ..", charArray14);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsAny("00h00h00h00h00h00h00h00h00h             4", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("", "h00h00h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444", " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444" + "'", str2, "0h00h00h#############4444444444444444444444444444ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410hi 1010 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410HI 1010 1" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410HI 1010 1");
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1                                                      ", "10                                                                                               1010", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("01                                                                                               ", 184, "...0h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        0...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...0h                        00h00h00h00h0001                                                                                               ...0h                        00h00h00h00h00h" + "'", str3, "...0h                        00h00h00h00h0001                                                                                               ...0h                        00h00h00h00h00h");
    }

    @Test
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("1                                                                                         11111111                                                                                         11", "...!ih01hi!11111111111111111111111111111111111...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1                                                                                         11111111                                                                                         11" + "'", str2, "1                                                                                         11111111                                                                                         11");
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI" + "'", str3, "       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI");
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!iH ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH" + "'", str1, "!iH");
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "h11111111");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ", 930, 148);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      " + "'", str1, "HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      ");
    }

    @Test
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                       44444444444444444444444444444444444", "00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       44444444444444444444444444444444444" + "'", str2, "                                       44444444444444444444444444444444444");
    }

    @Test
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iiiiiiiiii...", "00H10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "iiiiiiiiii..." });
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("         1                                                      ", "a44i!a44i!4i!                                              a4a4HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a44i!a44i!4i!                                              a4a4HI!" + "'", str2, "a44i!a44i!4i!                                              a4a4HI!");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00" + "'", str1, "00h00h00h00h00h00");
    }

    @Test
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("44444444104444444410411", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410411" + "'", str2, "44444444104444444410411");
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaHHHHHHHHH", 441, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                               00h00h00h00h00h00h00h00h00h", "                                                                                                                                                                                                                                                                                   i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1 i  i  1 i  1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               00h00h00h00h00h00h00h00h00h" + "'", str2, "                                                                                                               00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                              10hi!10", "10                                                                                          ...", 73);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i1aaaaaaaaaa11aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih!ih01!ih", "404HI!", "     144I!1    ..      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih01!ih" + "'", str3, "!ih!ih01!ih");
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("H00h00h00h00h00h00h00h00h", "", "0404HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H00h00h00h00h00h00h00h00h" + "'", str3, "H00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                    a", "...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa                                              0404101                                               ...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa...aaa.", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    a" + "'", str3, "                                    a");
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaa11401444444440144444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaa11401444444440144444444" + "'", str1, "aaaaaaaaa11401444444440144444444");
    }

    @Test
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444444444##h##h##h##h##h##h#...444444444444444", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444##h##h##h##h##h##h#...444444444444444" + "'", str2, "444444444444444##h##h##h##h##h##h#...444444444444444");
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "0h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi1010" });
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                               00h00h00h00h00h00h00h00h00", "!444444!4444!  ...");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("00H00H00H00H00H00H00H00H00", "hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa", 363);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("#######!ih!ih01!ih01", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "00H00H00H00H00H00H00H00H00" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("            00", "                 11                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00" });
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                                                                    " });
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAAAAAAAAAAA!ih!ih01!ih0", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10HI! 1010 10                                                   !ih!i     AAA", "          ...", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!IH10HI!10HI!HI!010HI!10HI!HI!01!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0!IH10HI!10HI!HI!010HI!10HI!HI!0", "     144I!1    ..      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444104", "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("0 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0", 35, 86);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 aaaaaaaaaaaaaaaaaa" + "'", str3, "                                 aaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 133, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" hh hh hh hh hh hh hh hh hhhhhhhhh444hhhhhhhhhhhh444444hhhhhhhhhhhh444hhhhhhhhhhhh444hhhhhhhhhhhh444", 154, 582);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hh hh hh hh hh hh hh hh hhhhhhhhh444hhhhhhhhhhhh444444hhhhhhhhhhhh444hhhhhhhhhhhh444hhhhhhhhhhhh444" + "'", str3, " hh hh hh hh hh hh hh hh hhhhhhhhh444hhhhhhhhhhhh444444hhhhhhhhhhhh444hhhhhhhhhhhh444hhhhhhhhhhhh444");
    }

    @Test
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                       1ahia1ahiahia", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiahia1ahia                                       1" + "'", str2, "hiahia1ahia                                       1");
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!       ..HI!       ..HI!       .", "    10   1001001001001001001001001001001001001001001001001001001001001001001001001001001001001001", 49, 88);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!       ..HI!       ..HI!       .    10   1001001001001001001001001001001001001001001001001001001001001001001001001001001001001001" + "'", str4, "HI!       ..HI!       ..HI!       .    10   1001001001001001001001001001001001001001001001001001001001001001001001001001001001001001");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                 " });
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("00H!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H!" + "'", str1, "00H!");
    }

    @Test
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H" + "'", str1, "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!010hi!10hi!hi!!ih10hI!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             ", "10     1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", 133);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444                       " + "'", str2, "                       4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444                       ");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("00H!IH!IH0HI!                                        H00h00h00h00h00h00h00h00h              144I!144I!4I!", "                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!IH!IH0HI!                                        H00h00h00h00h00h00h00h00h              144I!144I!4I!" + "'", str2, "00H!IH!IH0HI!                                        H00h00h00h00h00h00h00h00h              144I!144I!4I!");
    }

    @Test
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("00h!ih!ih0hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h!ih!ih0hi" + "'", str1, "00h!ih!ih0hi");
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("100", "44444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 ", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "100" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100" + "'", str5, "100");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "100" + "'", str6, "100");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("0404hi!", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("444444                                    ..444444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                              ", 94, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaa                                                                              " + "'", str3, "aaaaaaaaaaaaaaaa                                                                              ");
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1" + "'", str2, " 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1");
    }

    @Test
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("44444444104444444410444444441044444!ih!ih01!ih100.........................................4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("10                                                                                               1010                                                                                               10HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0404HI!");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "00H!ih!ih0");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "0404HI!" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "0404HI!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "404HI" });
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                HI!                                                                 ", "", "hi!10hi!hi!", 36);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                HI!                                                                 " + "'", str4, "                                HI!                                                                 ");
    }

    @Test
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                       4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444                       ", "aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H00h00h00h00h00h00h00h0000H00H00H00H00H00H00H00H00HH00h00h00h00h00h00h00h00", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "00000000000000000000000000010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            00h00h00h00h00h00", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "            00h00h00h00h00h00" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "            00h00h00h00h00h00" + "'", str4, "            00h00h00h00h00h00");
    }

    @Test
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...                                                                                     AAA", "44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                     AAA" + "'", str2, "...                                                                                     AAA");
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("     01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01        " + "'", str1, "     01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01        ");
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                   A                                                    ", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("########################   #########################");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                     ", "0hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     " + "'", str2, "                                     ");
    }

    @Test
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih10hi!10hi!  ...!ih10hi!10hi!h", 26, "                                   ##                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!  ...!ih10hi!10hi!h" + "'", str3, "!ih10hi!10hi!  ...!ih10hi!10hi!h");
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA44444444104444444410444444441044444!IH!IH01!IH010!IH!IH01!IH01HI!4444444410444444441044444444104444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "44444444104444444410444444441044444", "!", "IH", "!", "IH", "01", "!", "IH", "010", "!", "IH", "!", "IH", "01", "!", "IH", "01", "HI", "!", "4444444410444444441044444444104444" });
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...0h                        00h00h00h00h0001                                                                                               ...0h                        00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...0H                        00H00H00H00H0001                                                                                               ...0H                        00H00H00H00H00H" + "'", str1, "...0H                        00H00H00H00H0001                                                                                               ...0H                        00H00H00H00H00H");
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("h!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI!", "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                    ", 154);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                       ..." + "'", str2, "                                                                                                                                                       ...");
    }

    @Test
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###00###00###00###00###00", "                                                                                               1 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###00###00###00###00###00" });
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("00h00h00h00h00h00h00h00h00h                                                                      ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("44444444444444444444444444444444444444444444444444444444444444444", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("0hi 1010 10", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    0hi 1010 10" + "'", str2, "                    0hi 1010 10");
    }

    @Test
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("H!ih!ih0Hi!", "                                    0404HI!              ...", 94, 363);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H!ih!ih0Hi!                                    0404HI!              ..." + "'", str4, "H!ih!ih0Hi!                                    0404HI!              ...");
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("01 0101 !ih01       ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                aaa                                00000000000000000000000", "00H!ih!ih0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00H", "4444444aaa00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H" + "'", str2, "00H");
    }

    @Test
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444                ...4444444", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "101011aaaaaaaaa", 98, 182);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 98 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444                ...4444444" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000000000000000000000000" + "'", str1, "00000000000000000000000000000000000");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!..", "a...", "####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!.." + "'", str3, "HI!..");
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        char[] charArray8 = new char[] { 'a', '#', 'a', '#', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("0!ih!ih01!ih010!ih!ih01!ih01hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..hi!       ..", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', 'a', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                             10HI! 1010 10", "100100100100100100100100100100100100");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#########################   ########################                ", "##H##H##H##H##H##H##H##H##H                                                                      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#########################   ########################                " });
    }

    @Test
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Aa", 9, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######Aa" + "'", str3, "#######Aa");
    }

    @Test
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        java.lang.String[] strArray5 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', (int) '#', 3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "1");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                                                                               10");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray16);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444444444410                                                                                               1010                                                                                               10HI!44", strArray5);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                                                       hi!10hi!hi!                                                                        ", 5, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str14, "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 206 + "'", int18 == 206);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("#         1                                                                                                                                       ##", "0h00h...44400h00h...4...44400h00h...44400h00h...44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#         1                                                                                                                                       ##" + "'", str2, "#         1                                                                                                                                       ##");
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("144I!144I!4I!1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ", "hI!       ..4444444410                                                                                       ###################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###00###00###00###00###00                                                                                                                                                                 ", (int) (short) 100, "                                                                                                                                                        00                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###00###00###00###00###00                                                                                                                                                                 " + "'", str3, "###00###00###00###00###00                                                                                                                                                                 ");
    }

    @Test
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00...", 178);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00...                                             " + "'", str2, "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00...                                             ");
    }

    @Test
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aa", "aa11401444444440144444444a11401444444440144444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa" + "'", str2, "aa");
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("HI!       ..4444444410", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        1", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("00H!ih!ih0Hi", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("aaa", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                 aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##h##h##h##h##h##h##h##h##h                                                                      !HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
    }

    @Test
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                              11", "00h", (int) 'a');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                              11" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("10                                                                      00h00h00h00h0!ih!ih01!ih010!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                      00h00h00h00h0!ih!ih01!ih010!" + "'", str1, "10                                                                      00h00h00h00h0!ih!ih01!ih010!");
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!ih10hi!10hi!hi!010hi!10hi!hi!", "01 0101 !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!" + "'", str2, "!ih10hi!10hi!hi!010hi!10hi!hi!");
    }

    @Test
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("144I!1    ..aaaaaaaaaaaaaaaaa01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0", "", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Aa", "44444444444401 0101 !ih01  I 1  ...444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Aa" + "'", str2, "Aa");
    }

    @Test
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("144I!144444444444444444444444444444444444444444444", 156);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                          144I!144444444444444444444444444444444444444444444" + "'", str2, "                                                                                                          144I!144444444444444444444444444444444444444444444");
    }

    @Test
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                      44...", "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a" });
    }

    @Test
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("############################################################################################144I!1    ..", 761, "1001001001001");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################################################################################144I!1    ..100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001" + "'", str3, "############################################################################################144I!1    ..100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001001001100100100100110010010010011001001");
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("00H00H00H00H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "00H00H00H00H" });
    }

    @Test
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "                           000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                    0404HI!              ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    0404HI!              ..." + "'", str1, "                                    0404HI!              ...");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("10");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                HI!                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
    }

    @Test
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00H!ih!ih0Hi!", "10                                                                                          ...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                    !ih10hi!10hi!  ...                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H!ih!ih", "Hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H!ih!ih                                                                                    !ih10hi!10hi!  ...                                                                                    Hi!" + "'", str4, "H!ih!ih                                                                                    !ih10hi!10hi!  ...                                                                                    Hi!");
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!       ..hi!       ..hi!       .", "aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("0hi!10hi!hi!AAAAAAAAAAAAAAAAA", "                                              0404101                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hi!10hi!hi!AAAAAAAAAAAAAAAAA" + "'", str2, "0hi!10hi!hi!AAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("..                           ...", "444444   4444444410                               ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H", 186, "            00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H            00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00" + "'", str3, "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H            00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00");
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("            00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!HI!000404HI!000404HI!0004044444444444444444444444444444444444444444444444444");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!HI!000404HI!000404HI!0004044444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("    ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h" + "'", str1, "0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "1##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##h##h##h#...##h##h##h##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                    ...", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!IH4040AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH4040AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "!IH4040AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("         00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         00h00h00h00h00h00" + "'", str1, "         00h00h00h00h00h00");
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "#######  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("   !iH   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                 aaaaaaaaaaaaaaaaaa", "040...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih!ih01!ih01", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("     00H!i", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0014444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ...", "                                                                                                                                  HI!                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0014444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0" + "'", str3, "H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0014444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0");
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        char[] charArray14 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", charArray14);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", charArray14);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly("1100", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly("      ", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("AAAAAAAAAAAAAAAAA ih ih0  ih0", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("H00H00H00H00H00H00H00H00H000h00h00aaah00h00h00h00aaaaaah00h00h00h00aaah00h00h00h00aaah00h00h00h00aaa", "00000000000000000000000000010");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("144I!1..aaaaaaaaaaaaaaaaa010101!ih01010101!ih01010101!ih01010101!ih01010101!ih01010", 'a', 178);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "44444444444444444444444444444444444                                                                                                               11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 11 1 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1  i 1 01 0101 !ih01  i 1 ", "0                                                                                                 ", 156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                 aaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                 ", "aaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", "AAAAAAAAAAAA00", 173);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!" });
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aaa####################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaa####################################" });
    }

    @Test
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("H!ih!ih0Hi!                                    0404HI!              ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...aaa", "0h00h00h             4444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaa" + "'", str2, "...aaa");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih0");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "h00h00h00h00h00h00h00h     1  I 1  I  I");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih!ih0" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!i" });
    }

    @Test
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0014444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0", 490, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0014444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0014444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0");
    }

    @Test
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                 4444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("10101010hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih01010101" + "'", str1, "!ih01010101");
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("H!!!!I!!II!!!!I!!I!!I!!!!I!!II!!!!I!!I!!IIH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h" + "'", str1, "4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("HI!..HI!..HI!.");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("######################################################################   11 1 11 1 11 1 11 1 11 1######################################################################", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h           ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h           " });
    }

    @Test
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "0", "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0ahia!ahia!" + "'", str3, "0ahia!ahia!");
    }

    @Test
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 184);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                        " + "'", str2, "                                                                                                                                                                                        ");
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!10hi!hi!", "01010101010101010101010101010101010101010101010101", 414, 363);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!10hi!hi!01010101010101010101010101010101010101010101010101" + "'", str4, "hi!10hi!hi!01010101010101010101010101010101010101010101010101");
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("44444444444444444444444444", "00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I                                            00h!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0", "hh hh hh hh hh hh hh hh hhhhhhhhhaaahhhhhhhhhhhhaaaaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaahhhhhhhhhhhhaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0" + "'", str2, "10101010HI!0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0404HI!...0");
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444410                                                                                       4444444410                                                                                       411", "4444444444444444444444444444444444", 27);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10                                                                                       ", "10                                                                                       ", "11" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10                                                                                       00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h010                                                                                       00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h011" + "'", str6, "10                                                                                       00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h010                                                                                       00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h011");
    }

    @Test
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("            00H00H00H00H00H00H00H00H00H            ", "1  i 1 01 0101 !ih01  i 1 ", "0000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            00H00H00H00H00H00H00H00H00H            " + "'", str3, "            00H00H00H00H00H00H00H00H00H            ");
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih" + "'", str1, "00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaa", 20, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaHI!HI!HI!HI!HI!HI" + "'", str3, "aaaHI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                 4444444444444444444444         1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                 ", "4444444444444444444444", "         ", "1" });
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                    ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                           ", "                                              0404HI!                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1", "########################   ########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("#########################################################################11 1 11 1 11 1 11 1 11 1", "44444444444400H00H00H00H00H00H00H00H00444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################11 1 11 1 11 1 11 1 11 1" + "'", str3, "#########################################################################11 1 11 1 11 1 11 1 11 1");
    }

    @Test
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("11111111                                                 ", "         1                                                                                                                                       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", "0h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 182 + "'", int2 == 182);
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0404hi!                                             ", "0444444444", "0000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0404hi!                                             " + "'", str3, "0404hi!                                             ");
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1                                                      ", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "I0HI!I0", (int) (byte) 1, 86);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1                                                      " });
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AAA00H00H00H00HAAA00H00H00H00HAAA00H00H00H00HAAA", "                             ...", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...   0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   0" + "'", str1, "...   0");
    }

    @Test
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0h00h00h00h00h00h00h00h00h", "    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h00h00h00h00h00h00h" + "'", str2, "0h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("144i!144i!4i!", "10                                                                                          ...", 94, 114);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "144i!144i!4i!10                                                                                          ..." + "'", str4, "144i!144i!4i!10                                                                                          ...");
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!0404101040410104041010404101" + "'", str1, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!0404101040410104041010404101");
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H00H00H00H", "HI!                                4444444", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("10        ...", "#################################################################################################AAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10        ..." + "'", str2, "10        ...");
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "100100100...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "     01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01        ", "#0404HI!##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                 00000000000000000000000000000000000" + "'", str1, "                                                                 00000000000000000000000000000000000");
    }

    @Test
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("...aaa", "ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!444444441044444444104444444410                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h" + "'", str2, "h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h");
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   4444444410                                                                                                                                                                  00h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...10...", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", 544);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("H!ih!ih0", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#################################################", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################" + "'", str2, "#################################################");
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str2, "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...aaa        4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ", "44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                              0404HI!              ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...", "00h00h00h00h00h00h00h00h00h                                       10HI!1000h00h00h00h00h00h00h00h00h                                       10HI!1000h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i..." + "'", str2, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...");
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("..0404HI!.", "444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "..0404HI!." });
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", " !ih10hi!10hi!hi!010hi!10hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                    0hi 1010 10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray5, strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "hi!", 10, (int) (short) -1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "1", (int) (byte) 0);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, "");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                               10", strArray6, strArray17);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny("                                 00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                               ", strArray6);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray6);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                               10" + "'", str20, "                                                                                               10");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("404hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "404hi!" + "'", str1, "404hi!");
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                    4444444", "0                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("H00H00H00H00H00H00H00H00H", 17, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H00H00H00H00H00H00H00H00H" + "'", str3, "H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "    a!aiha!ai");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                         ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("44444104");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                   11                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("...####...", "!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 .   00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 .   00h00h" + "'", str1, "H00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 .   00h00h");
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", "00H!ih!ih0H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str2, "000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaaa#0404HI!##aaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444" + "'", str1, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                aaa                                00000000000000000000000", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!" + "'", str2, "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
    }

    @Test
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h", "a44i!a44i!4i!a4a4HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...                                      00", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           00" + "'", str2, "                           00");
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("100100100100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...   0", 129, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   0##########################################################################################################################" + "'", str3, "...   0##########################################################################################################################");
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!010hi!10hi!hi!!ih10hI!                                              0404101                                                                                             0404101                                                                                             0404101                                                                                             0404101                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                             1014040                                                                                             1014040                                                                                             1014040                                                                                             1014040                                              !Ih01hi!!ih!ih01!ih010!ih" + "'", str1, "                                                                                             1014040                                                                                             1014040                                                                                             1014040                                                                                             1014040                                              !Ih01hi!!ih!ih01!ih010!ih");
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("########################aa", "##h##h##h##h##h##h##h##h##h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" A44I!A44I!4I!                                              A4A4HI!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " A44I!A44I!4I!                                              A4A4HI!                                               " + "'", str1, " A44I!A44I!4I!                                              A4A4HI!                                               ");
    }

    @Test
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!" + "'", str1, "IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!");
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00HI!", "00H00H00H00H00H00H00H00H00H                        00H00H00H00H                                   ", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  #  H00H00H00H#  H00H00H00H#  H00H00H00H", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  #  H00H00H00H#  H00H00H00H#  H00H00H00H" + "'", str2, "  #  H00H00H00H#  H00H00H00H#  H00H00H00H");
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("HI!10##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "                                                                                               10");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("10hi 1010 10", strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h00h00h00h00h00h00h00h             ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10hi!10hi!hi!" + "'", str6, "10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...   0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444   4444444410", "                                               ", "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444   4444444410" + "'", str3, "444444   4444444410");
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        java.lang.String[] strArray4 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) '#', 3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "1");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                               10");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("0###00###00###00###00", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str13, "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00H", "11111111                                                                                         11111111                                                                                         1  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H" + "'", str2, "00H");
    }

    @Test
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "10", (int) '4', 10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444", strArray6, strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi 1010 10", "00h", (int) (byte) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("00h", strArray6, strArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("0000000000000000000000000000000000000aAAAAAAAAAAAAAAAA!ih!ih01!ih0", strArray18);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "44444444444444444444444444444444444" + "'", str14, "44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "10hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "00h" + "'", str19, "00h");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444441", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("        1    IH0HI!HI!H00", 71, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1    IH0HI!HI!H00                       " + "'", str3, "                               1    IH0HI!HI!H00                       ");
    }

    @Test
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "                                                                                                                                        a                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny("", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h", 191);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih01!ih010!ih!ih01!ih01hi!######################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!######################" + "'", str5, "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
    }

    @Test
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                            00H!i", "100100100100", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                            00H!i" });
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("..   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "H00H00H00H00H00H00H00H00H", 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str4, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                 ..", "4444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    aaa44444444444444                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaa00", "4444444                                    ", 114);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaa00" });
    }

    @Test
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0H00H00H00H00H             00000H00H00H00H00H00H00H00H00H             " + "'", str1, "0H00H00H00H00H             00000H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!", "101011aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!");
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                 00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                               " + "'", str1, "                                 00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                               ");
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!", 190);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!" + "'", str2, "144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!");
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0        1    ", 192);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0        1    " + "'", str2, "0        1    ");
    }

    @Test
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...aaa", "aaaaaaahhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                            HHHH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "            00h00h00h00h00h00");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '4', 70, 740);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 70 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "i!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i!" + "'", str12, "i!");
    }

    @Test
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str2, "HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("            00h00h00h00h00h00h00h00h00h             ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str2, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...00h00h00h00h00h00h00h00h00h ", (int) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...00h00h00h00h00h00h00h00h00h " + "'", str3, "...00h00h00h00h00h00h00h00h00h ");
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444444441044444444104                                                                 444444444444444444444444444...4444444410444444441044", " 10                                                                                          ...", "! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("100I!100I!0I!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100I!100I!0I!                                       " + "'", str2, "100I!100I!0I!                                       ");
    }

    @Test
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
        char[] charArray15 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("0", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny("144i!144i!4i!", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone("00h", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                       10hi!10hi!hi!", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone("00H!IH!IH0HI!                                                                                     ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny("0h00h00h             0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h00h00h00h00h00h0h00h00h00h", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 39 + "'", int22 == 39);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" !ih10hi!10hi!hi!010hi!10hi!hi!", "", "IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10HI!10HI!HI!010HI!10HI!HI!!IH10Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !ih10hi!10hi!hi!010hi!10hi!hi!" + "'", str3, " !ih10hi!10hi!hi!010hi!10hi!hi!");
    }

    @Test
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("     H  H  H  H  H  H  H  H  H             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHH" + "'", str1, "HHHHHHHHH");
    }

    @Test
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#            " + "'", str3, "00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#                        #00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#00#h#            ");
    }

    @Test
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("1         4444444444444444444444", 140);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1         4444444444444444444444" + "'", str2, "1         4444444444444444444444");
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H!", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih0", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("H00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 .   00h00h", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 159 + "'", int20 == 159);
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "                              ", 544);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "01", "0101", "!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" });
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("########################aa", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("144i!144i!4i!", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("..    1!I441", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 0                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("10hi 1010 10", "                                            00h!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("########################aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "...aaa00h00h00h00h00h00h00h00h00h");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 178, 180);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 178 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1001001001001001001001001001001001001001001001001001001001001001001001001001001001001" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" + "'", str4, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
    }

    @Test
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaHHHHHHHH", "040...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I" + "'", str1, "! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I");
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!0404hi!0404hi!0404hi!0", "10HI! 1010 10");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!IH010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                               10", "444444   4444444410                               ", 651);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                               10" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", '#');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', 98, 5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!", strArray4);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "                                                                                               10");
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("  ", strArray14);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444", strArray4, strArray14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, 'a', 22, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 22 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "44444444444444" + "'", str19, "44444444444444");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("4444444410                                                                                4444444", "4444444444444444444444444444104444444410411444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00.." + "'", str1, "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00..");
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                   a                    ...", 0, 191);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   a                    ..." + "'", str3, "                                                   a                    ...");
    }

    @Test
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1", "1");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 582, 27);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                                                                                                                                                                       aaaaaaaHHHHHHHH", "10     1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0a0ahi!", "h00h00h00h00h00h00h00h                ", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", "4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("000H!ih!ih0Hi!0h             00000h00h00h00h00h00h00h00h00h             ", "0                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih0Hi!0h             00000h00h00h00h00h00h00h00h00h" + "'", str2, "H!ih!ih0Hi!0h             00000h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("11!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!                                    ..", 196);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11" + "'", str2, "11!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11!11!11!11!1111!11!11!11!11");
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaaaaaaa", "", 82);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("aaaaaaaaa11401444444440144444444", "         ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H", "", 156);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 81 + "'", int3 == 81);
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!0!ih!ih01!ih010!ih!ih01!ih01hi", "4  ", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str2, "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444401 0101 !ih01  I 1  ...444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("11!11!11!11!11!11!11!11!1", " 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!", 73);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444   ", 195, "              AAA    10HI!10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA 444444   " + "'", str3, "              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA 444444   ");
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#####################################################################################################################################################################           1  1  1  1  1  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################################################################################################################################################################           1  1  1  1  1" + "'", str1, "#####################################################################################################################################################################           1  1  1  1  1");
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1hi!101010101010!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0404HI!              ...", "                      ###00                      ", 99);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0404HI!              ..." });
    }

    @Test
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                         ", 'a', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                              040...", "44444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444444410444444441044444!IH!IH01!IH10044444444104444###########    !IH!I############");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                              040..." });
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("014444444444!!!!!!!!!!!", "        1    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 150);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str1, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str2, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("100i!100i!0i!", "404HI!              ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                              0404HI!              ..", "hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("...   0");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                                                                              10HI!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                              10hi!10" + "'", str1, "                                                                                                                                                                                              10hi!10");
    }

    @Test
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "1  I 1 01 0101 !ih01  I 1", 105, 32);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        char[] charArray14 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("100", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("HI!                                ", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone("", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaa11401444444440144444444", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly("HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", charArray14);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly("###00##h##h##h##h##h##h#...##h##h##h#", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH10HI!10HI!HI!010HI!10HI!HI!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!IH10HI!10HI!HI!010HI!10HI!HI!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH10HI!10HI!HI!010HI!10HI!HI!" + "'", str2, "!IH10HI!10HI!HI!010HI!10HI!HI!");
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111", "    aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111");
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "1ahia1ahiahia");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10" + "'", str2, "                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 31, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "                                    444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                    ..        0404hi!                                    ..        ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00h00h00h00h00h00h00h00h00h                                                                      ", ".............................................................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "1  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi! 11 1 11 1 11 1 11 1 11 1hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("H00H00H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h00H00H" + "'", str1, "h00H00H");
    }

    @Test
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444         1                                                                                                                    ", 168);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1", "AAA", "                               1    IH0HI!HI!H00                       ", 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1" + "'", str4, "10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1");
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        int int1 = org.apache.commons.lang3.StringUtils.length("HHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410ih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih HhiI HhiIhiIH HhiI HhiIhiIIih Hh!I  HH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 615 + "'", int2 == 615);
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ", "   4444444", "HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                0!ih!ih01!ih010!ih!ih01!ih01hi!HI!                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaa        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih10hi!10hi!...1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA000", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("00h00h00h00haaa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("01 0101 !", "!I4!I441!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih!ih01!ih01", "144i!144i!4i!", 8);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h", "h0", "h0" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h4h04h0" + "'", str5, "h4h04h0");
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444                                    ", "44444444444444444444444444", "10     ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111                                    " + "'", str3, "1111111                                    ");
    }

    @Test
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!" + "'", str2, "4i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!I! 144i!144i!4i!");
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("0hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H000hi!hi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("iiiiiii...", "                               1    IH0HI!HI!H00                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("0hi!10hi!hi!AAAAAAAAAAAAAAAAA                                    ", "4444444444                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "0hi!10hi!hi!AAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("..00h00h.000h!i", "AA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..00h00h.000h!i" + "'", str2, "..00h00h.000h!i");
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                             10HI! 1010 10                                                   !ih!i     AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10HI! 1010 10                                                   !ih!i     AAA" + "'", str1, "10HI! 1010 10                                                   !ih!i     AAA");
    }

    @Test
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00H00H00H00H   ", (int) (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H00H00H00H   " + "'", str3, "00H00H00H00H   ");
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAAAAAAAA00", "01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAA");
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
        char[] charArray6 = new char[] { '4' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("            00h00h00h00h00h00", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 98 + "'", int7 == 98);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!       ..HI!       .HI!       ..HI!      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        char[] charArray8 = new char[] { 'a', '#', 'a', '#', '4' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00..", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA    10HI!10              AAA 444444   ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', 'a', '#', '4' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("44444444444444444444444444441044444444104114444444444444410        ...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "         1                                                                              ", 94, 39);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444410444444441         1                                                                              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444410444444441         1                                                                              4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00h00h00h00h00h00", "                                                                                                                                                        00                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00" + "'", str2, "00h00h00h00h00h00");
    }

    @Test
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("    10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h" + "'", str1, "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("4444444444444444444444         1                                                                                                                    ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0014444444444H00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h00h00h00h00h00h00hH00h00h0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(" ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                               10", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!" + "'", str1, "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!");
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                 44444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("0hi 1010 10", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                    0hi 1010 10", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                    0hi 1010 10" });
    }

    @Test
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "10", (int) '4', 10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444", strArray6, strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi 1010 10", "00h", (int) (byte) -1);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("00h", strArray6, strArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI", strArray18);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, '4');
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "44444444444444444444444444444444444" + "'", str14, "44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "10hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "00h" + "'", str19, "00h");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10hi 1010 10" + "'", str22, "10hi 1010 10");
    }

    @Test
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                                                                    ", "11111111                                                                                         11111111                                                                                         1  ", "                                                                                                 aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                                                                    " + "'", str3, "                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      4444444aaa                      444444                                                                    ");
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "44444444104444444410444444441044444!ih!ih01!ih100.........................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00H!ih!ih0#####################################################################################################################################################################################", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", (int) '4');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("0000000000000000000000000000000000000000000000000000000000000000000000", 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#################################################################################################", strArray5, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("1         ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", strArray5, strArray11);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "00H!ih!ih0#####################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "#################################################################################################" + "'", str9, "#################################################################################################");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "1" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str12, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444", "10                                                                                               1010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444" + "'", str2, "444");
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " hi!" + "'", str9, " hi!");
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("            00h00h00h00h00h00h00h00h00h             ", "     ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("#################################################################################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("                                                                                         ", "                                                   a                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444" + "'", str1, "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I 00h00h00h00h00h01 0101 !ih01  I 1  I  I", "                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("            00h00h00h00h00h00h00h00h00h             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi", 39);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi44444444444444444444444444444444444444444444444444444444444" + "'", str4, "hi44444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "                                                                                               10");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                               00", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                    ...");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...", 178, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...444444444444444444444444444" + "'", str3, "444444444444444444444444444H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...444444444444444444444444444");
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00H", "10HI!10##########", 94);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H" });
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   ", "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   " + "'", str2, "1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i 1  i 1  i  i                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "                                                                                               10");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                               00", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                    ...");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010h");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "10hi!10hi!hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "i!10hi!hi!" });
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("10                                   ##                                   10                                   ##                                   hi!", "                                aaa                                00000000000000000000000", " 00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#         1                                                                                                                                       ##", 55);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                       44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                       ", "44444444444444444444444444444444444" });
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                  00h00h00h00haaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 414);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("100i!100i!0i!", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!", "                                                                                            hi!       ..                                                                                            ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("10101010hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040", "##############################################################################################################################################################                                              ", 490, 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!404HI!000404HI!000404HI!00##############################################################################################################################################################                                              " + "'", str4, "HI!404HI!000404HI!000404HI!00##############################################################################################################################################################                                              ");
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("############################################################################################################################################################aaaaaaaaa11401444444440144444444", 159);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################################################################################aaa" + "'", str2, "############################################################################################################################################################aaa");
    }

    @Test
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("01 0101 !ih01       ", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !ih01       " + "'", str2, "01 0101 !ih01       ");
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1                                                                                               ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1                                                                                               " + "'", str2, "1                                                                                               ");
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                               00h00h00h00h00h00h00h00h00h", "aaaaaaaaaa1a");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                               00h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!       ..", 928);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("        1  ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                              0404HI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AAAAAAAA                                                                                         AAAAAAAA                                                                                         A");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAA                                                                                         AAAAAAAA                                                                                         A" + "'", str1, "aAAAAAAA                                                                                         AAAAAAAA                                                                                         A");
    }
}

