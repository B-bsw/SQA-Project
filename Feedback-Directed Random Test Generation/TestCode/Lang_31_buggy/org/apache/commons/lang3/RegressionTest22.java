package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22 {

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
    public void test11001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11001");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!Ihi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                             4!                                     !IH!IH!!IH!!IH!IH", "                                                      hiihiihiihiihihiihiihiihiihii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("Hi!hi!hi!hihi!hi!hi!hi!hi!", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI!44444444444444444444444444444444444444444444444444444444444444444444", "HIHIHIHIH                                  !IHIHIHIH                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "Hi!hi!hi!   HI!Hi!                                   ", (java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "Hi!hi!hi!   HI!Hi!                                   " + "'", charSequence2, "Hi!hi!hi!   HI!Hi!                                   ");
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...                        HI", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!.....................", "hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!.....................", 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                 ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence2, charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                !                                 ", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444HIa!", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444HIa!" + "'", str3, "444444HIa!");
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("i!hi!hi!hi!hihi!hi!hi!hi!hi!", "!             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !                                                       ...HIHIH!H!             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "i!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 3, (int) (byte) 1);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                 ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 6, 74);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                           ...", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(charSequence0, "!                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "#ih", "      hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                                                                    H", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                                                                    H" + "'", str2, "!ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                                                                    H");
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI !HI !HI !HI !HI !hih                                                                                             !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI !" + "'", str2, "HI !");
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                       !ih!ih", 65, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                       !ih!ih" + "'", str3, "                                                                                       !ih!ih");
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", "                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", 94, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 " });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIhiIhiIhiIhiIhihiIhiIhiIhiIhiIhiIIII", "i!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIhiIhiIhiIhiIhihiIhiIhiIhiIhiIhiIIII" + "'", str2, "4444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIhiIhiIhiIhiIhihiIhiIhiIhiIhiIhiIIII");
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!", 191, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!i                                                                ...", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!i                                                                ..." + "'", str3, "!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!i                                                                ...");
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                                                                                H", "4 4 4 4 HH 4 4 4 4 4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!                                !                                !                                !                                !                             ...", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hI!Hi!                                                                                       ", "hihihi44444444444444444444444444444444444444444444444444444444444444444444                             HI!44444444444444444444444444444444444444444444444444444444444444444444                             HI                                  44444444444444444444444444444444444444444444444444444444444444444444                             HIhihihihih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h!!HI!HI", "             !");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    !ih!ih!ih!ih!ihih!ih!ih!ih!iha", 41, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 41 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h!!HI!HI" });
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "...       hih                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                44444444444444444444444444444444444444444444444444444444444444444444                ", "hihihih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                44444444444444444444444444444444444444444444444444444444444444444444                " });
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444!                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hihihi!..", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihi!.." + "'", str2, "hihihi!..");
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!4!4!4!4!HH   !4!4!4!4!4", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          !4!4!4!4!HH   !4!4!4!4!4" + "'", str2, "          !4!4!4!4!HH   !4!4!4!4!4");
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hihihih", "                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihih" + "'", str2, "hihihih");
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("############################!ih!!ih", "!ih!ih!!ih                             !!ih                             !ih                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "############################!ih!!ih" });
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI#####################                                         ", "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 hihihihihihihihihihihi                                                                                               hihihihihihihihihihihi                              hi                                                                 hihihihihihihihihihihi                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", ' ', 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih" + "'", str1, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str1, "Hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        char[] charArray5 = new char[] { ' ', '4' };
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                              !                                                                 ih                              !                                                                                               !                                                                 ih", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!!hi!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!!h!h!h!h!hh!h!!h!h!h!h!hh!h                                                                  ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { ' ', '4' });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        char[] charArray12 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray12);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                  ", charArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   HI!Hi!                                                                                          ", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                       !!HI!HI!H                                            !!HI!HI!H               ", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                           ...", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 250);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", ' ');
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ', 96, (int) (byte) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("H! H! H! H! H!H! H! H! H! H!", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "i!hi!hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H! H! H! H! H!H! H! H! H! H!" + "'", str12, "H! H! H! H! H!H! H! H! H! H!");
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i!HH                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hh                                                               " + "'", str1, "i!hh                                                               ");
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIh!ih!ih!ih!ih!ihih!i!...", "!!!                               aaaaaaaaaaaaaaa         h", 444);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Hiihiihiihiihihiihiihiihiihi", 131);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                       Hiihiihiihiihihiihiihiihiihi" + "'", str2, "                                                                                                       Hiihiihiihiihihiihiihiihiihi");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                             4!                                     !IH!IH!!IH!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                !!h!h!h!h!hh!h!h!h!h!                                ", 307);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                              !!h!h!h!h!hh!h!h!h!h!                                " + "'", str2, "                                                                                                                                                                                                                                                              !!h!h!h!h!hh!h!h!h!h!                                ");
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!4         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!a", "hihihihih!ihihihihihihi!                      ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihihi!", 74);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                  444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444" + "'", str1, "444444444444444444444444");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!HI!H!!IH", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                    ", charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!I", "hihihi!                                  hihihihih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH", 162);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! I..." + "'", str2, "! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! I...");
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            " + "'", str1, "!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            ");
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("    ", "                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                              IH                              !                                                                                            IH                              !                              ", "HIH", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                             hi");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                             ", "hi" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                             4hi" + "'", str5, "                             4hi");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi" });
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                                                       HI!HI!HI!                                                                                                                                        ", (java.lang.CharSequence) "                               hihihih!ih                        hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 222 + "'", int2 == 222);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!!h!h!h!h!hh!h!!h!h!h!h!hh!h                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 95 + "'", int1 == 95);
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                         ", 897);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!             ", "hihihi!                  ...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih!ih!ihih!i!!h!ih!ih!ih" + "'", str1, "Ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                      iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########                              !         !         !         ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                              IH                              H                                                                                            IH                              H                              ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    H                              " + "'", str2, "    H                              ");
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                !                                !                                !                                !", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                !                                !                                !" + "'", str2, "                                !                                !                                !                                !");
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                 !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                    ", "hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                    " + "'", str2, "                                 !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                    ");
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!", "############################!ih!!ih", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!" });
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!" + "'", str1, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!");
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("Hi", strArray6, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "   HI!Hi!                                                                                          ");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HIHIHIHIH!", strArray9, strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", strArray17);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaa                                                               ", strArray17);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi" + "'", str10, "Hi");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "", "", "h", "", "h", "", "h", "", "h", "h", "", "h", "", "h", "", "h", "", "h", "", "" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HIHIHIHIH!" + "'", str18, "HIHIHIHIH!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 41 + "'", int19 == 41);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                !                                !                                !                                !", "!HI!H!!IH                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                !                                !                                !" + "'", str2, "                                !                                !                                !                                !");
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", (int) (byte) 10, 3);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("##########################################################################################################################################################################################################################################################", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI#HI#HI#HI#HIHI#HI#HI#HI#HI", "hihihih!ih", 106);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI#HI#HI#HIHI#HI#HI#HI#HI" + "'", str3, "HI#HI#HI#HI#HIHI#HI#HI#HI#HI");
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !                                                       ...HIHIH!H!             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !             !      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" });
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!                                      ", "!IH!I!!HI                                                                                        ", 174);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", "...                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h" + "'", str2, "!                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... ", "#############################...", "                              !                                                                hi!H                              !                                                                                               !                                                                 IH", 137);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... " + "'", str4, "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... ");
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("##########", "##########################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################################################################################################################################################################################################################################" + "'", str2, "################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!IH!IH!!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                                      !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                       HI!HI!HI!                                                                                                                                        ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!hi!hi", "4444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "Hi!hi!hi!   HI!Hi!                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!   HI!Hi!                                   " + "'", str1, "Hi!hi!hi!   HI!Hi!                                   ");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HI!HI!", (java.lang.CharSequence) "########################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI!HI!" + "'", charSequence2, "HI!HI!HI!");
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" });
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HIHHIHHIHHIHHIHIHHIHHIHHIHHIH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "aaaaaaaaaaaaaH", "aaaa!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIII!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "IIIIIIIIII!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih!ih!i" + "'", str1, "ih!ih!ih!i");
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!IH", 25, "AAAAAA####################################hhh####################################AAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAA#####!IHAAAAAA#####" + "'", str3, "AAAAAA#####!IHAAAAAA#####");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hihihihih                                  !ihihihih", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444h", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i" + "'", str3, "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "                                                              !", 657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                !" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                !");
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#########################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########################################################################################################################################################################################################################################################" + "'", str1, "#########################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "   !ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                        !!h!h!h!h!hh!h!h!h!h!                                Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!h", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("i!hi!hi!hi!hihi!hi!hi!hi!hi!######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hihi!hi!hi!hi!hi!######" + "'", str1, "i!hi!hi!hi!hihi!hi!hi!hi!hi!######");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                    ", "hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    " + "'", str2, "                                                    ");
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!                                                                                                                              ", "                                                 H                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#############################4hi", "                              !                                                                 IH                              !                                                                                               !                                                                 IH", "                                                                                                H", 41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############################4hi" + "'", str4, "#############################4hi");
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!");
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!#", "iiiiih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih############################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!#" });
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!" + "'", str2, "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("Hi", strArray3, strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi" + "'", str7, "Hi");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!         !         !", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!         !         !" });
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!h!h!h!h!hh!h!h!h!h!       aaa       aaa       aaa       aaa       aaa       aaa       aaa  ", "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############################################################################################################################################################################################################################!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!#############################################################################################################################################################################################################################", "...    ...", 96);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################################################################################################################################################################################################!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!#############################################################################################################################################################################################################################" });
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHHH", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHHH" + "'", str2, "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHHH");
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', (int) (byte) 10, 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" + "'", str1, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                      !ih!ih!ih!ih!ihih!ih!ih!ih!ih", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str3, "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!IHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hi!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!", "hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!IHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hi!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I" + "'", str2, "I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!IHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hi!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I");
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                             !!HI!HI!Hh!ih!ih!ih!ihih!ih!ih!ih!ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!HI!HI!Hh!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str1, "!!HI!HI!Hh!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "IHIH                         4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hi!hi!");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!hi!hi!" + "'", str4, "Hi!hi!hi!");
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("H!!hi!hi", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "!", 34);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "                                                                        ");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!!i!hihi!hi!hi", strArray5);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                !                   ", "         H", 191);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", strArray5, strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444" + "'", str13, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4!                                                               4H!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4!                                                               4H!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH" });
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("44444444444444     444444444444444", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 104, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "###################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaH", "!IH!IH                                                                                                                                                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaa", "" });
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhi                                                                 !                                                                                               !                              hi                                                                 !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444                             HI", "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                      !ih!ih!ih!ih!ihih!ih!ih!ih!ih", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!", "hi!aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         !                                                                                          ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         !                                                                                          " });
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                !", "hIHIHIHIH!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hhi!                                                                                             hi!                                                                                             HIhi!                                                                                             HI");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "hI!Hi!                                                                   ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IHIH                         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHIH                         " + "'", str2, "IHIH                         ");
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                 ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...4444444444444444444444444444444444444444444444", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...4444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!h                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     hihihihih", "!ih!!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hhhhhhhhhhhhhhhhhhhhhhhi                                                                                                                                                                                                hi                                                                  ", "ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", 7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hhhhhhhhhhhhhhhhhhhhhhhi                                                                                                                                                                                                hi                                                                  " });
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "  iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I########!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "hIH                        ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HIH                        ...", "hih", "      hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIH                        ..." + "'", str3, "HIH                        ...");
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("I!                      ...", "hihi!hi!                                                                                       hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", "!HI!h!!ih", (int) (short) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!IH!IHIH                                                          ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!!h!h!h!h!hh!h!h!h!h!.....................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!h!h!h!h!hh!h!h!h!h!....................." + "'", str1, "!!h!h!h!h!hh!h!h!h!h!.....................");
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "iihiihiihiihihiihiihiihiihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                            !!HI!HI!                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                            !!HI!HI!                                           " + "'", str1, "                                            !!HI!HI!                                           ");
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("h!!HI!HI!                                 ", "                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                  ", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 34);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '4');
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                       HIHIHIHIH!                                                                                                                                                        ", strArray5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                  " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 313 + "'", int8 == 313);
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "AAAAAA#####!IHAAAAAA#####", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "AAAAAA#####!IHAAAAAA#####" + "'", charSequence2, "AAAAAA#####!IHAAAAAA#####");
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!hi!hi!!!hi!hi!!!hi!hi!" + "'", str2, "!!!hi!hi!!!hi!hi!!!hi!hi!");
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!IH!!IHAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        char[] charArray8 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                                  ", charArray8);
        java.lang.Class<?> wildcardClass12 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!I444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH", 96, 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!I444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#####" + "'", str3, "IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!I444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#####");
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!IH                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#######          #######", "                                                 H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######          #######" + "'", str2, "#######          #######");
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!i");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "HI", "HI", "HI", "HIHI", "HI", "HI", "HI", "HI", "" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI", "HI", "HI", "HI", "HIHI", "HI", "HI", "HI", "HI", "" });
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("      HI!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!", "!hihihi                                                                     ", "!!!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih!ih!ihih!i!!h!ih!ih!i", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HIH", 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!i" + "'", str4, "!ih!ih!ihih!i!!h!ih!ih!i");
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444444444444444444444444444444444444444444444444444444444444                             HIhihihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444                             HIhihihihih" + "'", str1, "444444444444444444444444444444444444444444444444444444444444                             HIhihihihih");
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       HI!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "hi!hi!hi!  HH   Hi!hi!hi!", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaa                        ...", 137);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaa                        ..." + "'", str2, "aaaaa                        ...");
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                          ...#################                           ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                          ...", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "                           " });
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      ", "HIHIHIHIH                                  !IHIHIHIHhI!Hi!                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...                                                             ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...", "..." });
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ", "                                                       !                                       !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                             HHHHH                             ", "                                                 H                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!!!!!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!!!!" });
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                  hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                  hi" + "'", str1, "                                                                  hi");
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIhiIhiIhiIhiIhihiIhiIhiIhiIhiIhiIIII", "         4!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "...                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!HH                                                               ", "HIH#############################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!", "", "                                                               " });
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!                                                                                             ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                             " + "'", str2, "hi!                                                                                             ");
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI! 44444444444444444444444444444444444444444444444444444444444444444444", "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                          ihh!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", "HIHiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h" + "'", str2, "!                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI! 44444444444444444444444444444444444444444444444444444444444444444444                            ", "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH" + "'", str2, "iHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                             HHHHH                             ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             HHHHH                             " + "'", str3, "                             HHHHH                             ");
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        java.lang.String[] strArray6 = new java.lang.String[] { "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!                                  ", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!                                !                                !                                !                                !" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hih                                                                                             ", '#');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("             !", strArray9);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!                                  ", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!                                !                                !                                !                                !" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hih                                                                                             " });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hih" });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!h!!i!hihi!hi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                      iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########                              !         !         !         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########                              !         !         !" + "'", str1, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########                              !         !         !");
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HIHIHIHI !                                    HIHIHIHIH", "HI!h", "                       !!hi!hi!h                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                       " + "'", str3, "                                                       ");
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...               !...", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi", 247);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...               !..." });
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!", 246, 162);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI..." + "'", str3, "...HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI...");
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!hi!hihi!hi!hi!hi!hi!", "                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                      !ih!ih!ih!ih!ihih!ih!ih!ih!ih", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                      !ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str3, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h                      !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !       ", "#############################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !       " + "'", str2, "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !       ");
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!HIHIHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                   hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                              ! ", ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!                                  ", "                                                              !                                  ", 0);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("                                 HIHIHIHI!                                  HIHIHIHIH                  ", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 64 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!                                  " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "!" });
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("", 292);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!  HH   Hi!hi!hi!", "!                                                               H!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!  !!   !!!!!!!" + "'", str3, "!!!!!!  !!   !!!!!!!");
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                     !4!4!4!4!HH   !4!4!4!4!4                            ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     !4!4!4!4!HH   !4!4!4!4!4                            " + "'", str2, "                     !4!4!4!4!HH   !4!4!4!4!4                            ");
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            ", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            " + "'", str3, "!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            ");
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 302 + "'", int2 == 302);
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("IH                              !                                                                                               !", "!                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH                              " + "'", str2, "IH                              ");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("          HI!HI!HI!HI!HIHI!HI!HI!HI!HI           ", "                                                           !                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 160);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                " + "'", str2, "                                                                                                                                                                ");
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                                                       hI!HI!HI!                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                       Hi!hi!hi!                                                                                                        " + "'", str1, "                                                                                                                                       Hi!hi!hi!                                                                                                        ");
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", "          !ih                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !");
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                !                   ", "                                                                  444444444444444444444444", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "ihhihhhH", (java.lang.CharSequence) "!hihihi                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!#ih", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########                              !         !         !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#ih" + "'", str2, "!#ih");
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                           h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                           ", "h" });
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaahih", 24, "hi!                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!               aaahih" + "'", str3, "hi!               aaahih");
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                   !h                                    ", "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                   !h                                    " });
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        java.lang.String[] strArray2 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "!                                                             !                                !                                !                                !");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!                                                             !                                !                                !                                !" + "'", str6, "!                                                             !                                !                                !                                !");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str1, "444444444444444444444444444444ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!h", "HIHIHIHI !                                    HIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!h" + "'", str2, "hi!h");
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#", "         !         !         !         ", 191);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#" });
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hihihihihIH                             44444444444444444444444444444444444444444444444444444444444444444444                                  IH                             44444444444444444444444444444444444444444444444444444444444444444444!IH                             44444444444444444444444444444444444444444444444444444444444444444444ihihih", "hI!Hi!                                                         ", "hihihi!                      ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                                                                     HI", "                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI" });
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaaaaaaaaHi!aaaaaaa                                                       !                                       !", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HIHIH", "#########!                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hih", "                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hih" });
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("#########!                         ", "                                                                                                                                                                                                                                                                                                                         H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("h!!HI!HI", "                       !!HI!HI!H                                            !!HI!HI!H               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!!HI!HI" + "'", str2, "h!!HI!HI");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!hi!h!!ih", "i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!                                 ", "                                                               ", 246);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!                                              ..          !      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                              ..          !     " + "'", str1, "!                                              ..          !     ");
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                           hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                               ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               " + "'", str2, "                                                                                               ");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                     #######          #######", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     #######          #######" + "'", str2, "                     #######          #######");
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     h                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ", (java.lang.CharSequence) "HI                                                                                       ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     h                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      " + "'", charSequence2, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     h                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       HI!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                         " + "'", str2, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                         ");
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("        !i", "#############################4hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        !i" + "'", str2, "        !i");
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HIHIHIHI!    HIHIHIHIH", "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHI!    HIHIHIHIH" + "'", str2, "HIHIHIHI!    HIHIHIHIH");
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("          hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!4!4!4!4!HH   !4!4!4!4!4      ", "!IH", "#######!             #######                                                              !      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!4!4!4!4!HH   !4!4!4!4!4      " + "'", str3, "!4!4!4!4!HH   !4!4!4!4!4      ");
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hI!Hi!                                                         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!!!hi!hi!!!hi!hi!!!hi!hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" ", "ih!ih!ih!i", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", "IIIIIIIIII!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI", "H!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", "!!!!!!  !!   !!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI" + "'", str3, "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!HI");
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444...#############################", "             !");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444...#############################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444...#############################" + "'", str4, "4444444444...#############################");
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                         ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", 66);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("         4!", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         4!" + "'", str2, "         4!");
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                          hiHI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", "                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahiHIaHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahiHIaHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                               !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                              ! ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hihihihihihihihihih");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("...", strArray2, strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "..." + "'", str6, "...");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            ", "#########################################################################################################################################################################################################################################################", "HI                                                                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                              IH                              H                                                                                            IH                              H                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                              IH                              H                                                                                            IH                              H                              " + "'", str1, "                                                              IH                              H                                                                                            IH                              H                              ");
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "hi!HIhi!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HIHIHIHIH                                  !IHIHIHIH                       ", "44444444444444444444444444444444444444444444444444444444444444444444a                             ahia!", "!IH!!IHAHI!!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIH                                  !IHIHIHIH                       " + "'", str3, "HIHIHIHIH                                  !IHIHIHIH                       ");
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "", 191);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaH");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       " });
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                              IH                              !                                                                                               !                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HIH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI" + "'", str1, "HI");
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                 ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hihihih!ih", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("AAAAAAAAhI", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "      HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "      hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                     !         !         !                                                                                                                                                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "########################!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                      !!HI!HI!H                ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihih" + "'", str1, "hihih");
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih!!ih", "!!                               ", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!!ih" + "'", str3, "!ih!!ih");
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                 ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 ", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!                                                                                                 ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!h                                                                                                                                                                      ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("       ...                                                                                      ", " h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       ...                                                                                      " + "'", str4, "       ...                                                                                      ");
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                            ", "IH!IH!IHIH!I!!H!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                            " });
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ", "!                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              " + "'", str2, "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "AAAAAA#####!IHAAAAAA#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("####################################################", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####################################################" });
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hihihi4..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                             HI!                                                                                                                                                                                                                          ", "h!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                          HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ih!ih!ihih!i!!h!ih!ih!ih", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ", "       !", "!                                !                                !                                !                                !                                ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              " + "'", str3, "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444                                  !44444444444444444444444444444", "!    !ih!ih!ihih!i!!h!ih!ih!i                                                                                                                                                                                                                                                                                                                                                                                         ", "...                                                             ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444...................................44444444444444444444444444444" + "'", str3, "44444444444444444444444444444...................................44444444444444444444444444444");
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", '#', 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!                                                                                             ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#########", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!                                                                   ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!ih!ih!ihih!i!!h!ih!ih!i                                          ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!i                                          ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "!ih!ih!ihih!i!!h!ih!ih!i                                          ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#############################################################################################################################################################################################################################!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!#############################################################################################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################################################################################################################################################################################################!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!#############################################################################################################################################################################################################################" + "'", str2, "#############################################################################################################################################################################################################################!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!#############################################################################################################################################################################################################################");
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "44444444444444444444444444444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!!hi!hi!", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!hi!hi!" + "'", str3, "!!hi!hi!");
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 263, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                 ...HIHIH!H444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                 ...HIHIH!H444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                 ...HIHIH!H444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        char[] charArray6 = new char[] { ' ', '#', ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaa!HI", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "########################!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '#', ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                             !!HI!HI!Hh!ih!ih!ih!ihih!ih!ih!ih!ih  ", 874, 916);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                          ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          .." + "'", str1, "                          ..");
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", 96, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              !                                                                HI!h                              !                                                                                               !                                                                 ih" + "'", str3, "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                    ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi", "!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", 81);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi" });
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", "   HI!HI!                                                                                          ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!                                !                                !                                !                                !                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!!!!!", "!!h!h!h!h!hh!h!h!h!h!.....................!!h!h!h!h!hh!h!h!h!h!.....................!!h", "H                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!HH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!" + "'", str3, "!!!!!");
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!H", "I!                      ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                      ..." + "'", str2, "I!                      ...");
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!#########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!#########" + "'", str1, "!#########");
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("i!                                                                                       ", 246);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!                                                                                       " + "'", str2, "i!                                                                                       ");
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!h", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!I444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I4#########iH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!h" + "'", str2, "HI!h");
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...HIHIH", "4!HH   !4!4!4!4!4                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HIHIH" + "'", str2, "...HIHIH");
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                             !                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    " + "'", str1, "                                                    ");
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!!IH!IH!IHIH!I!!H!IH!IH!IH", 34, "#######          #######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!IH!IH!IHIH!I!!H!IH!IH!IH####### " + "'", str3, "!!IH!IH!IHIH!I!!H!IH!IH!IH####### ");
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...                        HI", "                                                                                           !!hi!hi!h", 98);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...                        HI" });
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         h", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", 1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         h" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "h" });
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("#################################### HHH ####################################", "", "hI!Hi!                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################### HHH ####################################" + "'", str3, "#################################### HHH ####################################");
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                       !!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       !!hi!hi!h" + "'", str1, "                       !!hi!hi!h");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                                                                                                                                                                                                                                                  ", 60, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                            " + "'", str3, "                            ");
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI !HI !HI !HI !HI !hih                                                                                             !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !", 87, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI !HI !HI !HI !HI !hih                                                                                             !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !" + "'", str3, "HI !HI !HI !HI !HI !hih                                                                                             !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !");
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                             ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             " + "'", str2, "                                             ");
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih                !ih!ih!ih!ih!ihih!                !ih!ih!ih!ih!ihih!ih!ih!ih!ih                !ih!ih!ih!ih!ihih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!#########", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHH" + "'", str1, "HHHHH");
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                             ", "##################################                                                 H                                                 ###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                             " + "'", str2, "!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                             ");
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                  ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HIhi!hi!#########################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...", 897, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("i!HH                                                               ", 'a', 898);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Hi!hi!hi", "iH!IH!IhihI!Hi!                                                                                       hi #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi" + "'", str2, "Hi!hi!hi");
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   !ih!ih!ihih!i!!h!ih!ih!ih", "   ", 45);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                      !!HI!HI!H                ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hihihihi!                                  hihihihihhihihihi!                                  hihihihih                                 hi!hihihihi!                                  hihihihihhihihihi!                                  hihihihih", strArray4, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 55");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "!ih!ih!ihih!i!!h!ih!ih!ih" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                      !!HI!HI!H                " + "'", str8, "                                      !!HI!HI!H                ");
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("             !", "####################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "             !" + "'", str2, "             !");
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", "                                                 Hi                                                 ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "...hihih");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 898);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                " });
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!HI!" + "'", str1, "hI!HI!HI!");
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi" + "'", str1, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi");
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HH", "", (-1));
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HH" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HH" + "'", str4, "HH");
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "####################################################", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                             4!                                                               4", (int) (byte) 1, 246);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             4!                                                               4" + "'", str3, "                             4!                                                               4");
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "                                                                                                                      4444444444444444444444444444444444444444444444444444                                                                                                                       ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("      HI!h", 8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        char[] charArray6 = new char[] { ' ' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "h!ih!ih!ih", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                                                                                                       Hi!hi!hi!                                                                                                                                        ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                         !ih                            ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 41 + "'", int11 == 41);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!#########", "ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i #########ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i #########ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i #########ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i #########ih!ih!i                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i #########ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i #########ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i #########ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i #########ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                        ", 19, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                        " + "'", str3, "                                                                        ");
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                    ", "!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", "    H                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    " + "'", str3, "                                                    ");
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("H                                 ", 32, 83);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  " + "'", str3, "  ");
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                               ", "HI!Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                         ", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  " + "'", str2, "                                  ");
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HIhi!hi!#########################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("####################################################################", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!");
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                             hi!", "hihihihi!                                  hihihihih");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !        ", 6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... hi!hhi!hhi!hhi!hhi!hhi!hhi!hhi!hhi!hhi!", strArray3, strArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                             hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "!                                  ");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, ' ', (int) '4', (-1));
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("                44444444444444444444444444444444444444444444444444444444444444444444          ...", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "iHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        char[] charArray12 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray12);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", charArray12);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "####################################################", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!ih!ih!ih!ih!ihih!ih!ih!ih!ih!hi!h", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!!!!!  !!   !!!!!!!", charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                             hi!                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                             hi!                                                                                                                                                                                                                          " + "'", str1, "                             hi!                                                                                                                                                                                                                          ");
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444          ...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "", 75);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 75 + "'", int3 == 75);
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                       Hi!hi!hi!                                                                                                                                        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h" + "'", str3, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444", "                                                              !                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "                                !", 59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", "hi!                                                                                                                              !                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                                                                       HI!HI!HI!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                              !                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...hihihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "                                                                        ...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        char[] charArray2 = new char[] {};
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!4         ", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                            ", 313);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            " + "'", str2, "                            ");
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI! 44444444444444444444444444444444444444444444444444444444444444444444                            ", 69, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI! 44444444444444444444444444444444444444444444444444444444444444444444                            " + "'", str3, "HI! 44444444444444444444444444444444444444444444444444444444444444444444                            ");
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 81, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HIHIH...", "                                                                                                                                                                    HIa!", 81, 250);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIHIH...                                                                                                                                                                    HIa!" + "'", str4, "HIHIH...                                                                                                                                                                    HIa!");
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        java.lang.String[] strArray5 = new java.lang.String[] { "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!                                  ", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!                                !                                !                                !                                !" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hih                                                                                             ", '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!                                  ", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!                                !                                !                                !                                !" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hih                                                                                             " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hih                                                                                             " + "'", str10, "hih                                                                                             ");
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!########################                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                 ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#########################################################################################################44444444444444444444444444444444444444444444444444444444444444444444          ...#########################################################################################################", 99, "...hihih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################################################################44444444444444444444444444444444444444444444444444444444444444444444          ...#########################################################################################################" + "'", str3, "#########################################################################################################44444444444444444444444444444444444444444444444444444444444444444444          ...#########################################################################################################");
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaa4aaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "4                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                 ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          HI!HI!HI!HI!HIHI!HI!HI!HI!HI           ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!!!!!  !!   !!!!!!!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...#################", "################################################################################################################################################################################################################################################", "HI                                                                                     ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...#############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#############################" + "'", str1, "...#############################");
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                !", (java.lang.CharSequence) "hiihiihiihiihihiihiihiihiihi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", 165, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                               " + "'", str3, "                                                               !ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                               ");
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hI!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!" + "'", str2, "hI!");
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("#IH############################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" #########", "                                  ", 93);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { " #########" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        char[] charArray16 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray16);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             hi!", charArray16);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray16);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hihihihih                                  !ihihihih", charArray16);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                                                                HI!h                              !                                                                                               !                                                                 ih", charArray16);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaH", charArray16);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", charArray16);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   !IH                    ", charArray16);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI HI HI HI HIHI HI HI HI HI                                                                                                                                                                          ", charArray16);
        int int26 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...HIHIH!H444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!", charArray16);
        int int27 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", charArray16);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertArrayEquals(charArray16, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 160 + "'", int26 == 160);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                              !                                  ", "                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              !                                  " + "'", str3, "                                                              !                                  ");
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!!I!HIHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!I!HIHI!HI!HI" + "'", str1, "!!I!HIHI!HI!HI");
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ", "                44444444444444444444444444444444444444444444444444444444444444444444          ...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          " });
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!IH   !ih!ih!iH                                                                                     ", "                             !ih!ih!ih!ih!ihih!ih!ih!ih!ih                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hihihihih!ihihihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihih!ihihihi" + "'", str1, "hihihihih!ihihihi");
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahiHIaHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hihihihih!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HIaHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!         !         ", "!!!!!!!!!iih!ih!i!!!!!!!!!!!!!!!!", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iiiiih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih############################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "iiiiih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih!ih!ih!ih!ih!ihih!ih!ih!ih!ih############################################################################################" });
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!", 75, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!                                           " + "'", str3, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!                                           ");
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("H!", "                          ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!" + "'", str2, "H!");
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                            !!HI!HI!                                           ", "!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                            !!HI!HI!                                           " + "'", str2, "                                            !!HI!HI!                                           ");
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#########iH!IH!IH4!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!4HI!HI!Hi#########" + "'", str1, "I!4HI!HI!Hi#########");
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HIHIHIHIH", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH" });
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h!ih!ih!ih", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("                             hi");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                 ", strArray6, strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 87);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hH", strArray6, strArray13);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                 " + "'", str9, "                                 ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hH" + "'", str14, "hH");
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "    i                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    i                                                                                        " + "'", str1, "    i                                                                                        ");
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI                                                                                     ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "                                                                                     " });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "" });
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#############################", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################                                                                       " + "'", str2, "#############################                                                                       ");
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#################...", 72, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################...                                                    " + "'", str3, "#################...                                                    ");
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "HIHIHIHI!    HIHIHIHIH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                                                               !                              hi                                                                 !" + "'", str1, "!                                                                                               !                              hi                                                                 !");
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                                                                                                                                                                                                                              ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                      !!HI!HI!H                ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH", 92, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH         " + "'", str3, "        HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH         ");
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("      hi!h", 302, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      hi!h####################################################################################################################################################################################################################################################################################################" + "'", str3, "      hi!h####################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("                                                                                                !", "                                                                                                !", (int) ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                             h", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", 969);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                  ", strArray4, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih", 1, 222);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
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
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!                              i                              i                              i                              i", '#', 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                               ", "...HIHIH", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                               " });
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        char[] charArray9 = new char[] { ' ', 'a', ' ', ' ', 'a' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HH   ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ', 'a', ' ', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   !ih!!ihaaa                  !ih!!ihaaa                  !", 39, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   !ih!!ihaaa                  !ih!!ihaaa                  !" + "'", str3, "   !ih!!ihaaa                  !ih!!ihaaa                  !");
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444444hihi!hi!                                                                                       hi", "HI!44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi!hi!                                                                                       hi" + "'", str2, "hihi!hi!                                                                                       hi");
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("44444444444444444444444444444444444444444444444444444444444444444444                           ", "hI!                                                                                                 ", 67);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444                           " });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444                           " });
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "i!hi!hi!hi!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 915);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                                                          HIHI!HI!", "#############################...", 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        a");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI" });
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             hi!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                                  ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44444444444444444444444444444444444444444444444444444444444444444444", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 49 + "'", int1 == 49);
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("44444444444444444444444444444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhih", '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi", "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!", "   !ih!ih!ihih!i!!h!ih!ih!ih", "!!!!!!!...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa                             h", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                   hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", "!         ", 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI!HI!HI!HIHI!HI!HI!HI!HI", (int) (byte) 100, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hihihih!ih", 222, 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihih!ih" + "'", str3, "hihihih!ih");
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hih", "#########################################################################################################44444444444444444444444444444444444444444444444444444444444444444444          ...#########################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!                                                                                                 ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("         !ih!!ihaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HIhi!hi!#########################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!", "!                                                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i", "hi", "hi", "hi", "hihi", "hi", "hi", "hi", "hi", "" });
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ih" });
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                        ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih!ih!ih!ih!ihih!ih!ih!ih!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!ih!ih!", "!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        java.lang.String[] strArray3 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!!");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("                                 ", strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!!!" + "'", str7, "!!!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "!", "" });
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                !                                                          aa", 106);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                                          aa" + "'", str2, "                                !                                                          aa");
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         HIHIHIHI                                                           4", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                           4", "                                                                                 !                              hi                                                                 !                                                                444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                         !ih                            ", "4444IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIhiIhiIhiIhiIhihiIhiIhiIhiIhiIhiIIII", "444444#########4444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!hi!" + "'", str1, "hi!!hi!");
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("IH", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH" + "'", str2, "IH");
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                !                                                                hihihihi", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                                                hihihihi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str2, "                                !                                                                hihihihi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!!!!!!!!!!!!!!!!!                                                          hihi!hi!!!!!!!!!!!!!!!!!!", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", 2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!!!!!!!!!!!!!!!!!                                                          hihi!hi!!!!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHHH", 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!i");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                        ..", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHHH" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIHHH" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I########!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i########!!!" + "'", str1, "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i########!!!");
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                            !!HI!HI!                                           ", "!         !         !         !         !                                                       ", 451);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4 4 4 4...", "...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!          ...", "!!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4 4 4 4!!!" + "'", str3, "4 4 4 4!!!");
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                        !ih!ih!iH                                                                                                                                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHIHI!                                  HIHIHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "..                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########" + "'", str1, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########");
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hihihihih!aaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!HIHIHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihih!aaaa" + "'", str2, "hihihihih!aaaa");
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!4", "aaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                 !Ih", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hihihih!ih", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                                                                hihihihih", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!ih!ih!!ih                             !!ih          HIHiiiiiiiiiiiiiiiiiiiiiiiiiiii                                                   H");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("      !               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h", "                                                             hi");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                        !!h!h!h!h!hh!h!h!h!h!                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h" + "'", str4, "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HIHHIHHIHHIHHIHIHHIHHIHHIHHIH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHHIHHIHHIHHIHIHHIHHIHHIHHIH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "HIHHIHHIHHIHHIHIHHIHHIHHIHHIH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ", "       ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!i", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                          hiHI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       .4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hi!hi!hi!hihi!hi!hi!hi!hi!", ".4444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hih!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hih!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi" + "'", str3, "HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hih!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444I!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi#########4I!HI!HI!H!!I!HIHI!HI!HI!HI!HI!Hi");
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 'a', 247);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("I!                      ...", "HIhi!hi!#########################HIhi!hi!#########################HIhi!hi!#########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      ..." + "'", str2, "                      ...");
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                 H", '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!ih!!ihahi!!hi!", "                                                                                                                                                                                                                                                      ih                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "aaaaaa##########...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str2, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("IIIIIIIIII!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "                                                                         ", 67);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "IIIIIIIIII!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "!");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!");
        java.lang.String[] strArray13 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "hi!");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", strArray10, strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray7, strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("IH", strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HI", "!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hihihihihihihihihihihi" + "'", str16, "hihihihihihihihihihihi");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...4444444                             hi!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhh...", "                                             !44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", 67);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...4444444                             hi!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhh..." });
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                            " + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                            ");
    }
}

