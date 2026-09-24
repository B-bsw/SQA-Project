package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test03501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03501");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray6 = new char[] { ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                !", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                 ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 96 + "'", int9 == 96);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test03502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("     ", "hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test03503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!         !         !         !         !         ", 542, "                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               " + "'", str3, "                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test03504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", "      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("################################################H################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################################H################################################" + "'", str1, "################################################H################################################");
    }

    @Test
    public void test03506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hihihih", 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihih" + "'", str3, "hihihih");
    }

    @Test
    public void test03507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       " + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
    }

    @Test
    public void test03508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444                             hi!", (int) (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             hi!" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444                             hi!");
    }

    @Test
    public void test03509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ", 165);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                !                                !                                !                                !                             ..." + "'", str2, "!                                !                                !                                !                                !                             ...");
    }

    @Test
    public void test03510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03510");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03511");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hiihiihiihiihihiihiihiihiihii", "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03513");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hih                                                                                            ", "...                                                                                  ...", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03514");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                              ", "                             hi!", (int) (byte) 0, 45);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                             hi!" + "'", str4, "                             hi!");
    }

    @Test
    public void test03515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03515");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test03516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                               ", "Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                              !                                  ", 28);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            " + "'", str2, "                            ");
    }

    @Test
    public void test03518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ", "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    " + "'", str2, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ");
    }

    @Test
    public void test03520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################" + "'", str1, "#################################################");
    }

    @Test
    public void test03521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03521");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                        ", 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA                        AAA" + "'", str3, "AAA                        AAA");
    }

    @Test
    public void test03522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03522");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03523");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                !                                !                                !                                !", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "                                ", "                                ", "                                ", "                                ", "" });
    }

    @Test
    public void test03524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03524");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "#######          #######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######          #######" + "'", str1, "#######          #######");
    }

    @Test
    public void test03525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03525");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", "", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "", "", "", "", "", "", "", "", "                         444444444444444444444444444444" });
    }

    @Test
    public void test03526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hihihi!                      ...", 87, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03527");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi" });
    }

    @Test
    public void test03528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("h!ih!ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih" + "'", str2, "h!ih!ih!ih");
    }

    @Test
    public void test03529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                           ...", "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           ..." + "'", str2, "                           ...");
    }

    @Test
    public void test03530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03530");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihihihihihihihihi" + "'", str1, "hihihihihihihihihihihi");
    }

    @Test
    public void test03531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", "aaahih                                                                                             ", "4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test03532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03533");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444444444444     444444444444444", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "44444444444444     444444444444444" + "'", str5, "44444444444444     444444444444444");
    }

    @Test
    public void test03534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03534");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444                               !4444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444", "!4444444444444444444444444444" });
    }

    @Test
    public void test03535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih" + "'", str1, "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
    }

    @Test
    public void test03536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI! 44444444444444444444444444444444444444444444444444444444444444444444", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI! 44444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "HI! 44444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03537");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi" + "'", str1, "hi!hi!hi");
    }

    @Test
    public void test03538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                  Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi" + "'", str1, "Hi");
    }

    @Test
    public void test03539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!h!!i!hihi!hi!hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!");
    }

    @Test
    public void test03540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03540");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!hi!hi!h                                                                                                    ", 29, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!h                                                                                                    " + "'", str3, "Hi!hi!hi!h                                                                                                    ");
    }

    @Test
    public void test03541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03541");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih", "4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih" });
    }

    @Test
    public void test03542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03542");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hihihih", "hihihihih!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihih" + "'", str3, "hihihih");
    }

    @Test
    public void test03543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaHi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03544");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "!!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03545");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                            !!hi!hi!                                            ", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("          ", "                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               ", "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03547");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444                               !4444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444                               !4444444444444444444444444444" + "'", str1, "4444444444444444444444444444                               !4444444444444444444444444444");
    }

    @Test
    public void test03548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03548");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                            !!hi!hi!                                            ", "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!!                               ", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!                               " + "'", str2, "!!                               ");
    }

    @Test
    public void test03550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03550");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                ...", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03551");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("         !", ' ', 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03552");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HIHIHIHIH                                  !IHIHIHIH", "4hi", "i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIH                                  !IHIHIHIH" + "'", str3, "HIHIHIHIH                                  !IHIHIHIH");
    }

    @Test
    public void test03554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03554");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03555");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!4!4!4!4!HH   !4!4!4!4!4", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                              !                                  " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!" });
    }

    @Test
    public void test03556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "!ih!ih!!ih!!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test03557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03557");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ", 898);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hihihihih!                                                                                          ", "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                             hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             hi!" + "'", str1, "                             hi!");
    }

    @Test
    public void test03560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03560");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("       ..", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03561");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", "H                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03562");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444                             HI", "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hih       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test03563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03563");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!I444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!Ihi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH" + "'", str2, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!Ihi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH");
    }

    @Test
    public void test03565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi");
    }

    @Test
    public void test03566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!ih                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH                        ..." + "'", str1, "!IH                        ...");
    }

    @Test
    public void test03567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...hihih", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h", "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
    }

    @Test
    public void test03569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
    }

    @Test
    public void test03570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03570");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", 90, "#############################hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################");
    }

    @Test
    public void test03571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("##", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##" + "'", str2, "##");
    }

    @Test
    public void test03572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03572");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03573");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                       !!HI!HI!H", (-1), 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       !!HI!HI!H" + "'", str3, "                       !!HI!HI!H");
    }

    @Test
    public void test03574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      " + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ");
    }

    @Test
    public void test03575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03575");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                                                                                                                                       Hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test03577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03577");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", "44444444444444444444444444444444444444444444444444444444444444444444                             HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!                               ", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03579");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "", 131);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03581");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03582");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi" + "'", str1, "ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
    }

    @Test
    public void test03584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!ih!!ihaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!!ihaaa" + "'", str2, "!ih!!ihaaa");
    }

    @Test
    public void test03585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03585");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!!ih!!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih!ih!!ih!!ih!ih" });
    }

    @Test
    public void test03586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03586");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...                             ", "!!h!h!h!h!hh!h!h!h!h!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                       Hi!hi!hi!                                                                                                                                        ", "!         !         !         !         !         ", "   HI!Hi!                                                                                          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03588");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03589");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ", (java.lang.CharSequence) "                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03591");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03592");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "! h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!IH                             ", "                                !!h!h!h!h!hh!h!h!h!h!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03594");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("H                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!HH", "!                              i                              i                              i                              i                              !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03595");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hI!                                                                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03596");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!                                                                                                                              !", "      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                                                              !" + "'", str2, "hi!                                                                                                                              !");
    }

    @Test
    public void test03597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03597");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!                                                             !                                !                                !                                !", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                                                                                                          " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " + "'", str9, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test03598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03598");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                ...", "                                !!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                ..." + "'", str2, "                                                                ...");
    }

    @Test
    public void test03599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03599");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!i                                           ", '#', 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03600");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  4hi", "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih!!ihaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!!ihaaa" + "'", str1, "!ih!!ihaaa");
    }

    @Test
    public void test03602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03602");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                        !!h!h!h!h!hh!h!h!h!h!                                ", (java.lang.CharSequence) "hihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03603");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("   HI!Hi!                                                                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("     !!", "aaaaa                                                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03605");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03606");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "! h                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03607");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                !                   ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!" + "'", str1, "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
    }

    @Test
    public void test03609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03609");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#########", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!HI!HIHI!HI!HI!HI!HI", (int) (short) 1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI" + "'", str3, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI");
    }

    @Test
    public void test03611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!IH                             ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03612");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                            !!hi!hi!                                            ", "hI!Hi!                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih", (int) '4', 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03614");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03615");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "hihihihih!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("             !                                                                                                                     ", "                             4hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH", "                                                           !                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03619");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...hihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hihih" + "'", str1, "...hihih");
    }

    @Test
    public void test03620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "h!!HI!HI!                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03621");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih                             ", "Hi", (int) (byte) 10);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("H", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!", "h                             " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test03622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("########################!         ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test03623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03624");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI! 44444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03625");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ih", "", "", "                  !ih!!ih", "", "", "                  !" });
    }

    @Test
    public void test03626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ", 99, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               " + "'", str3, "                                                               ");
    }

    @Test
    public void test03627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!I444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!I4#########iH!IH!IH" + "'", str2, "!I4#########iH!IH!IH");
    }

    @Test
    public void test03628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03628");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                              ", "Hi!hi!hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("!hihihihih!", strArray3, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "                                                           ", 45, 168);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 45 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                              " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!                              i                              i                              i                              i                              !" + "'", str8, "!                              i                              i                              i                              i                              !");
    }

    @Test
    public void test03629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03629");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", (int) (byte) 100);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                               ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03630");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi", "hiihiihiihiihihiihiihiihiihii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                  !", " ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("  4hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test03632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03632");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444444444444444444444444444444444444444                             HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             HI" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444                             HI");
    }

    @Test
    public void test03633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03633");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                 !Ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       HI!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03634");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", (java.lang.CharSequence) "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 158 + "'", int2 == 158);
    }

    @Test
    public void test03635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03635");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03636");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ", (java.lang.CharSequence) "hihihih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test03637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("##################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################" + "'", str1, "##################################");
    }

    @Test
    public void test03638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03638");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03639");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("   HI!Hi!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   HI!Hi!                                                                                         " + "'", str1, "   HI!Hi!                                                                                         ");
    }

    @Test
    public void test03640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03640");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03641");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 99, "!HI!H!!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI" + "'", str3, "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI");
    }

    @Test
    public void test03642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03642");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(" ", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 542, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03645");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test03646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi                                                                 !                                                                                               !                              hi                                                                 !                              ", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                                                                               !                              hi                                                                 !                              " + "'", str2, "!                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test03647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03647");
        char[] charArray7 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi                                                                 !                                                                                               !                              hi                                                                 !                              ", charArray7);
        java.lang.Class<?> wildcardClass10 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test03648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03648");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!4!4!4!4!HH   !4!4!4!4!4", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!4!4!4!4!HH   !4!4!4!4!4" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!4!4!4!4!HH   !4!4!4!4!4" + "'", str4, "!4!4!4!4!HH   !4!4!4!4!4");
    }

    @Test
    public void test03649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03649");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("Hi", strArray4, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "!                                  ");
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray14);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14, "                             h", 95, 66);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", strArray4, strArray14);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi" + "'", str8, "Hi");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  " + "'", str21, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ");
    }

    @Test
    public void test03650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!hihihihi!                                  hihihihih", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hihihihi!                                  hihihihih" + "'", str2, "!hihihihi!                                  hihihihih");
    }

    @Test
    public void test03651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                               ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03652");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!hi!#######          #######     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03653");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03654");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4 4 4 4 HH 4 4 4 4 4", "                           ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4 4 4 4 HH 4 4 4 4 4" + "'", str2, "4 4 4 4 HH 4 4 4 4 4");
    }

    @Test
    public void test03655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ih!!ihaaa", 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!!ihaaa" + "'", str3, "!ih!!ihaaa");
    }

    @Test
    public void test03656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03656");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih!!ih                             !!ih                             !ih                    ", "HIHIHIHI!                                  HIHIHIHIH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih!!ih                             !!ih                             !ih                    " });
    }

    @Test
    public void test03657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4hi", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 250);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi" + "'", str3, "4hi");
    }

    @Test
    public void test03659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03659");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("44444444444444444444444444444444444444444444444444444444444444444444                             HI", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03661");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i" });
    }

    @Test
    public void test03662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03662");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03663");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test03664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HIHIHIHI!                                  HIHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03665");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihi" + "'", str1, "hihihi");
    }

    @Test
    public void test03666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hihihi!..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..!ihihih" + "'", str1, "..!ihihih");
    }

    @Test
    public void test03667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03668");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", '#', 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03669");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("########################", "hih       ", "      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################" + "'", str3, "########################");
    }

    @Test
    public void test03670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03670");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        java.lang.String[] strArray5 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", strArray2, strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hihihihihihihihihihihi" + "'", str8, "hihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test03671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03671");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!hihihihih!", "!         !         !         !         !                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03672");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 ", "hi!hi!hi!h", 75);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                 " });
    }

    @Test
    public void test03673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03673");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test03674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03674");
        java.lang.String[] strArray2 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                                                                  Hi");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a', 10, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test03675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03675");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!ihih!i!!h!ih!ih!ih", ' ', 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03676");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03677");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', 49, 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str7, "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test03678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!4         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4         " + "'", str2, "!4         ");
    }

    @Test
    public void test03679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!", 158, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                           HI!" + "'", str3, "                                                                                                                                                           HI!");
    }

    @Test
    public void test03680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03680");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "####################################HHH####################################", (java.lang.CharSequence) "hihihihih!                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03681");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ", "hi!hi!hi!", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih", "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str2, "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test03683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03683");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                       !!HI!HI!H                                            !!HI!HI!H               ", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", 99);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test03684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03684");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                  ", "          !ih                             ", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03685");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                              ", "Hi!hi!hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("!hihihihih!", strArray3, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                              " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!                              i                              i                              i                              i                              !" + "'", str8, "!                              i                              i                              i                              i                              !");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                              " + "'", str9, "                              ");
    }

    @Test
    public void test03686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03686");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf(" IH IH IH IH IH IHIH I  H IH IH IH", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03688");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!HI!h!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03689");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!                                                             !                                !                                !                                !", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hihihi", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihi                                                                     " + "'", str2, "hihihi                                                                     ");
    }

    @Test
    public void test03691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03691");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!I4#########iH!IH!IH", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444444444444444444444444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                           " + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444                           ");
    }

    @Test
    public void test03693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03693");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!HI!H!!IH", "                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!H!!IH" + "'", str2, "!HI!H!!IH");
    }

    @Test
    public void test03694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!                                                                                                                              !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                                                                                                              " + "'", str1, "hi!                                                                                                                              ");
    }

    @Test
    public void test03695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03695");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!                                !                                !                                !                                !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03696");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                 H                                                 ", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03697");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "                              ", "!", "                                                                ", "HI", "!", "h", "                              ", "!", "                                                                                               ", "!", "                                                                 ", "ih", "                                 ", "!", "                                                                                               ", "!", "                              ", "hi", "                                                                 ", "!", "                              " });
    }

    @Test
    public void test03698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ", "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  " + "'", str2, "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ");
    }

    @Test
    public void test03700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                 " + "'", str2, "hi!                                                 ");
    }

    @Test
    public void test03701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i" + "'", str2, "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
    }

    @Test
    public void test03702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
    }

    @Test
    public void test03703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03703");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 29, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03704");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", (java.lang.CharSequence) "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03706");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!!hi!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test03707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03707");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                           HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                           hi!" + "'", str1, "                                                                                                                                                           hi!");
    }

    @Test
    public void test03708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03708");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", (java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 916 + "'", int2 == 916);
    }

    @Test
    public void test03709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03709");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", "                                                                                        ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03710");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", (java.lang.CharSequence) "H                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03711");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test03712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03712");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03713");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444#########4444444", "                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 1, 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!ih!!ihaaa", "44444444444444444444444444444444444444444444444444444444444444444444                             hi!", "h!ih!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!!ihaaa" + "'", str3, "!ih!!ihaaa");
    }

    @Test
    public void test03715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03715");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03716");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                       !!HI!HI!H                                            !!HI!HI!H               ", "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("Hi!hi!hi!", "   HI!Hi!                                                                                         ", 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!" + "'", str3, "Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!");
    }

    @Test
    public void test03718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03718");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         ", "hihihi!                      ..", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03719");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444#########4444444", "      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444#########4444444" + "'", str2, "444444#########4444444");
    }

    @Test
    public void test03720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03720");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                 ", "aaaaaaaaaaaaaaaaaaaaaaa", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################", "HH   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################");
    }

    @Test
    public void test03722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi                                                                 !                                                                                               !                              hi                                                                 !                              ", "aaaaaaaaH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi                                                                 !                                                                                               !                              hi                                                                 !                              " + "'", str2, "hi                                                                 !                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test03723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03723");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih", 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03724");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                             H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03725");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03726");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                           ...", "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 100, 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str4, " h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test03727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03727");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HHH", "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("          ", "aaaaa                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test03729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444444444444444444444444444444444444444444                             hi!", "                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4!                                                               4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03731");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!" });
    }

    @Test
    public void test03732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03732");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                  ", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 34);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("!!!", strArray5, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("      ", strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                  " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!!!" + "'", str8, "!!!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test03733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03733");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "   HI!Hi!                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03734");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4!                                                               4", "H                                 ", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4!", "", "", "", "", "", "", "                                                        4" });
    }

    @Test
    public void test03735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03735");
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hihi!hi!hi!hi!hi!", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 23 + "'", int13 == 23);
    }

    @Test
    public void test03736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03736");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hI!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!" + "'", str1, "hi!hi!");
    }

    @Test
    public void test03737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03737");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        java.lang.String[] strArray6 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!4!4!4!4!HH   !4!4!4!4!4", strArray3, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
    }

    @Test
    public void test03738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03738");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("         !ih!!ihaaa         ", "..                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03739");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("  4hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("         !", "hiihiihiihiihihiihiihiihiihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiihiihiihiihihiihiihiihiihi" + "'", str2, "hiihiihiihiihihiihiihiihiihi");
    }

    @Test
    public void test03741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03741");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("44444444444444444444444444444444444444444444444444444444444444444444                             hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444", "                             ", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444a                             ahia!" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444a                             ahia!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test03742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH", "", 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH" + "'", str3, "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH");
    }

    @Test
    public void test03743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03743");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                       HI!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03744");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!i                                           ", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03746");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hihihihih!", "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03747");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 897 + "'", int2 == 897);
    }

    @Test
    public void test03748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03748");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAA                        AAA");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAA", "                        ", "AAA" });
    }

    @Test
    public void test03749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03749");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hihihihih!                                                                                          ", "     !!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 24, 66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!" + "'", str3, "!hi!hi!");
    }

    @Test
    public void test03751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!                                                                                                                              !                                  ", (int) (short) 1, "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                                              !                                  " + "'", str3, "hi!                                                                                                                              !                                  ");
    }

    @Test
    public void test03752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03752");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      ", 97, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03753");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", (java.lang.CharSequence) "H                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!HH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03754");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                !", "hi!", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03756");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str2, "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test03757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03758");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H", "" });
    }

    @Test
    public void test03759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("###############################################################!!!!!###############################################################", "44444444444444444444444444444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################################!!!!!###############################################################" + "'", str2, "###############################################################!!!!!###############################################################");
    }

    @Test
    public void test03760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03761");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03762");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################" + "'", str1, "########################");
    }

    @Test
    public void test03763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               ", "44444444444444444444444444444444444444444444444444444444444444444444                             HI", 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               " + "'", str3, "                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test03764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03764");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HIHIHIHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH!" + "'", str1, "HIHIHIHIH!");
    }

    @Test
    public void test03765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HHHHH", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             HHHHH                             " + "'", str2, "                             HHHHH                             ");
    }

    @Test
    public void test03766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03766");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test03767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03767");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi!", "HIH                                                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hihihi", "!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HHHHH", "                                                                                                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HHHHH" });
    }

    @Test
    public void test03770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03770");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("h!!HI!HI!                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                 HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 HIHIHIHI!                                  HIHIHIHIH                  " + "'", str1, "                 HIHIHIHI!                                  HIHIHIHIH                  ");
    }

    @Test
    public void test03772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                              !                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              !                                                                 " + "'", str1, "                              !                                                                 ");
    }

    @Test
    public void test03773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03773");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", "!         !         !         !         !         ", (int) (short) -1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH" });
    }

    @Test
    public void test03774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03774");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03775");
        java.lang.String[] strArray3 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "                                  ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "!                                  ");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("hi!!hi!", strArray7, strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                  " + "'", str9, "                                  ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!!hi!" + "'", str17, "hi!!hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + " " + "'", str20, " ");
    }

    @Test
    public void test03776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03776");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...HIHIH", "                44444444444444444444444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                        ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test03778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03778");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", 30, 73);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH" + "'", str3, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
    }

    @Test
    public void test03779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03779");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", 22, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I" + "'", str3, "IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
    }

    @Test
    public void test03780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03780");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                 HIHIHIHI!                                  HIHIHIHIH                  ", 93, "                               !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       HIHIHIHI!                                  HIHIHIHIH                  " + "'", str3, "                       HIHIHIHI!                                  HIHIHIHIH                  ");
    }

    @Test
    public void test03781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03781");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                              !                                                                 ih                              !                                                                                               !                                                                 ih", 20, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              !                                                                 ih                              !                                                                                               !                                                                 ih" + "'", str3, "                              !                                                                 ih                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test03782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03782");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                             ", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   " + "'", str2, "                                                                   ");
    }

    @Test
    public void test03784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03784");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "                             4hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03785");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                ", (java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!", "!                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test03787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03787");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "HIHIHIHIH                                  !IHIHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str2, "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
    }

    @Test
    public void test03788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                  ", "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                 !Ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03790");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("...                             ", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03791");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", 542, "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!" + "'", str3, "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
    }

    @Test
    public void test03792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ", "                                !                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     " + "'", str2, "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ");
    }

    @Test
    public void test03793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03793");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hihihi!                                  hihihihih", (-1));
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03794");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       HI!h", "HH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03795");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("##################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################" + "'", str1, "##################################");
    }

    @Test
    public void test03796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03796");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                44444444444444444444444444444444444444444444444444444444444444444444                ", (java.lang.CharSequence) "                             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                44444444444444444444444444444444444444444444444444444444444444444444                " + "'", charSequence2, "                44444444444444444444444444444444444444444444444444444444444444444444                ");
    }

    @Test
    public void test03797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03797");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                              ", "h!ih!ih!ih", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03799");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!IH                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!                                  ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test03800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03800");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03801");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "!                                  ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "                             h", 95, 66);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ", strArray6);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test03802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03802");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03803");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03804");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!                              i                              i                              i                              i                              !", (java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test03806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { " " });
    }

    @Test
    public void test03807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03807");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", ' ', 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!HI!h!!ih", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!h!!ih" + "'", str2, "!HI!h!!ih");
    }

    @Test
    public void test03809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03809");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                        ", "!                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", 35, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !" + "'", str3, "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
    }

    @Test
    public void test03811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03811");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 49, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             " + "'", str3, "                                             ");
    }

    @Test
    public void test03812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03812");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "Hi", (java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test03815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03815");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "          ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI!Hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!Hi!" + "'", str2, "hI!Hi!");
    }

    @Test
    public void test03817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03817");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03818");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HIHIHIHIH                                  !IHIHIHIH", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHIH                                  !IHIHIHIH" + "'", str2, "HIHIHIHIH                                  !IHIHIHIH");
    }

    @Test
    public void test03819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03819");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH", "################################################H################################################");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!i" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03820");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                44444444444444444444444444444444444444444444444444444444444444444444          ...", "ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", 88);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                44444444444444444444444444444444444444444444444444444444444444444444          ..." });
    }

    @Test
    public void test03821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03821");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                           !                                        ", "hihihihihihihihihih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03822");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "                                                                                                                                       Hi!hi!hi!                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03823");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih                             ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", "                             " });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03824");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!!HI!HI!", "                                                                                                                                          ", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03826");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!!ih                             !!ih                             !ih                    ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03827");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH                            ", ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH" + "'", str1, "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
    }

    @Test
    public void test03829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03829");
        char[] charArray2 = new char[] {};
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444HIhi!hi!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test03830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03830");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03831");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                       HI!h", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                            ", "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03833");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!                                                                                                   ", "HH", 898);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03834");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!                                                                                                ", "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HHH", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HHH   " + "'", str2, "   HHH   ");
    }

    @Test
    public void test03836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!4!4!4!4!HH   !4!4!4!4!4", "4444444444444444444444444HIhi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4!4!4!4!HH   !4!4!4!4!4" + "'", str2, "!4!4!4!4!HH   !4!4!4!4!4");
    }

    @Test
    public void test03837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str1, "!ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test03838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03838");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                44444444444444444444444444444444444444444444444444444444444444444444                ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03839");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444HIhi!hi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test03840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03840");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "HH   ", "             !                                                                                                                     ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test03841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                              !                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              !                                                                 " + "'", str1, "                              !                                                                 ");
    }

    @Test
    public void test03842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03842");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("####################################HHH####################################", 88, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa####################################HHH####################################aaaaaaa" + "'", str3, "aaaaaa####################################HHH####################################aaaaaaa");
    }

    @Test
    public void test03843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03843");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...                                                                                  ...", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                       HIHIHIHI!                                  HIHIHIHIH                  ", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03845");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!                                                                                                 ", (java.lang.CharSequence) "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test03846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hH" + "'", str2, "hH");
    }

    @Test
    public void test03848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                              !                                  ", "!!                               ", " h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              !                                  " + "'", str3, "                                                              !                                  ");
    }

    @Test
    public void test03849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03849");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03850");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444444#########4444444", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "!4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444#########4444444" + "'", str3, "444444#########4444444");
    }

    @Test
    public void test03851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03852");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hihihi                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hihihi" });
    }

    @Test
    public void test03853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03853");
        java.lang.String[] strArray1 = null;
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                       HI!h", strArray1, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!", "hi", "!", "hi", "!", "hi", "!", "hi", "!", "hihi", "!", "hi", "!", "hi", "!", "hi", "!", "hi", "!!", "h" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!", "hi", "!", "hi", "!", "hi", "!", "hi", "!", "hihi", "!", "hi", "!", "hi", "!", "hi", "!", "hi", "!!", "h" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                       HI!h" + "'", str5, "                       HI!h");
    }

    @Test
    public void test03854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ", 897, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03855");
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                  ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hiihiihiihiihihiihiihiihiihi", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test03856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03856");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!4         ", "HHH", "###############################################################!!!!!###############################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!4         " + "'", str3, "!4         ");
    }

    @Test
    public void test03857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03857");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("  4hi", "!hihihihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ih!ih!ihih!i!!h!ih!ih!ih", "hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03859");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H                                 ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test03860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03860");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03861");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                  ", "...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                  " });
    }

    @Test
    public void test03862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!!!!!!!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!..." + "'", str1, "!!!!!!!...");
    }

    @Test
    public void test03863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03863");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                !                                !                                !                                !", "H                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03864");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hihihihihihihihihih", "hi!                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hihihihihihihihihih" });
    }

    @Test
    public void test03865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03865");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" });
    }

    @Test
    public void test03866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                               hihihih!ih                        hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "!         !         !         !         !                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!         !         !         !         !                                                       " + "'", str2, "!         !         !         !         !                                                       ");
    }

    @Test
    public void test03867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!IH                            ", 898);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH                            " + "'", str2, "!IH                            ");
    }

    @Test
    public void test03868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03868");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                                                                                           HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "      ", "                                                                ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test03870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03870");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hI!Hi!                                                                                       ", (java.lang.CharSequence) "                       !!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI! 44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!44444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "HI!44444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test03872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03872");
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!h", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test03873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03873");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "                       ", "!ih!ih!ih!ih!ihih!ih!ih!ih!ih", 22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str4, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test03874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03875");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                        ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03876");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03877");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03878");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("#################################################", "HIH                                                                                             ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       " + "'", str2, "                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ");
    }

    @Test
    public void test03880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03880");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                             hi");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("HH", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!ih!ih!ih!ih!ihih!ih!ih!ih!ih", 3, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test03881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03881");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", "!ih!ih!!ih!!ih!ih", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test03882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03882");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HIHI!HI!HI!HI!HI", 'a', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!", 168, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                     HI!" + "'", str3, "                                                                                                                                                                     HI!");
    }

    @Test
    public void test03884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03884");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI!HI!HI!HI!HIHI!HI!HI!HI!HI", "44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03885");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I", "" });
    }

    @Test
    public void test03886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03886");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("Hi!", "!                              i                              i                              i                              i                              !", 30);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!" + "'", str3, "Hi!");
    }

    @Test
    public void test03887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03887");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("aaaaaa####################################HHH####################################aaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAA####################################hhh####################################AAAAAAA" + "'", str1, "AAAAAA####################################hhh####################################AAAAAAA");
    }

    @Test
    public void test03888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03889");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", (int) (short) 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03890");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!IH                            ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03891");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "                                                                                                                                       Hi!hi!hi!                                                                                                        ", 542);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03892");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hihihi!                                  hihihihih");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!hi!hi!h                                                                                                    ", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hihihi", "!", "                                  ", "hihihihih" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test03893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ", "...                                                                                  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  " + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
    }

    @Test
    public void test03894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03894");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03895");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!ih!ih!!ih                             !!ih                             !ih                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!!IH                             !!IH                             !IH                    " + "'", str1, "!IH!IH!!IH                             !!IH                             !IH                    ");
    }

    @Test
    public void test03896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03896");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                !", "                                                                                                !", (int) ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                             h", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", 969);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                  ", strArray4, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 75, 136);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 75 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                             h" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                  " + "'", str10, "                                                                  ");
    }

    @Test
    public void test03897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03897");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!!HI!HI!Hhiihiihiihiihihiihiihiihiihii", "!!HI!HI!Hhiihiihiihiihihiihiihiihiihii", "!!HI!HI!Hhiihiihiihiihihiihiihiihiihii", "!!HI!HI!Hhiihiihiihiihihiihiihiihiihii", "!!HI!HI!Hhiihiihiihiihihiihiihiihiihii", "!!HI!HI!Hhiihiihiihiihihiihiihiihiihii", "!!HI!HI!Hhiihiihiihiihihiihiihiihiihii", "!!HI!HI!Hhiihiihiihiihihiihiihiihiihii", "!!HI!HI!H" });
    }

    @Test
    public void test03898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03898");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "444444#########4444444", (java.lang.CharSequence) "!4");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "444444#########4444444" + "'", charSequence2, "444444#########4444444");
    }

    @Test
    public void test03899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH", "                              !                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH" + "'", str2, "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH");
    }

    @Test
    public void test03900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03900");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ", "hi!hi!#######          #######     ", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03901");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03902");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       ..", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       .." + "'", str2, "       ..");
    }

    @Test
    public void test03903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03903");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                                HI!h                              !                                                                                               !                                                                 ih" + "'", str1, "!                                                                HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test03904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03904");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ", "HH", 0);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h", strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                       !!HI!HI!H                                            !!HI!HI!H               ", strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     " });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test03905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !" + "'", str3, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !");
    }

    @Test
    public void test03906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03906");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "      HI!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03907");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h", 67, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444h" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444h");
    }

    @Test
    public void test03909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03909");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaa", 87);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
    }

    @Test
    public void test03911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03911");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hihihihih!                                                                                          ", "hi!hi!#######          #######     ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03912");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444                           ", (int) (short) -1, "HI!44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                           " + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444                           ");
    }

    @Test
    public void test03913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03913");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!4         ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!!!                               ", 67, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!                               " + "'", str3, "!!!                               ");
    }

    @Test
    public void test03915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03915");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                       HI!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       hi!H" + "'", str1, "                       hi!H");
    }

    @Test
    public void test03916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03916");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "#################################################", (java.lang.CharSequence) "!                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test03917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!         !         !         !         !" + "'", str1, "!         !         !         !         !");
    }

    @Test
    public void test03918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                             4hi", "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03919");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ", "                                                 H                                                 ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03920");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                   ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   " + "'", str2, "                                                                                                   ");
    }

    @Test
    public void test03921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03921");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih", (int) (short) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih" + "'", str3, "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
    }

    @Test
    public void test03924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03924");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03926");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                  !", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########", "hiihiihiihiihihiihiihiihiihi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test03927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!                                                                                                ", 168, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!ih!ih!ih!ih!ihih!ih!ih!ih!ih", "      HI!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str2, "!ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test03929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!hihihihih", "aaahih                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hihihihih" + "'", str2, "!hihihihih");
    }

    @Test
    public void test03930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                           4", "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test03931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03931");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!hi!hi!hi!hihi!hi!hi!hi!hi", "!IH                            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!hi!hihi!hi!hi!hi!hi" });
    }

    @Test
    public void test03932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03932");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                     HI!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", 289);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test03933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03933");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!                                                                                                   ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03934");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!IH!IH!!IH                             !!IH                             !IH                    ", "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                       Hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                       HI!HI!HI!                                                                                                                                        " + "'", str1, "                                                                                                                                       HI!HI!HI!                                                                                                                                        ");
    }

    @Test
    public void test03936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03936");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                           4", "aaaaaa####################################HHH####################################aaaaaaa", "hi                                                                 !                                                                                               !                              hi                                                                 !                              ", 897);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                           4" + "'", str4, "                                                           4");
    }

    @Test
    public void test03937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hihihihih                                  !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03938");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03939");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test03940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "!                                !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03941");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!ih                        ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03942");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test03943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03943");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test03945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03945");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444HIhi!hi!", "a", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444HIhi!hi!" + "'", str3, "4444444444444444444444444HIhi!hi!");
    }

    @Test
    public void test03946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03946");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
    }

    @Test
    public void test03947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03947");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                           HI!", 99, "hihihi                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                           HI!" + "'", str3, "                                                                                                                                                           HI!");
    }

    @Test
    public void test03948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03948");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03949");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !" + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !");
    }

    @Test
    public void test03951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03951");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03952");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi!", "                44444444444444444444444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03953");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "H                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test03954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03954");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!hi!#######          #######     ", "HIhi!hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" + "'", str2, "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test03957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03957");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hihihi!                                  hihihihih", "                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test03958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaa####################################HHH####################################aaaaaaa", (int) '4', "hih       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaa####################################HHH####################################aaaaaaa" + "'", str3, "aaaaaa####################################HHH####################################aaaaaaa");
    }

    @Test
    public void test03959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "HI!Hi!                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   " + "'", str2, "                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
    }

    @Test
    public void test03960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !" + "'", str2, "                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
    }

    @Test
    public void test03961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03961");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03962");
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                  !", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                       !!HI!HI!H                                            !!HI!HI!H               ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "     !!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 23 + "'", int12 == 23);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test03963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03963");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03964");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                           HI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                           ", "HI", "!" });
    }

    @Test
    public void test03965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03966");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##################################", "hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##################################" });
    }

    @Test
    public void test03967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03967");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!ih                             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                                 " + "'", str1, "hi!                                                 ");
    }

    @Test
    public void test03969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03969");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!ih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!#ih" + "'", str3, "!#ih");
    }

    @Test
    public void test03970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03970");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#######          #######");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      ", strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#######", "#######" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test03971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("#######          #######", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######          #######" + "'", str2, "#######          #######");
    }

    @Test
    public void test03972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("   !ih!ih!ihih!i!!h!ih!ih!ih", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   !ih!ih!ihih!i!!h!ih!ih!ih" + "'", str2, "   !ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test03973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03973");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ", "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH", 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       " + "'", str4, "                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ");
    }

    @Test
    public void test03974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03974");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hihihi!                      ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihi!                      ..." + "'", str1, "hihihi!                      ...");
    }

    @Test
    public void test03975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("##", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test03976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str1, "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
    }

    @Test
    public void test03977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03977");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!                                                             !                                !                                !                                !", "!IH                             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test03978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03978");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444444444444444444444444444444444444444444444444444444444444444                             HI!", "                                !                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             HI!" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
    }

    @Test
    public void test03979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03979");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", strArray7, strArray14);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("##", strArray17);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str15, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test03980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03980");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!ih!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test03981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03981");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                            !!hi!hi!                                            ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "!                                                                                               ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!ih!!ih", "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!!ih" + "'", str2, "!ih!!ih");
    }

    @Test
    public void test03985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03985");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test03986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03986");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!!hi!hi!", "                                                 Hi                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03987");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03988");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!                                                                                                                              !                                  ", "", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 164 + "'", int3 == 164);
    }

    @Test
    public void test03989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03989");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!hihi!hi!hi!hi!hi!", "                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test03990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test03991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!                                                             !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                             !                                !                                !                                !" + "'", str1, "!                                                             !                                !                                !                                !");
    }

    @Test
    public void test03992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03992");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hH", "!         !         !         !         !         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03994");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaa                        ...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "                        ..." });
    }

    @Test
    public void test03995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hihihihih!ihihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihih!ihihihih" + "'", str1, "hihihihih!ihihihih");
    }

    @Test
    public void test03996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                 ", "!                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03997");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!         !         !         !         !                                                       ", "          ", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 41 + "'", int3 == 41);
    }

    @Test
    public void test03998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!                                                                                                 ", "hihihi!..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test03999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test03999");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi! " + "'", str1, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi! ");
    }

    @Test
    public void test04000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test04000");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!!", "..!ihihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }
}

