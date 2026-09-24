package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

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
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!AAAAAAA", (java.lang.CharSequence) "#################################################################################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 99, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                    ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "                                                                    ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                 !                                ", "!ih!ih!ih!ih!ihih!ih!ih!ih!ih                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ", "  4HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih", "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ", 67);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih" });
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                             ", ' ');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("..                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             .." + "'", str1, "                             ..");
    }

    @Test
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("      HI!h      HI!h!!!!!!!...", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ihih", "!", "i", "!!", "h", "!", "ih", "!", "ih", "!", "ih" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "      HI!h      HI!h!!!!!!!..." + "'", str7, "      HI!h      HI!h!!!!!!!...");
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 69 + "'", int1 == 69);
    }

    @Test
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hihihi!                                  hihihihih");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "44444444444444444444444444444444444444444444444444444444444444444444                             HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hihihi", "!", "                                  ", "hihihihih" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihi44444444444444444444444444444444444444444444444444444444444444444444                             HI!44444444444444444444444444444444444444444444444444444444444444444444                             HI                                  44444444444444444444444444444444444444444444444444444444444444444444                             HIhihihihih" + "'", str3, "hihihi44444444444444444444444444444444444444444444444444444444444444444444                             HI!44444444444444444444444444444444444444444444444444444444444444444444                             HI                                  44444444444444444444444444444444444444444444444444444444444444444444                             HIhihihihih");
    }

    @Test
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 292, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                      ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                            !!hi!hi!                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            !!HI!HI!                                           " + "'", str1, "                                            !!HI!HI!                                           ");
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                              !                                  ", "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       HI!h", 73, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("44444444444444444444444444444444444444444444444444444444444444444444a                             ahia!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444aahia!" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444aahia!");
    }

    @Test
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...#############################", "                                                                                                                                                       HIHIHIHIH!                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "ih", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!H!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!IH!IH!!IH!!IH!IH");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ih" + "'", charSequence2, "ih");
    }

    @Test
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!aaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444!                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "!I", "!                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                 Hi                                                 ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "HHHHH");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", strArray3, strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("hihih...");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("      HI!h", strArray9, strArray16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                 ", "H", "i", "                                                 " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 " + "'", str14, "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "hihih..." });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "      HI!h" + "'", str17, "      HI!h");
    }

    @Test
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                          hiHI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hIhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!         !         !         !         !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!         !         !         !         !" + "'", str1, "!         !         !         !         !");
    }

    @Test
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!#######          #######     ", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("H", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4444444444...#############################", "44444444444444444444444444444444444444444444444444444444444444444444aahia!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444...#############################" + "'", str2, "4444444444...#############################");
    }

    @Test
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                        !IH!IH!Ih                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                        !IH!IH!IH                                                                                                                                       " + "'", str1, "                                                                                                        !IH!IH!IH                                                                                                                                       ");
    }

    @Test
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaa                        ...", 'a', 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             ", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             " + "'", str2, "IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             ");
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ", "                                    !                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "4444444444444444444444444444444444444444444444444444", 874);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i" });
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str2, "ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
    }

    @Test
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                 H                                                 ", 168, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################                                                 H                                                 ###################################" + "'", str3, "##################################                                                 H                                                 ###################################");
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!h                                                                                                                                                                      ", "         h", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", "hihih...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH" + "'", str2, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "########################!         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...!hi!   ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 174);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!ih                            ", (java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi! ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     h                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     h                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !" + "'", str1, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     h                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
    }

    @Test
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaa!HI", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa!HI" + "'", str2, "aaaa!HI");
    }

    @Test
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                      ", "                             4!                                     !IH!IH!!IH!!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                      " + "'", str2, "                                      ");
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!IH                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH                             " + "'", str1, "!IH                             ");
    }

    @Test
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("##########################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################################################################################################" + "'", str1, "##########################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray10, strArray14);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "!");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!hi!hi!hi!hihi!hi!hi!hi!hi", strArray3, strArray10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "!         !         !         !         !");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h" + "'", str4, "h");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h" + "'", str5, "h");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi" + "'", str20, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!ih                                                                                                                                                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!                                                 ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                  hi", 314);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                  hi                                                                                                                                                                                                                                                      " + "'", str2, "                                                                  hi                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hihI!Hi!                                                                                       hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihI!Hi!                                                                                       hi" + "'", str1, "hihI!Hi!                                                                                       hi");
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hhi!                                                                                             hi!                                                                                             HIhi!                                                                                             HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!HIhi!HI" + "'", str1, "hhi!hi!HIhi!HI");
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("       ...                                                                                      ", '4', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("iiiiih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih", "I!                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str2, "iiiiih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("                             hi", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10, "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                              ! ", strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                                                                             ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", 898);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", strArray13, strArray18);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        int int22 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", strArray21);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!                                                                                             " });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str19, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HIHIHIHI !                                    HIHIHIHIH", "..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HIHHIHHIHHIHHIHIHHIHHIHHIHHIH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHHIHHIHHIHHIHIHHIHHIHHIHHIH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "HIHHIHHIHHIHHIHIHHIHHIHHIHHIH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444", "HI! 44444444444444444444444444444444444444444444444444444444444444444444                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444" + "'", str2, "4444444444444444444");
    }

    @Test
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!!!!!!!", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi" + "'", str1, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!.....................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!....................." + "'", str1, "hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!.....................");
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!                                                             !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                             !                                !                                !                                !" + "'", str1, "!                                                             !                                !                                !                                !");
    }

    @Test
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", (int) (short) 10, "HI!Hi!                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         HIHIHIHI                                                           4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         HIHIHIHI                                                           4" + "'", str1, "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         HIHIHIHI                                                           4");
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HIHIHI!                      ...", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HIHIHI!", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "..." });
    }

    @Test
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444444444", 289, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                      4444444444444444444444444444444444444444444444444444                                                                                                                       " + "'", str3, "                                                                                                                      4444444444444444444444444444444444444444444444444444                                                                                                                       ");
    }

    @Test
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4 4 4 4 HH 4 4 4 4 4", "4 4 4 4 HH 4 4 4 4 4");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444!                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444!                                  ", "hI!Hi!                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("          HI!HI!HI!HI!HIHI!HI!HI!HI!HI           ", (int) (byte) 0, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          HI!HI!HI!HI!HIHI!HI!HI!HI!HI           " + "'", str3, "          HI!HI!HI!HI!HIHI!HI!HI!HI!HI           ");
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h", "                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi! ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "" });
    }

    @Test
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaa                        ...", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa                        ..." + "'", str2, "aaaaa                        ...");
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 104);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#######################################", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################" + "'", str2, "#######################################");
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ih!ih!ih!i", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                              IH                              !                                                                                               !                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH                              !                                                                                               !" + "'", str1, "IH                              !                                                                                               !");
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!!!!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "...                                                                                  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str2, "!!!!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", 98, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                             ..." + "'", str3, "...                                                             ...");
    }

    @Test
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ", "4444444444444444444444444HIhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!i", "hihihihih!ihihihi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!Hi!                                                                                       ", 94, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HIHIHIHIH!IHIHIHIH", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHIH!IHIHIHIH" + "'", str2, "HIHIHIHIH!IHIHIHIH");
    }

    @Test
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!HI!HIHI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi");
    }

    @Test
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "!                                                                                               !                              hi                                                                 !                              ", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ", "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH" + "'", str1, "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH");
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ", "                                    !                               ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... ", 191, "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIHHIHIHIHIH               " + "'", str3, "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIHHIHIHIHIH               ");
    }

    @Test
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                              !                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!.....................", "   !ih!ih!ih!ih!ih!ihih!ih!ih!ih!", 137);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!....................." + "'", str3, "hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!.....................");
    }

    @Test
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih", "hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!" + "'", str2, "!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!");
    }

    @Test
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                       !IH                        ...", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!h                                                                                                                                                                      ", "!h                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                                     HI!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("! h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "! H" + "'", str1, "! H");
    }

    @Test
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!!h!h!h!h!hh!h!h!h!h!.....................!!h!h!h!h!hh!h!h!h!h!.....................!!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 87 + "'", int1 == 87);
    }

    @Test
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("############################!ih!!ih", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!Ihi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
    }

    @Test
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!H!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!IH!IH!!IH!!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!!!!!!!!!iih!ih!i!!!!!!!!!!!!!!!!", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!iih!ih!i!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!iih!ih!i!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!" });
    }

    @Test
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  ", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  " + "'", str2, "          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  ");
    }

    @Test
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!hihihi                                                                     ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                 ...HIHIH!H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!                                                                HI!h                              !                                                                                               !                                                                 ih", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "#########################################################################################################44444444444444444444444444444444444444444444444444444444444444444444          ...##########################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!                                                                HI!h                              !                                                                                               !                                                                 ih" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!                                                                HI!h                              !                                                                                               !                                                                 ih" });
    }

    @Test
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                              ! ", 164);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                  ! " + "'", str2, "                                                                                                                                                                  ! ");
    }

    @Test
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hih" });
    }

    @Test
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                              ", "h!!ih!ih!ih!ih!ihih!ih!ih!ih!ih!", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hihihi!                                  hihihihih", (-1));
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!                                                                                               !                              hi                                                                 !                              ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                44444444444444444444444444444444444444444444444444444444444444444444                ", "                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "44444444444444444444444444444                                  !44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("IH                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                        HI" + "'", str1, "...                        HI");
    }

    @Test
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hihihi!                      ...", 75, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihi!                      ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hihihi!                      ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#########################...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################..." + "'", str2, "#########################...");
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hhi!                                                                                             hi!                                                                                             HIhi!                                                                                             HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ", "HHHHH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                                                  ! ", (java.lang.CharSequence) "HI!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                  ", "4444!                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  " + "'", str2, "                                                                                                  ");
    }

    @Test
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hihihi!                                  hihihihih", "...     ", 49);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!", (int) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!" + "'", str3, "                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!");
    }

    @Test
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                            ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                     !         !         !         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       .4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIhi!hi!", "#############################...", 33);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIhi!hi!" });
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("      HI!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      hi!h" + "'", str1, "      hi!h");
    }

    @Test
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii");
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                !                                 ", 49, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                !                                 " + "'", str3, "                                !                                 ");
    }

    @Test
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ", 9, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HI!HIHI!HI!HI!HI!HI!                       ..." + "'", str3, "...HI!HIHI!HI!HI!HI!HI!                       ...");
    }

    @Test
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                      ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                           hi!", 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hihihihih                                  !ihihihih", (java.lang.CharSequence) "HIhi!hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("IHIHIHIHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IHIHIHIHI" + "'", str1, "IHIHIHIHI");
    }

    @Test
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                                                                    H", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hihih...", 95, "HIhi!hi!#########################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hihih..." + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hihih...");
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              " + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ");
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hihih...", 350);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi                                                                 !                                                                                               !                              h!IH                                                       ih                                                                                       !iH!Ihih", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "H!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!             ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...                                                                                  ...", 97, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaa...                                                                                  ...aaaaa" + "'", str3, "aaaa...                                                                                  ...aaaaa");
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         " + "'", str2, "                         ");
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "...4444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!IH", "   HI!HI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!                                                                                               !                              hi                                                                 !                              ", "...#############################", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                                                                               !                              hi                                                                 !                              " + "'", str3, "!                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!h" + "'", str2, "hi!hi!hi!h!!i!h");
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!                               ", "hhi!                                                                                             hi!                                                                                             HIhi!                                                                                             HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!         !         !", "         H", "         ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                 Hi                                                 ", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi" });
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", "HH   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str2, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!HI!h!!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!h!!ih" + "'", str1, "!hi!h!!ih");
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "Hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str2, "ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
    }

    @Test
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " + "'", str5, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!!!!!...                                !!h!h!h!h!hh!h!h!h!h!                                    ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 98 + "'", int2 == 98);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                        ...", 603, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                        ...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "                                                                        ...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               ", 'a', 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !H", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" i i i i                                                                                            ", "                       HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hihihi", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihi" + "'", str2, "hihihi");
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("             !                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "             ", "!", "                                                                                                                     " });
    }

    @Test
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!!HI!HI", "HIHIHI!                      ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!IH                             ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH                             " + "'", str2, "!IH                             ");
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 542);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444" + "'", str5, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
    }

    @Test
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("H", "aaaaaa IH IH IH IH IH IHIH I  H IH IH IHaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         HIHIHIHI                                                           4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("     hihihihihahihihi!", '#', 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("########################", "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIHHIHIHIHIH               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444...#############################", "!!ih!ih!ihih!i!!h!ih!ih!ih", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aaahih                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaahih" + "'", str1, "aaahih");
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hihihihih", 4, "                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihih" + "'", str3, "hihihihih");
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                       !!hi!hi!h                                                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                    ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!i", "hi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                              IH                              !                                                                                               !                                      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IH", "!", "!" });
    }

    @Test
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                       ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                          " + "'", str1, "                                                          ");
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                       HI!h", "HIH#############################################################################################", 73);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       HI!h" + "'", str3, "                       HI!h");
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("! h", "hih       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", 53);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!4!4!4!4!HH   !4!4!4!4!4", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hih                                                                                            ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4 4 4 4 HH 4 4 4 4 4              ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4 4 4 4..." + "'", str2, "4 4 4 4...");
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", "aaaaaaaaHi", "!IH!I!!HI                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!HI!H!!IH", (java.lang.CharSequence) "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                             hi", "                             h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", "                                !                  ", (int) (byte) 0);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("########################!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!########################" + "'", str1, "!########################");
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI!Hi!", "                                                                   ", 41, 603);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!Hi!                                                                   " + "'", str4, "hI!Hi!                                                                   ");
    }

    @Test
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!!!!!!!", "!                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!!!!!!!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!!!!!!!");
    }

    @Test
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!hi!hi!hi!hihi!hi!hi!hi!hi!hi", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!hi!hi!hi!hihi!hi!hi!hi!hi!hi" });
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hihihi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     hihihihih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hihihi", "!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "     ", "hihihihih" });
    }

    @Test
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HIHIHIHIH!", "", "hih                                                                                             ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      HI!h      HI!h!!!!!!!...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             h", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                               !ih!!ihaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI", "IHIH                         ", 0, 53);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IHIH                         4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI" + "'", str4, "IHIH                         4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI");
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                               ", "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hihihihihihihihihihihi", "hihihi!                      ...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "hi!                                                                                                                              !", 99, 41);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("HIHiiiiiiiiiiiiiiiiiiiiiiiiiiii", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!                               " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hihihihihihihihihihihi" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HIHiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str11, "HIHiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("IH!IH!IHIH!I!!H!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str1, "ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!IH                            ", "hihihi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                             ..", "...4444444444444444444444444444444444444444444444", 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                             hi!          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hihihi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     hihihihih", "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", "                                                                                                 !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h" + "'", str2, "                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", 94, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str3, "4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                             hi!                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             hi!                                                                                                                                                                                                                          " + "'", str1, "                             hi!                                                                                                                                                                                                                          ");
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                           hi", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444          ...", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!", "         H", "         4!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH" + "'", str1, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
    }

    @Test
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "HI!");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("!", strArray5, strArray14);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.split("", '4');
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", strArray20, strArray23);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray20, "#########");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("..                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray14, strArray20);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!" + "'", str15, "!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "                                                                                                                                          " });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " + "'", str24, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "                                                                                                                                          " });
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "..                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str27, "..                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HIHIHIHIH                                  !IHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!", ' ', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih", 898, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    !ih!ih!ih!ih!ihih!ih!ih!ih!iha" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    !ih!ih!ih!ih!ihih!ih!ih!ih!iha");
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!4", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!4" + "'", str2, "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!4");
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 97, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                44444444444444444444444444444444444444444444444444444444444444444444                ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "!!                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii" + "'", str3, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii");
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ", "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             " + "'", str2, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HIHIHIHI !                                    HIHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#################################################################################################...", "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################################################..." + "'", str2, "#################################################################################################...");
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
    }

    @Test
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" ######### ######### ######### ######### ######### ########", 69, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########## ######### ######### ######### ######### ######### ########" + "'", str3, "########## ######### ######### ######### ######### ######### ########");
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ", "                                                       !                                       !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           " + "'", str2, "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ");
    }

    @Test
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "hihihihih!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", charSequence2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ", "h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HIHIHIHI!    HIHIHIHIH", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHI!    HIHIHIHIH" + "'", str2, "HIHIHIHI!    HIHIHIHIH");
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                                                                    H                          ", 0, "!IH                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                                                                    H                          " + "'", str3, "!ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                                                                    H                          ");
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444444444444444444444444444                               !4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hihihihih!ihihihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" });
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!                                                                                                 ", "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                      ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!                                                                                                 " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!ih!ih!ih!ih!ihih!ih!ih!ih!ih                ", "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str2, "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!IH                           ", "!!!                               ", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         ", "hi                                                                 !                                                                                               !                              hi                                                                 !                              ", "hihihihihihihihihih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi!hi!", "          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  ", 26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!hi!hi!" });
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!          ...", "aaaaaaaaaaaaaHi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...", "          ..." });
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                              !                                                                 ", (int) (short) 100, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              !                                                                 " + "'", str3, "                                                              !                                                                 ");
    }

    @Test
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '4', "i!hi!hi!hi!hihi!hi!hi!hi!hi!######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                      iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########                              !         !         !         ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                      iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########                              !         !         !         " });
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hih       ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "         !ih!!ihaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", 49, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH" + "'", str3, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
    }

    @Test
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           4444444", 67, "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           4444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           4444444");
    }

    @Test
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
    }

    @Test
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4", 7, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaa4aaa" + "'", str3, "aaa4aaa");
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("##################################                                                 H                                                 ###################################", "hihihih!ih", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("aaaaaaaaaaaaaHi!", "!ih                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaH" + "'", str2, "aaaaaaaaaaaaaH");
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...                                          ", "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                          " + "'", str3, "...                                          ");
    }

    @Test
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!HI!H!!IH", "hihihihihihihihihih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("#######          #######", " HI HI HI HIHI HI HI HI HI                                                                                                                                                                           ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hi!h", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h" + "'", str2, "hi!hi!hi!h");
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444444444444444444                             HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444", "HI" });
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!h" + "'", str1, "Hi!hi!hi!h");
    }

    @Test
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       ", "HIHIHIHIH!", 97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!", 0, 874);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "         " });
    }

    @Test
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", (int) '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   " + "'", str3, "4444                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                         " + "'", str2, "                                                                                                                                         ");
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !       ", 263, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("         H", "IHIH                         ", "4!                                                               4");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...4444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...", 97, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                    ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hI!                                                                                                 ", "hI!                                                                                                 ", "                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                             !                                                      ", "                                !!h!h!h!h!hh!h!h!h!h!                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI!Hi!                                                                   ", 874, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!Hi!                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "hI!Hi!                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!!hi!hi!", "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!hi!hi!" + "'", str2, "!!hi!hi!");
    }

    @Test
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   HI!Hi!                                                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!Hi!" });
    }

    @Test
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                !                   ", (java.lang.CharSequence) "                       !IH                        ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaahih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!Ihi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH", 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                       HIHIHIHIH!                                                                                                                                                        ", (java.lang.CharSequence) "!h                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                             hi!          ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                  !", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                         !ih!ih!ih!ih!ihih!ih!ih!ih!ih  ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "  HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                           ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 137 + "'", int12 == 137);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ", "4hi", "                                !                                                          aa", 95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      " + "'", str4, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ");
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                " + "'", str1, "!                                ");
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!         ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      HI!h      HI!h!!!!!!!...", 90, "aaaaaaaaaaaaaaaaaaa                                    !                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaa                                    !          HI!h      HI!h!!!!!!!..." + "'", str3, "aaaaaaaaaaaaaaaaaaa                                    !          HI!h      HI!h!!!!!!!...");
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", (int) (byte) 100);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                       HIHIHIHI!                                  HIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH                                  !IHIHIHIH                       " + "'", str1, "HIHIHIHIH                                  !IHIHIHIH                       ");
    }

    @Test
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaHi!", "IH                              !                                                                                               !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaHi!" + "'", str2, "aaaaaaaaaaaaaHi!");
    }

    @Test
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                             ", "                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             " + "'", str2, "                                             ");
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("  HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                           ", "", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 104 + "'", int3 == 104);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HIHIHIHIH                                  !IHIHIHIH", "hihihihih!ihihihih", 66, 136);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIHIHIHIH                                  !IHIHIHIHhihihihih!ihihihih" + "'", str4, "HIHIHIHIH                                  !IHIHIHIHhihihihih!ihihihih");
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HI!HI!HI!HIHI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi");
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HI! 44444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "         !!hi!hi!                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         !!hi!hi!                " + "'", str1, "         !!hi!hi!                ");
    }

    @Test
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                       !!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "!                                                                hihihihih", 223, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 223 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 28 + "'", int3 == 28);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI !" + "'", str5, "HI !");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HIa!" + "'", str7, "HIa!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "HI", "!" });
    }

    @Test
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                            ...", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444444444444444444444444444444                           ", strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                " + "'", str5, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "" });
    }

    @Test
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                 !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                    ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                    " + "'", str2, "                                 !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                    ");
    }

    @Test
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIh!ih!ih!ih!ih!ihih!i!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIh!ih!ih!ih!ih!ihih!i!..." + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIh!ih!ih!ih!ih!ihih!i!...");
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                ", 30, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 " + "'", str3, "                                 ");
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("   HI!Hi!                                                                                        ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!Hi!                                                                                        " + "'", str2, "   HI!Hi!                                                                                        ");
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                             hi!          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH", ' ');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "4444444444444444444444444444                               !4444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 88 + "'", int1 == 88);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!h", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("...HIHIH!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!ih!ih!ihih!i!!h!ih!ih!ih", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str2, "!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  " + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ");
    }

    @Test
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hihihi!                                  hihihihih", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hihihi!                                  hihihihih" });
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!ih!ih!ih!ih!ihih!ih!ih!ih!ih                ", "", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 45 + "'", int3 == 45);
    }

    @Test
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "!ih!!ihaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str2, "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                             H", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             H" + "'", str2, "                             H");
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!IH                           ", 'a', 223);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...hihih", '#', 164);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("Hi", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "");
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!", strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi" + "'", str8, "Hi");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                                                         !ih!ih!ih!ih!ihih!ih!ih!ih!ih  ", "!!HI!HI!H", 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             !!HI!HI!Hh!ih!ih!ih!ihih!ih!ih!ih!ih  " + "'", str3, "                             !!HI!HI!Hh!ih!ih!ih!ihih!ih!ih!ih!ih  ");
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("! h                             ", "aI4#########aHaIHaIH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", 95);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                                !                                                                hihihihi");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "..", 19);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("########################!         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################!         " + "'", str3, "########################!         ");
    }

    @Test
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                       HIHIHIHI!                                  HIHIHIHIH");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("###############################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################" + "'", str2, "###############################");
    }

    @Test
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaa                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaa" + "'", str1, "aaaaa");
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "         !ih!!ihaaa         ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               " + "'", str1, "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               ");
    }

    @Test
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hIH                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hIH                        ..." + "'", str1, "hIH                        ...");
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("             !", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "             !" });
    }

    @Test
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaa!HI", "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             HI!" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
    }

    @Test
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("...4444444444444444444444444444444444444444444444", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444444444444444444444444444444444444444444" + "'", str2, "...4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                    ", "                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("h!!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!!HI!HI" + "'", str1, "h!!HI!HI");
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                              ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              " + "'", str2, "                                                                                              ");
    }

    @Test
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ih!ih!ih!ih!ihih!ih!ih!ih!ih", 164, 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                           hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihihihihihihihihihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                          HIhi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          HIhi!hi!" + "'", str2, "                                                          HIhi!hi!");
    }

    @Test
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      ", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      " + "'", str2, "HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      ");
    }

    @Test
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "h!ih!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                  444444444444444444444444", (java.lang.CharSequence) "     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "!                                  ", 29);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str4, "hihihihihihihihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI! 44444444444444444444444444444444444444444444444444444444444444444444", "                                                 H                          ", 898);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!", "44444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hI HI HI HI HIHI HI HI HI HI                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI HI HI HI HIHI HI HI HI HI                                                                                                                                                                           " + "'", str1, "hI HI HI HI HIHI HI HI HI HI                                                                                                                                                                           ");
    }

    @Test
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!!hi!", '4');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hihihi!                      ...", (int) (short) 0, (int) (byte) 0);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        boolean boolean15 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                ", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                  444444444444444444444444", strArray3, strArray14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!!hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                  444444444444444444444444" + "'", str16, "                                                                  444444444444444444444444");
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("...HIHIH", "                       !!HI!HI!H", 23);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "..." + "'", str5, "...");
    }

    @Test
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("##########################################################################################################################################################################################################################################################", "                                                      ", "HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################################################################################################################################################" + "'", str3, "##########################################################################################################################################################################################################################################################");
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!         !         !", "hi!hi!hi!hi!hihi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!         !         " + "'", str2, "!         !         ");
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str1, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!ih!!ih", "HI!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "                                                                                                                                   ", 5);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "", "", "", "                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "", "", "", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" });
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                                 !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                 ", (java.lang.CharSequence) "hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Hi!hi!hi!h", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!h" + "'", str2, "Hi!hi!hi!h");
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("i", "                                 HIHIHIHI!                                  HIHIHIHIH                  ", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                              IH                              !                                                                                            IH                              !                              ", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              IH                              !                                                                                            IH                              !                              " + "'", str2, "                                                              IH                              !                                                                                            IH                              !                              ");
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaa                        ...", "                                                                  444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa                        ..." + "'", str2, "aaaaa                        ...");
    }

    @Test
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", "hi!                                                                                                                              !", 350);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HIHiiiiiiiiiiiiiiiiiiiiiiiiiiii", "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIH" + "'", str2, "HIH");
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 'a', 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hihihi!                  ...", 314, 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihi!                  ..." + "'", str3, "hihihi!                  ...");
    }

    @Test
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                                                 ...HIHIH!H", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "!IH                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH                                                                                    " + "'", str2, "!IH                                                                                    ");
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("i", "hI!                                                                                                 ", 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "                             hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHIHI!                                  HIHIHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaH", 0, 104);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaH" + "'", str3, "aaaaaaaaH");
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str4, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        a", "HIhi!hi!#########################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " + "'", str4, "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
    }

    @Test
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                             !ih!ih!ih!ih!ihih!ih!ih!ih!ih                              ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       .4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       .4444444444444444444444444444444444444444444444" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       .4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!                              i                              i                              i                              i                              !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!         !         !         !         !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hI!Hi!                                                                                       ", "!IH                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!Hi!                                                                                       " + "'", str2, "hI!Hi!                                                                                       ");
    }

    @Test
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                                                                                                              !                                  ", "                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!                                                                                                                              !                                  " });
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("", '4');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "#########");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                                                          " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        " + "'", str8, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "                                                                                                                                          " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                          " + "'", str12, "                                                                                                                                          ");
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ", " h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      " + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ");
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "...HI!HIHI!HI!HI!HI!HI!                       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                              IH                              !                                                                                               !                                      ", "#################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!                                                                hihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH", "HI!Hi!                                                                                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih" + "'", str2, "h!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih!iH                                                                                         !iH!IH   !ih!ih");
    }

    @Test
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  44444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!" });
    }

    @Test
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi");
    }

    @Test
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !H", "                                                 H                                                 ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444!                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!hi!hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!" + "'", str2, "hi!hi!hi!");
    }

    @Test
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 137);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!                                                                                                 ", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                           ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny(" h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                             4!                                                               4", "      HI!h      HI!h!!!!!!!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hihihihihihihihihihihi", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          " + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
    }

    @Test
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                       !!hi!hi!h", "                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("       ...                                                                                      ", "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIhi!hi!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IHIHIHIHI", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" + "'", str2, "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("!!HI!HI!H", "HI!AAAAAAA", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!HI!HI!HHI!AAAAAAA!!HI!HI!HHI!AAAAAAA!!HI!HI!HHI!AAAAAAA!!HI!HI!HHI!AAAAAAA!!HI!HI!H" + "'", str3, "!!HI!HI!HHI!AAAAAAA!!HI!HI!HHI!AAAAAAA!!HI!HI!HHI!AAAAAAA!!HI!HI!HHI!AAAAAAA!!HI!HI!H");
    }

    @Test
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HIHIHIHIH                                  !IHIHIHIH                       ", "                                                                                                                                                                                                                                                      !         !         !         !         !                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aI4#########aHaIHaIH", "!IH!IH!!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                                      !", 263);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                !                 ", "                       !!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                 " + "'", str2, "                                !                 ");
    }

    @Test
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                       !!hi!hi!h", "                       !!HI!HI!H", 93);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                       !!hi!hi!h" });
    }

    @Test
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
        java.lang.String[] strArray5 = new java.lang.String[] { "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!                                  ", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!                                !                                !                                !                                !" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hih                                                                                             ", '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!                                  ", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!                                !                                !                                !                                !" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hih                                                                                             " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hih" });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hihihi                                                                     ", (java.lang.CharSequence) "i!hi!hi!h!!i!hihi!hi!hi!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hihihi                                                                     " + "'", charSequence2, "hihihi                                                                     ");
    }

    @Test
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", (int) (byte) -1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" + "'", str4, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hih                                                                                            ", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                !IH!IH!IH!IH!IHIH!IH!IH!IH!IH" + "'", str1, "                !IH!IH!IH!IH!IHIH!IH!IH!IH!IH");
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", "HIH#############################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIH#############################################################################################" + "'", str2, "HIH#############################################################################################");
    }

    @Test
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h!!ih!ih!ih!ih!ihih!ih!ih!ih!ih!", "aaaa...                                                                                  ...aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "!IH                            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aahi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ", "Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aa", "                                                          " });
    }

    @Test
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIh!ih!ih!ih!ih!ihih!i!...", "       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                       !!HI!HI!H                                            !!HI!HI!H               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!Ih" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444!Ih");
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HIhi!hi!#########################HIhi!hi!#########################HIhi!hi!#########################", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HIhi!hi!#########################HIhi!hi!#########################HIhi!hi!#########################" });
    }

    @Test
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaa                                    !                               ", "!!!!!!!!!iih!ih!i!!!!!!!!!!!!!!!!", 34);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaa                                    ", "                               " });
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("Hi!hi!hi!h", 2, 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!h" + "'", str3, "!hi!hi!h");
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAAAAAAAAAAAAAAAAAAAAAA", "!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                        .." + "'", str1, "                                                                        ..");
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#############################################################################################################################################################################################################################!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!#############################################################################################################################################################################################################################", " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 136);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################################################################################################################################################################################################!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!#############################################################################################################################################################################################################################" });
    }

    @Test
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h" + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "...               !...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("...HIHIH!", "                                                                                                                                                           hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HIHIH" + "'", str2, "...HIHIH");
    }

    @Test
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "! h                   ...", "                                !!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaa                                                       !                                       !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAA####################################hhh####################################AAAAAAA", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!         !         !         !         !                                                       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 96 + "'", int1 == 96);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                  ! ", "                                                                        ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                                                                                  ! " });
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!IH                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H", 247, 29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                             hih", 307, "                                                           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                      hih                                                                                                          " + "'", str3, "                                                                                                                                                                                                      hih                                                                                                          ");
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("####################################HHH####################################", 307);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################HHH####################################" + "'", str2, "####################################HHH####################################");
    }

    @Test
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi" + "'", str1, "ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hihihihih!", 14, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihih!aaaa" + "'", str3, "hihihihih!aaaa");
    }

    @Test
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                     !4!4!4!4!HH   !4!4!4!4!4                            ", "#################################################################################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     !4!4!4!4!HH   !4!4!4!4!4                            " + "'", str2, "                     !4!4!4!4!HH   !4!4!4!4!4                            ");
    }

    @Test
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...               !...", "44!44!HI !", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "         !ih!!ihaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   " });
    }

    @Test
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "...                                                                                  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                          Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                                                                            ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                          Hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                                                                                            " });
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!", "hi!hihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihihhihihihi!                                  hihihihih      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4!                                                               4H!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4!                                                               4H!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH" + "'", str1, "4!                                                               4H!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...!hi!   ", 39, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!ih                                                                                                                                                                                                                                                                                                                ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hihih...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("", "iiiiih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih", 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ", "HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                       !IH                        ...", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... ", "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
        java.lang.String[] strArray3 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", strArray3, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                                                                                   ", "", (int) (byte) 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", strArray7, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(" ######### ######### ######### ######### ######### ########", strArray7);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                                                              !                                  " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str8, "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!                                                                                                   " });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     " + "'", str13, "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "!" });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   !ih!ih!ih!ih!ih!ihih!ih!ih!ih!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIhi!hi!#########################", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 20 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   ", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ihih", "!", "ih", "!", "ih", "!", "ih", "!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" });
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HIHIHIHI!    HIHIHIHIH", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHI!    HIHIHIHIH" + "'", str2, "HIHIHIHI!    HIHIHIHIH");
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                44444444444444444444444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                44444444444444444444444444444444444444444444444444444444444444444444                " + "'", str1, "                44444444444444444444444444444444444444444444444444444444444444444444                ");
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 !Ih", "                                                                   ", 95);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "                              !Ih" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", "hih                                                                                             ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !" });
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                             ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!         ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "########################################hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

