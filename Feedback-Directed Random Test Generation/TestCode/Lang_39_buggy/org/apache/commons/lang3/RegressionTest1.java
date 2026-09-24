package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "                                       10HI!10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00h00h00h00h00h00h00h00h00h            " + "'", str1, "            00h00h00h00h00h00h00h00h00h            ");
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("          1 ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        1 " + "'", str2, "        1 ");
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                       10hi!10", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("         1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "            00h00h00h00h00h00", (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "         ", "1" });
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("00hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("            00H00H00H00H00H00H00H00H00H             ", "", "                                       10hi!10");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("00H", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("        1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("10                                                                                               1010                                                                                               10hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("10                                                                                               1010                                                                                               10hi!", "00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                               10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                 44444444444444444444444444444444444", "100", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih01!ih010!ih!ih01!ih01hi!", '4', 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0!ih!ih01!ih010!ih!ih01!ih01hi!", (int) '#', "000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!0000" + "'", str3, "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                                                 44444444444444444444444444444444444", "10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00h00h00h00h00h00h00h00h00h", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", 3, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 " + "'", str3, "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("10hi!10hi!hi!", "                                                                                               10", "00hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10hi!10hi!hi!" + "'", str3, "10hi!10hi!hi!");
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("00H", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H" + "'", str2, "00H");
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                 44444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                       10hi!10hi!hi!", "4444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10hi!hi!" + "'", str2, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("!ih!ih01!ih010!ih!ih01!ih01hi!", "                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!ih!ih01!ih01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10                                                                                               1010                                                                                               10hi", "10hi 1010 10", 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                       10hi!10hi!hi!", "11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10hi!hi!" + "'", str2, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                 4444444444444444444444         1", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 4444444444444444444444         1" + "'", str2, "                                                                 4444444444444444444444         1");
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                       10hi!10", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        char[] charArray8 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("0000000000000000000000000000000000000000000000000000000000000000000000", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                              0404hi!                                               ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("0404hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404hi!" + "'", str1, "0404hi!");
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("10hi 1010 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi 1010 10" + "'", str1, "10hi 1010 10");
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("            00H00H00H00H00H00H00H00H00H             ", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H00H00H00H00H00H00H00H00H" + "'", str2, "H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                 44444444444444444444444444444444444", "Hi!", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", "10hi 1010 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" + "'", str2, "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0!ih!ih01!ih010!ih!ih01!ih01hi!", "                                                                 4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str2, "0!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "000" + "'", str1, "000");
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", "00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("        1 ", "4444444444444444444444444444444444", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih!ih01!ih01", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("H00H00H00H00H00H00H00H00H", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih01!ih01" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                   ", "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("144i!144i!4i!", (int) (short) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "144i!144i!4i!" + "'", str3, "144i!144i!4i!");
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10                                                                                               1010                                                                                               10hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi! 1010 10" + "'", str2, "10hi! 1010 10");
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("            00H00H00H00H00H00H00H00H00H             ", "10hi 1010 10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 14 + "'", int2 == 14);
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                       10HI!10", "00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10HI!10" + "'", str2, "                                       10HI!10");
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                              11", (int) (short) 0, "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              11" + "'", str3, "                              11");
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("00hi!", "", (int) (byte) 100);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00", strArray3, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "00" + "'", str8, "00");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10HI!" + "'", str1, "10                                                                                               1010                                                                                               10HI!");
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("            00H00H00H00H00H00H00H00H00H             ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00h", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("100", "                                       10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                       10hi!10hi!hi!", "4444444410", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       10hi!10hi!hi!" + "'", str3, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("10hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi! 1010 10" + "'", str1, "10hi! 1010 10");
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("144i!144i!4i!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("144i!144i!4i!", "H00H00H00H00H00H00H00H00H", "00");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444");
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("        1 ", "Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("         1", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444   ", 98, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444                                                                                           " + "'", str3, "4444444                                                                                           ");
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("            00h00h00h00h00h00h00h00h00h            ", "                                       10HI!10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h" + "'", str2, "h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                       10hi!10", "10hi! 1010 10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("4444444   ", "00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!ih!ih01!ih01");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                              0404hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404hi!" + "'", str1, "0404hi!");
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("144i!144i!4i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144i!144i!4i!" + "'", str1, "144i!144i!4i!");
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("00h", "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str3, "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi!10hi!hi!" + "'", str1, "10hi!10hi!hi!");
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("00", "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("0", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444   ", "100", "            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444   " + "'", str3, "4444444   ");
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi!", "00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str1, "10                                                                                               1010                                                                                               10hi!");
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("1", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444410", "        1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410" + "'", str2, "4444444410");
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("0404hi!", "                                              0404hi!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0404hi!" + "'", str2, "0404hi!");
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        int int1 = org.apache.commons.lang3.StringUtils.length("10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                 4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1         4444444444444444444444                                                                 " + "'", str1, "1         4444444444444444444444                                                                 ");
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("10hi! 1010 10");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                       10HI!10", "!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "Hi!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" });
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih01!ih010!ih!ih01!ih01hi!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("H00H00H00H00H00H00H00H00H", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1         4444444444444444444444                                                                 ", "4444444   ", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("144i!144i!4i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!144I!4I!" + "'", str1, "144I!144I!4I!");
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("            00h00h00h00h00h00h00h00h00h             ", "144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str2, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00hi!", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "00hi!" + "'", str4, "00hi!");
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                   ", "Hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("          1 ", "4444444                                                                                           ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "########################   #########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 197 + "'", int2 == 197);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!", 197);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("4444444                                                                                           ", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444                                                                                           " + "'", str2, "4444444                                                                                           ");
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("          1 ", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("00hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00hi!" + "'", str1, "00hi!");
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                               10", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10" + "'", str2, "                                                                                               10");
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("            00h00h00h00h00h00h00h00h00h             ", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h             " + "'", str2, "00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "00hi!", (int) (short) 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("00h", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("          1 ", 29, 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          1 " + "'", str3, "          1 ");
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10" + "'", str7, "10");
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("0404hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h" + "'", str1, "00h");
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                              0404HI!                                               ", 12, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404HI!                                               " + "'", str3, "                                              0404HI!                                               ");
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("        1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        1 " + "'", str1, "        1 ");
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("10hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi! 1010 10" + "'", str1, "10hi! 1010 10");
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                       10HI!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih!ih01!ih010!ih!ih01!ih01hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str2, "!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                               10");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("            00h00h00h00h00h00h00h00h00h            ", "10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       10hi!10hi!hi!" + "'", str1, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("10                                                                                               1010                                                                                               10hi", "10                                                                                               1010                                                                                               10HI!", "1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str3, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444", "10                                                                                               1010                                                                                               10HI!", (int) ' ', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444410                                                                                               1010                                                                                               10HI!44" + "'", str4, "444444444410                                                                                               1010                                                                                               10HI!44");
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                       10HI!10", (-1), '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       10HI!10" + "'", str3, "                                       10HI!10");
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih01!ih010!ih!ih01!ih01hi!", (int) '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!######################" + "'", str3, "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10hi! 1010 10", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0404hi!", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0404hi!" + "'", str3, "0404hi!");
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("            00h00h00h00h00h00h00h00h00h            ", "4444444   ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                       10hi!10hi!hi!", "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444   ", 1, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444   " + "'", str3, "444444   ");
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", ' ');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        int int1 = org.apache.commons.lang3.StringUtils.length("          1 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("10hi 1010 10", "10                                                                                               1010                                                                                               10hi", (int) (short) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str4, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("1", (int) (short) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("########################   #########################", "!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("10hi 1010 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi 1010 10" + "'", str1, "10hi 1010 10");
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444   ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444   " + "'", str2, "4444444   ");
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("00hi!", "                                              0404HI!                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("", "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("H00H00H00H00H00H00H00H00H", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("4444444   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                 4444444444444444444444         1");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("144i!144i!4i!", 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("444444   ", "00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "                                                                 44444444444444444444444444444444444", "10                                                                                               1010                                                                                               10hi!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!######################" + "'", str4, "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                              0404HI!                                               ", "11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404HI!                                               " + "'", str2, "                                              0404HI!                                               ");
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000000000000000000000000" + "'", str1, "00000000000000000000000000000000000");
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("0404hi!", 197, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("            00h00h00h00h00h00h00h00h00h             ", "                                       10HI!10", "            00H00H00H00H00H00H00H00H00H             ", 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str4, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("1", "100", (int) '#', (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1100" + "'", str4, "1100");
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("            00H00H00H00H00H00H00H00H00H             ", (-1), "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            00H00H00H00H00H00H00H00H00H             " + "'", str3, "            00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("   ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("            00H00H00H00H00H00H00H00H00H             ", "         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00H00H00H00H00H00H00H00H00H             " + "'", str2, "            00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str2, "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444   ", '#', 197);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                                       10hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                   ", "144i!144i!4i!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                   " });
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("4444444                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("1100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1100" + "'", str1, "1100");
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("10hi 1010 10", "00h00h00h00h00h00h00h00h00h", "10");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                               10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "1", (int) (byte) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 12, 46);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10hi 1010 10", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi 1010 10" + "'", str2, "10hi 1010 10");
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                              0404HI!                                               ", "         1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!                                                                                                 ", 'a', 191);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("1         4444444444444444444444                                                                 ", "h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("144I!144I!4I!", 14);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " 144I!144I!4I!" + "'", str2, " 144I!144I!4I!");
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("            00h00h00h00h00h00", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 0, "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                              0404hi!                                               ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404hi!                                               " + "'", str2, "                                              0404hi!                                               ");
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                              0404HI!                                               ", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404HI!                                               " + "'", str3, "                                              0404HI!                                               ");
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("10                                                                                               1010                                                                                               10hi", "                              11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str2, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("h00h00h00h00h00h00h00h00h", "4444444                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h" + "'", str2, "h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                              11");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", "4444444444444444444444444444444444", 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("00hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0404hi!", "4444444410", "4444444444444444444444444444444444", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0404hi!" + "'", str4, "0404hi!");
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("00H", "44444444444444444444444444444444444", "100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H" + "'", str3, "00H");
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("            00h00h00h00h00h00h00h00h00h             ", "                              11");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h             " + "'", str2, "00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                   ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                   " });
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("10hi!10hi!hi!", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10hi!hi!" + "'", str2, "10hi!10hi!hi!");
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444444444444444444444", "hi!", "00hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444");
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("          1 ", '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00H00H00H00H00H00H00H00H" + "'", str1, "H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                 44444444444444444444444444444444444", (int) (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str3, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" + "'", str2, "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!", 0, 98);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10                                                                                               1010                                                                                               10hi!", "            00h00h00h00h00h00", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "1", "1", "1", "1", "i!" });
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                 ", "Hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("00h00h00h00h00h00h00h00h00h             ", "000", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             " + "'", str3, "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                              0404HI!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404HI!" + "'", str1, "0404HI!");
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!ih!ih01!ih01");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih01" + "'", str1, "!ih!ih01!ih01");
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("            00h00h00h00h00h00h00h00h00h             ", "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str2, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!144I!4I!" + "'", str1, "144I!144I!4I!");
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                       10HI!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", (int) 'a', "0404HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!", "          1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("10hi!10hi!hi!", "        1 ", "11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10hi!10hi!hi!" + "'", str3, "10hi!10hi!hi!");
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("00000000000000000000000000000000000", "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000000000000000" + "'", str2, "00000000000000000000000000000000000");
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444410", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410" + "'", str2, "4444444410");
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("10hi! 1010 10", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("0", "        1 ", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!", "                                       10hi!10", "4444444                                                                                           ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("10hi 1010 10", "        1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0hi 1010 10" + "'", str2, "0hi 1010 10");
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("########################   #########################", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("0000000000000000000000000000000000000000000000000000000000000000000000", "00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("0404HI!", "!ih!ih01!ih010!ih!ih01!ih01hi!", "00h", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0404HI!" + "'", str4, "0404HI!");
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00h00h00h00h00h00h00h00h00h", 97, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h                                                                      " + "'", str3, "00h00h00h00h00h00h00h00h00h                                                                      ");
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" 144I!144I!4I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "144I!144I!4I!" + "'", str1, "144I!144I!4I!");
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                 4444444444444444444444         1", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 65 + "'", int2 == 65);
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("144I!144I!4I!", "         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "144I!144I!4I!" + "'", str2, "144I!144I!4I!");
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("10", "                                                                 4444444444444444444444         1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("10hi!10hi!hi!", "1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("0000000000000000000000000000000000000000000000000000000000000000000000", "10                                                                                               1010                                                                                               10hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                                       10hi!10hi!hi!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0000000000000000000000000000000000000000000000000000000000000000000000" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!                                                                                                 ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!                                                                                                 " + "'", str3, "Hi!                                                                                                 ");
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410" + "'", str1, "4444444410");
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("00hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00HI!" + "'", str1, "00HI!");
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!ih!ih01!ih01", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("        1 ", "444444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                              11");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0404HI!", 0, "                              11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0404HI!" + "'", str3, "0404HI!");
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("10", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 191);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "   ", 13);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                              0404hi!                                               ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10                                                                                               1010                                                                                               10hi!", "", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00" + "'", str1, "00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("10hi!10hi!hi!", "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("1100", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1100" + "'", str2, "1100");
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        int int1 = org.apache.commons.lang3.StringUtils.length("            00h00h00h00h00h00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 29 + "'", int1 == 29);
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "00h", "                              11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("000", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               000                                               " + "'", str2, "                                               000                                               ");
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("11", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11" + "'", str2, "11");
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("00h00h00h00h00h00h00h00h00h                                                                      ", "                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                 ", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("            00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00h00h00h00h00h00" + "'", str1, "            00h00h00h00h00h00");
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100", (int) 'a', "10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " + "'", str3, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("H00H00H00H00H00H00H00H00H", "                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00h", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("00000000000000000000000000000000000", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("10hi 1010 10", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("1         4444444444444444444444                                                                 ", "00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                       10hi!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       10hi!10" + "'", str1, "                                       10hi!10");
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("1         4444444444444444444444                                                                 ", " 144I!144I!4I!", "100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1         4444444444444444444444                                                                 " + "'", str3, "1         4444444444444444444444                                                                 ");
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!######################" + "'", str3, "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Hi!                                                                                                 ", "          1 ", "00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!                                                                                                 " + "'", str3, "Hi!                                                                                                 ");
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("444444444410                                                                                               1010                                                                                               10HI!44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                       10hi!10hi!hi!", "            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "1", "i!1", "i!", "i!" });
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", "00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str2, "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih!ih01!ih01", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih01" + "'", str2, "!ih!ih01!ih01");
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("00000000000000000000000000000000000", (int) (byte) 100, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("0404hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("00HI!", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00HI!" + "'", str2, "00HI!");
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("00h", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00h" + "'", str7, "00h");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("000", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih01!ih010!ih!ih01!ih01hi!######################", "Hi!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih01!ih010!ih!ih01!ih01hi!######################" });
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("        1 ", 13, "                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        1    " + "'", str3, "        1    ");
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!", "0404hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10", ' ', 70);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("000", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                               10", "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10" + "'", str2, "                                                                                               10");
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                              11");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                 4444444444444444444444         1", "144i!144i!4i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                              0404HI!                                               ", "0404hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!                                                                                                 ", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 196 + "'", int2 == 196);
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("1         4444444444444444444444                                                                 ", (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1         4444444444444444444444                                                                 " + "'", str3, "1         4444444444444444444444                                                                 ");
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("Hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "         1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", (int) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44" + "'", str3, "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44");
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("        1    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("10                                                                                               1010                                                                                               10HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10HI!" + "'", str1, "10                                                                                               1010                                                                                               10HI!");
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                 44444444444444444444444444444444444", "         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str2, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("11", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "10hi 1010 10", "            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", 5, "   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!0000" + "'", str3, "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        java.lang.String[] strArray4 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) '#', 3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "1");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                                                                               10");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hi!");
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00000000000000000000000000000000000", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("11", strArray4, strArray18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str13, "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10hi!10hi!hi!" + "'", str15, "10hi!10hi!hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "00000000000000000000000000000000000" });
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444410", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("1", 'a', 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("10                                                                                               1010                                                                                               10HI!", "   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               1010                                                                                               10HI!" + "'", str2, "10                                                                                               1010                                                                                               10HI!");
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("444444444410                                                                                               1010                                                                                               10HI!44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("            00h00h00h00h00h00h00h00h00h            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 191, "00h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00" + "'", str3, "00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00h00");
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                 ", "            00h00h00h00h00h00h00h00h00h             ", "!", 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                 " + "'", str4, "                                                                                                 ");
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("1         4444444444444444444444                                                                 ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("100", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", '4', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     " + "'", str3, "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("0!ih!ih01!ih010!ih!ih01!ih01hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "0!ih!ih01!ih010!ih!ih01!ih01hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str3, "0!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", 10, "                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih01!ih010!ih!ih01!ih01hi!######################", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("00h", "44444444444444444444444444444444444", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h" + "'", str3, "00h");
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                 4444444444444444444444         1", "00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("            00h00h00h00h00h00h00h00h00h            ", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            " + "'", str2, "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "100");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", 0, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " + "'", str4, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ", 95, "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     " + "'", str3, "        10        10        10     !ih!ih01!ih010!ih!ih01!ih01hi!        10        10        10     ");
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("H00H00H00H00H00H00H00H00H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H00H00H00H00H00H00H00H00H" + "'", str1, "H00H00H00H00H00H00H00H00H");
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("00h00h00h00h00h00h00h00h00", "!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "000", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("00H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str2, "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00H00H00H00H00H00H00H00H00H            " + "'", str1, "            00H00H00H00H00H00H00H00H00H            ");
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "                                                                                                 ", (int) (byte) 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("        1    ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                       10HI!10", "4444444   ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       10hi!10hi!hi!" + "'", str1, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                                       10hi!10", "00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                 ", (int) (byte) 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 aaa" + "'", str3, "                                                                                                 aaa");
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("10", "            00h00h00h00h00h00h00h00h00h            ", "10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "10", (int) '4', 10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444444444444444444444444", strArray5, strArray12);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00h00h00h00h00h00h00h00h00h             ", "00h00h00h00h00h00h00h00h00h", 13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("                              11", strArray5, strArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "44444444444444444444444444444444444" + "'", str13, "44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "             " });
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            " + "'", str2, "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("########################   #########################", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################   #########################" + "'", str2, "########################   #########################");
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" + "'", str1, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444410", "00h00h00h00h00h00h00h00h00");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444410" });
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("00h", "1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("0", "         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("4444444                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("            00h00h00h00h00h00h00h00h00h            ", "10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h            " + "'", str2, "            00h00h00h00h00h00h00h00h00h            ");
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("        1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        1 " + "'", str1, "        1 ");
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("        1    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h00h00h00h00h00h00h00h00h", "   ", (int) '4');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h00h00h00h00h00h00h00h00h" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("0404HI!", "00", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!" + "'", str3, "0404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!000404HI!");
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0" + "'", str2, "00H!ih!ih0");
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("            00H00H00H00H00H00H00H00H00H            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00H00H00H00H00H00H00H00H00H            " + "'", str1, "            00H00H00H00H00H00H00H00H00H            ");
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("h00h00h00h00h00h00h00h00h", "   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h00h00h00h00h00h00h00h00h" + "'", str2, "h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("00hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00hi!" + "'", str2, "00hi!");
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", "00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                               10", "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("10hi! 1010 10", "4444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444");
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1", 197, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("########################   #########################", "          1 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, " !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("100", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100                                                                                              " + "'", str2, "100                                                                                              ");
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                       10hi!10hi!hi!", "10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10hi!hi!" + "'", str2, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("10hi 1010 10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("            00H00H00H00H00H00H00H00H00H             ", (int) (byte) 10, 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("000", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("            00h00h00h00h00h00h00h00h00h             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("444444444410                                                                                               1010                                                                                               10HI!44");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444444444410", "1010", "10HI!44" });
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                 aaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 aaa" + "'", str2, "                                                                                                 aaa");
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("11");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "11" + "'", str1, "11");
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("00H!ih!ih0", "4444444410");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("10", "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "!ih!ih01!ih010!ih!ih01!ih01hi!######################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("00");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "00" });
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444", '#', 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                       10hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" + "'", str1, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                               000                                               ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("000", "            00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000" + "'", str2, "000");
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                              11", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              " + "'", str2, "                              ");
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                              ", '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("1100", "                                               000                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("1         4444444444444444444444                                                                 ", "144i!144i!4i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1         4444444444444444444444                                                                 " + "'", str2, "1         4444444444444444444444                                                                 ");
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("1", "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("h00h00h00h00h00h00h00h00h", "444444444410                                                                                               1010                                                                                               10HI!44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("44444444444444444444444444444444444", "4444444410");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 27 + "'", int2 == 27);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("         1", "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         1" + "'", str2, "         1");
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("00H!ih!ih0", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00H!ih!ih0" + "'", str2, "00H!ih!ih0");
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                       10hi!10", "0!ih!ih01!ih010!ih!ih01!ih01hi!0000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10" + "'", str2, "                                       10hi!10");
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                       10HI!10", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10HI!10" + "'", str2, "                                       10HI!10");
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("         1", "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   00H00H00H00H00H00H00H00H00H             " + "'", str2, "   00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        char[] charArray10 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("                                   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                 44444444444444444444444444444444444", 196);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str2, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00H!ih!ih0", 191, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H!ih!ih0#####################################################################################################################################################################################" + "'", str3, "00H!ih!ih0#####################################################################################################################################################################################");
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        1    ", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "        1    " });
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("00H!ih!ih0", " 144I!144I!4I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00h00h00h00h00h00h00h00h00h                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("10hi! 1010 10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "01 0101 !ih01" + "'", str1, "01 0101 !ih01");
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444", "   00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("0404HI!", 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#0404HI!##" + "'", str3, "#0404HI!##");
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("00H!ih!ih0#####################################################################################################################################################################################", "0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "H!ih!ih", "#####################################################################################################################################################################################" });
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("00h00h00h00h00h00h00h00h00h             00000h00h00h00h00h00h00h00h00h             ", "                                       10HI!10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("1         4444444444444444444444                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("00h00h00h00h00h00h00h00h00", "00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00" + "'", str2, "00");
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                       10HI!10", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("100", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "100" });
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                              0404HI!                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H", "0!ih!ih01!ih010!ih!ih01!ih01hi!", 70, (int) '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str4, "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111110!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " + "'", str2, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("        1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("100                                                                                              ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100                                                                                              " + "'", str2, "100                                                                                              ");
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("10                                                                                               1010                                                                                               10hi", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str3, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444444444410                                                                                               1010                                                                                               10HI!44", "10hi!10hi!hi!", "            00H00H00H00H00H00H00H00H00H            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444410                                                                                               1010                                                                                               10HI!44" + "'", str3, "444444444410                                                                                               1010                                                                                               10HI!44");
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("100                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0404HI!", "                                       10HI!10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                                                 44444444444444444444444444444444444", "00H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1010hi!", "00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                 aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa" + "'", str1, "aaa");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                       10hi!10", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih01!ih01", "Hi!", 65);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "h", "", "h01", "", "h01" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", "        1    ", (int) ' ');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "0!ih!ih0", "!ih0", "0!ih!ih0", "!ih0", "hi!0000" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00H00H00H00H00H00H00H00H00H             " + "'", str1, "            00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   " + "'", str3, "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "0404", "hi", "!" });
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(" 144I!144I!4I!", "                                       10hi!10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 5, 0);
        java.lang.Class<?> wildcardClass10 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00", "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "            00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h                        00h00h00h00h00h00h00h00h00h            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 651 + "'", int2 == 651);
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0!ih!ih01!ih010!ih!ih01!ih01hi!0000", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                       10hi!10", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10" + "'", str2, "                                       10hi!10");
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   10   10010010010010010010010010010010010010010010010010010010010010010010010010010010010010010   ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 97, 29);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", '#');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("         1", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("100                                                                                              ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("144I!144I!4I!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                              0404hi!                                               ", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("            00h00h00h00h00h00", "H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              11", "                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!", "144i!144i!4i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                       10HI!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       10HI!10" + "'", str1, "                                       10HI!10");
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        int int1 = org.apache.commons.lang3.StringUtils.length("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa0404hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 145 + "'", int1 == 145);
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 44", "                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }
}

