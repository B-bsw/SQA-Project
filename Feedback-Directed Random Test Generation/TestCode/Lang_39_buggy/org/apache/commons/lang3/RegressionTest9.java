package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

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
    public void test04501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                          ", "00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00" + "'", str1, "00");
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 97, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("h00h00h00h00h00h00h00h00h", "1aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h" + "'", str2, "h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                              0404HI!              ..", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("             ", "!ih!ih01!ih0", "4444444  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             " + "'", str3, "             ");
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444                ...4444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                ...4444444" + "'", str2, "4444444                ...4444444");
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                   ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("!iH ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI", "          1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI" + "'", str2, "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI");
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "10", (int) '4', 10);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444", strArray4, strArray11);
        java.lang.Class<?> wildcardClass13 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "44444444444444444444444444444444444" + "'", str12, "44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("h00h00h00h00h00h00h00h             ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                    4444444", "4444444aaa", 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444" + "'", str3, "                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444");
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "10                                                                                          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("##h##h##h##h##h##h#...", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...44400h00h", "                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 197);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               " + "'", str4, "                                               ");
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (int) (short) 10, "                                    4444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00h   ", '4', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              ", "                                                                    ", 191);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                      ###00                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444..", (int) (byte) 1, "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01                                                      0404HI!         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444.." + "'", str3, "444444444444444444444444444..");
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        char[] charArray7 = new char[] { 'a', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("...", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("                                       10hi!10", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("44...", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("144I!1    ..aaaaaaaaaaaaaaaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111", '4', 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "                             ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                                                 4444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih01!ih01", "########################   #########################");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih01!ih01" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "00hi!", (int) (short) 0);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("10");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "h00h00h00h00h00h00h00h             ", 197, 5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("          ...", strArray6, strArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("10HI!10", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "          ..." + "'", str14, "          ...");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!", "########################", "00h00h00h00h00h00h00h00h00", 92);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!" + "'", str4, "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#####################################################################################################################################################################         00h00h00h00h00h00", "...   00h00h00h00h00h00h00h00h00h", "        1   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################################################################################################################################           1  1  1  1  1  " + "'", str3, "#####################################################################################################################################################################           1  1  1  1  1  ");
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...   00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("0H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00H00H00H00H00H00H00H00H0" + "'", str1, "H00H00H00H00H00H00H00H00H0");
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "          ...                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ", 57, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  " + "'", str3, "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                               ", "                                                                 4444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("", "100100100100100100100100100100100100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("H00h00h00h00h00h00h00h00h              144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00h00h00h00h00h00h00h00h              144I!144I!4I!" + "'", str1, "H00h00h00h00h00h00h00h00h              144I!144I!4I!");
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "100I!100I!0I!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 148, 138);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10                                                                                               1010                                                                                               10hi", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "..        0404hi!                                    ..", 192, 8);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10", "1010", "10hi" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("00hi!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" ", "   00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410" + "'", str1, "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("  ...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                          ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00" + "'", str3, "00");
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                   0                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                   0                                                                                                 " + "'", str1, "                                                                                                   0                                                                                                 ");
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("!ih!ih01!ih0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("        1 ", "4444444                                   ", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        1 " + "'", str3, "        1 ");
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        char[] charArray7 = new char[] { 'a', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444410                                                       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444410", "                                                       " });
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("10     1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10     1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!" + "'", str2, "10     1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!");
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("104hi4 410104 410", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "104hi4 410104 410" + "'", str3, "104hi4 410104 410");
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10", "                                                                                                   0                                                                                                 ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   hi!   ", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("44444444104444444410411a44444444104444444410411aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa11401444444440144444444a11401444444440144444444" + "'", str1, "aa11401444444440144444444a11401444444440144444444");
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HHHHHHHHH", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHH" + "'", str2, "HHHHHHHHH");
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                 ", "00000000000000000000000000000000000" });
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("", "4444410411");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!" + "'", str1, "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("444444444", "hI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("          ...", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         ..." + "'", str2, "         ...");
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444" + "'", str1, "444444444");
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444104444444410411", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II" + "'", str1, "1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II1I1II");
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!                                ", "0404hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!                                " });
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", "                                    ...", 49);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" });
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                              0404HI!", "H00h00h00h00h00h00h00h00h              144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "########################00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                               000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               000" + "'", str1, "                                               000");
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("4444444444444444444444444444444444444444444444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4444444444444444444444444444444444444444444444444444444444444444444444444", "1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "1  I 1  I  I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0h00h00h             ", '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("##h##h##h##h##h##h#...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##h##h##h##h##h##h#..." + "'", str1, "##h##h##h##h##h##h#...");
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "            00H00H00H00H00H00H00H00H00H             ", 12);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                                    ", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("10", strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("###################################h##h##h##h##h##h#...#################################", "HHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHH" + "'", str2, "HHHHHHHHH");
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("        1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "                                aaa                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                      0404HI!         ", "0404hi!                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih10hi!10hi!  ...!ih10hi!10hi!h", "HI!       ..", 22);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih10hi!10hi!  ...!ih10hi!10hi!h" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!ih10hi!10hi!  ...!ih10hi!10hi!h" + "'", str5, "!ih10hi!10hi!  ...!ih10hi!10hi!h");
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("   ..   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444..", "h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444.." + "'", str2, "444444444444444444444444444..");
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                  0000000000000000000000000000000000000000000000000000000000000000000000", "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "                  0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "                                                                                                 ", (int) (byte) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 39, 23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444", "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444");
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", "        1  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!IH", "########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!" + "'", str1, "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("###################################h##h##h##h##h##h#...#################################", "4444444                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                                   " + "'", str2, "4444444                                   ");
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  1  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  .");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...", 200, "1                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                      " + "'", str3, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                      ");
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("#####################################################################################################################################################################           1  1  1  1  1  ", "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 191 + "'", int2 == 191);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" 1                                                                                               ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 1                                                                                               " + "'", str2, " 1                                                                                               ");
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(" 144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 144I!144I!4I!" + "'", str1, " 144I!144I!4I!");
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 57, "...44400h00h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44400h00h...44400h00h...4...44400h00h...44400h00h...44" + "'", str3, "...44400h00h...44400h00h...4...44400h00h...44400h00h...44");
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                      4444444aaa", "#####################################################################################################################################################################         00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444aaa" + "'", str2, "4444444aaa");
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...   00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   00h00h00h00h00h00h00h00h00h" + "'", str1, "...   00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                              11", "00000000000000000000000000000000000", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11" + "'", str3, "                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11");
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1         4444444444444444444444", "444444   ", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        char[] charArray6 = new char[] { '4', ' ', ' ', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                    4444444", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4', ' ', ' ', ' ' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h                              ", "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444444...", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444444                ...4444444", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                ...4444444" + "'", str2, "4444444                ...4444444");
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", "###00###00###00###00###00", 930);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                     1", "        1", "        1", "     !ih!ih", "1!ih", "1", "!ih!ih", "1!ih", "1hi!        1", "        1", "        1" });
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("         00h00h00h00h00h00", "4444444aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...10hi 1010 10H!ih!ih000H!ih!ih00...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("44444444444444444444444444444444444                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                              0404hi!                                               ", 928, "0404hi!444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444" + "'", str3, "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444");
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0h00h00h00h00h00h00h00", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h00h00h00h00h00" + "'", str2, "0h00h00h00h00h00h00h00");
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                         ", "                                                                 4444444444444444444444         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                     ", "         1                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("000", "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("    ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                 44444444444444444444444444444444444", 'a', 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aa11401444444440144444444a11401444444440144444444", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aa11401444444440144444444" + "'", str2, "aa11401444444440144444444");
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          ...", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ..." + "'", str3, "          ...");
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00h00h00h00h00h00h00h00h00h                                                                      ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   ", "h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "   " });
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###00", "100                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###00" });
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "                                                                                                 ", 5);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("144I!1", "                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "144I!1" + "'", str2, "144I!1");
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" });
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ih!ih01!ih0", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "100100100100100100100100100100100100");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaa.aaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("101011aaaaaaaaa", "100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "4444444444444444444444         1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444");
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ", "!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", "11111111                                                                                         11111111                                                                                         1  ", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!       ..HI!       ..HI!       ." + "'", str2, "HI!       ..HI!       ..HI!       .");
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih10hi!10hi!  ...", "                                   ..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih10hi!10hi!", "", "", "", "", "" });
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444", "10     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("1", "#####################################################################################################################################################################           1  1  1  1  1  ", "#########################################################################11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444  " + "'", str1, "4444444  ");
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    " });
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("   ..   ", "!ih10hi!10hi!  ...!ih10hi!10hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("    ", "                                aaa                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaa####################################", "H00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444410                                                                                4444444", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410                                                                                4444444" + "'", str2, "4444444410                                                                                4444444");
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("00H!", 1, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0H!" + "'", str3, "0H!");
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ", "#0404HI!##", "0404HI!                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     " + "'", str3, "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                    ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444", "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                    ...", "44444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040", 7, "                                aaa                                00000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040" + "'", str3, "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040");
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("AA", "                                                                         AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i..." });
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 200, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10   100100...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10   100100" + "'", str3, "10   100100...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10   100100");
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("######################### ########################", 72, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10" + "'", str2, "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", "10   100100...   00h00h00h00h00h00h00h00h00haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa10   100100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44", "h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("00000000000000000000000000010");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000000000000000010" + "'", str1, "00000000000000000000000000010");
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("H", ' ', 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################" + "'", str1, "######################");
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0H!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "0", "H", "!" });
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray13);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00h00h00h00h00h00h00h00h00h             ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                       10hi!10hi!hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("01", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone("!ih40        1    ", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 39 + "'", int17 == 39);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!                                                                                                 ", "!ih!ih0", 4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                            100                                                                                                                                           ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi!                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!                                                                                                 " + "'", str6, "Hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###############################################000###############################################", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################000###############################################" + "'", str2, "###############################################000###############################################");
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("    !ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...00h00h00h00h00h00h00h00h00h ", "!IH10HI!10HI!HI!010HI!10HI!HI!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("########################   #########################", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################   #########################" });
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI!", "                                              0404HI!              ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                           ", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I " + "'", str1, "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ");
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444444   ", "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444   " + "'", str2, "444444   ");
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                                     ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                     ");
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i                                            00H!i", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("...                                                                                  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1  I 1  I  I", (int) (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1  I 1  I  I" + "'", str3, "1  I 1  I  I");
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI", 651);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI" + "'", str2, "       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI");
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ", "01                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            " + "'", str2, "                                                                              00h00h00h00h00h00h00h00h00h                                                                                            ");
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("   hi!   ", "00hi!00hi!00hi!00hi!00hi!00hi!  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 191);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("H00h00h00h00h00h00h00h00h                                                                      ", "                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str1, "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("            00H00H00H00H00H00H00H00H00H            ", "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("100                                                                                              ", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    " + "'", str2, "                                    ");
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("###################################h##h##h##h##h##h#...#################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h", "                                                      0404HI!         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h" + "'", str2, "h!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100h");
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("   0", ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 27, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100..." + "'", str1, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   100100100100100100100100100100100100100100100100100100100100100100100100100100100100100...");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    " + "'", str2, "4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    4444444444444444444444         1                                                                                                                    ");
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h00h00h00h00h00h00h00h                 ", "#######  ", 200);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h00h00h00h00h00h00h00h                 " });
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44444444444444444444444444444444444                                                                                                              ", "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444                                                                                                              " });
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                   0                                                                                                 ", "                                    ..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                   0                                                                                                 " });
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("            00H00H00H00H00H00H00H00H00H            ", "     ", 188);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 46 + "'", int3 == 46);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("00h00h00h00h", "00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                    ", "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                    " + "'", str3, "                                                                    ");
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#############################################################################################444444", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################################################444444" + "'", str2, "#######################################################################444444");
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                 4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444         1" + "'", str1, "4444444444444444444444         1");
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "H00h00h00h00h00h00h00h00h              144I!144I!4I!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144I!144444444444444444444444444444444444444444444", "I!", "444444441");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444" + "'", str3, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("  ", "###############################################000###############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10hi!hi!", "1", (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 90, 0);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih!ih01!ih01", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "0hi!", "0hi!hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                       10hi!10hi!hi!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000000000000000000000000" + "'", str1, "00000000000000000000000000000000000");
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1         4444444444444444444444                                                                 ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0h00h00h00h00h00h00h00h00h", 26, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                aaa                                00000000000000000000000", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa00000000000000000000000" + "'", str2, "aaa00000000000000000000000");
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#0404HI!##", "100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444444444", 188);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444" + "'", str2, "444444444");
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("i!", "   0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ", "014444444444!!!!!!!!!!!", 43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str4, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("            00H00H00H00H00H00H00H00H00H             ", "                                              0404hi!                                               ", 27);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "            00H00H00H00H00H00H00H00H00H             " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...h!i..", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...h!i.." });
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        char[] charArray13 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", charArray13);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H!", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih000h!ih!ih0", charArray13);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("4444444", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("100100100100100100100100100100100100", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H", "!ih!ih01!ih0", "00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  ...", "!ih10hi!10hi!  ...", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "  ..." });
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("01 0101 !i", "4444444444hi           0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !" + "'", str2, "01 0101 !");
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("444444   4444444410                               ", "###############################################000###############################################", "                                                                                                                                                                00H00H00H00H00H00H00H00H00", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444   4444444410                               " + "'", str4, "444444   4444444410                               ");
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("44444444444444444444444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1         ", "                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Aaaaaaaaaa1a", '4', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        int int1 = org.apache.commons.lang3.StringUtils.length("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 197 + "'", int1 == 197);
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444410                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410" + "'", str1, "4444444410");
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "#0404HI!##", 8, 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaa#0404HI!##aaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444" + "'", str4, "aaaaaaaa#0404HI!##aaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("        1  ", "10hi! 1010 10", "...h!i...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01                                                      0404HI!         ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01                                                      0404HI!         " + "'", str3, "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01                                                      0404HI!         ");
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "!ih!i");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444", "                                              0404HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444" + "'", str2, "                                              0404hi!                                               0404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!4444444444444444444444444444444444444444444440404hi!44444444444444444444444444444444444444444");
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "########################00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                     10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01                                                                                                     " + "'", str1, "01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01                                                                                                     ");
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("144I41", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0hi!10hi!hi!", 29, "AAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0hi!10hi!hi!AAAAAAAAAAAAAAAAA" + "'", str3, "0hi!10hi!hi!AAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "10                                                                                               1010                                                                                               10hi");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 97, (int) (short) 1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 65, 9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!", "!ih10hi!10hi!hi!010hi!10hi!hi!", "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!" + "'", str4, "0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!0!IH!IH01!IH010!IH!IH01!IH01HI!10!IH!IH01!IH010!IH!IH01!IH01HI!");
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!", 13, "0404HI!                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!" + "'", str3, "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!                                                                                                 ", "00HI!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Hi!");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 14, 72);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 14 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("444444444410                                                                                               1010                                                                                               10HI!44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00H00H00H00H00H00H00H00H00H", "4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H00H00H00H00H00H00H00H00H" + "'", str2, "00H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     " + "'", str1, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ");
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaa####################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa####################################" + "'", str1, "aaa####################################");
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444410411");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444410411" + "'", str1, "4444410411");
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H00H00H00H00H00H00H00H00H" + "'", str1, "00H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray4, strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("10hi 1010 1", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi", "10                                                                                               10100h00h00h00h00h00h00h00h00h       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi" + "'", str2, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi");
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              1100000000000000000000000000000000000                              11", "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "...    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str2, "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444444444444444444444444444444444444", "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         " + "'", str2, "0h00h00h             0h00h00h        ########################00H0h00h00h             0h00h00h         ");
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                  ", "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                              0404HI!                                               ", "0404HI!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("########################00H", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                              ", "                                               " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040", "44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00h00h00h00h0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih", "404HI!              ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444104444444410444444441044444!ih!ih01!ih", "!ih10hi!10hi!  ...!ih10hi!10hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("          ...                                                                                                                                                                             ", "4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("####", 441, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444####" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444####");
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                               00h00h00h00h00h00h00h00h00", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                               00h00h00h00h00h00h00h00h00" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!IH10HI!10HI!HI!010HI!10HI!HI!", "                                                                             10hi! 1010 10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444         1", 1, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444         1" + "'", str3, "4444444444444444444444         1");
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("11 1 11 1 11 1 11 1 11 1", "             ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "0404HI!                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ", 651);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     " + "'", str2, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                     ");
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H", "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444" + "'", str1, "                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    44444444444444AAA                                    4444444");
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                               00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                               00h00h00h00h00h00h00h00h00h" + "'", str1, "                                                                                                               00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...44400h00h...44400h00h...4...44400h00h...44400h00h...44", "    !ih!i", "0h00h00h00h00h00h00h0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ", "                                                                             10hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   " + "'", str2, "1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                 4444444444444444444444         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                 4444444444444444444444         " + "'", str1, "                                                                 4444444444444444444444         ");
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H", 27, 188);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H" + "'", str3, "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!                                ", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            HI!                                " + "'", str2, "                                                            HI!                                ");
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                                                ########################   #########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                                                                                                                        00                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("01 0101 !ih01", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !ih01       " + "'", str2, "01 0101 !ih01       ");
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10HI!10", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10HI!10" });
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H", "001001001001001001001001001001001001", "   0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                       10hi!10hi!hi!", "#####################################################################################################################################################################         00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10hi!hi!" + "'", str2, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aa11401444444440144444444", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", "00HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("#0404HI!##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0", "40        1    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h" + "'", str2, "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h");
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("11111111                                                                                         11111111                                                                                         1  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11111111                                                                                         11111111                                                                                         1 " + "'", str1, "11111111                                                                                         11111111                                                                                         1 ");
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                    144I!144I!4I!", 65, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                    144I!144I!4I!" + "'", str3, "                                                                                    144I!144I!4I!");
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", '#', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#######  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00H00H00H00H00H00H00H00H00H                                                                      ", '4', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!                                                                                                 ", "!ih!ih0", 4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10hi", ' ');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "         1");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "10");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray8, strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("144i!144i!4i!", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 191");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi!                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10                                                                    ", "    !ih!i");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10                                                                    " });
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("########################", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "            00h00h00h00h00h00");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H", 188, (int) '4');
        java.lang.String[] strArray14 = null;
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("01 0101 !i", strArray3, strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "i!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "01 0101 !i" + "'", str15, "01 0101 !i");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00h00h00h00h", "I!", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                 00000000000000000000000000000000000", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                 00000000000000000000000000000000000" });
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!" + "'", str3, "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str1, "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("         00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ", (int) '#', 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  I " + "'", str3, "  I ");
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", "44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         " + "'", str2, "                                                                                         ");
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  ", "44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("100", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("HI!                                ", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny("                                                      0404HI!         ", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####" + "'", str1, "####");
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444...", (int) (byte) 1, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44" + "'", str3, "44");
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("         ...", 13, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         ..." + "'", str3, "         ...");
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" 10                                                                                          ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "10", "..." });
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH" + "'", str1, "!iH");
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("     ", "                  0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("01 0101 !ih0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h", "                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("1111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("144I!1", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "144I!1" + "'", str2, "144I!1");
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10hi!10", "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10hi!10" });
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00h00h00h00h00h00h00h00h00h             ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                       10hi!10hi!hi!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("1", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#0404HI!##", "00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H", "444444444410                                                                                               1010                                                                                               10HI!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H" + "'", str2, "aaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                 4444444444444444444444         ", 33, "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01                                                      0404HI!         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 4444444444444444444444         " + "'", str3, "                                                                 4444444444444444444444         ");
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("444444441", "...44400h00h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("10hi! 1010 10", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi! 1010 10" + "'", str2, "10hi! 1010 10");
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("h00h00h00h00h00h00h00h             ", "#########################################################################11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h             " + "'", str2, "h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("10HI! 1010 10                                                                                                 AAA", "!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", 25, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str3, "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        char[] charArray10 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                              0404HI!                                               ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("00000000000000000000000000000000000", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...aaa00h00h00h00h00h00h00h00h00h...aaa00h00h00h00h0" });
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" 144I!144I!4I!", "                                                                 44444444444444444444444444444444444", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " 144I!144I!4I!" });
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                    ..", "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00", "4444444   ", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                    .." + "'", str4, "                                    ..");
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h0 144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h0 144I!144I!4I!" + "'", str1, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h0 144I!144I!4I!");
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("144I!144444444444444444444444444444444444444444444", "                                                                 00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   ", "                                                                                                 aaa", "00H!ih!ih0Hi!          00H!ih!ih0Hi!          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000" + "'", str3, "000");
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("00", "                                              0404101                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                              0404HI!              ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("... ...", "00000000000000000000000000010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("1         4444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10hi!", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", 25);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "                                                                         1010                                                                                               10hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih10hi!10hi!  ...!ih10hi!10hi!h", "HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..HI!       ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                                  ", "!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01!IH!IH01!IH01                                                      0404HI!         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("00H!ih!ih0Hi!          00H!ih!ih0Hi!          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "10", "", "", "10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "", "", "10", "", "", "10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "", "", "" });
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("H00h00h00h00h00h00h00h00h                                                                      ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("H00H00H00H00H00H00H00H             ", "                                              0404101                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!i...1                                                       1                                                       1                      ", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          1                      " + "'", str2, "          1                      ");
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00h00h00h00h   ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", 930);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10" + "'", str2, "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("         1                                                                                                                                       ", "########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("######################### ########################", "0!IH!IH01!IH010!IH!IH01!IH01HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################### ########################" + "'", str2, "######################### ########################");
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "001001001001001001001001001001001001");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 4444...", "01        01        01        !ih10hi!10hi!hi!010hi!10hi!hi!     01        01        01                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!", 148, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Aaa", "   ", "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhh" + "'", str1, "hhhhhhhh");
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111", 102);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH11111");
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!", "0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!" + "'", str2, "1010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010100100100100100100100100100100100100100100100100100100100100100100100100100100100100100HI!");
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444" + "'", str1, "444444");
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("1  I 1  I  I ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1  I 1  I  I " + "'", str1, "1  I 1  I  I ");
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!iH", "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444104444444410411a44444444104444444410411aa", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444410411", "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444410411" + "'", str2, "4444410411");
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                              0404HI!", "##h##h##h##h##h##h##h##h##h                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404HI!" + "'", str2, "                                              0404HI!");
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00H!ih!ih0Hi!                                                                                     ", "       00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1100", "          1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1100" + "'", str2, "1100");
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 " + "'", str2, "h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 ");
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ", 651, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         ");
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#######################################################################444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#######################################################################444444" });
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                                                                                 AAA", "     00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("44444444104444444410411aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444", "aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!", 4, "   4444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!" + "'", str3, "!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!10hi!hi!010hi!10hi!hi!!ih10hi!");
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                            ", "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!", (int) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!" + "'", str3, "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("00H!ih!ih0Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("######################### ########################", "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################" + "'", str1, "######################");
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("1                                                       ", "!ih10hi!10hi!  ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH10HI!1010   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   HI!HI!010HI!10HI!HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!IH10HI!1010", "", "", "10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", "", "", "HI!HI!010HI!10HI!HI" });
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!", '#', 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "0H!", (int) (byte) 100, 36);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                      ###00                      ", 96, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                                                                                00h00h00h00h00h00h00h00h00", "H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                00h00h00h00h00h00h00h00h00" + "'", str2, "                                                                                                                                                                00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!       ..", "aaaaaaaaaaaaaaaaaaaaaaa                      ###00                      aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!", "", "", "", "", "", "", ".." });
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H", "HI!       ..HI!       ..HI!       .");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H" + "'", str2, "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          ", "  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  1  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  ...  .", "444444441");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          " + "'", str3, "10                                                                                               1000H!ih!ih0Hi!          00H!ih!ih0Hi!          ");
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        java.lang.String[] strArray5 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', (int) '#', 3);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "1");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                                                                               10");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray16);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1         4444444444444444444444                                                                 ", "0000000000000000000000000000000000000000000000000000000000000000000000");
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!", strArray23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                                                    ", strArray5, strArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1010hi!" + "'", str19, "1010hi!");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "1         4444444444444444444444                                                                 " });
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10HI!", "                              ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                    ", "0000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444    ", "1    ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444    " });
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00h", "444444                                    ..444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "0H!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih01!ih010!ih!ih01!ih01hi!######################" });
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih!ih01!ih0", "                                                                                                                                                                00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih", "1!ih" });
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "0hi 1010 10");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444104444444410444444441044444", "!", "ih", "!", "ih", "01", "!", "ih", "010", "!", "ih", "!", "ih", "01", "!", "ih", "01", "hi", "!", "44444444104444444410444444441044444" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444104444444410444444441044444", "!", "", "!", "", "", "!", "", "", "!", "", "!", "", "", "!", "", "", "", "!", "44444444104444444410444444441044444" });
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("01 0101 !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01 0101 " + "'", str1, "01 0101 ");
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("H00H00H00H00H00H00H00H00H0", "h00h00h00h00h00h00h00h                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("144I!144444444444444444444444444444444444444444444", '#', 192);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        char[] charArray9 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("444444   4444444410                               ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("10                                                                    ", "", 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    " + "'", str3, "10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    10                                                                    ");
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ", "                                                                 4444444444444444444444         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     " });
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444410411", "0h00h00h00h00h00h00h0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih" + "'", str1, "44444444104444444410444444441044444!ih!ih01!ih");
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("          1                      ", "hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!", "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", "HI!", 102);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                                    ", 26, 12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444104444444410444444441044444", "ih", "ih01", "ih010", "ih", "ih01", "ih01hi", "44444444104444444410444444441044444" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "44444444104444444410444444441044444", "ih", "ih01", "ih010", "ih", "ih01", "ih01hi", "44444444104444444410444444441044444" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040", 928, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040");
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        int int1 = org.apache.commons.lang3.StringUtils.length("H00h00h00h00h00h00h00h00h              144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 52 + "'", int1 == 52);
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("144I!1    ..aaaaaaaaaaaaaaaaa", 133, "01 0101 !ih01       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "144I!1    ..aaaaaaaaaaaaaaaaa01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0" + "'", str3, "144I!1    ..aaaaaaaaaaaaaaaaa01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0");
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("00H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H" + "'", str1, "00H");
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        char[] charArray8 = new char[] { 'a', ' ' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(" ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("01 0101 !ih0", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !ih0" + "'", str2, "01 0101 !ih0");
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h", "00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00H00H00H" + "'", str2, "H00H00H00H");
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("4444444                ...4444444      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444441", "4444444aaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "1" });
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00h00h00h00h00h", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!IH!I", "          1                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("144I!1    ..aaaaaaaaaaaaaaaaa01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0101 !ih01       01 0", "11111111                                                                                         11111111                                                                                         1 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("100                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!IH", "00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("10hi! 1010 10", "                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    44444444444444aaa                                    4444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!       ..", 196, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            HI!       ..                                                                                            " + "'", str3, "                                                                                            HI!       ..                                                                                            ");
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                               000                                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "00H!ih!ih0#####################################################################################################################################################################################");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                               000                                               " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                               000                                               " + "'", str4, "                                               000                                               ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "000" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "000" + "'", str6, "000");
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                    144I!144I!4I!", "00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!00hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    144I!144I!4I!" + "'", str2, "                                                                                    144I!144I!4I!");
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H                        00H00H00H00H00H00H00H00H00H            ", "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                             ...", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             ..." + "'", str2, "                             ...");
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...   00h00h00h00h00h00h00h00h00h             ", (int) (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   00h00h00h00h00h00h00h00h00h             " + "'", str3, "...   00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI", "", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "100I!100I!0I!", 97, (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100I!100I!0I!" + "'", str4, "100I!100I!0I!");
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", 13, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" + "'", str3, "4444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i144444444441144444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444" + "'", str1, "ih!ih01!ih010!ih!ih01!ih01hi!0!ih!i14444444444114444444444444444444444444444444444444444444");
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00h00h00h00h00h00h00h00h00h                                                                      ", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str3, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 32, "         1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!IH10HI!10!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0404HI!", "0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "404HI!" + "'", str2, "404HI!");
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#############################################################################################444444", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################444444" + "'", str2, "#############################################################################################444444");
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("10hi!10", "014444444444!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi" + "'", str2, "10hi");
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaa1a", "                                                                                                                                                        00                                          ", "####################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaa1a" + "'", str3, "aaaaaaaaaa1a");
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00hi!", "0", 186);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "aahi!" + "'", str5, "aahi!");
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", "####", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0!ih!ih01!ih010!ih!ih01!ih01hi!0000" });
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("######################### ########################", "                                    ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaa1aaaaaaaaaaa1aaaaaaa                                    ...aaaaaaaaaa1aaaaaaaaaaa1aaaaaaaa", '#', 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("00H!ih!ih0Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h!ih!ih0hi" + "'", str1, "00h!ih!ih0hi");
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("          ...                                                                                                                                                                             ", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 176 + "'", int2 == 176);
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("aaa00000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("... ...", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...   00h00h00h00h00h00h00h00h00h", "101010!ih!ih01!ih010!ih!ih01!ih01hi!101010");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   00h00h00h00h00h00h00h00h00h" + "'", str2, "...   00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("11111111                                                                                         11111111                                                                                         1  ", 191);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11                                                                                         11111111                                                                                         1  " + "'", str2, "11                                                                                         11111111                                                                                         1  ");
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", "                                                                                          ", 13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 " });
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00h00h00h00h00h", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!0404hi!", 90, 186);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!0404hi!" + "'", str3, "!0404hi!");
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH", "aa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aahi!" + "'", str1, "aahi!");
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("          1                      ", "                                              0404HI!              ...", 52);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1" });
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        int int1 = org.apache.commons.lang3.StringUtils.length("10     ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     ", "!ih!ih0", (int) '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "         1                                                                                                                                       ", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", strArray5, strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("00h00h00h00haaa", "00H!ih!ih0#####################################################################################################################################################################################");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("44444444444444444444444444444444444444444444444444", strArray5, strArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "     " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!ih!ih01!ih010!ih!ih01!ih01hi!######################" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str10, "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "aaa" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "44444444444444444444444444444444444444444444444444" + "'", str14, "44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("4444444410                                                       ", "444444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                 00000000000000000000000000000000000", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 00000000000000000000000000000000000" + "'", str2, "                                                                 00000000000000000000000000000000000");
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0h00h00h00h00h00h00h0", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("101011aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "101011aaaaaaaaa" + "'", str1, "101011aaaaaaaaa");
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0000000000000000000000000000000000", 2, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000");
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                               00h00h00h00h00h00h00h00h00", "                                    ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" 10                                                                                          ...", "10HI!10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 10                                                                                          ..." + "'", str2, " 10                                                                                          ...");
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I 1  I 1  I  I                                                                                                                                                                                                                                                                                   ", "0haaa00h00h00h00haaaaaa00h00h00h00haaa00h00h000H00H00H00H00H00H00H00H00H", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("144i!144i!4i!", "00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("        1  ", "00h00h00h00h00h00h00h00h00h                                                                      ", 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!10hi!hi!" + "'", str1, "hi!10hi!hi!");
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("00h00h00h00h00h00h00h00h00h", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h" + "'", str2, "h00h00h");
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("444444    ", "44...");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("1aaaaaaaaa", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h00h00h00h00h00h00h00h00h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaa                                                                                           ", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 17");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "    " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h", "00", "h" });
    }
}

