package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

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
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!H" });
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#############################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!hi!hi!h!!i!hihi!hi!hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        char[] charArray13 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                  ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   HI!Hi!                                                                                          ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                          ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", charArray13);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#ih", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          " + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #######" + "'", str1, "!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #######");
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HIHIHIHIH", "!hi!hi!", (int) 'a', 95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIHIHIHIH!hi!hi!" + "'", str4, "HIHIHIHIH!hi!hi!");
    }

    @Test
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! I...", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I" });
    }

    @Test
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                                " });
    }

    @Test
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaa                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                    HIa!", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("! h                   ...", "hihihihih                         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hihihihih                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("h!", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "                                                                  HIHIHIHI !          HHIHIHIHI !                                                                             ", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h!" + "'", str4, "h!");
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                                                          HIHI!HI", "                                                                                                                                                      HI!hHI!h!!!!!!!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", "!", "ih", "!", "ih", "!", "ih", "!", "ih", "!", "ihih", "!", "ih", "!", "ih", "!", "ih", "!", "ih" });
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", "###################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "!IH!IH                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH                                                                                                                                                              " + "'", str1, "!IH!IH                                                                                                                                                              ");
    }

    @Test
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str1, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hihihi!..", "hihih...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hihihihihihihihihih", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaHaaaaaaaaHaaaaaaaaHaaaaaaaaHaaaaaaaaHHIaaaaaaaaHHIaaaaaaaaHHIaaaaaaaaHHI!HIHI!HI!HI!HI!HI!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("             !                                                                                                                     ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAAAAA####################################hhh####################################AAAAAAA", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     h                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAA####################################hhh####################################AAAAAAA" + "'", str2, "AAAAAA####################################hhh####################################AAAAAAA");
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################" + "'", str1, "###################");
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                             ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaahih                                                                                             ", "                                                                                                                                                                                 !!i!hihi!hi!hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!4         ", "HIhi!hi!", 90);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hihihi!                                  hihihihih", strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "4         " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("IH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "IH" });
    }

    @Test
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "hI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                      HI!hHI!h!!!!!!!...", "HI!HI!                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                      HI!hHI!h!!!!!!!..." + "'", str2, "                                                                                                                                                      HI!hHI!h!!!!!!!...");
    }

    @Test
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hih                                                                                             ", 59);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hih                                                     ..." + "'", str2, "hih                                                     ...");
    }

    @Test
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aa", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#######!             #######                                                              !      ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("h", "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!!HI!HI!H", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HI!HI!H" + "'", str2, "!!HI!HI!H");
    }

    @Test
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                 ...HIHIH!H", "                                                                                                                                   ", 155);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!ih!ih!ihih!i!!h!ih!ih!i                                          ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", "!", "ih", "!", "ihih", "!", "i", "!!", "h", "!", "ih", "!", "ih", "!", "i", "                                          ", "##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aa4#########aaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa4#########aaaaaaaa" + "'", str1, "aa4#########aaaaaaaa");
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "                                                                                                                                                                                                                                                      ih                                                                  ", 99, 106);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                                                                                                                                                                                                                                                      ih                                                                  " + "'", str4, "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                                                                                                                                                                                                                                                      ih                                                                  ");
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#############################...", 136);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                 !Ih", "hihihihihihihihihihihiHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih                            ", "hihihi!                      ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih                            " });
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         HIHIHIHI                                                           4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         HIHIHIHI                                                           4" + "'", str1, "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         HIHIHIHI                                                           4");
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!4!4!4!4!HH   !4!4!4!4!4", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hI!                                                                     ...", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                         ", "                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "        HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH         ", "HIH                                                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                  ", "!!!!!...", 111);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   ", 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!IH                             ", "#############################################################################################################################################################################################################################!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!#############################################################################################################################################################################################################################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################", 111, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       .4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################hi!hi!hi!hi!hihi!hi!h" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################hi!hi!hi!hi!hihi!hi!h");
    }

    @Test
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#############################                                                                       ", "!IH   !ih!ih!iH                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44444444444444444444444444444444444444444444444444444444444444444444", "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!44444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" HI HI HI HIHI HI HI HI HI                                                                                                                                                                           ", "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI HI HI HIHI HI HI HI HI                                                                                                                                                                           " + "'", str2, " HI HI HI HIHI HI HI HI HI                                                                                                                                                                           ");
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("IH", 778);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        IH" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        IH");
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                44444444444444444444444444444444444444444444444444444444444444444444                ", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                44444444444444444444444444444444444444444444444444444444444444444444                " + "'", str2, "                44444444444444444444444444444444444444444444444444444444444444444444                ");
    }

    @Test
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hhhhhhhhhhhhhhhhhhhhhhhi                                                                 !                                                                                               !                              hi                                                                 !", "                             4hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 162);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                  " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                  ");
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                            ", "", 565);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 60 + "'", int3 == 60);
    }

    @Test
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 31, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "...4444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                               ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#############################                                                                       ", 164);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################                                                                                                                                       " + "'", str2, "#############################                                                                                                                                       ");
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", "hI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...hihih                                                                                             hih", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "...                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 211 + "'", int2 == 211);
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                 ", "                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "4", 302, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4" + "'", str4, "4");
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444444HIa!", "h                                                                                         hih   h                                                                                         hih   h                                                                                         hih   h                                                                                         hih   h                                                                                         hih   h                                                                                         hih   h", 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444HIa!" + "'", str3, "444444HIa!");
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hI!                                                                                                 ", "#######!             #######");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!hihihihih", "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hi!hi!h                                                                                                    ", "hi                                                                 !                                                                                               !                              hi                                                                 !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaa                        ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, ' ');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hihihihih!", strArray5, strArray9);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("                                                 H                                                 ");
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny("...                             ", strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!", strArray9, strArray18);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.startsWithAny("                             h", strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                              !                                  " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hihihihih!" + "'", str15, "hihihihih!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "H" });
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!4!4!4!4!HH   !4!4!4!4!4", 111, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!4!4!4!4!HH   !4!4!4!4!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "!4!4!4!4!HH   !4!4!4!4!4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h!!ih!ih!ih!ih!ihih!ih!ih!ih!ih!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", 41);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h!!ih!ih!ih!ih!ihih!ih!ih!ih!ih!" });
    }

    @Test
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi", 75, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi########################################" + "'", str3, "!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi########################################");
    }

    @Test
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4HI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", "#######          #######", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4HI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " });
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HI!hHI!h!!!!!!!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!hHI!h!!!!!!!..." + "'", str1, "hI!hHI!h!!!!!!!...");
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hihih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihih..." + "'", str1, "hihih...");
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("AAA                        AAA", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                 ...HIHIH!H444444444444444444444444444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("i!hi!hi!hi!hi!!hhihihihih", "!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444HIa!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444HIa!" + "'", str1, "444444HIa!");
    }

    @Test
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", '4');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                          hiHI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                          hiHI!HI!" + "'", str1, "                                                          hiHI!HI!");
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str1, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HiiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!" + "'", str3, "HiiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I iH!IH!IH!IH!");
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("..!.!.!.!.", 250, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..!.!.!.!.################################################################################################################################################################################################################################################" + "'", str3, "..!.!.!.!.################################################################################################################################################################################################################################################");
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi", 313);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                             hi", "                           hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !H", "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !HI !H" });
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h!!i!hihi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!Ih", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("       !", 280, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444       !4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444       !4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                          hiHI!HI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...       hih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...       hi" + "'", str1, "...       hi");
    }

    @Test
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", 191, 969);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...444444444444444444444444444444444444444444444444444444444444444444444444444444444...", 66, 33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...444444444444444444444444444..." + "'", str3, "...444444444444444444444444444...");
    }

    @Test
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                                                               " + "'", str1, "!                                                                                               ");
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!                                                                                               !                              hi                                                                 !", "hihihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("##", "                                                                                                                                                       HIHIHIHIH!                                                                                                                                                        ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                     !4!4!4!4!HH   !4!4!4!4!4                            ", (java.lang.CharSequence) "!!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!", "                                                                                                                                                           hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI", "" });
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!IH!IH!!IH!!IH!IH", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi!hi!  HH   Hi!hi!hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444                             hi!", "H                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                              ", "                        ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("AaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                      " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                             hi!", "hih       ", "hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!.....................");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("44444444444444444444444444444444444444444444444444444444444444444444          ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih", "                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", " 4 4 4 HH 4 4 4 4 4");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("   HHH   ", "      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   HHH   " + "'", str2, "   HHH   ");
    }

    @Test
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         HIHIHIHI                                                           4", "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...                                          ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!ih                            ", "!                                                                ", "Hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih                            " + "'", str3, "!ih                            ");
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("       hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!h", strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                   ", "HIHIH...", 263);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                   " });
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("      hi!h", "!hi!h!!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!h!!ih" + "'", str2, "!hi!h!!ih");
    }

    @Test
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!         !         !         !         !                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI HI HI HIHI HI HI HI HI", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI HI HI HIHI HI HI HI HI" });
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("iH!IH!IhihI!Hi!                                                                                       hi #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", "4 4 4 4 HH 4 4 4 4 4              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH!IH!IhihI!Hi!                                                                                       hi #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH" + "'", str2, "iH!IH!IhihI!Hi!                                                                                       hi #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "4444!                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444!                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "4444!                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HIHIHIHI !                                    HIHIHIHIH", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                                                                                                                                                                                      ih                                                                  ", "                       !!hi!hi!h                                                                  ", "AAA                        AAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("         !!hi!hi!                ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!", "!#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 155);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhi                                                                 !                                                                                               !                              hi                                                                 !", "44444444444444444444444444444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhih", 88);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HH        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     " });
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("###################", 165);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                  ###################" + "'", str2, "                                                                                                                                                  ###################");
    }

    @Test
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI..." + "'", str1, "...HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI!HI!!HI...");
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4 4 4 4!!!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                      !hihihihih", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 22 + "'", int2 == 22);
    }

    @Test
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", '4', 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 62 + "'", int3 == 62);
    }

    @Test
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "hI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "i", "", "i", "", "i", "", "i", "", "i", "i", "", "i", "", "i", "", "i", "", "i", "", "i", "" });
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###############################", (int) (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################" + "'", str3, "###############################");
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hihihih", 5, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihih" + "'", str3, "hihihih");
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("H! H! H! H! H!H! H! H! H! H! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H! H! H! H! H!H! H! H! H! H! " + "'", str1, "H! H! H! H! H!H! H! H! H! H! ");
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hihihihih!ihihihi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HIHIHIHI!    HIHIHIHIH", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHI!    HIHIHIHIH  " + "'", str2, "HIHIHIHI!    HIHIHIHIH  ");
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "HHH", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                            ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip(" i i i i                                                                                            ", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " i i i i                                                                                            " + "'", str2, " i i i i                                                                                            ");
    }

    @Test
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                                !", "hi!hi!hi!hi!hi!HIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("        !i", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!    !ih!ih!ihih!i!!h!ih!ih!i                                                                                                                                                                                                                                                                                                                                                                                         ", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   " + "'", str2, "                                                                   ");
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                      hiihiihiihiihihiihiihiihiihii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                      hiihiihiihiihihiihiihiihiihii" + "'", str1, "                                                      hiihiihiihiihihiihiihiihiihii");
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                !                                 ", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                         ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih!ih!!ih!!ih!ih", "hihihih", 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih!ih!!ih!!ih!ih" });
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...4444444444444444444444444444444444444444444444", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444444444444444444444444444444" + "'", str3, "...4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                                                                                                  ! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!!", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HIa!", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                              ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!Ihi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA4HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" });
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", "###################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h" + "'", str2, "                                                              !                                                               !                                                               !                                   !hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
    }

    @Test
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", ' ', 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!i                                                                ...", 292, 60);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!hi!hi!h", "!ih!ih!ihih!i!!h!ih!ih!i                                          ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!h" + "'", str2, "Hi!hi!hi!h");
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih!ih!ih!ih!ihih!ih!ih!ih!ih", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "!         !         ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih!ih!ih!ih!ihih!ih!ih!ih!ih" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "ih!ih!ih!ih!ihih!ih!ih!ih!ih" });
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaa", "             !                                                                                                                     ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!hi!hi!hi!hihi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaa" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
    }

    @Test
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HIHIHIHI !          HHIHIHIHI !          ", "!                                                                                               !                              hi                                                                 !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hihihi!                  ...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                              !                                  " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                              !                                  " + "'", str4, "                                                              !                                  ");
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih", (java.lang.CharSequence) "                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                             ...                                                          HIHI!HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih" + "'", charSequence2, "                                                                                                                                               !ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...hihih", "4HI                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hihih" + "'", str2, "...hihih");
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI                                                                                       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                              !!h!h!h!h!hh!h!h!h!h!                                ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                              !!h!h!h!h!hh!h!h!h!h!                                " + "'", str3, "                                                                                                                                                                                                                                                              !!h!h!h!h!hh!h!h!h!h!                                ");
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                                      !" + "'", str1, "!!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !!IH                             !IH                             !!IH                             !!IH                             !!IH                             !!IH                                      !");
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HIHIHIHIH                                  !IHIHIHIHhI!Hi!                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihih                                  !ihihihihHi!hI!                                                                                       " + "'", str1, "hihihihih                                  !ihihihihHi!hI!                                                                                       ");
    }

    @Test
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                 ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                 ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hihihih!ih", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!ih!ih!ih", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!IH                            ", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "ih!ih!ihih!i!!h!ih!ih!ih", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "                                                                                                                      4444444444444444444444444444444444444444444444444444                                                                                                                       ", "ih", 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HHH", "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHH" + "'", str2, "HHH");
    }

    @Test
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("ih                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                              IH                              !                                                                                            IH                              !                              ", "...                                                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              IH                              !                                                                                            IH                              !" + "'", str2, "                                                              IH                              !                                                                                            IH                              !");
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!hi!!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !", 809);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !" + "'", str2, "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !");
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        char[] charArray10 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                !                   ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                          HIHI!HI!", "hihihihih                         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hihihihih                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!                                                             !                                !                                !                                !", "H! H! H! H! H!H! H! H! H! H!", 451);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!                                                             !                                !                                !                                !" });
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "..!ihihih");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HI!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str4, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                      !!HI!HI!H                ", "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... hi!hhi!hhi!hhi!hhi!hhi!hhi!hhi!hhi!hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!h", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                !", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                            !                                       !                                                                                                                                                                                                                                                                                                                                                                                                     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi44444444444444444444444444444444444444444444444444444444444444444444                             hi!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi44444444444444444444444444444444444444444444444444444444444444444444                             hi!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhih" + "'", str1, "ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi44444444444444444444444444444444444444444444444444444444444444444444                             hi!ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhih");
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                  Hi");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                  ", "H", "i" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ", "4444444444...#############################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 874, 603);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        java.lang.String[] strArray3 = null;
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                              !                                  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", strArray3, strArray7);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                                                                                   ", "", (int) (byte) 1);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                  ", strArray7, strArray12);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("HIHIHIHIH!IHIHIHIH", strArray7);
        java.lang.Class<?> wildcardClass17 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                                                              !                                  " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str8, "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!                                                                                                   " });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     " + "'", str13, "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!" + "'", str15, "!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!                                                                                               !                              hi                                                                 !                              ", 49, "                                            !!HI!HI!                                                                                        !!HI!HI!                                                                                        !!HI!HI!                                             ! h                   ...                                            !!HI!HI!                                                                                        !!HI!HI!                                                                                        !!HI!HI!                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                                                                               !                              hi                                                                 !                              " + "'", str3, "!                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "   !ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hihihihih                                  !ihihihihHi!hI!                                                                                       ", '4', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...", "!!h!h!h!h!hh!h!!h!h!h!h!hh!h                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ..." + "'", str2, "                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...                       !IH                        ...");
    }

    @Test
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "..!.!.!.!.");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #######", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "...HIHIH!", 88);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #######" + "'", str4, "!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #######");
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih!ih!ihih!i!!h!ih!ih!i                                          ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aahi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ", "..                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 969);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aahi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          " + "'", str4, "aahi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi                                                          ");
    }

    @Test
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!         !ih!!ihaaa                  !ih!!ihaaa                  !", "                     hihihihihihihihihihihi                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("iHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hihihi44444444444444444444444444444444444444444444444444444444444444444444                             HI!44444444444444444444444444444444444444444444444444444444444444444444                             HI                                  44444444444444444444444444444444444444444444444444444444444444444444                             HIhihihihih");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih...", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444" + "'", charSequence2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
    }

    @Test
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", "hi!hi!hi", (int) (short) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH" + "'", str4, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH");
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi!hi!  HH   Hi!hi!hi!", "hi                           ...", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "          hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaa", "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih                !ih!ih!ih!ih!ihih!                !ih!ih!ih!ih!ihih!ih!ih!ih!ih                !ih!ih!ih!ih!ihih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "                                  !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!         ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("!#########", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "", 69);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "HI                                                                                     ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ih!ih!ih!ih!ih!ihih!i!...", "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                                                                                                                                                                                                                                                      ih                                                                  ", "                             4hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih!ih!ih!ih!ihih!i!..." + "'", str3, "ih!ih!ih!ih!ih!ihih!i!...");
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", '4', 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4!HH   !4!4!4!4!4                            ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi!hi!hi!  HH   Hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4", "!", "HH", "   ", "!", "4", "!", "4", "!", "4", "!", "4", "!", "4", "                            " });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4", "", "", "", "", "4", "", "4", "", "4", "", "4", "", "4", "" });
    }

    @Test
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("      hi!h", "aaaaa                        ...", "hi!h", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      hi!h" + "'", str4, "      hi!h");
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!I4#########iH!IH!IH", "HIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################", "#########iH!IH!IH4!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                       !IH                        ...", 191, "hi!                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                                              hi!                             !IH                        ..." + "'", str3, "hi!                                                                                                                              hi!                             !IH                        ...");
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!                                           ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!ihi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                             ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444                             HIhihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HIHIHIHI!    HIHIHIHIH  ", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHI!    HIHIHIHIH  " + "'", str3, "HIHIHIHI!    HIHIHIHIH  ");
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                         !ih                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("            hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hihihihi!                                  hihihihih", "                                ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   !ih!ih!ihih!i!!h!ih!ih!ih", "   ", 45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 35 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "", "", "!ih!ih!ihih!i!!h!ih!ih!ih" });
    }

    @Test
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...HIHIH!H", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hihihihihihihihihihi");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...HIHIH", "H" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "...HIHIH", "H" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str1, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                     ", 565, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     " + "'", str3, "                     ");
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hIhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii...", "!IH!!IHAHI!!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii..." + "'", str2, "hIhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii...");
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...hihihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                    !hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!!hi!hi!", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!IH!IH!!IH                             !!IH                             !IH                    ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                             ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IH!IH!!IH", "!!IH", "!IH" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!                                                                                             ", "   HI!Hi!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("########################################hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hihih...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hihih...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!                                  ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "                             h", 95, 66);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "4", (int) (byte) 10, (-1));
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16, ' ', 155, 5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!!!!!", "!ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                             !ih                    !ih!ih!!ih                             !!ih                                                                    H                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI#HI#HI#HI#HIHI#HI#HI#HI#HI", "                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!", ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("                                   !h                                    ", strArray3, strArray9);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                   !h                                    " + "'", str10, "                                   !h                                    ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hih       ", 2, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h       " + "'", str3, "h       ");
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                                                                                                                                                                                                                                          ", "                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...                             ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...                             " });
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!                                                                                                                              hi!                             !IH                        ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...                                          ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!H", '#', 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", " ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str6, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!h!!i!hihi!hi!hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi" });
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#################...                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################...                                                    " + "'", str1, "#################...                                                    ");
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        char[] charArray13 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray13);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray13);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                  ", charArray13);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", charArray13);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "   HI!Hi!                                                                                          ", charArray13);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                                                                          ", charArray13);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", charArray13);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi                                                                 !                                                                                               !                              h!IH                                                       ih                                                                                       !iH!Ihih", charArray13);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertArrayEquals(charArray13, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("####################################################", "                               !");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", strArray4);
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("                                !                                                                hihihihih", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "####################################################" });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                !                                                                hihihihih" + "'", str7, "                                !                                                                hihihihih");
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "AAA                        AAA", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#############################                                                                       ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!i                                           ", (java.lang.CharSequence) "!                                !                                !                                !                                !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                         !ih                            ", "!!                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!IH!!IHAHI!!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########IH!IH!I                                                                                                                                                            HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI!HIH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                        ..", (java.lang.CharSequence) "                                                                                      ...       ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                        .." + "'", charSequence2, "                                                                        ..");
    }

    @Test
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        java.lang.String[] strArray3 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 313, 41);
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihihihihihihihihihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 103 + "'", int12 == 103);
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", "...     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("          ", "                                                 H                          ", "                                                                                                                                                                                                                                                                                                                                                                                                                  Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hihihi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 6 + "'", int1 == 6);
    }

    @Test
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        char[] charArray9 = new char[] { ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                    ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         !", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIh!ih!ih!ih!ih!ihih!i!...", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 174 + "'", int17 == 174);
    }

    @Test
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("iHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHiHiHiHiHiHiHiHiHiHiHiHiHiHi..." + "'", str3, "iHiHiHiHiHiHiHiHiHiHiHiHiHiHi...");
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                    ", 98, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                    " + "'", str3, "                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                       HIHIHIHI!                                  HIHIHIHIH", "HIH#############################################################################################", "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       HIHIHIHI!                                  HIHIHIHIH" + "'", str3, "                       HIHIHIHI!                                  HIHIHIHIH");
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hihihih!ih", "                                      ", 314);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "hiihiihiihiihihiihiihiihiihii");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "       ...                                                                                      ", 9, 155);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 9 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hihihih!ih" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!ih!ih!ihih!i!!h!ih!ih!i                                          ##################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "44", "                                                              !                                  ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "     !!", "i!                                                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaa", "Hi!hi!hi!h                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" });
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                 !Ih", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence1, charArray11);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hihihihih!ihihihih", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih", "!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                       HI!HI!HI!                                                                                                                                        ", "       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                                        ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                        !!h!h!h!h!hh!h!h!h!h!                                ", 263, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                  !!h!h!h!h!hh!h!h!h!h!                                " + "'", str3, "                                                                                                                                                                                                                  !!h!h!h!h!hh!h!h!h!h!                                ");
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                44444444444444444444444444444444444444444444444444444444444444444444          ...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                ", "44444444444444444444444444444444444444444444444444444444444444444444", "          ", "..." });
    }

    @Test
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                       HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!ih!ih!ih!ih!ih!ihih!ih!ih!ih!i", 898);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                 !ih!ih!ih!ih!ih!ihih!ih!ih!ih!i                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                 !ih!ih!ih!ih!ih!ihih!ih!ih!ih!i                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hihihi!..", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHIHI!                                  HIHIHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!               aaahih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!               AAAHIH" + "'", str1, "HI!               AAAHIH");
    }

    @Test
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ", "AAAAAA#####!IHAAAAAA#####", "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhi                                                                 !                                                                                               !                              hi                                                                 !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          " + "'", str3, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ");
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                            ", "          ih  ihaaa         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i!hi!hi!hi!hihi!hi!hi!hi!hi!######", "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH", "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i hi hi hi hihi hi hi hi hi ######" + "'", str3, "i hi hi hi hihi hi hi hi hi ######");
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', (int) (byte) -1, 81);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" });
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           4444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           4444444" + "'", charSequence2, "44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           4444444");
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                            ", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ", 603);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                              !                                                                 ", "hi!                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              !                                                                 " + "'", str2, "                                                              !                                                                 ");
    }

    @Test
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!                                                                                             ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                         ", strArray6, strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!IH!IH!IHIH!I!!H!IH!IH!IH", 'a');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!         ", strArray7, strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                         " + "'", str8, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                         ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "!!IH!IH!IHIH!I!!H!IH!IH!IH" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "!         " + "'", str12, "!         ");
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("#ih", "hihI!Hi!                                                                                       hi", 657);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("i!hi!hi!hi!hi!!hhihihihih", "...4444444444444444444444444444444444444444444444", 307);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!hi!hi!hi!hi!!hhihihihih" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "i!hi!hi!hi!hi!!hhihihihih" });
    }

    @Test
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                         ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 137 + "'", int2 == 137);
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                              !                                                                 ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                              !                                                                 " });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hihi!hi!                                                                                       hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!hi!                                                                                       h" + "'", str1, "hihi!hi!                                                                                       h");
    }

    @Test
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih" + "'", str2, "!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih!HI!h!!ih");
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...HIHIH!", "!#ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                                                                                 !Ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hihi!hi!                                                                                       hi", "##");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hihi!hi!                                                                                       hi" });
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "HIHIHIHI!                                  HIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahihihihihihihihihihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                  hi                                                                                                                                                                                                                                                      ", "a");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ", "", (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!AAAAAAA", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!IHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hi!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I", "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "         !", (java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI!Hi!                                                                   ", "                                  !!ih!ih!ihih!i!!h!ih!ih!ih                                   ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!Hi!                                                                   " });
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                          ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ".." + "'", str1, "..");
    }

    @Test
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("iH!IH!IhihI!Hi!                                                                                       hi #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", "                                                                                                                                                                                                                                                                                                                                                                                                                                                            !                                       !                                                                                                                                                                                                                                                                                                                                                                                                     ", "HIhi!hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!########################                            !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!##..." + "'", str2, "!##...");
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("h                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("      HI!h", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI!h" + "'", str2, "      HI!h");
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########                              !         !         !", "                     !                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     !                                                      " + "'", str2, "                     !                                                      ");
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!!h!h!h!h!hh!h!h!h!h!       aaa       aaa       aaa       aaa       aaa       aaa       aaa  ", "4hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4hi", "", "                                !                                                          aa", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4hi" + "'", str4, "4hi");
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I ########", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         " + "'", str2, "                                                                                                                                                                              hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h                                         ");
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!IH                            ", "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                       ", "!!!hi!hi!!!hi!hi!!!hi!hi!", 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                       " + "'", str3, "                                                       ");
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hihihihi!                                  hihihihih", "                                ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                   ", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                              ", "ih!ih!ih!ih!ihih!ih!ih!ih!ih", "hi!hi!hi!h!!i!h");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi                                                                 !                                                                                               !                              hi                                                                 !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi                                                                 !                                                                                               !                              hi                                                                 !" + "'", str1, "hi                                                                 !                                                                                               !                              hi                                                                 !");
    }

    @Test
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########################################################################################################################################################################################################################################################", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ", "ih!ih!ih!ih!ihih!ih!ih!ih!ih", "44!44!HI !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     " + "'", str3, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ");
    }

    @Test
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hIhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii...", "aaaaaa##########...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                          hiHI!HI!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                         ", "44!44!HI !");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "                                                                                                          hih                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#########################################################################################################44444444444444444444444444444444444444444444444444444444444444444444          ...##########################################################################################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########################################################################################################44444444444444444444444444444444444444444444444444444444444444444444          ...##########################################################################################################" + "'", str2, "#########################################################################################################44444444444444444444444444444444444444444444444444444444444444444444          ...##########################################################################################################");
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!IH   !ih!ih!iH                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH   !IH!IH!IH                                                                                     " + "'", str1, "!IH   !IH!IH!IH                                                                                     ");
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaa                        ...", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "  iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I########!!!", 81);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!IHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hi!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!", 111, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!IHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hi!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!" + "'", str3, "i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!IHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHhi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hi!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!!I!!I!!I!I!!I!!!!I!!I!!IH#########i!!I!!I!");
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hI!Hi!                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih                             ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", "                             " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                             " + "'", str3, "!Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!iihIh!ih!ih!ih!ih!ihih!i!!h!ih!ih!i                             ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih                             " + "'", str4, "!ih                             ");
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!!!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", (int) (short) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str3, "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        a");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str10, "4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "#######!i                                           ", 0, 289);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#######!i                                           " + "'", str4, "#######!i                                           ");
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH! IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HIH                                                                                             ", 155, 68);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                          " + "'", str2, "           Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                          ");
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                     !                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!i", "h       ", "hihihih!ihhihihih!ihhihihi!!h!h!h!h!hh!h!h!h!h!.....................", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!i" + "'", str4, "!i");
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "   HI!Hi!                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                               !ih!!ihaaa", 66, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!IH   !IH!IH!IH                                                                                     ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!!!hi!hi!!!hi!hi!!!hi!hi!", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHIHIHIHI!                                  HIHIHIHIHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 249 + "'", int2 == 249);
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     h                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", "!!!!!!!!!!!!!!!!!                                                          hihi!hi!!!!!!!!!!!!!!!!!!", "aaahih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444                           44444444444444444444444444444444444444444444444444444444444444444444", 0, 106);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444                           44444444444444444444444444444444444444444444444444444444444444444444    " + "'", str3, "4444444                           44444444444444444444444444444444444444444444444444444444444444444444    ");
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 247);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        char[] charArray11 = new char[] { ' ' };
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             hi!", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          ", charArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444", charArray11);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray11);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                            !!hi!hi!                                            ", charArray11);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!                                                             !                                !                                !                                !", charArray11);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("         !", "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################hhhhhhhhhhhhhhhhhhhhhhhi                                                                 !                                                                                               !                              hi                                                                 !", "                                !                                                          aa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hIH                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hIH                        ..." + "'", str1, "hIH                        ...");
    }

    @Test
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!ih!ih!ih!ih!ihih!ih!ih!ih!ih!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", "!IH!IH!!IH!!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih##" + "'", str1, "ih##");
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!", "!h                                                                                                                                                                      aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa     hihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!" + "'", str2, "                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!   HI!Hi!                                                                                         Hi!hi!hi!");
    }

    @Test
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("AAAAAA#####!IHAAAAAA#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####AAAAAAHI!#####AAAAAA" + "'", str1, "#####AAAAAAHI!#####AAAAAA");
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!!hi!", 778, 263);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HIHiiiiiiiiiiiiiiiiiiiiiiiiiiii", "4hi                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HIHiiiiiiiiiiiiiiiiiiiiiiiiiiii" });
    }

    @Test
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!                                                                                                                                           !!hi!hi!                                                                                       !!hi!hi!                                                                                       !!hi!hi!            ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!                                !                                !                                !                                !                                ", "4IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                !                                !                                !                                " + "'", str2, "                                !                                !                                !                                !                                ");
    }

    @Test
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hhhhhhhhhhhhhhhhhhhhhhhi                                                                                                                                                                                                hi                                                                  ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaa                                                               ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                       !                                       !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                       !                                       !" + "'", str1, "                                                       !                                       !");
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!                                              ..          !     ", (java.lang.CharSequence) "                       HI!");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!                                              ..          !     " + "'", charSequence2, "!                                              ..          !     ");
    }

    @Test
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI                                                                                     ", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI                                                                                     " + "'", str2, "HI                                                                                     ");
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HIHIHIHI!                                  HIHIHIHIH", "aaaaaaaaaaaaaaaaaaa                                    !          HI!h      HI!h!!!!!!!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I########!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I########!!" + "'", str1, "  iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I########!!");
    }

    @Test
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("        HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH" + "'", str1, "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH");
    }

    @Test
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                    ", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       " + "'", str2, "                       ");
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("       !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!h!h!h!h!hh!h!h!h!h!                                                                 !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "hihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                   ", "                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!" + "'", str2, "                       hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!h", 60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!h" + "'", str2, "                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!h");
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 98);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                          hiHI!HI!", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ", "44!44!HI!", 19);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                                             hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   " });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         " });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str11, "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                         ", "44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhi");
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "iihiihiihiihihiihiihiihiihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaH", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ih44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "...HIHIH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hiihiihiihiihihiihiihiihiihi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi#####################hi!hi!hi!hi!hihi!hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                !                                !                                !                                !", "hihihihihihihihihihihiHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIHHIHIHIHIH                         HI!HI!HI!HI!HIHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I44");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4", "IH", "!", "IH", "!", "IH", "!", "IH", "!", "IH", "!", "IHIH", "!", "I", "!!", "H", "!", "IH", "!", "IH", "!", "I", "44" });
    }

    @Test
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" i i i i                                                                                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                  ", 451);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { " i i i i                                                                                            " });
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hih       ", (java.lang.CharSequence) "                       !!hi!hi!h                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 88 + "'", int2 == 88);
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 403, "          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !            !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !            !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !            !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str3, "          !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !            !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !            !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !            !  !  !  !  ! !  !  !  !  !  !  !  !  !  !  ! !  !  !  !  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h!!i!hihi!hi!hi", "444444444444444444444444444444444444444444444444444444444444444444h", 136);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "HI HI HI HIHI HI HI HI HI", 7, 280);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 7 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi" });
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!                                                               H!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", 307, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                                               H!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH" + "'", str3, "!                                                               H!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str2, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                         ...     ", "                             HI!                                                                                                                                                                                                                          ", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH                        ...", "HI!#######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        char[] charArray8 = new char[] { '#', '4', ' ', 'a' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH!I4#########iH!IH!IH", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hih                                                                                             ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', '4', ' ', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                !                                !                                !                                " + "'", str1, "                                !                                !                                !                                ");
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", "  4hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                  ", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi" + "'", str1, "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi");
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!####### #############################hihi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!#######          #######     hi!hi!####### ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          " + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hi!hi!hi!hi!hihi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     h                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ", "                              !                                                                 IH                              !                                                                                               !                                                                 IH", 34);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!                                                                                               !                              HI                                                                 !" + "'", str5, "!                                                                                               !                              HI                                                                 !");
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi################################################H################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi################################################H################################################" });
    }

    @Test
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                              !                                                                 ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!Ihi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I#########iH!IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                              !                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                              !                                                                 " });
    }

    @Test
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                                                                                   ", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", (int) (short) 1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "!                                                                                                   " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                             hi", "       ...                                                                                      ", "HIa!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                             hi" + "'", str3, "                                                             hi");
    }

    @Test
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi", "                             hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!" + "'", str2, "ihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!");
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("       hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!h", " ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HIHIHIHIH!IHIHIHIH", "...     ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIH!IHIHIHIH" + "'", str3, "HIHIHIHIH!IHIHIHIH");
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444i!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                  ", 19, 657);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                               " + "'", str3, "                                                                               ");
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "                                                                                                                                                                                                                  !!h!h!h!h!hh!h!h!h!h!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H...HIHIH!H", 542);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        char[] charArray9 = new char[] { ' ' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                             hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "          ", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                                                                    ", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         !", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIh!ih!ih!ih!ih!ihih!i!...", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!               AAAHIH", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { ' ' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hhi!                                                                                             hi!                                                                                             HIhi!                                                                                             HI", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIhi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI" + "'", str3, "hhi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIhi!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI");
    }

    @Test
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!", 444, "!                                                                                               ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!!                                                                                               ...!                                                                                               ...!                                                                                               ...!                                                                                               ...!                                      " + "'", str3, "hi!hi!hi!!                                                                                               ...!                                                                                               ...!                                                                                               ...!                                                                                               ...!                                      ");
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "                     !                                                      ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "..!.!.!.!.", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                       HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("      HI!h      HI!h!!!!!!!...", 247);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI!h      HI!h!!!!!!!...                                                                                                                                                                                                                         " + "'", str2, "      HI!h      HI!h!!!!!!!...                                                                                                                                                                                                                         ");
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhih", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!hihihihih!", "hihihih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!hihihihih!" });
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "...#################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih", "hI!Hi!                                                                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        char[] charArray14 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                             hi!", charArray14);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", charArray14);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hihihihih                                  !ihihihih", charArray14);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                                                                HI!h                              !                                                                                               !                                                                 ih", charArray14);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaH", charArray14);
        boolean boolean21 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", charArray14);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!hi!hi!", charArray14);
        int int23 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "H! H! H! H! H!H! H! H! H! H!", charArray14);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertArrayEquals(charArray14, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray11);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!!", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                              !                                                                HI!h                              !                                                                                               !                                                                 ih", charArray11);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                       ", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "################################################################################################################################################################################################################################################", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                       hihihihi!                                  hihihihih", 247, "####################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       hihihihi!                                  hihihihih############################################################################################################################################################################" + "'", str3, "                       hihihihi!                                  hihihihih############################################################################################################################################################################");
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!         ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "...!hi!   aaaaaa####################################HHH####################################aaaaaaa", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaa", "444444444444444444444444", 158);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaa" });
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("...4444444444444444444444444444444444444444444444", "hihihi                       ...4444444444444444444444444HIhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        java.lang.String[] strArray5 = new java.lang.String[] { "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!                                  ", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!                                !                                !                                !                                !" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hih                                                                                             ", '#');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray5, strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "44444444444444444444444444444444444444444444444444444444444444444444                             HI");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ... HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIHHIHIHIHIH               ");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "!                                  ", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!                                !                                !                                !                                !" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hih                                                                                             " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hih" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hih                                                                                             " + "'", str12, "hih                                                                                             ");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "" });
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("      HI!h      HI!h!!!!!!!...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!h      HI!h!!!!!!!..." + "'", str1, "HI!h      HI!h!!!!!!!...");
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", "   HI!HI!                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                  !", " ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                                 H                          ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                                                                             ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", 898);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '4', 898, (int) (byte) 1);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("         !         !         !         ", strArray11);
        java.lang.String[] strArray19 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray19, "hi!");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray19, "!");
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray11, strArray23);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("h!!HI!HI", strArray5, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', 72, 250);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 72 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!                                                                                             " });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hhi!                                                                                             hi!                                                                                             HIhi!                                                                                             HI" + "'", str25, "hhi!                                                                                             hi!                                                                                             HIhi!                                                                                             HI");
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!", "                       hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!" + "'", str2, "hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!");
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH" + "'", str1, "!IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH                             !IH");
    }

    @Test
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", "HIHIHIHIH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                             4!                                     !IH!IH!!IH!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                        " + "'", str1, "                                                                                        ");
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        char[] charArray4 = new char[] { ' ', '4' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                              !                                                                 ih                              !                                                                                               !                                                                 ih", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "! H", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { ' ', '4' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("################################################H################################################", "...                                                   hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!", "                       !!hi!hi!h", "                             4hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                                                                                                                                           hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                           hi!" + "'", str1, "                                                                                                                                                           hi!");
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                                                                    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                             H", 969);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                              ", "                             4!                                                               4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 29, 249);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                      444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI", "                                                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HI!HI!HI");
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HIHIHIHI !                                    HIHIHIHIH", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      HI!h      HI!h", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!                                 ", "!hihihihih", "                                  ", 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!                                 " + "'", str4, "!                                 ");
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi" + "'", str2, "!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi");
    }
}

