package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

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
    public void test06001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06001");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!   ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444" });
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("I!                 ", (int) (byte) 0, "HhI!HI                           hI!HI                           h################################HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!                 " + "'", str3, "I!                 ");
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!HI                           hI!HI            hiHI!HI                           hI!H...", "hI!                               ", 71);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!H..." });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                 !ih", "hi!4444     ##############444hi!4444     ############################444hi!4444     ################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hiHi!hiHIhi!hiHi!hi", "                                            HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                              ", "44!IH!IH4444!IH!IH4444!IH!IH44                ", 97);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                              " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                              ", "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", 162, 55);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                       hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str4, "                                                       hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("ih!ih#############################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444", "#############################################hi!hi!#############################################", 349);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444" });
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44444444444   hiHI!HI                           hI!HI", "I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi#hi", "!IH!IH4444444444444444444444444444444444444444444444", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("h################################ hI!HI HI!HI", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("###########HI", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi#hi" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!hiHi!hiH########################" + "'", str9, "Hi!hiHi!hiH########################");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "###########HI" + "'", str10, "###########HI");
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!", "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                 !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                                                                                 " + "'", str1, "hi!                                                                                                 ");
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                    ", (int) (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hiHi!hiHIhi!hiHi!h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  ", "                           ", "           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!", "HI                           hI!HI            hiHI!HI                           hI!HI", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!HI                           hI!HI            hiHI!HI                           hI!HI", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "AAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IAHI                           hIAHI            hAHIAHI                           hIAHI" + "'", str3, "IAHI                           hIAHI            hAHIAHI                           hIAHI");
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                   I!                        ", "hI!HI4444444444444444444444444444444!444hi!4444hI!HI4444444444444444444444444444444!444hi!4444hI!HI44444444444444444444444444444I!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###########################################", 11, 57);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################" + "'", str3, "###########################################");
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("  hiHI!HI                           hI!HI           ", "     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "444444444444444444444444hi!4444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444###############################################444444444444444444444444444", "                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444###############################################444444444444444444444444444" });
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "                  ###############################################HI#!#HI#                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                        ", "hi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("I!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HIhI!HIh################################" + "'", str1, "I!HIhI!HIh################################");
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!hi                           Hi!hi                           H################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                      444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HIHi!hiHi!hi#Hi!hiHi!hiH", "IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiH" + "'", str2, "HIHi!hiHi!hi#Hi!hiHi!hiH");
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                       4#############################################4hi4!4hi4                        ", (java.lang.CharSequence) "   hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih" + "'", str1, "ih!ih");
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI                           hI!HI            ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "                           ", "h", "I", "!", "HI", "            ", "..." });
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#################################################################################################" });
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! " + "'", str1, "hi! ");
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("         ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#############################################HI!HI!##############################################", "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444################################4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444################################4444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#", "hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("     4444444444444444444444444444444444444444444444      ", "!HIhI!HIh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444      " + "'", str2, "     4444444444444444444444444444444444444444444444      ");
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "I!                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                 !IH", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 !IH" + "'", str2, "                                                                                                 !IH");
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "###############");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        char[] charArray15 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hI!HI               ", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray15);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray15);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray15);
        java.lang.Class<?> wildcardClass25 = charArray15.getClass();
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 26 + "'", int22 == 26);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!" + "'", str1, "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!");
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI#################################hi!hi         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI#################################hi!hi" + "'", str1, "HI!HI#################################hi!hi");
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", 'a');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str4, "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hI#HI", "hi!hi                           hi!hi       ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ih!ihih!ih", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ihih!ih" + "'", str2, "ih!ihih!ih");
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                           HI!HI                           H################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           H################################" + "'", str1, "HI!HI                           H################################");
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI                           HI!HI            HIHI!HI                           HI!HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                           hI!HI            hiHI!HI                           hI!HI            #", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hI!HI            hiHI!HI                           hI!HI            #" + "'", str2, "                           hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HHHHHI!HHHH", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi", "####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444hI!HI", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  4444444444444444444444444444444444444444444444hI!HI  " + "'", str2, "  4444444444444444444444444444444444444444444444hI!HI  ");
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HII!HI                                       hiHI!HI", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###############################################", "...###################################hi#!#hi#");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###############################################" });
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI!HI4444444444444444444444444444444!444hi!4444hI!HI4444444444444444444444444444444!444hi!4444hI!HI44444444444444444444444444444I!HIhI!HIh################################", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444################################4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI!HI4444444444444444444444444444444!444hi!4444hI!HI4444444444444444444444444444444!444hi!4444hI!HI44444444444444444444444444444I!HIhI!HIh################################" });
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hI!HI                           ", (java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("    h     ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!HI#################################hi!hi444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", "            hiHI!HI                                       hiHI!HI               4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444..." + "'", str2, "            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI" + "'", str2, "HI!HI!IIIIHI!HI!IIIIHI!HI!IIHIHI                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II!                IIHI!HI!IIIIHI!HI!IIIIHI!HI!IIHI");
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!                                                                                                 ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!                              ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                              " + "'", str2, "hi!                              ");
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "    H     hi!hi                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi                           hi!hi            hihi!hi                           hi!hi           ", "hi!HI!HI!HI!HI!                              ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi", "                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi" + "'", str2, "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!HIHI!HIH################################", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HIHI!HIH##############..." + "'", str2, "!HIHI!HIH##############...");
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "####################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("h################################ hi#hi hi#hi", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi        " + "'", str1, "Hi        ");
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("   !4444444444444444444444444444444", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                 a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                                         a#############################################ahia!ahia                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                  " + "'", str1, "                                 A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                  ");
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!hihi!hi", 261);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                             !hihi!hi" + "'", str2, "                                                                                                                                                                                                                                                             !hihi!hi");
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#############################################hi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa", 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################hi!hi" + "'", str3, "#############################################hi!hi");
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                  hI!HI                           hI!HI                           h################################                                                                                  " + "'", str2, "                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ");
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        char[] charArray7 = new char[] { 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!HI            ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "         H         H         H         H        hi!         H         H         H         H         ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hhi!                               ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###############################################hi#!#hi#", "444hi!4444", 10);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                        hI!HI   ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "###############################################hi#!#hi#" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##### ######hi!hi", "                            IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##### ######hi!hi" + "'", str2, "##### ######hi!hi");
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("444!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!" + "'", str1, "444!");
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!h", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!h" });
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "############aaaaa###################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "############aaaaa###################################" + "'", str1, "############aaaaa###################################");
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI#HI");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("HI#HI", strArray3, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!hiHi!hi");
        java.lang.String[] strArray13 = null;
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("HI ! HI ! HI ! HI", ' ');
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI", strArray13, strArray16);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAny("################################", strArray22);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray13, strArray22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("###############################################hi#!#hi", strArray3, strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "#", "HI" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI#HI" + "'", str8, "HI#HI");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHI" + "'", str10, "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str17, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hI!HI", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI" + "'", str3, "hI!HI");
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" H     hi!hi                 ", "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " H     hi!hi                 " });
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("      4444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      4444444444444444444444444444444444444444444444" + "'", str2, "      4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("IH!IH##################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IH!IH##################################" });
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                       #############################################", "!  !   hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444!", "hi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("####################################################################################################################################################################################################################################################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!HI                           hI!HI            ...", "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            ..." + "'", str2, "HI!HI                           hI!HI            ...");
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!HI            ", (java.lang.CharSequence) "44444444444444444444444444###############################################444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                              HI#HI                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
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
        java.lang.String[] strArray49 = org.apache.commons.lang3.StringUtils.split("", "");
        boolean boolean50 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray49);
        int int51 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray49);
        boolean boolean52 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!hiHi!hiH################################", strArray49);
        java.lang.String[] strArray54 = org.apache.commons.lang3.StringUtils.stripAll(strArray49, "                                              hI!HIhI!HIh################################");
        int int55 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray49);
        java.lang.String str56 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h", strArray5, strArray49);
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
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertArrayEquals(strArray54, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h" + "'", str56, "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h");
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("     4444444444444444444444444444444444444444444444      ", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444      " + "'", str2, "     4444444444444444444444444444444444444444444444      ");
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("           HI!HIhI!HIhiHI!HIhI!HIHI!H", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                 I!                                                                                                 ", "4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 I!                                                                                                 " + "'", str2, "                                                                                                 I!                                                                                                 ");
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("     4444444444444444444444444444444444444444444444 hI!HI                           ", "           Hi!hi   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444", "I", "I" });
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  " + "'", str1, "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4            4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...######################", 0, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    H     hi!hi                 ", "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    H     hi!hi                 " });
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HhI!HI            ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hh", "I", "!", "HI", "            " });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hh", "I", "!", "HI", "" });
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("I!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hiHi!hiH################################" + "'", str1, "i!hiHi!hiH################################");
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("##############444hi!4444###############", "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############444hi!4444###############" + "'", str2, "##############444hi!4444###############");
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444!   444hi!4444   ", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444!   444hi!4444   " + "'", str2, "4444444444444444444444444444444!   444hi!4444   ");
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("IH!IH#############################################", "                                                       #############################################", "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi                           hi!hi                           h################################", "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i", "i                           ", "i", "i                           " });
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaa", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444", "aaaaaaa                         aaaaaaa     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                           4            4                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!                                                                                                 ", "h################################ hI!HI HI!HI", 2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "I!                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HhI!HI             ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HhI!HI", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI                           hI!HI                           h###############################", "                       A#############################################AHIA!AHIA                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah" + "'", str1, "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI" + "'", str1, "HI!HIhI!HI!IH!IH4444444444444444444444444444444444444444444444hiHI!HIhI!HI");
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hI!HI                           hI!HI                           h################################", 47);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!HIHI!HI");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str7, "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("ih!ih", "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!hihi!hi", 873);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hihi!hi" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hihi!hi");
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################" + "'", str2, "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################");
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H", "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H" + "'", str2, "H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H");
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "hI!HI                           ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH!IH#############################################", strArray7, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI                           hI!HI                           h################################", strArray2, strArray7);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IH!IH#############################################" + "'", str13, "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str14, "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!hiHi!hiH########################" + "'", str16, "Hi!hiHi!hiH########################");
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hI!HI4444444444444444444444444444444!   444hi!4444   ", "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("I!", "  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!" + "'", str2, "I!");
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHI", "                       a#HI!hi!hi!aa       a###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###############################################hi#4#hi#############################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#4#hi#############################################" + "'", str2, "###############################################hi#4#hi#############################################");
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("###################", "#############################################HI!HI!##############################################", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################" + "'", str3, "###################");
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...#I!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "AAAAAAAAAAAAAAAAA", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##############################################################################################hi!hi!", "I!HI                           hI!HI            hiHI!HI                           hI!HI", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##############################################################################################" });
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                  ", "hI!HI                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                    hI   Hi!hiHi!hiH                                                                                                                                                                         ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!hi!hi                           Hi!hi            HIhi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi                           Hi!hi            HIhi!hi" + "'", str1, "!hi!hi                           Hi!hi            HIhi!hi");
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444", 92, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444#########################################################" + "'", str3, "44444444444444444444444444444444444#########################################################");
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!4444     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH" + "'", str1, "44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH");
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("####################################################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("#############################################################################################################################################################################################################################################", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("aaHI#HIaaa", "################################HhI!HI            ##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("#############################################HI!HI!##############################################", "44444444444444444444444444444444444#########################################################", 89, 349);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############################################HI!HI!######################################44444444444444444444444444444444444#########################################################" + "'", str4, "#############################################HI!HI!######################################44444444444444444444444444444444444#########################################################");
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44hi!hi!44", "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!44" + "'", str2, "44hi!hi!44");
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "###################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("I!                                                                                                 ", "                       4#############################################4hi4!4hi4                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        char[] charArray10 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "       ################################        ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!HIhI!HIh", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                       #############################################hi!hi                        ", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str4, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi", "      Hhi!                                     ", "                           HI!HI                           H################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi" + "'", str3, "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 61, 89);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!HI!HI!HI!HI!                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI " + "'", str1, "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI ");
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444444444444444444###############################################444444444444444444444444444", "                           HI!HI                           H################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI                           hI!HI            hiHI!HI                           hI!HI            ", 56, 237);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        hI!HI            " + "'", str3, "                        hI!HI            ");
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("###############################################hi#!#hi", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444" + "'", str1, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("##########", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...                                !ih!ih!ih!ih!ih!ih!ih", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                !ih!ih!ih!ih!ih!ih!ih" + "'", str2, "...                                !ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##############################################", "!i!i                                                                                                                                                                                                                                        ", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##############################################" });
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#############################################HI!HI!##############################################hI!HI                           h################################", "!", "##");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################HI#HI###############################################hI#HI                           h################################" + "'", str3, "#############################################HI#HI###############################################hI#HI                           h################################");
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("##", 159, "                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                             ##" + "'", str3, "                                                                                                                                                             ##");
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "h    h    h    h    h    h                                             h    h    h    h    h    h  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!####" + "'", str2, "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!####");
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444444444444444444444444444444444444444", (int) (short) 0, "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("################################HhI!HI            ##", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                                                                                                                                                                                          HI!HI!HI!AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                             I!                                             ", 71, "aaaaaaa                         aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             I!                                             " + "'", str3, "                                             I!                                             ");
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...##########################################################################################...", "44hi!hi!4444hi!hi!4444hi!hi!44", "                                                    ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...##########################################################################################..." + "'", str3, "...##########################################################################################...");
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", "!HI                           hI!HI                           h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str2, "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("###########################################", "!hihi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!!i!i!i!", "                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                        I!444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...                   4444444444444444444444444444444444444444444444HI!HI!...                    ", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "###########HI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...                   ", "HI!HI!...                    " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...                   ", "...                    " });
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("               hiHI!HI               4444444444444444444", "IH!IH                           IH!IHIH            IH!IH                           IH!IH", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "...                           hi!hi            hihi!hi                           hi!hi           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44hi!hi!4444hi!hi!4444hi!hi!44", 40, "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     " + "'", str3, "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ");
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44HI444", 0, 7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44HI444" + "'", str3, "44HI444");
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("#############################", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             #############################             " + "'", str2, "             #############################             ");
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!hiHi!hiHi!hiHi!h..." + "'", str2, "hi!Hi!hiHi!hiHi!hiHi!h...");
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                         ", (java.lang.CharSequence) "4444IH!IH##################################4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##### ######hi!hi", "         H                      ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#####", "######hi!hi" });
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("    H  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                    HI#HI                   ", "444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                                                                                                                                                                                                                                                                                                                                                                                                                                      444444", "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray15 = new char[] { '#', ' ', 'a', '#', 'a', '4' };
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!                                ", charArray15);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray15);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                              ", charArray15);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray15);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                          hI!HI               ", charArray15);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray15);
        boolean boolean22 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ", charArray15);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray15);
        int int24 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###########HI!", charArray15);
        org.junit.Assert.assertNotNull(charArray15);
        org.junit.Assert.assertArrayEquals(charArray15, new char[] { '#', ' ', 'a', '#', 'a', '4' });
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("###########################################", 34, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################" + "'", str3, "###########################################");
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("###################################HI!HI################", "!HIHI!HIH################################    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                 A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                                         A#############################################AHIA!AHIA                                  ", "HI!HI                           H################################", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "44444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!  !   hi!hihi!hih################################hi", "            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", "HI!HIHI!HIH################################", 7);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!  !   hi!hihi!hih################################hi" + "'", str4, "!  !   hi!hihi!hih################################hi");
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("#############################################hi!hi!#############################################");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("Hi!aa", "                           HI!HI                           H###############################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           HI!HI                           H###############################" + "'", str2, "                           HI!HI                           H###############################");
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                 !ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                 ", "!", "ih" });
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!HI#################################hi!hi         ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 0, 63);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "#################################", "hi", "!", "hi", "         " });
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                           ", 5, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "             #############################             ", "###########HI!H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "!44...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################" + "'", str2, "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH" + "'", str1, "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH");
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444", (java.lang.CharSequence) "#############################################HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 296 + "'", int2 == 296);
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "444", "!" });
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!HI", "HHHHHI!HHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ih!ih###################################", "            hiHI!HI                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih###################################" + "'", str2, "ih!ih###################################");
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...##########################################################################################...", (int) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...##########################################################################################..." + "'", str3, "...##########################################################################################...");
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hI!                               ", "IH IH###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!                               " + "'", str2, "hI!                               ");
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("     4444444444444444444444444444444444444444444444 hI!HI                           ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444 hI!HI                           " + "'", str2, "     4444444444444444444444444444444444444444444444 hI!HI                           ");
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#############################################################################################################################################################################################################################################", "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#####    H     ", "44444444444444444444444444###############...", 78);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ihhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihh" + "'", str1, "!ihh");
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaa", "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4            4                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4            4                           " + "'", str1, "4            4                           ");
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", 16, 260);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I#I#HIHI#H44444444444444444" + "'", str3, "I#I#HIHI#H44444444444444444");
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...                                !ih!ih!ih!ih!ih!ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 36);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444444444!   ", "##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444!   " + "'", str2, "4444444444444444444444444444444!   ");
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hiHi!hiH################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "HI!                                                                                                 ", 100, 277);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!hiHi!hiH################################" });
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("##############444hi!4444###############                                                                                                                                                                                                                                                                                                                       ", "!HIhI!HIh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HIhI!HIh" + "'", str2, "!HIhI!HIh");
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaa!ih!ih", 32, 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                        ..." + "'", str2, "Ih!iH                           ih!ihIH            ih!iH                        ...");
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!                                                                                                 ", "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("I!HI                            ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "                                                                                                 " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "               hiHI!HI               4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI#H", "HI!HI                           HI!HI            ..", 45, 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI#HI!HI                           HI!HI            .." + "'", str4, "hI#HI!HI                           HI!HI            ..");
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444!   ", "hI!HI                           hI!H...", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("#############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################" + "'", str1, "#############################");
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###############################################hi#!#hi#", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                                                                                    ", "################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hI#HI");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI#################################hi!hi444444444", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "hi!                                ", 19, 8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("################################hi!                               ############", "4444!IH444", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi" });
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#############################################HI!HI", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################HI!HI" + "'", str3, "#############################################HI!HI");
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444!", "4444444444444444444444444444444444444444444444 hI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaa                         aaaaaaa", "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ", "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI                           hI!HI            hiHI!HI                           hI!HI", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str2, "HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!HIHI!HI", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                 !IH", strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!HIHI!HI" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!HIHI!HI" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####" + "'", str1, "####");
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i!444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!444" + "'", str1, "i!444");
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "###########HI", "", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi" + "'", str4, "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("##############################################################################################hi!hi!", 874);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############################################################################################hi!hi!" + "'", str2, "##############################################################################################hi!hi!");
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!                                                                                                 ", "44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                       A#############################################AHIA!AHIA                        ", "################################4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       A#############################################AHIA!AHIA                        " + "'", str2, "                       A#############################################AHIA!AHIA                        ");
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi####" + "'", str1, "4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi####");
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence4, charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!4444    ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" });
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("h################################ hI!HI HI!HI", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI   Hi!hiHi!hiH################################    ", "HI!HI                           HI!HI                           H################################                                        ", 277);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HHI!                               ", 11, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        " + "'", str3, "                        ");
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!aa", "44444444444444444444444444###############...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         h####################################", "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         " + "'", str3, "         ");
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!aa", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!aa" + "'", str2, "Hi!aa");
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hihi!hi", "  hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hihi!hi" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hihi!hi");
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                        ", "HI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", "hi!##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!hiHi!hiHIhi!hiHi!hi", 85, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray14);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.split("!ih!ih", "HI!HI!", 32);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI                           HI!HI            ...", strArray6, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "ih", "ih" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "ih", "ih" });
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                    hI   Hi!hiHi!hiH                                                                                                                                                                         ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI                           HI!HI            ..", (java.lang.CharSequence) "ih!ih#############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###############################################   hi#hihi#hih################################h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################   hi#hihi#hih################################h" + "'", str1, "###############################################   hi#hihi#hih################################h");
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#################################hi!                               #################################", "ih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihih!ihih!ihih!ihihih!ihi", "!i!i                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################i!!                               #################################" + "'", str3, "#################################i!!                               #################################");
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H", "Ia", "H", "Ia", "Ia", "H", "Iaa", "H", "Ia", "H", "Ia", "Ia", "HIH", "Ia", "H", "44444444444", "..." });
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!i!i!i!", "###############################################", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 387 + "'", int2 == 387);
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!HI                           HI!HI                           H################################                                        ", "ih#ih ih#ih ###############################hi!hihi!hih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           HI!HI                           H" + "'", str2, "HI!HI                           HI!HI                           H");
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                              HI#HI                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI" + "'", str1, "HI#HI");
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("             hI!HI             hi", "44444444444   hiHI!HI                           hI!HI", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("##### ######hi!hi", "###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ######hi!hi" + "'", str2, " ######hi!hi");
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!aa" + "'", str1, "hi!aa");
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!4444444444444444444444444444444444444444444444", "hi!4444    ", 84);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("H################################ hi#hi hi#hi", "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 350);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                    HI#HI                    ", "ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    HI#HI                    " + "'", str2, "                    HI#HI                    ");
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "###############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################" + "'", str1, "###############################################");
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#####    H     ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########H#####" + "'", str3, "#########H#####");
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             !ihIH!Ih                                            !ih" + "'", str1, "                                             !ihIH!Ih                                            !ih");
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("           ih!iH                           ih!ihIH            ih!iH                           ih!ih", "                                                    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str2, "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi                           hi!hi       ...", "4444444444HI!HI!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi                           hi!hi       ..." + "'", str2, "hi!hi                           hi!hi       ...");
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "###############################################   hi#hihi#hih################################h");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!h" });
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                  hI!HI                           hI!HI                           h################################                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaa                         aaaaaaa     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAA                         AAAAAAA     " + "'", str1, "AAAAAAA                         AAAAAAA     ");
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("I!HI                            ", "    h     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                            " + "'", str2, "I!HI                            ");
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ih!ih###################################", 71);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih###################################" + "'", str2, "ih!ih###################################");
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                           HI!HI                           H###############################", "HI!                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           HI!HI                           H###############################" + "'", str2, "                           HI!HI                           H###############################");
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...###################################hi#!#hi#", "               ", "44444444", 349);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...###################################hi#!#hi#" + "'", str4, "...###################################hi#!#hi#");
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!hi                           hi!hi            hihi!hi                           hi!hi", "HIHi!hiHi!hi#Hi!hiHi!hiHI", 6);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                          hI!HI               ", strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, ' ');
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                           ", "            ", "                           " });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                    " + "'", str8, "                                                                    ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("             HI   Hi!hiHi!hiH                 ", 94, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI4444444444444444444444444444444444444444#############################################HI!HI" + "'", str1, "HI!HI4444444444444444444444444444444444444444#############################################HI!HI");
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "                                                                                            hi!hi", 84);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!hi                           hi!hi            hihi!hi                           hi!hi", "HIHi!hiHi!hi#Hi!hiHi!hiHI", 6);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                          hI!HI               ", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                           ", "            ", "                           " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                    " + "'", str7, "                                                                    ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                           4            4                           " + "'", str9, "                           4            4                           ");
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  4444444444444444444444444444444444444444444444!   ", "                                      444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  4444444444444444444444444444444444444444444444!   " + "'", str2, "  4444444444444444444444444444444444444444444444!   ");
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                            IH!I", 10, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI                           hI!HI            ...", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################" + "'", str2, "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################");
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                             I!HIhI!HIh################################                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "h################################ Hi!hi hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("4444444444444444444444444444444444444444444444HI!HI!", "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI", ' ', 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hI!HI                           hI!H...", " hI!HI  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 45);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!HI                           hI!H..." + "'", str4, "hI!HI                           hI!H...");
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("     4444444444444444444444444444444444444444444444 hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     4444444444444444444444444444444444444444444444 Hi!hi                           " + "'", str1, "     4444444444444444444444444444444444444444444444 Hi!hi                           ");
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "###########HI!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                       #############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################" + "'", str1, "#############################################");
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!#######", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!#######" + "'", str2, "hi!#######");
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih", 5, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih" + "'", str3, "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih");
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                       a###                44hi!hi!4444hi!hi!4444hi!hi!44                       a###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       " + "'", str1, "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ");
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HhI!HI             ", "      H         H         H         H         !ih        H         H         H         H         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI             " + "'", str2, "HhI!HI             ");
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                        hI!HI   ", "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        hI!HI   " + "'", str2, "                        hI!HI   ");
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", "         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  " + "'", str2, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("           HI!HIhI!HIhiHI!HIhI!HIHI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           hi!hiHi!hiHIhi!hiHi!hihi!h" + "'", str1, "           hi!hiHi!hiHIhi!hiHi!hihi!h");
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                       a#############################################ahia!ahia                        ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                       a#############################################ahia!ahia                        " });
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                    ih ih ih ih ih ih ih", "hi!hi                           hi!hi                           h################################", "                                                                           ###################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                        " + "'", str3, "                                                        ");
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!  4444444444444444444444444444444444444444444444!   HI!HIHI!HIH################################HI" + "'", str1, "444!  4444444444444444444444444444444444444444444444!   HI!HIHI!HIH################################HI");
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#############################################hi!hi!#############################################", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################hi!hi!#############################################" + "'", str2, "#############################################hi!hi!#############################################");
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "H", (java.lang.CharSequence) "     4444444444444444444444444444444444444444444444 hI!HI                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", "                                              hi#hi                                              ", 26);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str7, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h    h    h    h    h    h                                             h    h    h    h    h    h  ", "!ihh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "    ", "    ", "    ", "    ", "    ", "                                             ", "    ", "    ", "    ", "    ", "    ", "  " });
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#", "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi#hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI" + "'", str1, "HI#HI");
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ", "                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I!                                                                                                 ", "###############################################HI#!#HI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                                                                                                 " + "'", str2, "I!                                                                                                 ");
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("           hi!hiHi!hiHIhi!hiHi!hihi!h", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi####", "                                                                                              I!", 162);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                        hI!HI   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        hI!HI  " + "'", str1, "                        hI!HI  ");
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "  IH!Ih                           IH!Ih4444   444  IH!Ih                           IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                                                                                    ", "################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hI#HI");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI#################################hi!hi444444444", strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '#');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...                   4444444444444444444444444444444444444444444444HI!HI!...                    ", "h################################ hi#hi hi#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                   4444444444444444444444444444444444444444444444HI!HI!...                    " + "'", str2, "...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  4444444444444444444444444444444444444444444444hI!HI  ", "###############################################hi#!#hi#                                 ", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444", "#I!HI#I!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444" + "'", str2, "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444");
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...", (java.lang.CharSequence) "IH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!                               ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                               " + "'", str2, "hi!                               ");
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                                ", "###############################################", (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                                                                                 I!                                                                                                 ", 11, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 11 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...                                " });
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...!IH!IH4444444444444444444444444444444444444444444444                   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HI", 45, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str3, "HI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HIHI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!hihi!hi", "         H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("################HI!HI################", (int) (byte) 10, "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################HI!HI################" + "'", str3, "################HI!HI################");
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...", 19, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####..." + "'", str3, "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!HI                         HI!HIHI!HIH################################!HI                           hI!H...", "     4444444444444444444444444444444444444444444444 hI!HI                           ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "################################", "..." });
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Ih!iH                           ih!ihIH            ih!iH                           ih!ih", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str2, "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ", "hi        ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "            hiHI!HI                                       hiHI!HI               4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                                    ", "                            ##################################hi!hi                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    H  ", "HI ! HI ! HI ! HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    H  " });
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH", "... ...                                !ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH" });
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi#hhi   hi!hihi!hih################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...##########################################################################################...", "!                                             ", "hI#H");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Ih!iH                           ih!ihIH            ih!iH                        ...", 161);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444444444444444444444444HI!HI", "44hi!hi!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI" + "'", str2, "HI!HI");
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("IH!IH!IH!IH", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "!", "!" });
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444!ih444", "          IH!IH                           IH!IHIH            IH!IH  #############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!HI");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Ih!iHi!444Ih!iHIh!iHi!444Ih!iHIh!iHi!444Ih!iH", "...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#...#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!hiHi!hiH################################", 39, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hiH################################" + "'", str3, "Hi!hiHi!hiH################################");
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#############################################", 460);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                               #############################################" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                               #############################################");
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4444!IH444", "IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("###################################hi!hi################", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########" + "'", str2, "#########");
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("            hiHI!HI                           ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "            ", "hi", "HI", "!", "HI", "                           " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI!HIHI!HIH################################HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!H", "    #HI   Hi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!H" + "'", str2, "HI!H");
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hI!HI                           HI!HI            ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...###################################hi#!#hi", "ih!ihih!ih");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray7, strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray10, strArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, ' ', (int) (short) 100, (int) (short) 100);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("############444hi!4444     ###############", strArray3, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 6 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...###################################", "", "#", "#", "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hI!HI" + "'", str11, "hI!HI");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                          !IHHI            " + "'", str14, "                          !IHHI            ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str20, "!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("         H         H         H         H                    H         H         H         H      ", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...", 260);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                             !hihi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hihi!hi" + "'", str1, "!hihi!hi");
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...", "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", "ih!ih                                             ", 162);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!" });
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!hihi!hi", "#############################", "                               !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hihi!hi" + "'", str3, "!hihi!hi");
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         H         H         H         H                    H         H         H         H      ", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    H         H         H         H      " + "'", str2, "    H         H         H         H      ");
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                               !ih", "###############################################hi#!#hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               !ih" + "'", str2, "                               !ih");
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                            IH!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!I" + "'", str1, "IH!I");
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ih!ih##################################", "     !4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!4444444444444444444444444444444444444444444444!44444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("IH!IH!IH!IH", "HI   HI!HIHI!HIH################################    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", "4444444444444444444444444444444444444444444444!", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("      H         H         H         H         !ih        H         H         H         H         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      H         H         H         H         !ih        H         H         H         H         " + "'", str1, "      H         H         H         H         !ih        H         H         H         H         ");
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!IhI!aaaaaaaaaaaaaaaaa", "44hi!hi!4444hi!hi!4444hi!hi!44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                             !ihIH!Ih                                            !ih", "hI!HI                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("I!HI                                       hiHI!HI", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                                       hiHI!HI" + "'", str2, "I!HI                                       hiHI!HI");
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "IH IH###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HhI!HI             ", "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#####!#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####!#####" + "'", str1, "#####!#####");
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", "###################################", (int) ' ');
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi                                                                                                                              ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 174 + "'", int5 == 174);
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444HI!H444", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444HI!H444      " + "'", str2, "444HI!H444      ");
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", "#########", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444###############...", "hi! HI!HI                           hI!HI            hiHI!HI       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#####", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                ", 324, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                ");
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444444444444", "                   I!                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HhHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444", 40);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444" + "'", str2, "HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "I!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence2, charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h################################ hi#hi hi#hi", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi! HI!HI                           hI!HI            hiHI!HI       ", "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! HI!HI                           hI!HI            hiHI!HI       " + "'", str2, "hi! HI!HI                           hI!HI            hiHI!HI       ");
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "aaaaaaaaaaaaaaaa44444444444444444444aaaaaaaaaaaaaaaa", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) 'a', 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray3, strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!hi!hi!aa", strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!hi!" + "'", str14, "hi!hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("################################", 874);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("I!HI                                       hiHI!HI                                       ", "................AA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("................AA", "...                           hi!hi            hihi!hi                           hi!hi           ", 25, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                           hi!hi            hihi!hi                           hi!hi           " + "'", str4, "...                           hi!hi            hihi!hi                           hi!hi           ");
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI                           HI!HI            HIHI!HI                           HI!HI", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("IH!I", "                     hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##########", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     ##########" + "'", str2, "                                                     ##########");
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("I!HI                           hI!HI            hiHI!HI                           hI!HI", "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#####    H", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                    HI#HI                    ", "H################################ hi#hi hi#hi", "                                      444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     I  I                    " + "'", str3, "                     I  I                    ");
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("#############################################HI#HI###############################################hI#HI                           h################################", "I!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HIhI!HIh################################" + "'", str2, "I!HIhI!HIh################################");
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                    ", "!                                             ", 54);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("############444hi!4444     ###############", "HI!HI!HIHI!HIH################################HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "IH!IH###################################", (java.lang.CharSequence) "ih!ihih!ih!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray3, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray6, strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '#', 387, 100);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hI!HI" + "'", str7, "hI!HI");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                          !IHHI            " + "'", str10, "                          !IHHI            ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str12, "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "ih!ih##################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        char[] charArray7 = new char[] { 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!hi!hi!aa", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", "I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  " + "'", str2, "##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "     4444444444444444444444444444444444444444444444      ", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!HI!HI!HI", "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "            IH!Ih                           IH!IHih            IH!Ih                           IH");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                44HI!HI!4444HI!HI!4444HI!HI!44", 3, "I!HI                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                44HI!HI!4444HI!HI!4444HI!HI!44" + "'", str3, "                44HI!HI!4444HI!HI!4444HI!HI!44");
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################..." + "'", str1, "################################...");
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("I!HI                           hI!HI                           h###############################", "###############################################hi#!#hi##############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#!#hi##############################################" + "'", str2, "###############################################hi#!#hi##############################################");
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                              44444444444444444H#IHIH#I#IH#IH##IH#I#IH#IH");
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!ihhi", (java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("4444!ih444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi", "hi!#######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IH!IH#############################################", "hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaa                         aaaaaaa     ", "HhI!HI            ", "                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa                         aaaaaaa     " + "'", str3, "aaaaaaa                         aaaaaaa     ");
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                           hI!HI            hiHI!HI                           hI!HI            #", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hI!HI            hiHI!HI                           hI!HI            #" + "'", str2, "                           hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!  !   hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ih!ih#############################################", "                               ###################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                 444!   ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                 ", "", "", "!   " });
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        char[] charArray7 = new char[] { 'a', '#', '#' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hI!HI", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################", 2, "hI!HIHI!HIH################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("###########HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###########HI!" + "'", str1, "###########HI!");
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", "               hiHI!HI               4444444444444444444", 162);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                             ", "hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "     ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HII!HI                                       hiHI!HI", (java.lang.CharSequence) "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "############ih!ih##################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!##", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("ih!ihih!ih", 237);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                              I", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              I" + "'", str2, "                                                                                              I");
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         H         H         H         H        hi!         H         H         H         H      ", 84, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H         H         H         H        hi!         H         H         H         H      " + "'", str3, "         H         H         H         H        hi!         H         H         H         H      ");
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                       #############################################HI!HI                        ", 42, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       #############################################HI!HI                        " + "'", str3, "                       #############################################HI!HI                        ");
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!hiHi!hi", 83, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444Hi!hiHi!hi" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444Hi!hiHi!hi");
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i", "AAAAAihAAA", "################################..");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hiHi!hiHIhi!hiHi!h", "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hiHi!hiHIhi!hiHi!h" + "'", str2, "hi!hiHi!hiHIhi!hiHi!h");
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi", "HI!HI                           HI!HI                           H################################                                        ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "", 873, 260);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hihi!hiHi!hiHIhi!hiHi!hi" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHI!HHHH", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HHHHHI!HHHH" });
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH" + "'", str1, "Hih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH#####!#####ih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iHih!iH");
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("iHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", "444!  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!ih", "", 50);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH!IH", "Hhi!                               ", 85);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

