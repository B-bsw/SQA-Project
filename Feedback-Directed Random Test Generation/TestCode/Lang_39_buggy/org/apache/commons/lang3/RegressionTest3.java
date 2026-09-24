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
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00hi!", "          ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00hi!" + "'", str2, "00hi!");
    }

    @Test
    public void test01503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00", "                                    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00" + "'", str2, "00");
    }

    @Test
    public void test01504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("10", "100", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00h00h00h00h00h00h00h00h" + "'", str1, "H00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                ########################   #########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################   #########################" + "'", str1, "########################   #########################");
    }

    @Test
    public void test01508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01508");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                              0404HI!                                               ", "4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404HI!" + "'", str2, "                                              0404HI!");
    }

    @Test
    public void test01509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01509");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("1         4444444444444444444444                                                                 ", "44444444444444444444444444444444444                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01510");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                ########################   #########################", '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01511");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01513");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01514");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("000", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01515");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("0hi 1010 10", "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10" + "'", str3, "0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10");
    }

    @Test
    public void test01516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                              0404HI!", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404HI!" + "'", str3, "                                              0404HI!");
    }

    @Test
    public void test01517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01518");
        int int1 = org.apache.commons.lang3.StringUtils.length("!ih!ih0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test01519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01519");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1010hi!", '#', 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444   ", "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444   " + "'", str2, "4444444   ");
    }

    @Test
    public void test01521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00H00H00H00H00H00H00H00H00H", "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H00H00H00H00H00H00H00H00H" + "'", str2, "00H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test01522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("   00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   00H00H00H00H00H00H00H00H00H             " + "'", str1, "   00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test01523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                       10hi!10hi!hi!", "            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10hi!hi!" + "'", str2, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test01524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01524");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 197, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test01525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01525");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  ", "4444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test01526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01526");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("   0", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01527");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                                ########################   #########################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test01528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444410                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410                                                       " + "'", str1, "4444444410                                                       ");
    }

    @Test
    public void test01529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01529");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01530");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("1         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test01532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01532");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test01533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01533");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aa", "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01534");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("00h00h00h00h00h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01535");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("0hi 1010 10", "10hi!10hi!hi!");
        java.lang.String[] strArray7 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a', (int) '#', 3);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "1");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          ...", strArray3, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0hi 1010 10" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0404hi!" + "'", str16, "0404hi!");
    }

    @Test
    public void test01536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444410                                                                                       ", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444" + "'", str2, "44444444");
    }

    @Test
    public void test01537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("10                                                                                          ...", "  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test01538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test01539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("1010hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1010hi!" + "'", str1, "1010hi!");
    }

    @Test
    public void test01540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01540");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", "                                                ########################   #########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            " + "'", str2, "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
    }

    @Test
    public void test01541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(".", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "." + "'", str2, ".");
    }

    @Test
    public void test01542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01542");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                                ########################   #########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("00H", "!ih!ih0", "!ih!ih01!ih01");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10", "00H!ih!ih0", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 11 1 11 1 11 1 11 1 11 1" + "'", str3, " 11 1 11 1 11 1 11 1 11 1");
    }

    @Test
    public void test01546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01546");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih0#####################################################################################################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "        1    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01548");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 " + "'", str2, "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
    }

    @Test
    public void test01549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01549");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hi!", 10, (int) (short) -1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "10                                                                                               1010                                                                                               10HI!", (int) (short) 0, 145);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test01550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("4444444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01551");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                              0404HI!              ...", 35, "hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404HI!              ..." + "'", str3, "                                              0404HI!              ...");
    }

    @Test
    public void test01552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01552");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("            00h00h00h00h00h00h00h00h00h            ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            00h00h00h00h00h00h00h00h00h            " + "'", str3, "            00h00h00h00h00h00h00h00h00h            ");
    }

    @Test
    public void test01553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              " + "'", str1, "                              ");
    }

    @Test
    public void test01554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!IH", "h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test01556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01556");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040" + "'", str2, "HI!404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!0004040");
    }

    @Test
    public void test01557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01557");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("     ", (int) (short) 10, "00H!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     00H!i" + "'", str3, "     00H!i");
    }

    @Test
    public void test01558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01558");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "        1   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01559");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("144I!144I!4I!", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "144I!144I!4I!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01560");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, ' ', 138, 148);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", "!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410" + "'", str2, "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410");
    }

    @Test
    public void test01562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01562");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih!ih01!ih01", "000", "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih01!ih01" + "'", str4, "!ih!ih01!ih01");
    }

    @Test
    public void test01563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01563");
        char[] charArray5 = new char[] { 'a', ' ' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1", charArray5);
        java.lang.Class<?> wildcardClass9 = charArray5.getClass();
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01564");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0hi 1010 10", "                                               000                                               ", "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H", "!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H" + "'", str2, "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test01566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444444444410                                                                                               1010                                                                                               10HI!44", "                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444410                                                                                               1010                                                                                               10HI!44" + "'", str2, "444444444410                                                                                               1010                                                                                               10HI!44");
    }

    @Test
    public void test01567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("100                                                                                              ", "########################   #########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01569");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00", (int) (short) 100, "!iH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00" + "'", str3, "H0011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111!ih10hi!10hi!hi!010hi!10hi!hi!H00");
    }

    @Test
    public void test01571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01571");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h", "00H!ih!ih0Hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01572");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("10hi 1010 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi 1010 10" + "'", str1, "10hi 1010 10");
    }

    @Test
    public void test01573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01573");
        int int1 = org.apache.commons.lang3.StringUtils.length("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 197 + "'", int1 == 197);
    }

    @Test
    public void test01574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("   0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test01575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01575");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                  ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test01577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01577");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                               00h00h00h00h00h00h00h00h00h", "000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" 144I!144I!4I!", "444444   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("1         ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1         " });
    }

    @Test
    public void test01580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01580");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("00h00h00h00h00h00h00h00h00h", " 11 1 11 1 11 1 11 1 11 1", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                              0404HI!                                               ", "4444444410                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404HI!                                               " + "'", str2, "                                              0404HI!                                               ");
    }

    @Test
    public void test01582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01582");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih!ih0", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih0" + "'", str2, "!ih!ih0");
    }

    @Test
    public void test01584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01584");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          1 ", "            00h00h00h00h00h00h00h00h00h            ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("0000000000000000000000000000000000000000000000000000000000000000000000");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("100", strArray6, strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "1100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00H!ih!ih0Hi!                                                                                                 ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 12 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "1", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100" + "'", str11, "100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str13, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test01585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!ih10hi!10hi!hi!010hi!10hi!hi!", "1100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih10hi!10hi!hi!010hi!10hi!hi!" + "'", str2, "!ih10hi!10hi!hi!010hi!10hi!hi!");
    }

    @Test
    public void test01586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444");
    }

    @Test
    public void test01587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01587");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("!IH", "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test01588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01588");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("00H00H00H00H00H00H00H00H00H", "10hi 1010 10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!0000" + "'", str1, "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
    }

    @Test
    public void test01590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("10hi!10", "10hi 1010 10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01591");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          1 ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          1 " + "'", str3, "          1 ");
    }

    @Test
    public void test01592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01592");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("0000000000000000000000000000000000000000000000000000000000000000000000", "                                                                 4444444444444444444444         1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test01593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!                                                                                                 ", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!                                                                                                 " + "'", str3, "Hi!                                                                                                 ");
    }

    @Test
    public void test01594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444410", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", "44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01596");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01597");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str1, "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test01599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00", "                                              0404HI!              ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00" + "'", str2, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test01600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01600");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "########################   #########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01601");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!iH", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test01602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          ...", "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01603");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444" + "'", str1, "4444444");
    }

    @Test
    public void test01604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01604");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("H00H00H00H00H00H00H00H00H", "                                                                 4444444444444444444444         1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01605");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01606");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(" 11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                  ", "!ih!ih0", "4444444410");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  " + "'", str3, "                                                  ");
    }

    @Test
    public void test01608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01608");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00h00h00h00h00h00h00h00h00", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00" + "'", str3, "00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test01609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01609");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("11", "", 145);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test01610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01610");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("########################   #########################");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("            00h00h00h00h00h00h00h00h00h            ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################", "", "", "#########################" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test01611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str3, "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test01612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01612");
        int int1 = org.apache.commons.lang3.StringUtils.length("H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test01613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01613");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444410                                                                                       4444444410                                                                                       411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410411" + "'", str2, "44444444104444444410411");
    }

    @Test
    public void test01614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01614");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!iH", "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("144i!144i!4i!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "144i!144i!4i!" + "'", str2, "144i!144i!4i!");
    }

    @Test
    public void test01616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("########################   #########################", "Hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################   #########################" + "'", str2, "########################   #########################");
    }

    @Test
    public void test01617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                  ", 196);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                    ");
    }

    @Test
    public void test01618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                              0404hi!                                               ", "!ih!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404hi!                                               " + "'", str2, "                                              0404hi!                                               ");
    }

    @Test
    public void test01619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01619");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444410", "                                              0404HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01620");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test01621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                               00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01622");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" ", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("444444441", "########################00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444441" + "'", str2, "444444441");
    }

    @Test
    public void test01624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test01625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test01626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01626");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                               00h00h00h00h00h00h00h00h00", "1100");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01627");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("            00H00H00H00H00H00H00H00H00H            ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                       10HI!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("0hi 1010 10", "!ih!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01630");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("0404HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("     H  H  H  H  H  H  H  H  H             ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHH" + "'", str2, "HHHHHHHHH");
    }

    @Test
    public void test01632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("10hi!10", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10" + "'", str2, "10hi!10");
    }

    @Test
    public void test01633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01633");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("            00H00H00H00H00H00H00H00H00H             ", "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01634");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("100I0100I00I0", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01636");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10                                                                                          ...", "########################   #########################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10", "..." });
    }

    @Test
    public void test01637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01637");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("!ih!ih0", "44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test01638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01638");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("1         4444444444444444444444                                                                 ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1         4444444444444444444444                                                                 " + "'", str2, "1         4444444444444444444444                                                                 ");
    }

    @Test
    public void test01640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01640");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "1010hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01641");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H", "                                                                                                               ", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H" });
    }

    @Test
    public void test01642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                              0404hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404hi!" + "'", str1, "0404hi!");
    }

    @Test
    public void test01643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("11", "                                                                                                               00h00h00h00h00h00h00h00h00h", "!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01644");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("144I!144I!4I!", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01645");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str2, "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test01646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("            00h00h00h00h00h00h00h00h00h             ", 27, 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   00h00h00h00h00h00h00h00h00h             " + "'", str3, "...   00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test01647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01647");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hi!                                                                                                 ", "0404HI!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str1, "!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test01649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01649");
        int int1 = org.apache.commons.lang3.StringUtils.length("H00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test01650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01650");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "0404HI!", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "", "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" });
    }

    @Test
    public void test01651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
    }

    @Test
    public void test01652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01653");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01654");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("        1 ", "100I0100I00I0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("     H  H  H  H  H  H  H  H  H             ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01656");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                 44444444444444444444444444444444444", "                                              0404hi!                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", "aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01659");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0!ih!ih01!ih010!ih!ih01!ih01hi!", "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h00h00h00h00h00h00h00h00h", "", "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h00h00h00h00h00h00h00h00h" + "'", str3, "h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "4444444410                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " + "'", str2, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
    }

    @Test
    public void test01662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("00000000000000000000000000000000000", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 00000000000000000000000000000000000" + "'", str2, "                                                                 00000000000000000000000000000000000");
    }

    @Test
    public void test01663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("", "                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01664");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", "!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                               ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                               " + "'", str2, "                                                                                                               ");
    }

    @Test
    public void test01667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01668");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          1 ", "            00h00h00h00h00h00h00h00h00h            ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "1", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaa1a" + "'", str4, "aaaaaaaaaa1a");
    }

    @Test
    public void test01669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01669");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                    " + "'", str1, "                                                                                                                                                                                                    ");
    }

    @Test
    public void test01670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                 44444444444444444444444444444444444", "4444444   ", "0hi 1010 10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str3, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test01671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("0404HI!", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01673");
        java.lang.String[] strArray3 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) '#', 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 1, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test01674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01674");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                    ...", "1010hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444104444444410411");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410411" + "'", str1, "44444444104444444410411");
    }

    @Test
    public void test01676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01676");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00h00h00h00h00h00h00h00h00h", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01677");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("          1 ", "     H  H  H  H  H  H  H  H  H             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", 191);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test01679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("########################   #########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################   #########################" + "'", str1, "########################   #########################");
    }

    @Test
    public void test01680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01681");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(".", "                                              0404HI!                                               ", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "." });
    }

    @Test
    public void test01682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01682");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("4444444410                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01684");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "10                                                                                               1010                                                                                               10hi", 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444410", "00hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("          ...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444441" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444441" + "'", str5, "444444441");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test01686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01686");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("h00h00h00h00h00h00h00h00h", "00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01687");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("!iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01689");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 25, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                               00h00h00h00h00h00h00h00h00h", "4444444410                                                       ", "                                                                                               10");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01691");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01692");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01693");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("########################   #########################");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                 aaa", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "########################", "", "", "#########################" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test01694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "HHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01695");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hI!", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01696");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str1, "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test01697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01697");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("10hi 1010 10", '#', 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01698");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", ".", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01699");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("   00H00H00H00H00H00H00H00H00H             ", "144i!144i!4i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410                                                                                       4444444410                                                                                       411" + "'", str1, "4444444410                                                                                       4444444410                                                                                       411");
    }

    @Test
    public void test01701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01701");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 70, "00h00h00h00haaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0" + "'", str3, "00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0");
    }

    @Test
    public void test01702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("########################00H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################00" + "'", str1, "########################00");
    }

    @Test
    public void test01703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01704");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                 4444444444444444444444         1", "...   00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("4444444410                                                                                       4444444410                                                                                       411", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410                                                                                       4444444410                                                                                       411" + "'", str2, "4444444410                                                                                       4444444410                                                                                       411");
    }

    @Test
    public void test01706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01706");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01707");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
    }

    @Test
    public void test01708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01708");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("11", "1         4444444444444444444444                                                                 ", "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01709");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444         1" + "'", str1, "4444444444444444444444         1");
    }

    @Test
    public void test01710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01710");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                               10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01                                                                                               " + "'", str1, "01                                                                                               ");
    }

    @Test
    public void test01711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("########################   #########################", "00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################   #########################" + "'", str2, "########################   #########################");
    }

    @Test
    public void test01712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010", (int) (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010" + "'", str3, "10100100100100100100100100100100100100100100100100100100100100100100100100100100100100100101010010010010010010010010010010010010010010010010010010010010010010010010010010010010010010");
    }

    @Test
    public void test01713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01713");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01714");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ", "!ih!ih01!ih0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test01715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00h00h00h00haaa", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h   " + "'", str3, "00h00h00h00h   ");
    }

    @Test
    public void test01716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01716");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                              0404HI!              ...", 46, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404HI!              ..." + "'", str3, "                                              0404HI!              ...");
    }

    @Test
    public void test01717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("00H!ih!ih0Hi!                                                                                                 ", "                                                                                                               00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0Hi!                                                                                                 " + "'", str2, "00H!ih!ih0Hi!                                                                                                 ");
    }

    @Test
    public void test01718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01719");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("########################00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################00" + "'", str1, "########################00");
    }

    @Test
    public void test01720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01720");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "   00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("     00H!i", "4444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01722");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("!ih10hi!10hi!hi!010hi!10hi!hi!", "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
    }

    @Test
    public void test01723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                    ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                    .." + "'", str1, "                                    ..");
    }

    @Test
    public void test01724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("00h", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h" + "'", str2, "00h");
    }

    @Test
    public void test01725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01725");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '#');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01726");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" 144I!144I!4I!", "444444441");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01727");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HHHHHHHHH", 0, "        1    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHH" + "'", str3, "HHHHHHHHH");
    }

    @Test
    public void test01728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01728");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("            00h00h00h00h00h00h00h00h00h             ", "                                              0404hi!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test01729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01729");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("10hi!10hi!hi!", "########################   #########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01730");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            " + "'", str1, "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
    }

    @Test
    public void test01731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01731");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("1", "                              11");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01732");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("10", "000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44..." + "'", str2, "44...");
    }

    @Test
    public void test01734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01734");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("     00H!i", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01735");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("Hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("     ", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("00h00h00h00haaa", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "     " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test01737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01738");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ", "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "aaaaaaaaaa1a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     " + "'", str3, "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
    }

    @Test
    public void test01739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("!ih!ih01!ih010!ih!ih01!ih01hi!######################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01740");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44...", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "..." });
    }

    @Test
    public void test01741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01741");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!", "aaa", 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!" });
    }

    @Test
    public void test01742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01742");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("10                                                                                               1010                                                                                               10hi", 145);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               1010                                            " + "'", str2, "10                                                                                               1010                                            ");
    }

    @Test
    public void test01743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H" + "'", str2, "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test01744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", 10, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01745");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("...   00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   00h00h00h00h00h00h00h00h00h" + "'", str1, "...   00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("10", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "00h00h00h00h   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
    }

    @Test
    public void test01747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01747");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', 10, 14);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test01748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01748");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("          1 ", "444444   ", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(" 144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01750");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("   ", "                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01751");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00h00h00h00haaa", "     H  H  H  H  H  H  H  H  H             ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 27, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 27 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00h00h00h00haaa" });
    }

    @Test
    public void test01752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01752");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("########################   #########################", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01753");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("   4444444", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   4444444" + "'", str2, "   4444444");
    }

    @Test
    public void test01755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("!ih!ih01!ih0", "   0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("          ...", 39, "4444444                                                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444                ...4444444      " + "'", str3, "4444444                ...4444444      ");
    }

    @Test
    public void test01758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01758");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#0404HI!##", 196, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01759");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444410", "                                       10hi!10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410" + "'", str2, "4444444410");
    }

    @Test
    public void test01761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01761");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01762");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         1", "            00h00h00h00h00h00h00h00h00h             ", (int) (byte) 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "         1" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test01763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01763");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "00");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                 " + "'", str5, "                                                                                                 ");
    }

    @Test
    public void test01764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("01                                                                                               ", "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "10                                                                                          ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1                                                                                               " + "'", str3, " 1                                                                                               ");
    }

    @Test
    public void test01765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" 11 1 11 1 11 1 11 1 11 1", "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01767");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#0404HI!##", "0", "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("            00h00h00h00h00h00h00h00h00h            ", "0404HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test01770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01770");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00hi!", "0!ih!ih01!ih010!ih!ih01!ih01hi!", 13);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00hi!" });
    }

    @Test
    public void test01771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00" + "'", str1, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test01772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01772");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("   ", "00H!ih!ih0Hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test01773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01773");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01775");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                    ", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01776");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("1         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih!ih01!ih0", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih0" + "'", str2, "!ih!ih01!ih0");
    }

    @Test
    public void test01780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01780");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("########################   #########################", "10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 198 + "'", int2 == 198);
    }

    @Test
    public void test01781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01781");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "", ".", 70);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test01782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01782");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "!ih4040aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!ih!ih01!ih01", 46, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1         4444444444444444444444" + "'", str1, "1         4444444444444444444444");
    }

    @Test
    public void test01785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01785");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01786");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                               00h00h00h00h00h00h00h00h00h", "HI!                                ", 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "                                                                                                      00h00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test01787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1         4444444444444444444444                                                                 ", "                                                                                                 AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01788");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "444444441", 186);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test01789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01789");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("00H!ih!ih0Hi!                                                                                                 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                       10hi!10", 186);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str1, "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test01792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01792");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                 4444444444444444444444         1", "1100", 197);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                 4444444444444444444444         1" });
    }

    @Test
    public void test01793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("10hi!10hi!hi!", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!" + "'", str2, "10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!");
    }

    @Test
    public void test01794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " 144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih!ih01!ih0", "                                              0404HI!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih" + "'", str2, "!ih!ih01!ih");
    }

    @Test
    public void test01796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" 11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11 1 11 1 11 1 11 1 11 1" + "'", str1, "11 1 11 1 11 1 11 1 11 1");
    }

    @Test
    public void test01797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01797");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444410                                                                                       4444444410                                                                                       411", "00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                               ", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                               " + "'", str3, "                                                                                                               ");
    }

    @Test
    public void test01799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01799");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 1000h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h000hi 1010 10", "0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01800");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test01801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("444444444410                                                                                               1010                                                                                               10HI!44", "                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("000", "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str2, "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test01803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("        1    ", "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        1    " + "'", str2, "        1    ");
    }

    @Test
    public void test01804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01804");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA" + "'", str1, "AAA");
    }

    @Test
    public void test01805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test01806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "0404hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("100I0100I00I0", "                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100I0100I00I0" + "'", str2, "100I0100I00I0");
    }

    @Test
    public void test01809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01809");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00h", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00h" + "'", str7, "00h");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10" + "'", str9, "10");
    }

    @Test
    public void test01810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01810");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01811");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00hi!", "44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00hi!" });
    }

    @Test
    public void test01812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01812");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                 4444444444444444444444         1", "01 0101 !ih01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", ".", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01814");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "                                     014444444444!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                     014444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01815");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            00h00h00h00h00h00h00h00h00h             ", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(".", "10                                                                                               1010                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01817");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10" + "'", str1, "10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10");
    }

    @Test
    public void test01818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                               10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test01819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01819");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" 1                                                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { " ", "1", "                                                                                               " });
    }

    @Test
    public void test01820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01820");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("H", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test01821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01821");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10hi! 1010 10", "h00h00h00h00h00h00h00h00h                                                                      ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                    " + "'", str1, "                                                                                                                                                                                                    ");
    }

    @Test
    public void test01823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test01824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("144I!144I!4I!", "#0404HI!##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "144I!1" + "'", str2, "144I!1");
    }

    @Test
    public void test01825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" 144I!144I!4I!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01826");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10    ", "444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01827");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444  ", (int) (short) 100, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444  " + "'", str3, "4444444  ");
    }

    @Test
    public void test01828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01828");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                                ########################   #########################", "4444444                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01829");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H00h00h00h00h00h00h00h00h", "1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H00h00h00h00h00h00h00h00h" });
    }

    @Test
    public void test01830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01830");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                                                                                 AAA", "            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("1         4444444444444444444444", "4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1         4444444444444444444444" });
    }

    @Test
    public void test01832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01832");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01833");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("!ih!ih01!ih01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01834");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("Hi!                                                                                                 ", "0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01835");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "00");
        java.lang.String[] strArray8 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a', (int) '#', 3);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "1");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, '4');
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        int int22 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray21);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                 4444444444444444444444         1", strArray15, strArray21);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("10                                                                                               1010                                                                                               10HI!", strArray3, strArray21);
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        java.lang.String str26 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray21);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0404hi!" + "'", str17, "0404hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                 4444444444444444444444         1" + "'", str23, "                                                                 4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10                                                                                               1010                                                                                               10HI!" + "'", str24, "10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test01836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01836");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00HI!", "h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00HI!" });
    }

    @Test
    public void test01837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01837");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44", "00H00H00H00H00H00H00H00H00H             00000H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01838");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01839");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("        1    ", "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                ########################   #########################", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####" + "'", str2, "####");
    }

    @Test
    public void test01841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str1, "0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test01842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01842");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("0404hi!", "4444444                ...4444444      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                               00h00h00h00h00h00h00h00h00h", (int) (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                               00h00h00h00h00h00h00h00h00h" + "'", str3, "                                                                                                               00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01844");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("        1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        1 " + "'", str1, "        1 ");
    }

    @Test
    public void test01845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01845");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10hi 1010 10", "00h", (int) (byte) -1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!ih!ih01!ih010!ih!ih01!ih01hi!######################", (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10hi 1010 10" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test01846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44..." + "'", str2, "44...");
    }

    @Test
    public void test01847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("0!ih!ih01!ih010!ih!ih01!ih01hi!", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str2, "0!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test01848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01848");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("            00H00H00H00H00H00H00H00H00H            ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("4444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", "0");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("01 0101 !ih01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01 0101 !ih01" + "'", str1, "01 0101 !ih01");
    }

    @Test
    public void test01852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                 ", "!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test01853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("                                                                                                 AAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring(" 1                                                                                               ", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    " + "'", str2, "                                                                    ");
    }

    @Test
    public void test01855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("10hi!10hi!hi!", "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10hi!hi!" + "'", str2, "10hi!10hi!hi!");
    }

    @Test
    public void test01856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("   00H00H00H00H00H00H00H00H00H             ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01857");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("   0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01858");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444         1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                    ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test01860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01860");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("AAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA" + "'", str1, "AAA");
    }

    @Test
    public void test01861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01861");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                              ", "h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...   00h00h00h00h00h00h00h00h00h             ", "   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00h00h00h00h00h00h00h00h00h " + "'", str2, "...00h00h00h00h00h00h00h00h00h ");
    }

    @Test
    public void test01863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aa", "..");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih" + "'", str2, "44444444104444444410444444441044444!ih!ih01!ih");
    }

    @Test
    public void test01865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444                                                                                           ", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                                                                                           " + "'", str2, "4444444                                                                                           ");
    }

    @Test
    public void test01866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("H00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00h00h00h00h00h00h00h00h" + "'", str1, "H00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01867");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("100", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100100100100100100100100100100100100" + "'", str2, "100100100100100100100100100100100100");
    }

    @Test
    public void test01869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00" + "'", str1, "00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test01870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444104444444410444444441044444!ih!ih01!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih" + "'", str1, "44444444104444444410444444441044444!ih!ih01!ih");
    }

    @Test
    public void test01871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                    ..", 50, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444                                    ..444444" + "'", str3, "444444                                    ..444444");
    }

    @Test
    public void test01872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01872");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00H00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01873");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111001111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test01875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444410                                                                                       4444444410                                                                                       411", "...   00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410                                                                                       4444444410                                                                                       411" + "'", str2, "4444444410                                                                                       4444444410                                                                                       411");
    }

    @Test
    public void test01876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 198);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  " + "'", str2, "                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                  ");
    }

    @Test
    public void test01877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                 44444444444444444444444444444444444", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str2, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test01878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("00h00h00h00h00h00h00h00h00", "100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test01879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("44444444104444444410411", "        1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410411" + "'", str2, "44444444104444444410411");
    }

    @Test
    public void test01880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01880");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test01881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01881");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "   0", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444   ", (int) (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444    " + "'", str3, "444444    ");
    }

    @Test
    public void test01883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("00H00H00H00H00H00H00H00H00H", "", " 1                                                                                               ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test01884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01884");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                       10hi!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       10hi!10" + "'", str1, "                                       10hi!10");
    }

    @Test
    public void test01885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01885");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("00H!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", "        1 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("10hi 1010 10", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi 1010 10" + "'", str2, "10hi 1010 10");
    }

    @Test
    public void test01889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01889");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                    ", "     00H!i", 39, 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                            00H!i" + "'", str4, "                                            00H!i");
    }

    @Test
    public void test01890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01890");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("00H!ih!ih0#####################################################################################################################################################################################", 46, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H!ih!ih0#####################################################################################################################################################################################" + "'", str3, "00H!ih!ih0#####################################################################################################################################################################################");
    }

    @Test
    public void test01891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01891");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01892");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                       10hi!10hi!hi!", "                                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "    10hi!10hi!hi!" });
    }

    @Test
    public void test01893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01893");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                 AAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test01894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01894");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "00");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "         1");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) (short) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test01895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01895");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("00HI!", 0, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00HI!" + "'", str3, "00HI!");
    }

    @Test
    public void test01896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01896");
        int int1 = org.apache.commons.lang3.StringUtils.length("01 0101 !ih01");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test01897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01897");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str1, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test01898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01898");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "11 1 11 1 11 1 11 1 11 1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01899");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                 4444444444444444444444         1", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                 4444444444444444444444         1" });
    }

    @Test
    public void test01900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01900");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                            00H!i", "            00h00h00h00h00h00", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01901");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                              0404HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404HI!" + "'", str1, "0404HI!");
    }

    @Test
    public void test01902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("10hi!10", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                              10hi!10" + "'", str2, "                                                                                                                                                                                              10hi!10");
    }

    @Test
    public void test01903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("00HI!", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!" + "'", str2, "00HI!");
    }

    @Test
    public void test01904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01904");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                              0404HI!              ...", "00h00h00h00h00h00h00h00h00", "...   00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404HI!              ..." + "'", str3, "                                              0404HI!              ...");
    }

    @Test
    public void test01906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                               00h00h00h00h00h00h00h00h00", "100100100100100100100100100100100100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01907");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test01908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444                ...4444444      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444                ...4444444" + "'", str1, "4444444                ...4444444");
    }

    @Test
    public void test01909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01909");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  ", "44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih!ih01!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih" + "'", str1, "!ih!ih01!ih");
    }

    @Test
    public void test01911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("44...", "4444444                ...4444444      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44..." + "'", str2, "44...");
    }

    @Test
    public void test01912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("0000000000000000000000000000000000000000000000000000000000000000000000", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test01913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01913");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("########################00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("   4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                       10hi!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi!10" + "'", str1, "10hi!10");
    }

    @Test
    public void test01916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01916");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("100                                                                                              ", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("144I!1", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "100" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "144I!1" + "'", str5, "144I!1");
    }

    @Test
    public void test01917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!ih!ih01!ih0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0hi!10hi!hi!" + "'", str1, "0hi!10hi!hi!");
    }

    @Test
    public void test01918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str1, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test01919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...   00h00h00h00h00h00h00h00h00h", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaa00h00h00h00h00h00h00h00h00h" + "'", str3, "...aaa00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test01921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444410                                     !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444410                                     ", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "00H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     " + "'", str3, "4444444444hi                                     0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000004444444444hi                                     ");
    }

    @Test
    public void test01922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01922");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                  " + "'", str1, "                                                  ");
    }

    @Test
    public void test01923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00HI!", 100, "0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!" + "'", str3, "00HI!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!ih!ih01!ih010!ih!ih01!ih01hi!0!");
    }

    @Test
    public void test01924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01924");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10                                                                                               1010                                                                                               10hi!", "00hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "1010hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10                                                                                               1010                                                                                               10hi!", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", 25);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 25");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10                                                                                               1010                                                                                               10hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                                                               1010                                                                                               " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "10                                                                                               1010                                                                                               10hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "                                                                         1010                                                                                               10hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "1010                                                                                               10hi!" });
    }

    @Test
    public void test01925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h00h00h00h00h00h00h00h00h" + "'", str1, "h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01926");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444", "00H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", "                                            00H!i", 95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444" + "'", str4, "4444444");
    }

    @Test
    public void test01927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("00H", 0, "!ih!ih0#####################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H" + "'", str3, "00H");
    }

    @Test
    public void test01928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01928");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" + "'", str1, "h!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0");
    }

    @Test
    public void test01929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01929");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test01930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01930");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                 44444444444444444444444444444444444", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str3, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test01931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01931");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("h00h00h00h00h00h00h00h00h", "00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h" + "'", str2, "h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01932");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaa", 145, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10                                                                                               1010                                                                                               10hi!", 133, "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str3, "10                                                                                               1010                                                                                               10hi!");
    }

    @Test
    public void test01934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...aaa00h00h00h00h00h00h00h00h00h", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...aaa00h00h00h00h00h00h00h00h00h" + "'", str2, "...aaa00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("     ", 196, "00HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!0" + "'", str3, "     00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!0");
    }

    @Test
    public void test01936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01936");
        char[] charArray11 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray11);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                              0404HI!                                               ", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("                                              0404HI!", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("00", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test01937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01937");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("00000000000000000000000000000000000", "########################00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01938");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!", "                                                                                               10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...   00h00h00h00h00h00h00h00h00h             ", "########################00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   00h00h00h00h00h00h00h00h00h             " + "'", str2, "...   00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test01940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01940");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("                                                                 4444444444444444444444         1", "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test01941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("00h00h00h00haaa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h" + "'", str2, "00h00h00h00h");
    }

    @Test
    public void test01942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01942");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("00", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" 144I!144I!4I!", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    144I!144I!4I!" + "'", str2, "                                                                                    144I!144I!4I!");
    }

    @Test
    public void test01944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("10                                                                                          ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                          ..." + "'", str1, "10                                                                                          ...");
    }

    @Test
    public void test01945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01945");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("Hi!", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 192 + "'", int2 == 192);
    }

    @Test
    public void test01946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!" + "'", str2, "00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
    }

    @Test
    public void test01947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h" + "'", str2, "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test01948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01948");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ih!ih01!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih!ih01!ih" });
    }

    @Test
    public void test01949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01950");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("0404hi!", "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!" + "'", str2, "0404hi!");
    }

    @Test
    public void test01951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01951");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih000H!ih!ih0" });
    }

    @Test
    public void test01952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01952");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("4444444410", "1         4444444444444444444444", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("   00H00H00H00H00H00H00H00H00H             ", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h!IH10HI!10HI!HI!010HI!10HI!HI!");
    }

    @Test
    public void test01955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01955");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!ih10hi!10hi!hi!010hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH10HI!10HI!HI!010HI!10HI!HI!" + "'", str1, "!IH10HI!10HI!HI!010HI!10HI!HI!");
    }

    @Test
    public void test01956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01956");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("444444   ", "                                                ########################   #########################", 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   " + "'", str3, "444444                                                   ########################   #########################444444                                                   ########################   #########################444444                                                   ########################   #########################444444   ");
    }

    @Test
    public void test01957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...00h00h00h00h00h00h00h00h00h ", 198);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...00h00h00h00h00h00h00h00h00h " + "'", str2, "...00h00h00h00h00h00h00h00h00h ");
    }

    @Test
    public void test01958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01958");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!10hi!10hi!hi!", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01959");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("            00H00H00H00H00H00H00H00H00H             ", "100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 0, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "            ", "H", "H", "H", "H", "H", "H", "H", "H", "H             " });
    }

    @Test
    public void test01960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00H!ih!ih0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0" + "'", str2, "00H!ih!ih0");
    }

    @Test
    public void test01961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01961");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0hi 1010 10", "          1 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01962");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("10                                                                                               1010                                                                                               10hi!", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 104 + "'", int2 == 104);
    }

    @Test
    public void test01963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01963");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" 144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 144i!144i!4i!" + "'", str1, " 144i!144i!4i!");
    }

    @Test
    public void test01964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01964");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("H00H00H00H00H00H00H00H00H", "                                                                                                 AAA", 651);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test01965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01965");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" 11 1 11 1 11 1 11 1 11 1", "00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h00haaa00h00h00h0", "00hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test01966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01966");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih10hi!10hi!hi!010hi!10hi!hi!", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaa1a", "                                       10hi!10hi!hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test01968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01968");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01969");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" ", "100                                                                                              ", 46);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " " });
    }

    @Test
    public void test01970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01970");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                       10hi!10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01971");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 aaa", " 144I!144I!4I!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                 aaa" });
    }

    @Test
    public void test01972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01972");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", "1100", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" });
    }

    @Test
    public void test01973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H00H00H00H00H00H00H00H00H                                                                      " + "'", str1, "00H00H00H00H00H00H00H00H00H                                                                      ");
    }

    @Test
    public void test01974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("         1                                                                                                                                       ", "                                    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test01975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01975");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                               000                                               ", "                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01977");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                    ", "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01978");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "" });
    }

    @Test
    public void test01979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!ih!ih01!ih010!ih!ih01!ih01hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444         1aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01980");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0404HI!", "00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404HI!" + "'", str2, "0404HI!");
    }

    @Test
    public void test01981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01981");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0404hi!", 98, "010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000010101!ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0404hi!010101!ih0100000000000000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test01982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01982");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("########################00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi!", "                                                                                                 aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test01984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444410                                                                                       4444444410                                                                                       411");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test01985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test01986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                ########################   #########################", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                ########################   #########################" + "'", str2, "                ########################   #########################");
    }

    @Test
    public void test01987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01987");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...00h00h00h00h00h00h00h00h00h ", 186, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test01988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01988");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("...00h00h00h00h00h00h00h00h00h ", "     H  H  H  H  H  H  H  H  H             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test01989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("            00h00h00h00h00h00h00h00h00h             ", "01 0101 !ih010000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str2, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test01990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!00HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01992");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("            00h00h00h00h00h00h00h00h00h             ", "1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test01993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01993");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                ########################   #########################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "########################", "#########################" });
    }

    @Test
    public void test01994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01994");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("0!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01995");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(".", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test01996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01996");
        char[] charArray12 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("            00h00h00h00h00h00h00h00h00h             ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("0404hi!", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("                                              0404HI!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test01997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01997");
        char[] charArray7 = new char[] { '4', ' ', ' ', ' ' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', ' ', ' ', ' ' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test01998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01998");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("         1", "4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test01999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test01999");
        char[] charArray10 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih!ih01!ih01", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("10hi! 1010 10", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test02000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test02000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("1", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1    " + "'", str2, "1    ");
    }
}

