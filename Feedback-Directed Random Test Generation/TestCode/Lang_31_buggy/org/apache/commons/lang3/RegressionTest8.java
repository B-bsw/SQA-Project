package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test04001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!", 164, "hihihihihihihihihih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!" + "'", str3, "Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!");
    }

    @Test
    public void test04002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                             hi!", (int) ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             hi!" + "'", str3, "                             hi!");
    }

    @Test
    public void test04003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04003");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                              !                                                                 IH                              !                                                                                               !                                                                 IH", "                                                           !                                        ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!!hi!hi!", strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                              !                                                                 IH                              !                                    ", "                         IH" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 25 + "'", int5 == 25);
    }

    @Test
    public void test04004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04004");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hihihihih!", "HHH", 131);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hihihihih!" });
    }

    @Test
    public void test04005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04005");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04006");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        java.lang.String[] strArray5 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", strArray2, strArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "hihihi                                                                     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hihihihihihihihihihihi" + "'", str8, "hihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!hihihi                                                                     " + "'", str11, "!hihihi                                                                     ");
    }

    @Test
    public void test04007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                              !                                  ", "IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!!hi!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaH", "!ih!!ihaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test04010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04010");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("          ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04011");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "! h                             ", "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("   HI!Hi!                                                                                         ", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HI!Hi!                                                                                        " + "'", str2, "   HI!Hi!                                                                                        ");
    }

    @Test
    public void test04013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04013");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("      ", "                        !!h!h!h!h!hh!h!h!h!h!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04014");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", (java.lang.CharSequence) "hihihihih!                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test04015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04015");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#########", "!                                !                                !                                !                                !                             ...", 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "!!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" + "'", str2, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
    }

    @Test
    public void test04017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444444444444444444444444444h", 23, "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444h" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444h");
    }

    @Test
    public void test04018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hihihihih!ihihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihih!ihihihih" + "'", str1, "hihihihih!ihihihih");
    }

    @Test
    public void test04019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HH        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HH" + "'", str1, "HH");
    }

    @Test
    public void test04020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04020");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", 289);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h" });
    }

    @Test
    public void test04021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04021");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih", "", 897);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih" });
    }

    @Test
    public void test04022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04022");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!ih!ih!ih!ih!ihih!ih!ih!ih!ih", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                  !", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  !" + "'", str2, "                                  !");
    }

    @Test
    public void test04024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI! 44444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 100, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI! 44444444444444444444444444444444444444444444444444444444444444444444                            " + "'", str3, "HI! 44444444444444444444444444444444444444444444444444444444444444444444                            ");
    }

    @Test
    public void test04025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH" + "'", str1, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
    }

    @Test
    public void test04026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04026");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "hiihiihiihiihihiihiihiihiihii");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                     HI!", strArray4, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 63 vs 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str6, "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "                                                                                                                                        ", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ihih", "!", "ih", "!", "ih", "!", "ih", "!", "ih" });
    }

    @Test
    public void test04027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04027");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "hi", "!", "hi", "!", "h", "!!", "i", "!", "hihi", "!", "hi", "!", "hi", "!", "hi", "!", "hi", "!", "hi", "!", "hhi", "                                                          " });
    }

    @Test
    public void test04028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 131);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("     !!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     !!" + "'", str2, "     !!");
    }

    @Test
    public void test04030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ", 90, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              " + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
    }

    @Test
    public void test04031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHHIHHIHHIHHIHIHHIHHIHHIHHIH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "HIHHIHHIHHIHHIHIHHIHHIHHIHHIH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04032");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace(" #########", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "####################################HHH####################################", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " #########" + "'", str4, " #########");
    }

    @Test
    public void test04033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("     ", "hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test04034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04034");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hihihi!                      ...", "####################################################", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04035");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HH   ", "HH        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04037");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!!h!h!h!h!hh!h!h!h!h!", "!                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04038");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ", "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi!!hi!", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!hi!" + "'", str2, "hi!!hi!");
    }

    @Test
    public void test04040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04041");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hI!                                                                                                 ", (java.lang.CharSequence) "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04042");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hihihihi!                                  hihihihih", (java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test04043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", "!IH                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
    }

    @Test
    public void test04044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                             ", "         !ih!!ihaaa         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4!                                                               4", "aaaaa                        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa                        ..." + "'", str2, "aaaaa                        ...");
    }

    @Test
    public void test04047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04047");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" IH IH IH IH IH IHIH I  H IH IH IH", "!ih!ih!ihih!i!!h!ih!ih!ih", 289);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " IH IH IH IH IH IHIH I  H IH IH IH" });
    }

    @Test
    public void test04048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04048");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                             hi", strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04050");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444#########4444444", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444#########4444444" + "'", str3, "444444#########4444444");
    }

    @Test
    public void test04051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04051");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hihihihihihihihihih", (java.lang.CharSequence) "   HHH   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hihihihihihihihihih" + "'", charSequence2, "hihihihihihihihihih");
    }

    @Test
    public void test04052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04053");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!                                  ", (java.lang.CharSequence) "                                !                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04054");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaa####################################HHH####################################aaaaaaa", "!                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04055");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        java.lang.String[] strArray6 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", strArray3, strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi! ", strArray3, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI", "!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hihihihihihihihihihihi" + "'", str9, "hihihihihihihihihihihi");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                                                              !                                  " });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "!" });
    }

    @Test
    public void test04056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##" + "'", str1, "##");
    }

    @Test
    public void test04057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HIHIHIHI!                                  HIHIHIHIH", "hihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHI!                                  HIHIHIHIH" + "'", str2, "HIHIHIHI!                                  HIHIHIHIH");
    }

    @Test
    public void test04058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04059");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!hi!hi!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!ih                        ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04061");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H                                 ", '4', 136);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04062");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("4444444444444444444444444444                               !4444444444444444444444444444", "                                                                                                                                       Hi!hi!hi!                                                                                                                                        ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04063");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!ih!!ihaaa", "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                             ", "########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             " + "'", str2, "                                             ");
    }

    @Test
    public void test04065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04065");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!#ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!                                                                                                   ", "                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                                                                                   " + "'", str2, "!                                                                                                   ");
    }

    @Test
    public void test04067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04067");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hihihihihihihihihihihi", "         !ih!!ihaaa", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "hI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                !                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                !                 " + "'", str1, "                                !                 ");
    }

    @Test
    public void test04071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04071");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  44444444444444444444444444444" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  44444444444444444444444444444");
    }

    @Test
    public void test04072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!IH                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04073");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("! h                             ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', (int) (byte) -1, 96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", " ", "h", "                             " });
    }

    @Test
    public void test04074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test04075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04075");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 31, 158);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!" + "'", str5, "!");
    }

    @Test
    public void test04076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!         !         !         !         !         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   " + "'", str2, "                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
    }

    @Test
    public void test04079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04079");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                ...");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("hihihi                                                                     ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                ", "..." });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test04080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04080");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hihi!hi!hi!hi!hi!!hhihihihih", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04081");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                        ", "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test04082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04082");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#########", 3, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########" + "'", str3, "#########");
    }

    @Test
    public void test04083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04083");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                 ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence3, charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                              ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!h", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test04084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!!HI!HI!H", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!HI!HI!H" });
    }

    @Test
    public void test04085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04085");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HH   ", "hihihi                                                                     ", 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04086");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 28, "!4!4!4!4!HH   !4!4!4!4!4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04087");
        char[] charArray6 = new char[] { '#', '4', ' ', 'a' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", charArray6);
        java.lang.Class<?> wildcardClass9 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '#', '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test04088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ", 6, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         " + "'", str3, "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ");
    }

    @Test
    public void test04089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04089");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   HI!Hi!                                                                                        ", "hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "   HI", "H", "                                                                                        " });
    }

    @Test
    public void test04090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04090");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             !44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str2, "                                             !44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
    }

    @Test
    public void test04092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", 99, "!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              !                                                                HI!h                              !                                                                                               !                                                                 ih" + "'", str3, "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test04093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!IH                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "hiihiihiihiihihiihiihiihiihii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!HI!h!!ih", "HIhi!hi!#########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!h!!ih" + "'", str2, "!HI!h!!ih");
    }

    @Test
    public void test04096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                                                                                     HI!", "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              " + "'", str3, "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test04098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 59, " #########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ######### ######### ######### ######### ######### ########" + "'", str3, " ######### ######### ######### ######### ######### ########");
    }

    @Test
    public void test04099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ", (int) (byte) 0, 250);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         " + "'", str3, "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ");
    }

    @Test
    public void test04100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04100");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("i");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04101");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                           ", "                 HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04102");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                  !", "hihihihih!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04103");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("", "                                !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04105");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !", "                                                           ", "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04106");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "HI!", 898);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hih                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hih" + "'", str1, "hih");
    }

    @Test
    public void test04108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih!ih!ih!ih!ihih!ih!ih!ih!ih", "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str2, "ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test04109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "H                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!HH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test04111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04111");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04112");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "aaaaa                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" });
    }

    @Test
    public void test04113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("   HI!Hi!                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!Hi!" + "'", str1, "HI!Hi!");
    }

    @Test
    public void test04114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04114");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!                                                                                                                              !", "##", 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                           HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test04116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04116");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!h", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!h" });
    }

    @Test
    public void test04117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04117");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!4", "                       !!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04118");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "hi!!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("      ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
    }

    @Test
    public void test04120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444                               !4444444444444444444444444444", 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444                               !4444444444444444444444444444" + "'", str2, "4444444444444444444444444444                               !4444444444444444444444444444");
    }

    @Test
    public void test04121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!                                                                                                 ", "44444444444444444444444444444444444444444444444444444444444444444444                           ", 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                                 " + "'", str3, "HI!                                                                                                 ");
    }

    @Test
    public void test04122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hihihihihihihihihih", "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!I444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", "                                                           4", "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  " + "'", str3, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
    }

    @Test
    public void test04126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04127");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("      HI!h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04128");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04129");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "!ih!ih!ihih!i!!h!ih!ih!ih", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04130");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444444444444444444444444444444444444444                             HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             H" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444                             H");
    }

    @Test
    public void test04131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04131");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!                                  ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...                                                                                  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                                                                  ..." + "'", str1, "...                                                                                  ...");
    }

    @Test
    public void test04133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04133");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04134");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                             4!                                                               4", "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                     ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     " + "'", str2, "                     ");
    }

    @Test
    public void test04136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...HIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", 280, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                   hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH..." + "'", str3, "...                                                   hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH...");
    }

    @Test
    public void test04138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04138");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!", (java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test04139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "   HI!Hi!                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04140");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       ..", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "       .." });
    }

    @Test
    public void test04141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04141");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04142");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!                                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "                                  " });
    }

    @Test
    public void test04143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04143");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!hihihi                                                                     ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04144");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!!hi!", "!IH                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                !                 ", "AAA                        AAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###############################################################!!!!!###############################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################!!!!!###############################################################" + "'", str1, "###############################################################!!!!!###############################################################");
    }

    @Test
    public void test04148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa!HI" + "'", str2, "aaaa!HI");
    }

    @Test
    public void test04149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04149");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             hi!", (java.lang.CharSequence) "hihihihi!                                  hihihihih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04150");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                 ", "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih", 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04151");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!                                                                                                 ", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                           ", strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test04152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih", "hihI!Hi!                                                                                       hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04153");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             " + "'", str1, "                                             ");
    }

    @Test
    public void test04154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04154");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ih!ih!ihih!ih!ih!ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih!ih!ih!ih!ihih!ih!ih!ih!ih" });
    }

    @Test
    public void test04155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04155");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ", "!         !         !         !         !                                                       ", "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           " + "'", str3, "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ");
    }

    @Test
    public void test04156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "hi!hi!hi!h!!i!hihi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!i!hihi!hi!hi" + "'", str2, "!!i!hihi!hi!hi");
    }

    @Test
    public void test04157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                               ", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               " + "'", str3, "                                                               ");
    }

    @Test
    public void test04158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04158");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                            !!HI!HI!                                            ", "   ", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04159");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...hihih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...hihih" });
    }

    @Test
    public void test04160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04160");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!!IH!IH!IHIH!I!!H!IH!IH!IH", "...HIHIH!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04161");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi                                                                 !                                                                                               !                              hi                                                                 !                              ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                             hih", "HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             hih" + "'", str2, "                                                                                             hih");
    }

    @Test
    public void test04163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04163");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!ih!ih!ihih!ih!ih!ih!ih", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaHi", "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaHi" + "'", str2, "aaaaaaaaHi");
    }

    @Test
    public void test04165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04165");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih                        ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                !                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04167");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04168");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444                             hi!", "4 4 4 4 HH 4 4 4 4 4", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!                                                                                                                              !", "                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                                                              !" + "'", str2, "hi!                                                                                                                              !");
    }

    @Test
    public void test04170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04170");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hihihihih                                  !ihihihih", 35);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test04171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04172");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04173");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihih" + "'", str2, "hihihih");
    }

    @Test
    public void test04175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ", 97, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     " + "'", str3, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ");
    }

    @Test
    public void test04176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                            !!hi!hi!                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            !!hi!hi!                                           " + "'", str1, "                                            !!hi!hi!                                           ");
    }

    @Test
    public void test04177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########" + "'", str1, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
    }

    @Test
    public void test04178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         !", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       !" + "'", str2, "       !");
    }

    @Test
    public void test04179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04179");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", "aaaa!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04180");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04181");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04182");
        java.lang.String[] strArray3 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", strArray3, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                                                                                   ", "", (int) (byte) 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", strArray7, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("H", strArray7);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                                                              !                                  " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str8, "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!                                                                                                   " });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     " + "'", str13, "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04183");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!                               ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 30");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                               " });
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test04184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                   ", 34, "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                   " + "'", str3, "                                                                                                                                   ");
    }

    @Test
    public void test04185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04185");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hihihi!                      ...", "Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hihihi!                      ..." });
    }

    @Test
    public void test04186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              " + "'", str2, "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test04187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04187");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                          ", "                                            !!HI!HI!                                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                          " + "'", str2, "                                                                                                                                          ");
    }

    @Test
    public void test04188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "..                             ", (java.lang.CharSequence) "hiHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04189");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                              ! ", "4!                                                               4", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                  ", 90, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                  444444444444444444444444" + "'", str3, "                                                                  444444444444444444444444");
    }

    @Test
    public void test04192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04192");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                              !                                                                 IH                              !                                                                                               !                                                                 IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04193");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HIHIHIHIH!", 136, 168);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", "!", "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ", "HI!44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04196");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!IH                        ...", "!hihihihih", "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hIH                        ..." + "'", str3, "hIH                        ...");
    }

    @Test
    public void test04197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04197");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("################################################H################################################", "!!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                  Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                  hi" + "'", str1, "                                                                  hi");
    }

    @Test
    public void test04199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04199");
        char[] charArray5 = new char[] { ' ', '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                              !                                                                 ih                              !                                                                                               !                                                                 ih", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAAAAA####################################hhh####################################AAAAAAA", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test04200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!         !         !         !         !                                                       ", "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ", "                                                                                              ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04201");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH", "hihihihihihihihihihi", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  44444444444444444444444444444", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH" + "'", str4, "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH");
    }

    @Test
    public void test04202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04202");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04203");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hihihih!ih", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!                                                 ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                 " + "'", str2, "hi!                                                 ");
    }

    @Test
    public void test04205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 97, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04206");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", "!                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04207");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hihihihih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hihihihih" + "'", str1, "!hihihihih");
    }

    @Test
    public void test04208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!44444444444444444444444444444444444444444444444444444444444444444444", 96, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444444444444444444444444444444" + "'", str3, "...4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04209");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                           ...", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", 131);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                           ..." });
    }

    @Test
    public void test04210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04211");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("H                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "H" });
    }

    @Test
    public void test04212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04212");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "             !                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04213");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04214");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("         !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test04216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                           4", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04217");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!hi!hi!h!!i!hihi!hi!hi", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04218");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hihihihih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04219");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "          !ih                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04220");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                !                                 ", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaaaaHi");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04221");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!ih!ih!!ih!!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!!ih!!ih!ih" + "'", str1, "!ih!ih!!ih!!ih!ih");
    }

    @Test
    public void test04222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04222");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                ", "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", "aaaaaaaaHi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                " + "'", str3, "                                ");
    }

    @Test
    public void test04224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04224");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hihihihih!                                                                                          ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihih!                                                                                          " + "'", str3, "hihihihih!                                                                                          ");
    }

    @Test
    public void test04225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI", "   HI!Hi!                                                                                         ", "   !ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI" + "'", str3, "HI");
    }

    @Test
    public void test04226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str2, "!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test04227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                          ", 898);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test04228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hiihiihiihiihihiihiihiihiihii", "                           ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...HIHIH", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HIHIH" + "'", str2, "...HIHIH");
    }

    @Test
    public void test04230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "hH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", 916, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          " + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
    }

    @Test
    public void test04232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04232");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                !                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test04234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04234");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i" + "'", str3, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
    }

    @Test
    public void test04235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hih                                                                                             ", "Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hihihih!ih", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04237");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                          HIHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04238");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !" + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !");
    }

    @Test
    public void test04239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04239");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                !                                !                                !                                !                                ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!                                !                                !                                !                                !                                " });
    }

    @Test
    public void test04240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04240");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     !!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "     !!" });
    }

    @Test
    public void test04241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04242");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("         !ih!!ihaaa         ", "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04243");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!4         ", "         !ih!!ihaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", "hihihi!..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                " + "'", str2, "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ");
    }

    @Test
    public void test04245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04245");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04246");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!h!!i!hihi!hi!hi!", "hI!                                                                                                 ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", 73);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!" + "'", str4, "hi!hi!hi!h!!i!hihi!hi!hi!");
    }

    @Test
    public void test04247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("44444444444444444444444444444444444444444444444444444444444444444444                             HI!", "!!", "44444444444444444444444444444444444444444444444444444444444444444444                             H");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04248");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                               ", "!I4#########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "h!!HI!HI!                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test04250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04250");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!4         ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!4", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test04251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04251");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                           HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04252");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                              !                                                                 ih                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 292 + "'", int1 == 292);
    }

    @Test
    public void test04253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HH   ", "IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HH   " + "'", str2, "HH   ");
    }

    @Test
    public void test04254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444444444444444444444444444444444444                             hi!", 34, "!hihihi                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             hi!" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444                             hi!");
    }

    @Test
    public void test04255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04255");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "                             4hi", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04256");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04257");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!h", 168, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!h                                                                                                                                                                      " + "'", str3, "!h                                                                                                                                                                      ");
    }

    @Test
    public void test04258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "   HI!Hi!                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test04260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04260");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih                            ", "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!ih                        ...", 897);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                        ..." + "'", str2, "!ih                        ...");
    }

    @Test
    public void test04263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04263");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih" });
    }

    @Test
    public void test04264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 75, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              " + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ");
    }

    @Test
    public void test04265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...                                                                                  ...", 542, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                        ", "                                            !!HI!HI!                                            ", "hihihihihihihihihih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                        " + "'", str3, "                                                                        ");
    }

    @Test
    public void test04267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...                                                   hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH...", (java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04268");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...HIHIH", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test04269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str2, "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test04270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04271");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ", "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04272");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", "44444444444444444444444444444444444444444444444444444444444444444444                             H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!hi!hi!hi!hihi!hi!hi!hi!hi!", "i!hi!hi!hi!hihi!hi!hi!hi!hi!", "!ih!!ihaaa", "!ih!!ihaaa", "!" });
    }

    @Test
    public void test04273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04273");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04275");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!" + "'", str1, "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test04276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04276");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                    ", (java.lang.CharSequence) "                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test04277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04277");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                           ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04278");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaHi", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", 158);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04279");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!ih!ih!ihih!i!!h!ih!ih!ih", 168);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih" + "'", str2, "                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test04280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  " + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ");
    }

    @Test
    public void test04281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04281");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "ih!ih!ih!ih!ihih!ih!ih!ih!ih", (java.lang.CharSequence) "hi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", charSequence2, "ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test04282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04282");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!ih!ih!!ih                             !!ih                             !ih                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 95 + "'", int1 == 95);
    }

    @Test
    public void test04283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04283");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("! h                             ", "                 HIHIHIHI!                                  HIHIHIHIH                  ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 20, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "! h                             " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test04284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04284");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!         !         !         !         !         ", "       ...", 23);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04285");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("..                             ", 8, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..                             " + "'", str3, "..                             ");
    }

    @Test
    public void test04287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04287");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hI!Hi!", (java.lang.CharSequence) "                             h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test04288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04288");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!!ih                             !!ih                             !ih                    ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04289");
        java.lang.String[] strArray3 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test04290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 30, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              " + "'", str3, "                              ");
    }

    @Test
    public void test04291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04291");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!4         ", "", 289);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!4         " });
    }

    @Test
    public void test04292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04292");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!                                                                                                 ", "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04293");
        java.lang.String[] strArray2 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!ih!ih!ihih!i!!h!ih!ih!ih");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 0, 131);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!!!" + "'", str6, "!!!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str8, "!!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test04294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04294");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                !" + "'", str1, "                                                                                                !");
    }

    @Test
    public void test04295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04295");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", "hI!Hi!                                                                                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04296");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                               hihihih!ih                        hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04297");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("a", "                                !                                !                                !                                !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("             !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!             " + "'", str1, "!             ");
    }

    @Test
    public void test04299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04299");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!i                                           ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04300");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!!h!h!h!h!hh!h!h!h!h!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!!", "h", "!", "h", "!", "h", "!", "h", "!", "hh", "!", "h", "!", "h", "!", "h", "!", "h", "!" });
    }

    @Test
    public void test04301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                             hih", 67, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                             hih" + "'", str3, "                                                                                             hih");
    }

    @Test
    public void test04303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04303");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04304");
        java.lang.String[] strArray3 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", strArray3, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                                                                                   ", "", (int) (byte) 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", strArray7, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int15 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hih                                                                                            ", strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray14);
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "!" + "'", str16, "!");
    }

    @Test
    public void test04305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih" + "'", str2, " !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
    }

    @Test
    public void test04306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04306");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", strArray2, strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                                                                                   ", "", (int) (byte) 1);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", strArray6, strArray11);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                              !                                  " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str7, "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "!                                                                                                   " });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     " + "'", str12, "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "!" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test04307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                       HI!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04308");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("..                             ", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      " + "'", str2, "      ");
    }

    @Test
    public void test04310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04310");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i" + "'", str2, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
    }

    @Test
    public void test04312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i" + "'", str1, "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
    }

    @Test
    public void test04313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                  !", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         !" + "'", str2, "         !");
    }

    @Test
    public void test04314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04314");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                       ", 897, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       " + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                       ");
    }

    @Test
    public void test04315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hihihi!                      ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04316");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                    ", "                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test04317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaa", "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         ", "hihihihih!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ih      ", 5, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih      " + "'", str3, "!ih      ");
    }

    @Test
    public void test04321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04321");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("         !ih!!ihaaa         ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa" + "'", str2, "aaa");
    }

    @Test
    public void test04322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04322");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 916);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04323");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "..." });
    }

    @Test
    public void test04324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04324");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "      HI!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hihihihih                                  !ihihihih", "hi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihih                                  !ihihihih" + "'", str2, "hihihihih                                  !ihihihih");
    }

    @Test
    public void test04326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!hihihihi!                                  hihihihih", (java.lang.CharSequence) "H                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#######          #######", "                                                                                                                                       Hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######          #######" + "'", str2, "#######          #######");
    }

    @Test
    public void test04329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "aaaaaaaaaaaaaaaaaaaaaaa", "##################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04330");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                             4hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                             ", "4", "hi" });
    }

    @Test
    public void test04331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", " #########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i" });
    }

    @Test
    public void test04332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04332");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!                                !                                !                                !                                !", "h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                !                                !                                !" + "'", str2, "                                !                                !                                !                                !");
    }

    @Test
    public void test04333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("##", (int) (short) -1, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##" + "'", str3, "##");
    }

    @Test
    public void test04334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04334");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HHH", (java.lang.CharSequence) "   HHH   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih", (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 ..." + "'", str3, "                                                                                                 ...");
    }

    @Test
    public void test04336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04336");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH", "hi!hi!hi", 292);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04337");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!                                                                                                   ", "hI!                                                                                                 ", 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("!4", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!                                                                                                   " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!4" + "'", str12, "!4");
    }

    @Test
    public void test04338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ", "Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              " + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
    }

    @Test
    public void test04339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04339");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", ' ', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test04340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04340");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                  hi", "       ..", (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                  hi" });
    }

    @Test
    public void test04341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04341");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########", "                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("          ", "###############################################################!!!!!###############################################################", "                             4hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04343");
        char[] charArray12 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             hi!", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hihihihih                                  !ihihihih", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                                                                HI!h                              !                                                                                               !                                                                 ih", charArray12);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray12);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444     444444444444444", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test04344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04344");
        char[] charArray13 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             hi!", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray13);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hihihihih                                  !ihihihih", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                                                                HI!h                              !                                                                                               !                                                                 ih", charArray13);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaH", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############################", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test04345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04345");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "#############################hi", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("! h                             ", "hihihihi!                                  hihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444#########4444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444#########4444444" + "'", str1, "444444#########4444444");
    }

    @Test
    public void test04349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                            !!hi!hi!                                           ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04350");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("         !", "h!ih!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04351");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!                                                                                                ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 898);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HHHHHHHHHHHHHHHHHHHHHH", "                             4hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test04354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04354");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!#ih", "H                               ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                 H                                                 ", "                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 H                          " + "'", str2, "                                                 H                          ");
    }

    @Test
    public void test04356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!HI!H!!IH", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!H!!IH                                                                                        " + "'", str2, "!HI!H!!IH                                                                                        ");
    }

    @Test
    public void test04357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04358");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!hi!hi!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!" + "'", str3, "Hi!hi!hi!");
    }

    @Test
    public void test04359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04359");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("####################################HHH####################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################HHH####################################" + "'", str1, "####################################HHH####################################");
    }

    @Test
    public void test04360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                       HI!HI!HI!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih!!ihaaa", "                                            !!hi!hi!                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!!ihaaa" + "'", str2, "!ih!!ihaaa");
    }

    @Test
    public void test04362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04362");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "         !", (java.lang.CharSequence) "HI!44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str2, "!ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test04364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                 H                          ", "hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 H                          " + "'", str2, "                                                 H                          ");
    }

    @Test
    public void test04365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4hi" + "'", str2, "4hi");
    }

    @Test
    public void test04366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih" + "'", str2, "hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test04367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04367");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test04368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ", "                             h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04369");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 6, 131);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test04372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04372");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                !!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                ", "hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04374");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!", 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!Hi!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ", "hihihih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h" + "'", str3, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
    }

    @Test
    public void test04378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04378");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaahih                                                                                             ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH", "                                !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH" + "'", str2, "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH");
    }

    @Test
    public void test04381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         !", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "! h                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         h" + "'", str3, "         h");
    }

    @Test
    public void test04382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  " + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
    }

    @Test
    public void test04383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04383");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04384");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04385");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!!hi!hi!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04387");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!                                                                                                   ", "       ..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
    }

    @Test
    public void test04388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!IH!IH!!IH                             !!IH                             !IH                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "aaaaaaaaHi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04390");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "hi!                                                 ", "hi!                                                                                             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04391");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!IH                            ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!IH" });
    }

    @Test
    public void test04392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04392");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04393");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HH        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04394");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", "                                                 Hi                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04395");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04396");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test04397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!!h!h!h!h!hh!h!h!h!h!", "H                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                               " + "'", str2, "H                               ");
    }

    @Test
    public void test04398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04398");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!4!4!4!4!HH   !4!4!4!4!4", "                                !", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04399");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4 4 4 4 HH 4 4 4 4 4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04400");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", "!4         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test04401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04401");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                  !", "Hi", 66);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                  !" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04402");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hH", "hihihihihihihihihihihi", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04403");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", '4', 542);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04404");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                44444444444444444444444444444444444444444444444444444444444444444444                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                              !                                                                 ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                              !                                                                 " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              !                                                                 " + "'", str3, "                              !                                                                 ");
    }

    @Test
    public void test04406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("...HIHIH", "                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HIHIH" + "'", str2, "...HIHIH");
    }

    @Test
    public void test04408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04408");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih", "!ih!ih!ih!ih!ihih!ih!ih!ih!ih", 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04409");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!!IH!IH!IHIH!I!!H!IH!IH!IH", "!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test04410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04410");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("! h                             ", "   HI!Hi!                                                                                         ", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!4!4!4!4!HH   !4!4!4!4!4", 63, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width with offset is 7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("444444#########4444444", "   HI!Hi!                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04413");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", 88, 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04415");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                       hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!H" + "'", str1, "hi!H");
    }

    @Test
    public void test04416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04416");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 96 + "'", int2 == 96);
    }

    @Test
    public void test04417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04417");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ", "                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       HI!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test04419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04419");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!h                                                                                                                                                                      ", "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!h                                                                                                                                                                      " + "'", str2, "!h                                                                                                                                                                      ");
    }

    @Test
    public void test04420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04420");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hiHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04421");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04422");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HH   ", (java.lang.CharSequence) "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test04423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04423");
        java.lang.String[] strArray2 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "hi!!hi!");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!!hi!" + "'", str7, "hi!!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test04424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih", "!h                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih" + "'", str2, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
    }

    @Test
    public void test04425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04425");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                !", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                    ", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test04427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04427");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI! 44444444444444444444444444444444444444444444444444444444444444444444                            ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih!ih!!ih                             !!ih                             !ih                    ", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!!ih                             !!ih                             !ih                    " + "'", str2, "!ih!ih!!ih                             !!ih                             !ih                    ");
    }

    @Test
    public void test04429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04429");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!", "hi!                                                                                             ", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04430");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HH   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test04431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                !                                !                                !                                !                                ", "HI!Hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "                                ", "                                ", "                                ", "                                ", "                                " });
    }

    @Test
    public void test04432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04432");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 ", "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04433");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!" + "'", str1, "Hi!hi!hi!");
    }

    @Test
    public void test04435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04435");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "HIhi!hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi!!hi!", "", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!" + "'", str3, "hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!");
    }

    @Test
    public void test04437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04437");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                ", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test04439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04439");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04440");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", 'a', 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04441");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "aaaaaaaaH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" });
    }

    @Test
    public void test04442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04442");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!                                !                                !                                !                                !");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hihihih!ih", 34, 916);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "!", "!", "!", "!" });
    }

    @Test
    public void test04443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                           !                                        ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04444");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!4!4!4!4!HH   !4!4!4!4!4", "                               hihihih!ih                        hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                       hi!H", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4", "4", "4", "4", "HH", "4", "4", "4", "4", "4" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi" });
    }

    @Test
    public void test04445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ", "                                  !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           " + "'", str2, "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ");
    }

    @Test
    public void test04446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04446");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       HI!h");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04447");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HIHIHIHIH!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04448");
        char[] charArray6 = new char[] { 'a', '4', ' ', '4', '#' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hihihi!                      ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '4', ' ', '4', '#' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test04449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04450");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i" });
    }

    @Test
    public void test04451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!IH                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH                           " + "'", str1, "!IH                           ");
    }

    @Test
    public void test04452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           " + "'", str1, "Hi hi hi hi hihi hi hi hi hi                                                                                                                                                                           ");
    }

    @Test
    public void test04453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04453");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                  ", "hi!", (int) (short) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                  " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                  " + "'", str4, "                                                                                                  ");
    }

    @Test
    public void test04454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04454");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!                                                                                                 ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                 " + "'", str3, "hi!                                                                                                 ");
    }

    @Test
    public void test04455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                 H                                                 ", "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 H                                                 " + "'", str2, "                                                 H                                                 ");
    }

    @Test
    public void test04457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04457");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaHi", "!IH                        ...", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                                                                                     HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                     HI!" + "'", str1, "                                                                                                                                                                     HI!");
    }

    @Test
    public void test04459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04459");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04460");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!Hi!                                                                                       ", "          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 83 + "'", int2 == 83);
    }

    @Test
    public void test04461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444a                             ahia!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04462");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "HH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h" + "'", str1, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
    }

    @Test
    public void test04464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                    ", (int) 'a', 45);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                          " + "'", str3, "...                                          ");
    }

    @Test
    public void test04465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04465");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI! 44444444444444444444444444444444444444444444444444444444444444444444                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04466");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                   ", "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04468");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "   HI!Hi!                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04469");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hihihihih                                  !ihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04470");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hih       ", "################################################H################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("########################", 87, 20);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...#################" + "'", str3, "...#################");
    }

    @Test
    public void test04472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test04473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04473");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hihi!hi!hi!hi!hi!!hhihihihih", "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test04474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!                                                                                                                              ", "     !!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                                                              " + "'", str2, "hi!                                                                                                                              ");
    }

    @Test
    public void test04475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04475");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", 63, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
    }

    @Test
    public void test04476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                !                                                                hihihihih", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                                                hihihihih" + "'", str2, "                                !                                                                hihihihih");
    }

    @Test
    public void test04477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!IH                        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa" + "'", str1, "aa");
    }

    @Test
    public void test04479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04479");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                 ", "hihihi!                                  hihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!Hi!                                                                                       ", 6, 63);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               " + "'", str3, "                                                               ");
    }

    @Test
    public void test04481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04481");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04483");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!!IH!IH!IHIH!I!!H!IH!IH!IH", "!!!!!!!...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04484");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                 ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04485");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ", (java.lang.CharSequence) "...HIHIH!H");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        " + "'", charSequence2, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ");
    }

    @Test
    public void test04486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                 Hi                                                 ", "H                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04487");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("     ", "                              !                                                                HI!h                              !                                                                                               !                                                                 ih", 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "     " });
    }

    @Test
    public void test04488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04488");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih      ", "h!!HI!HI", 49);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih      " });
    }

    @Test
    public void test04489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04489");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "HIH                                                                                             ", 49);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test04490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "4 4 4 4 HH 4 4 4 4 4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04491");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", "", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test04492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!         !         !         !         !", "!hihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         !         !         !         " + "'", str2, "         !         !         !         ");
    }

    @Test
    public void test04493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04493");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "                       !!HI!HI!H                                            !!HI!HI!H               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04494");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h", "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "HI!Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test04496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04496");
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!                                                                                                 ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h!ih!ih!ih", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi                                                                 !                                                                                               !                              hi                                                                 !                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test04497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04497");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                           !                                        ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04498");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ", "H                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test04500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                             ", "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }
}

