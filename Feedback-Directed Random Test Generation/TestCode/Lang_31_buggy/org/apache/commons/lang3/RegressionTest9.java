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
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "          !ih                             ", (java.lang.CharSequence) "!                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                             hi!", 68, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 hi!" + "'", str3, "                                                                 hi!");
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "!", 34);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                        ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###############################", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################" + "'", str2, "###############################");
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                             ", "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih", "hi!hi!hi!", 916);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                             " + "'", str4, "                                             ");
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih      " + "'", str1, "!ih      ");
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!44444444444444444444444444444444444444444444444444444444444444444444", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                !                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 !                                " + "'", str1, "                                 !                                ");
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih!ih!ihih!i!!h!ih!ih!ih", "                                                          HIhi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str2, "!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa" + "'", str1, "aa");
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "          !ih                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("...hihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihih..." + "'", str1, "hihih...");
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444                             H", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             H" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444                             H");
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                              !                                                                 ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "                                                                                                 ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  " + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ");
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("########################!         ", "       ...", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "hihihihi!                                  hihihihih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                             ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str1, "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ", "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                       ", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#############################", 250, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################################################################################################################################################" + "'", str3, "##########################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!         !         !         !         !         ", "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!         !         !         !         !         " + "'", str2, "!         !         !         !         !         ");
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", "hI!HI!HI!HI!HIHI!HI!HI!HI!HI!", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !" + "'", str1, "!!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", "hihI!Hi!                                                                                       hi", 7, (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iH!IH!IhihI!Hi!                                                                                       hi #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH" + "'", str4, "iH!IH!IhihI!Hi!                                                                                       hi #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hI!Hi!", "hihihihih!ihihihih", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", "                                !                  ", 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                       !                                       !" + "'", str3, "                                                       !                                       !");
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!!", 45, 165);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                      ", "  4hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                 HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                             HHHHH                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hiihiihiihiihihiihiihiihiihii", '#', 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                       HI!HI!HI!                                                                                                                                        ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "                                !                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                       HI!HI!HI!                                                                                                                                        " + "'", str3, "                                                                                                                                       HI!HI!HI!                                                                                                                                        ");
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               " + "'", str1, "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ");
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                             HHHHH                             ", "                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("####################################HHH####################################", "4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################HHH####################################" + "'", str2, "####################################HHH####################################");
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                      ", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      " + "'", str2, "                                      ");
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "hi!                                                                                                 ", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!         !         !         !         !         ", "!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!         !         !         !         !         " + "'", str2, "!         !         !         !         !         ");
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                               ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                  !", (java.lang.CharSequence) "     !!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        java.lang.String[] strArray3 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!!");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("                                 ", strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!!!" + "'", str7, "!!!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!4" + "'", str12, "!4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!" + "'", str13, "!");
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih", "!hi!hi!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", 34);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str4, "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                !                  ", (java.lang.CharSequence) "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IH", "##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH" + "'", str2, "IH");
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaHi", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaH", "" });
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                            !!hi!hi!                                            ", "hihihihih!ihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            !!hi!hi!                                            " + "'", str2, "                                            !!hi!hi!                                            ");
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                !                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 51 + "'", int1 == 51);
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hihihihihihihihihih");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", "!!!                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hihihihih!ihihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH!IHIHIHIH" + "'", str1, "HIHIHIHIH!IHIHIHIH");
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray5 = new char[] { ' ' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             hi", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                                              ", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH", "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!                                                                                                                              ", "                                                                                                                                                           hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              " + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ");
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH", "hi", "a", 131);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH" + "'", str4, "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##########################################################################################################################################################################################################################################################", 73, 66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...############################################################..." + "'", str3, "...############################################################...");
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "   HI!Hi!                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "                             h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaa                                                               ", "                             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaa" });
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", "!                              i                              i                              i                              i                              !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 898);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HIHIHIHI!                                  HIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihi!                                  hihihihih" + "'", str1, "hihihihi!                                  hihihihih");
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!", ' ', 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring(" ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 66, 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!!!", "!hihihi                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!                                !                                !                                !                                !", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("!HI!h!!ih", "aaaaaaaaaaaaaaaaaaaaaaa", 95);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!Hi!                                                                                       ", strArray3, strArray9);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!                                !                                !                                !                                !" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!                                !                                !                                !                                !" + "'", str5, "!                                !                                !                                !                                !");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!HI!h!!ih" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HI!Hi!                                                                                       " + "'", str10, "HI!Hi!                                                                                       ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "         h", "                       HI!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                  ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hihihihihihihihihihi", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HIHIHIHIH                                  !IHIHIHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH                                  !IHIHIHIH" + "'", str1, "HIHIHIHIH                                  !IHIHIHIH");
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                       hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       hi!H" + "'", str1, "                       hi!H");
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!!HI!HI!H", (java.lang.CharSequence) "                                                           ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!!HI!HI!H" + "'", charSequence2, "!!HI!HI!H");
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!                                ", "IH", 898);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!                                " });
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                       HI!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       HI!h" + "'", str1, "                       HI!h");
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                !!h!h!h!h!hh!h!h!h!h!                                ", "", (int) ' ', (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                !!h!h!h!h!hh!h!h!h!h!                                " + "'", str4, "                                !!h!h!h!h!hh!h!h!h!h!                                ");
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hihihihih                                  !ihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "h!!HI!HI!                                 ", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" });
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                 HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                 ", "HIHIHIHI", "!", "                                  ", "HIHIHIHIH", "                  " });
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!!!                               ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!4         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         4!" + "'", str1, "         4!");
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("   HI!Hi!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   HI!HI!                                                                                          " + "'", str1, "   HI!HI!                                                                                          ");
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!hi!hi!hihi!hi!hi!hi!hi!", "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hI!", "h!!HI!HI!                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hihihi!                                  hihihihih", "                             ", 0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hihihi!", "     hihihihih" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("     ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hihihihihihihihihih", "iH!IH!IhihI!Hi!                                                                                       hi #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihihihihihihih" + "'", str3, "hihihihihihihihihih");
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         ", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHIH                         " + "'", str2, "IHIH                         ");
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HIHIHIHIH!", (java.lang.CharSequence) "                               !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                !                                                                hihihihih", 51, "!hihihihi!                                  hihihihih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                !                                                                hihihihih" + "'", str3, "                                !                                                                hihihihih");
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("h!ih!ih!ih", " #########", "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih" + "'", str3, "h!ih!ih!ih");
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HIhi!hi!#########################", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIhi!hi!#########################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HIhi!hi!#########################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!I4#########iH!IH!IH", "4hi", "hihihi", 49);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!I4#########iH!IH!IH" + "'", str4, "!I4#########iH!IH!IH");
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                  ", "         !", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!!IH!IH!IHIH!I!!H!IH!IH!IH", "!ih      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                !                  ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             ..." + "'", str2, "                             ...");
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!4!4!4!4!HH   !4!4!4!4!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!4!4!4!4!HH   !4!4!4!4!4" + "'", str1, "!4!4!4!4!HH   !4!4!4!4!4");
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("H", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  H" + "'", str2, "                                                                                                  H");
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                                                 H                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("################################################H################################################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################H################################################" + "'", str2, "################################################H################################################");
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hihihih", "hih", 66);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihih" + "'", str3, "hihihih");
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           " + "'", str2, "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ");
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!!", "!4         ", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) " ######### ######### ######### ######### ######### ########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                             4hi", "                           ...", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                             4hi" });
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!Hi!                                                                                       ", "", 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 93 + "'", int3 == 93);
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hihihi!..", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("h!!HI!HI", "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!                               ", "         !", "       ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!                                                                                               !                              hi                                                                 !                              ", "44444444444444     444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                                                                               !                              hi                                                                 !                              " + "'", str2, "!                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                  !", "         !ih!!ihaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                  !" });
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                       ", 3, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       " + "'", str3, "                       ");
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             H", (java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!Ihi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             " + "'", str1, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                  ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hI!Hi!", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ihih", "!", "i", "!!", "h", "!", "ih", "!", "ih", "!", "ih" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hIH                        ...", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                       !!HI!HI!H", 63, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                      !!HI!HI!H                " + "'", str3, "                                      !!HI!HI!H                ");
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hi" + "'", str2, "                           hi");
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     " + "'", str1, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ");
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                 ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!ih!!ih", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  44444444444444444444444444444", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                           hi", (java.lang.CharSequence) "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                               ", "aa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                               " });
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("       !", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 41);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       !" + "'", str3, "       !");
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hihihihih!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihih!" + "'", str2, "hihihihih!");
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaa                                                               ", ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                  !", 93, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444                                  !44444444444444444444444444444" + "'", str3, "44444444444444444444444444444                                  !44444444444444444444444444444");
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("! h", "Hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HH   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH" + "'", str1, "HH");
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" ", 165, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hihI!Hi!                                                                                       hi", "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444                               !4444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444                               !4444444444444444444444444444" + "'", str1, "4444444444444444444444444444                               !4444444444444444444444444444");
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HIHIHIHIH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str5, "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                  ", '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hihihi!                  ...", "!HI!h!!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi!hi!hi!hihi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" ######### ######### ######### ######### ######### ########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " ######### ######### ######### ######### ######### ########" + "'", str1, " ######### ######### ######### ######### ######### ########");
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("         h", "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ", "!                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         h" + "'", str3, "         h");
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hihihihih!", strArray4, strArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("                       HIHIHIHI!                                  HIHIHIHIH                  ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                              !                                  " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hihihihih!" + "'", str14, "hihihihih!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HHHHH", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHH" + "'", str2, "HHHHH");
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Hi", "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!IH!IH!IHIH!I!!H!IH!IH!IH" + "'", str1, "!!IH!IH!IHIH!I!!H!IH!IH!IH");
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  " + "'", str3, "          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  ");
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "################################################H################################################", "                             hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...                                                   hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH...", 23, "44444444444444444444444444444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                   hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH..." + "'", str3, "...                                                   hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH...");
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", "       ..", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#############################hi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                          HIHI!HI!", "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str2, "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#################################################", "", "4!                                                               4");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                       !                                       !", "HI!Hi!                                                                                       ", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!             ", 28, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#######!             #######" + "'", str3, "#######!             #######");
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hIH                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIH                        ..." + "'", str1, "HIH                        ...");
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', 59, 10);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi                                                                 !                                                                                               !                              h!IH                                                       ih                                                                                       !iH!Ihih" + "'", str1, "hi                                                                 !                                                                                               !                              h!IH                                                       ih                                                                                       !iH!Ihih");
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("             !                                                                                                                     ", "", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, "HIhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("##################################", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!hihihihi!                                  hihihihih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hihihihi!                                  hihihihih" + "'", str2, "!hihihihi!                                  hihihihih");
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                  ", "!                                  ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("                                                 H                                                 ");
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("...                             ", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                          ", strArray5, strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hihihi!..", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "H" });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                          " + "'", str11, "                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!                                !                                !                                !                                !                                ", "hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                !                                !                                !                                !                                " + "'", str2, "!                                !                                !                                !                                !                                ");
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                               ", (java.lang.CharSequence) "!!!!!!!...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                               " + "'", charSequence2, "                                                                                               ");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                              !                                                                 ", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              !                                                                 " + "'", str2, "                              !                                                                 ");
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("         4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         4!" + "'", str1, "         4!");
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "         !         !         !         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi" + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" ######### ######### ######### ######### ######### ########", "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "                                 ", 99);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " ######### ######### ######### ######### ######### ########" + "'", str4, " ######### ######### ######### ######### ######### ########");
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", '#', 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                !                                 ", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("         !", "                                                                                              ", "########################!         ", 542);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         !" + "'", str4, "         !");
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h", "                                                                                                ", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h" });
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ", "                              !                                                                 IH                              !                                                                                               !                                                                 IH", 34);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!ih!ih!ihih!i!!h!ih!ih!ih", (int) '4', 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!                                  ", 39, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444!                                  " + "'", str3, "4444!                                  ");
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!h!!i!hihi!hi!hi!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!");
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "!!!!!", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IH", "IH", "IH", "IH", "IH", "IHIH", "I", "H", "IH", "IH", "I" });
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHIHIHIHI" + "'", str2, "IHIHIHIHI");
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 " });
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", (java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "IH", "HH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HH", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         !         !         !         ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         !         !         !         " + "'", str3, "         !         !         !         ");
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!                                  ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                  " + "'", str3, "!                                  ");
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                             ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                !                   ", (java.lang.CharSequence) "         h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "#######!             #######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hih       ", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                !                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI! 44444444444444444444444444444444444444444444444444444444444444444444                            ", "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI! 44444444444444444444444444444444444444444444444444444444444444444444                            " + "'", str2, "HI! 44444444444444444444444444444444444444444444444444444444444444444444                            ");
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "!ih!ih!ih!ih!ihih!ih!ih!ih!ih" });
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str2, " h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !" + "'", str1, "!!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!IH                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "   HI!HI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("  4hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4hi" + "'", str1, "4hi");
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hihihi                                                                     ", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihi                                                                     " + "'", str2, "hihihi                                                                     ");
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!hihihi                                                                     ", 0, "!ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hihihi                                                                     " + "'", str3, "!hihihi                                                                     ");
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 542, 95);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                        ", "HIhi!hi!#########################", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        " + "'", str3, "                        ");
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!         !         !         !         !                                                       ", 897, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("#########", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       ", "   HI!Hi!                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "H                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!HH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("4 4 4 4 HH 4 4 4 4 4", "!!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("          HI!HI!HI!HI!HIHI!HI!HI!HI!HI           ", 'a', 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("       ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                 ", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaa", "!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hihihihihihihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi");
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("  4hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4hi" + "'", str1, "4hi");
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!                                                                                               ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                                                               ..." + "'", str1, "!                                                                                               ...");
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!hi!hi!hi!hihi!hi!hi!hi!hi!hi", "                                !!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!4", "hih                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4" + "'", str2, "!4");
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!IH                        ...", "                                !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH                        ..." + "'", str2, "!IH                        ...");
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HIhi!hi!#########################", '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HHHHHHHHHHHHHHHHHHHHHH", "hi!                                                                                                 ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!                                !                                !                                !                                !                                ", (java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                           ...", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          ..." + "'", str2, "                          ...");
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                   " + "'", str1, "                                                                                                                                   ");
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaahih                                                                                             ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                !                                 ", (int) (short) 10, 289);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                !                                 " + "'", str3, "                                !                                 ");
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih", ' ', 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("   HI!Hi!                                                                                         ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("! h", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "! h" + "'", str2, "! h");
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H" + "'", str1, "                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H");
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!HI!HI!" + "'", str1, "!!HI!HI!");
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                             ", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", (int) 'a', 20);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("", "hihihi!                      ...");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hi!                                                                                                 ", strArray3, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!                                                                                                 " + "'", str11, "hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444444444444444444444444444444444444444444444444444444                             hi!", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HIhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hI!                                                                                                 ", 0, 75);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!                                                                     ..." + "'", str3, "hI!                                                                     ...");
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        char[] charArray9 = new char[] { ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                    ", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...HIHIH!H", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h!ih!ih!ih", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444                             H", "                                ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...HIHIH!H", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HIHIH!H" + "'", str2, "...HIHIH!H");
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "!I4#########iH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih", 68, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str3, "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hihihihih!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hihihihihihihihihih", "hih", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", 289, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("h!!HI!HI!                                 ", "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!!HI!HI" + "'", str2, "h!!HI!HI");
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("44444444444444444444444444444444444444444444444444444444444444444444                             HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             HI" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444                             HI");
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                  !", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  !" + "'", str2, "                                  !");
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                           ", "44444444444444444444444444444444444444444444444444444444444444444444                             HI", 6);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                           " });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!4         ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                             hi", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI !", "                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI !" + "'", str2, "HI !");
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               " + "'", str1, "                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("4444!                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", 19, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" + "'", str3, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "          HI!HI!HI!HI!HIHI!HI!HI!HI!HI           ", 31, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!" });
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!         ", "                             hi!", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!!i!hihi!hi!hi", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!         " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!ih!ih!ihih!ih!ih!ih!ih", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ihih!ih!ih!ih!ih                " + "'", str2, "!ih!ih!ih!ih!ihih!ih!ih!ih!ih                ");
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI !", "", "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI !" + "'", str3, "HI !");
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444                             HI!", 100, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             HI!" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hihihihih                                  !ihihihih", "!                                !                                !                                !                                !                             ...", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih!!ih", (int) '#', "#############################hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############################!ih!!ih" + "'", str3, "############################!ih!!ih");
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  " + "'", str1, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                              " + "'", str1, "                                                                                              ");
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...                                          ", "hI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI", "! h                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                44444444444444444444444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                44444444444444444444444444444444444444444444444444444444444444444444                " + "'", str1, "                44444444444444444444444444444444444444444444444444444444444444444444                ");
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih" + "'", str2, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h!!i!hihi!hi!hi", "444444444444444444444444444444444444444444444444444444444444444444h", 136);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 542, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("       !", "          !ih                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                               " + "'", str1, "!                               ");
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!" + "'", str1, "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hi                                                                 !                                                                                               !                              h!IH                                                       ih                                                                                       !iH!Ihih", (java.lang.CharSequence) "                             HHHHH                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" });
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                          HIHI!HI!", "                             h", 25);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                          HIHI!HI!" });
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "!ih!!ih", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!Ihi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi" });
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("..                             ", 90, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "..                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI", 0, "hihihi                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI" + "'", str3, "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI");
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "HHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                              ", "!         !         !         !         !", "!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hI!Hi!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", 'a', 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 83, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ", "..                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "...############################################################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("##########################################################################################################################################################################################################################################################", "", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "h!!HI!HI!                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi");
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("         h", '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", (int) '#', "HI!44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!4" + "'", str3, "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!4");
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                !!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                ", "44444444444444444444444444444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("   HI!HI!                                                                                          ", "!!h!h!h!h!hh!h!h!h!h!", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("          HI!HI!HI!HI!HIHI!HI!HI!HI!HI           ", 289, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ih!ih!ih!ih!ihih!ih!ih!ih!ih", "!!!                               ", 136);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih", "ih", "ih", "ih", "ihih", "ih", "ih", "ih", "ih" });
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hihihih", "!!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hI!                                                                     ...", "44444444444444     444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "aaahih                                                                                             ", (java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi! ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaahih                                                                                             " + "'", charSequence2, "aaahih                                                                                             ");
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "! h", "                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("         !", "HI !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "4444!                                  ", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ", 73);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" + "'", str4, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                          HIHI!HI!", "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!                                                                                                                              !                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                                                                                                              !" + "'", str1, "hi!                                                                                                                              !");
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAA####################################hhh####################################AAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) " !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ", "hihihi!                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihi!                      ..." + "'", str2, "hihihi!                      ...");
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "..!ihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "                                ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "!                                  ");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi!hi!h" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!h" + "'", str5, "hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str13, "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", "4444!                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                          HIhi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                          hiHI!HI!" + "'", str1, "                                                          hiHI!HI!");
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hihihihihihihihihihi", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihi" + "'", str2, "hihihihihihihihihihi");
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      ", "aaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      " });
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!hihihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hihihihih" + "'", str1, "!hihihihih");
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             H" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444                             H");
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                44444444444444444444444444444444444444444444444444444444444444444444          ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("         4!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         4!" + "'", str2, "         4!");
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...#################", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#################" + "'", str2, "...#################");
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!!ih!ih!ihih!i!!h!ih!ih!ih", "                                                                 hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!ih!ih!ihih!i!!h!ih!ih!ih" });
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4", "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ", 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", "!ih!ih!!ih!!ih!ih", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                  !", "HHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!4!4!4!4!HH   !4!4!4!4!4", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4!4!4!4!HH   !4!4!4!4!4      " + "'", str2, "!4!4!4!4!HH   !4!4!4!4!4      ");
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!h" + "'", str1, "!h");
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH" });
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hihihih!ih", '#', 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!                                                                                                ", 969, "                                !                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                !                                                                 !                                                                 !                                                                 !                                                                 !                                                                 !                                                                 !       !                                                                                                                                !                                                                 !                                                                 !                                                                 !                                                                 !                                                                 !                                                                 !       " + "'", str3, "                                !                                                                 !                                                                 !                                                                 !                                                                 !                                                                 !                                                                 !       !                                                                                                                                !                                                                 !                                                                 !                                                                 !                                                                 !                                                                 !                                                                 !       ");
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!hihihihih!", 35, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hihihihih!" + "'", str3, "!hihihihih!");
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!I444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!I444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH" });
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("       ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         " + "'", str2, "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ");
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih!ih!ih!ih!ihih!ih!ih!ih!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!!h!h!h!h!hh!h!h!h!h!", "##################################", "                             H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!h!h!h!h!hh!h!h!h!h!" + "'", str3, "!!h!h!h!h!hh!h!h!h!h!");
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        char[] charArray8 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!hihihihih!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                        ", "                                 ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444#########4444444", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("       ", "HI! 44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                44444444444444444444444444444444444444444444444444444444444444444444          ...", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("   HI!HI!                                                                                          ", "HI!44444444444444444444444444444444444444444444444444444444444444444444", "!!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("                                                                   ", "                                                              ! ", 8);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach(" ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", strArray3, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str8, " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                !                   ", "                                                                                                !", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                 HIHIHIHI!                                  HIHIHIHIH                  ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hI!                                                                     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IHIHIHIHI", "Hi!hi!hi!", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HIH                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ", "hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                               !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HH        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH        " + "'", str1, "HH        ");
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "     !!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!IH                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", (int) (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!" + "'", str3, "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                  444444444444444444444444", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaa!HI", "                                !                                 ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa!HI" + "'", str3, "aaaa!HI");
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                !                                                                hihihihih", "hI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                                                hihihihih" + "'", str2, "                                !                                                                hihihihih");
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hihi!hi!hi!hi!hi!!hhihihihih", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!hi!hi!hi!!hhihihihih" + "'", str2, "hi!hihi!hi!hi!hi!hi!!hhihihihih");
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!i", '#', 83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI" + "'", str2, "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", (java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I" + "'", charSequence2, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("AAAAAA####################################hhh####################################AAAAAAA", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "HHHHH", 63);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "AAAAAA####################################hhh####################################AAAAAAA" + "'", str4, "AAAAAA####################################hhh####################################AAAAAAA");
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("########################!         ", "                                !!h!h!h!h!hh!h!h!h!h!                                ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                           ...", "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 30);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                           ..." });
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "HI!");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, "HI!");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("h", strArray11, strArray15);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ", strArray4, strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "h" + "'", str19, "h");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         " + "'", str20, "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ");
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi                                                                 !                                                                                               !                              h!IH                                                       ih                                                                                       !iH!Ihih", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi                           ..." + "'", str2, "hi                           ...");
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hihihihih", "!ihihihihhihihihih", "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" });
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI !", " !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI !" + "'", str2, "HI !");
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HIHIHIHI!                                  HIHIHIHIH", 250, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHIHI!                                  HIHIHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHIHI!                                  HIHIHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                             HHHHH                             ", "hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HIhi!hi!#########################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi! ", "hi!hi!hi!h", 292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                             hih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hih" + "'", str1, "hih");
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!ih!ih!ih!ih!ihih!ih!ih!ih!ih                ", "                                !                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!4", "!IH                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4 4 4 4 HH 4 4 4 4 4", (java.lang.CharSequence) "HI!HI!HI!HI!HIHI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 26 + "'", int2 == 26);
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...hihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "..!ihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hI!Hi!                                                                                       ", "         !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         !" + "'", str2, "         !");
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("h!ih!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ihih!ih!ih!ih!ih!hi!h" + "'", str1, "!ih!ih!ih!ih!ihih!ih!ih!ih!ih!hi!h");
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                   ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  4hi", "                                                                  444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("########################!         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########################!" + "'", str1, "########################!");
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                            !!HI!HI!                                            ", "                                      !!HI!HI!H                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            !!HI!HI!                                            " + "'", str2, "                                            !!HI!HI!                                            ");
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                             H", 0, "                             4!                                                               4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             H" + "'", str3, "                             H");
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!IH                            ", " !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih", 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IH" });
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!" + "'", str2, "Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!");
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "HI!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("h", strArray3, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "h" + "'", str11, "h");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaahih                                                                                             ", "hIH                        ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaahih                                                                                             " });
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hihihihih                                  !", "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                            !!hi!hi!                                            ", 35, 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         !!hi!hi!                " + "'", str3, "         !!hi!hi!                ");
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HIH                        ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hihihih!ih", 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihih!ih" + "'", str3, "hihihih!ih");
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   " });
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HIHIHIHIH!IHIHIHIH", "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", "################################################H################################################", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                               ", "                              !                                                                 IH                              !                                                                                               !                                                                 IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                               " + "'", str2, "                                                               ");
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hih", "4444!                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HIhi!hi!#########################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str2, "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", (java.lang.CharSequence) "!h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !" + "'", charSequence2, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH                        ...", 53, "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       !IH                        ..." + "'", str3, "                       !IH                        ...");
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                       HIHIHIHI!                                  HIHIHIHIH                  ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   " + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str2, "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!IH!IH!!IH                             !!IH                             !IH                    ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH!IH!!IH", "!!IH", "!IH" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "     ", (java.lang.CharSequence) "                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                 ", "                           hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaa                                                               ", "                           ...", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       HI!h", 289);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                      !!HI!HI!H                ", "aaaaaaaaHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      !!HI!HI!H                " + "'", str2, "                                      !!HI!HI!H                ");
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!!h!h!h!h!hh!h!h!h!h!", "..                             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!h!h!h!h!hh!h!h!h!h!" });
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("H                               ", "                                                              !                                  ", (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                              !                                                                 " + "'", str4, "                                                              !                                                                 ");
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("         h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         H" + "'", str1, "         H");
    }
}

