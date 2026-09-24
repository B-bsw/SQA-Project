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
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4h         44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 128, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!!!class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test06003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06003");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", (java.lang.CharSequence) "hIhIhI444444444444444444444444444444444444444444444444444444444", 123);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       ");
    }

    @Test
    public void test06005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06005");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "Hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06006");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                hi!");
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test06007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "AAA");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "###########################################################################################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test06008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hI", "H         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI" + "'", str2, "hI");
    }

    @Test
    public void test06009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06009");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06010");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                              a########################a########################a#######################hi!", (java.lang.CharSequence) "...#############hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...##############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test06011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!Hi!Hi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "AAA", (java.lang.CharSequence) "AA#################################################################################################A");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "   ################################    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "!ih00.0011-!ih1-");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06015");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 483 + "'", int1 == 483);
    }

    @Test
    public void test06016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06016");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HI!HI!HI!HaIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi", (java.lang.CharSequence) "A###################################################################                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06017");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06018");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", 52, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi##############Hi#############", "4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi##############Hi#############" + "'", str2, "hi##############Hi#############");
    }

    @Test
    public void test06020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###################################", (int) (short) 1, "                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################" + "'", str3, "###################################");
    }

    @Test
    public void test06021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06021");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "###############################h                                ###############################", 32);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "###############################h                                ###############################");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "Hi!                                hi!                                hi!", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test06022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06022");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', 1, 120);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test06023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06023");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "...#############hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...##############", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06024");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "##aaHiia###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06026");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444", (java.lang.CharSequence) "                            hi!hi!hi!h                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06028");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444-1 hi! -1 100.0 0", 742, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444-1 hi! -1 100.0 0" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444-1 hi! -1 100.0 0");
    }

    @Test
    public void test06029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06029");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06030");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", "aaa                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test06031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                     H!IH!IH!IH                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06032");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("IaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06033");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                          I!I!I!I!I!I!I!I!I!I!", 15, "!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                          I!I!I!I!I!I!I!I!I!I!" + "'", str3, "                                                                          I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test06034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06034");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!", "                     H!IH!IH!IH                     ", 31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!" });
    }

    @Test
    public void test06035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06035");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "h         hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI                                                 ", (java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06036");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aIahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahihihiaI                                                 #hiaIahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahahihihiaIa", (java.lang.CharSequence) "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06038");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06039");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06040");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("a###################################################################       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("######hi!hi!hi!h#####", 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                    ######hi!hi!hi!h#####" + "'", str2, "                                                                                                                                                                                    ######hi!hi!hi!h#####");
    }

    @Test
    public void test06042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", "aiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiai");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test06043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test06044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06044");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Hihi!", (java.lang.CharSequence) "          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06046");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hihi", (java.lang.CharSequence) "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06047");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 0, (int) (short) -1);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence[]) strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                ", (java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test06048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06048");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "!ih                                                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: !ih                                                                                                                              ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test06049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06049");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("i!", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", 69);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test06050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06050");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test06051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06051");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06052");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("#################################################################hi", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String", (int) (short) 100);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray12, "###############################h                                ###############################");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("!", strArray8, strArray12);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", (java.lang.CharSequence[]) strArray8);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              ", "Hi##################################################################################################", 10);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("a###################################################################", strArray8, strArray21);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray8);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence[]) strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "#################################################################h" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!" + "'", str15, "!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              " });
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "a###################################################################" + "'", str22, "a###################################################################");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test06053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06053");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 239 + "'", int2 == 239);
    }

    @Test
    public void test06054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("##aahiia###########################################################################################", "!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06055");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!44444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06056");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h", "h                                                                                                   ", 39);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test06057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06057");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                hi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!");
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!");
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        java.lang.Class[] classArray10 = new java.lang.Class[3];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray11 = (java.lang.Class<?>[]) classArray10;
        wildcardClassArray11[0] = wildcardClass2;
        wildcardClassArray11[1] = wildcardClass5;
        wildcardClassArray11[2] = wildcardClass8;
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray11);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.Type[]) wildcardClassArray11);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.Type[]) wildcardClassArray11);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.Type[]) wildcardClassArray11);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.Type[]) wildcardClassArray11);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[]) wildcardClassArray11);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[]) wildcardClassArray11);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(classArray10);
        org.junit.Assert.assertArrayEquals(classArray10, new java.lang.Class[] { java.lang.String[].class, java.lang.String[].class, java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray11);
        org.junit.Assert.assertArrayEquals(wildcardClassArray11, new java.lang.Class[] { java.lang.String[].class, java.lang.String[].class, java.lang.String[].class });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str18, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str19, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str20, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str21, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str22, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str23, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str24, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test06058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06058");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "", "###############################h                                ###############################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06059");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("i!H", 20, "A############################...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!HA################" + "'", str3, "i!HA################");
    }

    @Test
    public void test06060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06060");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06061");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                     ...!AAAAAAAAAAAAAA...                                     aaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...!AAAAAAAAAAAAAA...", "aaaaaaaaaa" });
    }

    @Test
    public void test06062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06062");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                      !ih 0 0.001 1- !ih 1-", (java.lang.CharSequence) "a############################...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "...!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                        ...", (java.lang.CharSequence) "                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06064");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06065");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) " ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test06066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06066");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   " + "'", str4, "   ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06067");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahi!", "###############################h                                ###############################");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!", "");
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence[]) strArray8);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, 'a');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("i!", strArray4, strArray8);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("                              hi!", '4');
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                         ");
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", strArray17, strArray19);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A############################################H         A############################################", strArray8, strArray17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "ahi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "i!" + "'", str13, "i!");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "                              hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "                                                                                                         " });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str20, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "A############################################H         A############################################" + "'", str21, "A############################################H         A############################################");
    }

    @Test
    public void test06068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "Ahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test06069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06069");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##aaHiia######################################################################################", (java.lang.CharSequence) "h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06070");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h         ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############################h                                ###############################", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi##############Hi##############", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test06071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06071");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                 ", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                         ", "Hi##############Hi##############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         " + "'", str2, "                                                                         ");
    }

    @Test
    public void test06073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!...", (java.lang.CharSequence) "                                                                          I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06074");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                 ", 3);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "##################################################################################################a#H#iia#A##################################################################################################", (java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "I!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "             a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test06075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06075");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi##############Hi#############", "AA", 94);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi##############Hi#############" });
    }

    @Test
    public void test06076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06076");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi##############Hi#############hi##############Hi#############hi##############Hi#############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi##############Hi#############hi##############Hi#############hi##############Hi#############" + "'", str1, "hi##############Hi#############hi##############Hi#############hi##############Hi#############");
    }

    @Test
    public void test06077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06077");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                 Hi", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a#################################################################################################aa #################################################################hi A#################################################################################################aa", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test06078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#h##h##h##h##h##h#...", "AA###############################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h##h##h##h##h##h#..." + "'", str2, "h##h##h##h##h##h#...");
    }

    @Test
    public void test06080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Hihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hIHI" + "'", str1, "hIHI");
    }

    @Test
    public void test06081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" + "'", str1, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
    }

    @Test
    public void test06082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ha#################################################################################################aa #################################################################hi a#################################################################################################aaia#################################################################################################aa #################################################################hi a#################################################################################################aa!", 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ha###############################################################################..." + "'", str2, "ha###############################################################################...");
    }

    @Test
    public void test06083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                            hi!hi!hi!h                             ", 221);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            hi!hi!hi!h                                                                                                                                                                                       " + "'", str2, "                            hi!hi!hi!h                                                                                                                                                                                       ");
    }

    @Test
    public void test06084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06084");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#################################", 221, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################                                                                                                                                                                                            " + "'", str3, "#################################                                                                                                                                                                                            ");
    }

    @Test
    public void test06085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06085");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "!Hi!Hi...", 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi..." + "'", str3, "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...");
    }

    @Test
    public void test06086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06086");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h         ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############################h                                ###############################", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ahi!", charArray10);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                     h!ih!ih!ih                     ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test06087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06087");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################aH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################ah" + "'", str1, "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################ah");
    }

    @Test
    public void test06088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06088");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "...IH!IH!IH!IH!IH!IH!", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 465 + "'", int2 == 465);
    }

    @Test
    public void test06089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06089");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "a########################################################################################### Hii ##aa", (java.lang.CharSequence) "...IH!IH!IH!IH!IH!IH!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06090");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...###############################################h", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 0, 3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI###############################################h" + "'", str4, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI###############################################h");
    }

    @Test
    public void test06091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06091");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HiHiHHI!HI!HI!HI!HI!HI...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ihHiHiHHI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HiHiHHI!HI!HI!HI!HI!HI...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ihHiHiHHI!HI!HI!HI!HI!HI" });
    }

    @Test
    public void test06092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test06093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06093");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                                                       ", (java.lang.CharSequence) "hihi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06094");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aa#hi               a#aa               #a", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AA###############################################################################################", "                                 h                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA###############################################################################################" + "'", str2, "AA###############################################################################################");
    }

    @Test
    public void test06096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", (java.lang.CharSequence) "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06097");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" });
    }

    @Test
    public void test06098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06098");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06099");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str1, "...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test06100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06100");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06101");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi##############Hi#############", "...       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi##############Hi#############" });
    }

    @Test
    public void test06102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06102");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 25, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                              hIhIhI", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    hIhIhI" + "'", str2, "    hIhIhI");
    }

    @Test
    public void test06104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06104");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hhh", 0, 129);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06105");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "##aaHiia######################################################################################", "i!", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str4, "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test06106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06106");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 255);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test06107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06107");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi", 69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06108");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                                                                                     ", "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                     ");
    }

    @Test
    public void test06109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06109");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("a#################################################################################################aa #################################################################hi A#################################################################################################aa", "H#################################################################################################               #################################################################hi               #################################################################################################i#################################################################################################               #################################################################hi               #################################################################################################!", "a########################a########################a#######################hi!h                     ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("AA", "###############################################################################################################################################################################################################################################################", "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                         hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "H                                H                                H                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "                         hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test06112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06112");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        java.lang.Object[] objArray7 = new java.lang.Object[] { (byte) -1, "hi!", (-1L), 100.0f, 0L, "hi!" };
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join(objArray7, "", 35, (int) (byte) 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(objArray7, ' ');
        java.lang.Class<?> wildcardClass14 = objArray7.getClass();
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray17);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray17, "");
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.stripAll(strArray21, "                                                 hi!");
        java.lang.String[] strArray25 = org.apache.commons.lang3.StringUtils.stripAll(strArray21, "!");
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.stripAll(strArray25, "                                                                                                    ");
        java.lang.Class<?> wildcardClass28 = strArray25.getClass();
        java.lang.String[] strArray32 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi", 95);
        java.lang.Class<?> wildcardClass33 = strArray32.getClass();
        java.lang.String[] strArray37 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", (int) (short) 10);
        java.lang.String str38 = org.apache.commons.lang3.StringUtils.join(strArray37);
        java.lang.String[] strArray39 = org.apache.commons.lang3.StringUtils.stripAll(strArray37);
        java.lang.Class<?> wildcardClass40 = strArray39.getClass();
        java.lang.String[] strArray43 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h", "#################################################################################################");
        java.lang.Class<?> wildcardClass44 = strArray43.getClass();
        java.lang.Class[] classArray46 = new java.lang.Class[5];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray47 = (java.lang.Class<?>[]) classArray46;
        wildcardClassArray47[0] = wildcardClass14;
        wildcardClassArray47[1] = wildcardClass28;
        wildcardClassArray47[2] = wildcardClass33;
        wildcardClassArray47[3] = wildcardClass40;
        wildcardClassArray47[4] = wildcardClass44;
        java.lang.String str58 = org.apache.commons.lang3.StringUtils.join(wildcardClassArray47);
        java.lang.String str59 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.AnnotatedElement[]) wildcardClassArray47);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[-1, hi!, -1, 100.0, 0, hi!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[-1, hi!, -1, 100.0, 0, hi!]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 hi! -1 100.0 0 hi!" + "'", str13, "-1 hi! -1 100.0 0 hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "h" });
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(classArray46);
        org.junit.Assert.assertArrayEquals(classArray46, new java.lang.Class[] { java.lang.Object[].class, java.lang.String[].class, java.lang.String[].class, java.lang.String[].class, java.lang.String[].class });
        org.junit.Assert.assertNotNull(wildcardClassArray47);
        org.junit.Assert.assertArrayEquals(wildcardClassArray47, new java.lang.Class[] { java.lang.Object[].class, java.lang.String[].class, java.lang.String[].class, java.lang.String[].class, java.lang.String[].class });
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str58, "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str59, "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test06113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;H         CLASS [lJAVA.LANG.sT         I", "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...IH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...IH!IH!IH!IH!IH!IH!" + "'", str1, "...IH!IH!IH!IH!IH!IH!");
    }

    @Test
    public void test06115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "         H", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H         cl", "ss [Lj", "v", ".l", "ng.String;cl", "ss [Lj", "v", ".l", "ng.String;cl", "ss [Lj", "v", ".l", "ng.String;" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test06116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06116");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", "   aiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiai", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 233);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str4, "...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test06117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06117");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", 255, 482);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str3, "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test06118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("-1 hi! -1 100.0 0 ", "a########################a########################a#######################hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 hi! -1 100.0 0 " + "'", str2, "-1 hi! -1 100.0 0 ");
    }

    @Test
    public void test06119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06119");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "!ih                                                 ", 239);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test06121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06121");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hIhIhI", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hIhIhI" });
    }

    @Test
    public void test06122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06123");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "...!aaaaaaaaaaaaaa...", (java.lang.CharSequence) "                                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 39, "44444444444444444444444444444444444aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444aaaa" + "'", str3, "44444444444444444444444444444444444aaaa");
    }

    @Test
    public void test06125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06125");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", 49, "Hi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str3, "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test06126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06126");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Hi", "ahi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444", (java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "H" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06127");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06128");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("-1 HI! -1 100.0 0                                                                                                                                                    4444444444444444444444444444444444444444444444444444444444444444444444444444444444", 128);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 HI! -1 100.0 0                                                                                                                                                    4444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "-1 HI! -1 100.0 0                                                                                                                                                    4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06131");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...", (int) (byte) 0, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h         CLASS [LJAVA.LANG.STRI" + "'", str3, "h         CLASS [LJAVA.LANG.STRI");
    }

    @Test
    public void test06132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06132");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...!AAAAAAAAAAAAAA...", (java.lang.CharSequence) "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06133");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", (java.lang.CharSequence) "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!" + "'", str2, "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!");
    }

    @Test
    public void test06135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                                          ###################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                          ###################################################################################################" + "'", str1, "                                                                                                                          ###################################################################################################");
    }

    @Test
    public void test06136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi##############Hi#############", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hi##############Hi#############                           " + "'", str2, "                           hi##############Hi#############                           ");
    }

    @Test
    public void test06137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06137");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "", (java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06138");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                                                           hihi!", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test06140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                       HI!HI!HI!H", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06141");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("...iH!iH!iH!iH!iH!iH!iH!iH                               ", "Ha#################################################################################################aa               #################################################################hi               a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!", "h         hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...iH!iH!iH!iH!iH!iH!iH!iH                               " + "'", str3, "...iH!iH!iH!iH!iH!iH!iH!iH                               ");
    }

    @Test
    public void test06142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06142");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("A#...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 233, 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A#...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "A#...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ", "                      Hi!                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ");
    }

    @Test
    public void test06144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06144");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06145");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                       HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!H" + "'", str1, "HI!HI!HI!H");
    }

    @Test
    public void test06146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test06147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06147");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06148");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "                                hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!44444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!44444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!44444444444444444444444444444444444444444");
    }

    @Test
    public void test06150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06150");
        java.lang.CharSequence charSequence0 = null;
        int int1 = org.apache.commons.lang3.StringUtils.length(charSequence0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test06151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06151");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test06152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06152");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06153");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06154");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi##############Hi##############HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!", "###############################h                                ###############################", 742);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi##############Hi##############HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi##############Hi##############HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!" + "'", str4, "Hi##############Hi##############HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!");
    }

    @Test
    public void test06155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", "                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                         " + "'", str2, "                                                                         ");
    }

    @Test
    public void test06156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06156");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "A################################", (java.lang.CharSequence) "i!H", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("class [Ljava.lang.String;class [Lja", (int) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [Ljava.lang.String;class [Lja" + "'", str3, "class [Ljava.lang.String;class [Lja");
    }

    @Test
    public void test06158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06158");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "##################################################################################################iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06159");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      ", 95);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test06160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06160");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "   ", (java.lang.CharSequence) "H...", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06161");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "   ################################    ", (java.lang.CharSequence) "         hi##############Hi#############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...i!h...", "#################################################################################################################################          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...i!h..." + "'", str2, "...i!h...");
    }

    @Test
    public void test06163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06163");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "A#################################################################################################aaHiia#################################################################################################aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("a#################################################################################################aa", 32, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a#################################################################################################aa" + "'", str3, "a#################################################################################################aa");
    }

    @Test
    public void test06165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" + "'", str2, "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test06166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank(";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!...", "hIHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!..." + "'", str2, ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!...");
    }

    @Test
    public void test06167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06167");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "Hi#########################################################################################################################", (java.lang.CharSequence) "  ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 123 + "'", int2 == 123);
    }

    @Test
    public void test06168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06168");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                                             a########################a#############", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiai");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                             a########################a#############" + "'", str3, "                                                             a########################a#############");
    }

    @Test
    public void test06170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06170");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence) "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test06171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06171");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", "#################################################################################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test06173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06173");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444444444hi44444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...       ", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06174");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("-1 hi! -1 100.0 0 ", "aaa                                                                 HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", "                                                                                                   ", 67);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "-1 hi! -1 100.0 0 " + "'", str4, "-1 hi! -1 100.0 0 ");
    }

    @Test
    public void test06175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi..." + "'", str2, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
    }

    @Test
    public void test06176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI!HI!HI!HI!HI!HI!HI!HI!HIi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H");
    }

    @Test
    public void test06177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06177");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06178");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 94, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("A################################################################################################...", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A..." + "'", str2, "A...");
    }

    @Test
    public void test06180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06180");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!!!!!!!!!!!!!!!#################################################################hi!!!!!!!!!!!!!!!", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaH                                H                                Haaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("               ..................................................................i               ................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               ..................................................................I               ................................" + "'", str1, "               ..................................................................I               ................................");
    }

    @Test
    public void test06182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################a", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4" + "'", str3, "!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4");
    }

    @Test
    public void test06183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                    hI!                          ...                                     ", "-1 HI! -1 100.0 0                                                                                                                                                    4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!                          ...                                     " + "'", str2, "hI!                          ...                                     ");
    }

    @Test
    public void test06184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06184");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, 255);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("4444444444", "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi" + "'", str2, "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test06186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06186");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "                          !ihih                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str2, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test06187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06187");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", (java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 247, 120);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "Hihi!", (java.lang.CharSequence[]) strArray3);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test06188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                     ", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                             " + "'", str2, "                                                                             ");
    }

    @Test
    public void test06189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06189");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                         ", (java.lang.CharSequence) "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06190");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aa#hi               a#aa               #a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06191");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h         class [Ljava.lang.String;class hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "######hi!hi!hi!h#####");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!", "                                ", (int) (short) 1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hI", 'a');
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("h                                h                                h                                ", strArray8, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", strArray3, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 14 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "         class [Ljava.lang.Str", "ng;class ", "I", "                                HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI", "HI" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hI" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "h                                h                                h                                " + "'", str14, "h                                h                                h                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hI" + "'", str15, "hI");
    }

    @Test
    public void test06192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", (java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                           hi##############Hi#############                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi##############Hi#############" + "'", str1, "hi##############Hi#############");
    }

    @Test
    public void test06194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06194");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 41);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06195");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06196");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("         H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test06197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06197");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "a########################a########################a#######################hi!h", "a########################a########################a#######################hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06198");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!" });
    }

    @Test
    public void test06199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06199");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!", "h                                h                                h                                ", "############################4#i##i##i##44444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!" + "'", str3, "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!");
    }

    @Test
    public void test06201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06201");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(charSequence0, (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06202");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "...!AAAAAAAAAAAAAA...", (java.lang.CharSequence) "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06203");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H", "hi!hi!hi!hhi!hi!hi!h", 129);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H" + "'", str3, "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H");
    }

    @Test
    public void test06204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06204");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "a###################################################################                                ", (java.lang.CharSequence) "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHi!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", "hIhIhI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHi!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str2, "!!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHi!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test06206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06206");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi", (java.lang.CharSequence) "         hi##############Hi#############", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 93 + "'", int3 == 93);
    }

    @Test
    public void test06207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06207");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06209");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                      Hi!                       ", "! I! I! I! I! I! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      Hi!                       " + "'", str2, "                      Hi!                       ");
    }

    @Test
    public void test06211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06211");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444444", 143, "        hI######Hi####################Hi####################Hi####################Hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444" + "'", str3, "        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444");
    }

    @Test
    public void test06212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", 294);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi..." + "'", str2, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
    }

    @Test
    public void test06213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06213");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaa                                                              ", (java.lang.CharSequence) "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h    ", (java.lang.CharSequence) "                            hi!hi!hi!h                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06215");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "               #################################################################hi               ", (int) (short) 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "hI!                                ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                hi!                                hi!                                hi!", strArray5, strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                hi!                                hi!                                hi!" + "'", str10, "                                hi!                                hi!                                hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test06216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06216");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06217");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h                                                                                                   ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test06218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06218");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                          !ihih                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06219");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "H         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06220");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                H", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                H" + "'", str2, "                                H");
    }

    @Test
    public void test06221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06221");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444       ", (java.lang.CharSequence) "                                                             a########################a#############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("I!HI!HI!", "hihi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi!" + "'", str2, "hihi!");
    }

    @Test
    public void test06223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                HI!HI!HI!", "                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06224");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444-1 hi! -1 100.0 0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test06225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06225");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", charSequence2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06226");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a##################################", "h                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a##################################" });
    }

    @Test
    public void test06227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06227");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", (int) (short) 0, 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06228");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################################################", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hI!", "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("!", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "a#################################################################################################aa", (java.lang.CharSequence[]) strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", 0, 0);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "         I-1 HI! -1 100.0 0 HI!");
        boolean boolean18 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                                hi!                                hi!                                hi!", (java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!" + "'", str10, "!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test06229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06229");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                              hi!", (java.lang.CharSequence) "               a###################################################################                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hIhIhI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06232");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "I!I!I!I!I!I!I!I!I!I!", (java.lang.CharSequence) "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06233");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("i", "                                    hI!                          ...                                     ", "                                                             a########################a#############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test06234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aiii!ii!ii!i                             ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aiii!ii!ii!i                             " + "'", str2, "aiii!ii!ii!i                             ");
    }

    @Test
    public void test06235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06235");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                 44444444444444444444444444444444444", (java.lang.CharSequence) "                                H", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str2, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test06237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test06238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06238");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "A########################A########################A#######################HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06239");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###############################h                                ###############################", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                    ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test06240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06240");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                                  hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", (java.lang.CharSequence) "HI!HI!HI!H", 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 234 + "'", int3 == 234);
    }

    @Test
    public void test06241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("A########################A########################A#######################HI!H                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A########################A########################A#######################HI!H" + "'", str1, "A########################A########################A#######################HI!H");
    }

    @Test
    public void test06243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("I!HI!HI!", "         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!" + "'", str2, "I!HI!HI!");
    }

    @Test
    public void test06244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("##################################################################H                                ##################################################################", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################H                                ##################################################################" + "'", str2, "##################################################################H                                ##################################################################");
    }

    @Test
    public void test06245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06245");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ", 65, "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       " + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ");
    }

    @Test
    public void test06246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06246");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4", "", 32);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 60, (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test06247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hIhIhIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhIhIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "hIhIhIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06248");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!", "                                                                      !ih 0 0.001 1- !ih 1-");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!" });
    }

    @Test
    public void test06249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06250");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "###################################", "         H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str3, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test06251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06251");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", (java.lang.CharSequence) "                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06252");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hIhIhI44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06253");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i!Hi!Hi!Hi", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 129 + "'", int2 == 129);
    }

    @Test
    public void test06254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06254");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06255");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06256");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "a#################################################################################################aaHiia#################################################################################################aa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06257");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               ", '#');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "...###############################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               " });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test06258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06258");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test06259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06259");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                 h                                                                  ", "hI!                          ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06260");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!HI!H...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "a########################a########################a#######################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("AHIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444" + "'", str2, "AHIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444");
    }

    @Test
    public void test06262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444444444444444444444aaaaaaaaaaaaaaaaa", "hi##############Hi#############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444aaaaaaaaaaaaaaaaa" + "'", str2, "44444444444444444444444444444444444aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06263");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "a############################...", (java.lang.CharSequence) "                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06264");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                          I!I!I!I!I!I!I!I!I!I!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I!I!I!I!I!I!I!I!I!I!" });
    }

    @Test
    public void test06265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                              " + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                              ");
    }

    @Test
    public void test06266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a############################...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", "H#################################################################################################               #################################################################hi               #################################################################################################i#################################################################################################               #################################################################hi               #################################################################################################!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a############################..." + "'", str3, "a############################...");
    }

    @Test
    public void test06267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06267");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AA", "HI!HI!HI!H", "##aahiia###########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AA" + "'", str3, "AA");
    }

    @Test
    public void test06268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06268");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#################################################################hi               ################################", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06269");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "..aaaaaaaaaaaaaa!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 165);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "##aahiia###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06271");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06272");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "IaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiH", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                     ...!AAAAAAAAAAAAAA...                                     ", 0, "hi!                                hi!                                hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                     ...!AAAAAAAAAAAAAA...                                     " + "'", str3, "                                     ...!AAAAAAAAAAAAAA...                                     ");
    }

    @Test
    public void test06274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06274");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...", "       " });
    }

    @Test
    public void test06275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06275");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "...###############################################h", (java.lang.CharSequence) "A#################################################################################################AA #################################################################HI A#################################################################################################AA", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06276");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", (java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 103);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06278");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "          hc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         h", (java.lang.CharSequence) "                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06279");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              ", "Hi##################################################################################################", 10);
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("i!", strArray6, strArray7);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray11);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray11);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaH                                H                                Haaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray11);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              " });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "i!" + "'", str8, "i!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test06280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06280");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...       ", (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06281");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                         ", (java.lang.CharSequence) "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test06282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "IaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaH                                H                                Haaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06284");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                               ", 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06285");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("################################", 306, "aiii!ii!ii!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii################################" + "'", str3, "aiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii################################");
    }

    @Test
    public void test06286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06286");
        java.lang.CharSequence charSequence1 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h         ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence1, charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test06287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06287");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "  ", (java.lang.CharSequence) "...#############hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...##############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06288");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                                                                                                            hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06289");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", ";GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test06290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06290");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                 Hi");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "444444444444444444HHHHHHHHHHHHHHHHHHHHH                      ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                 ", "Hi" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test06291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("h         CLASS [LJAVA.LANG.STRI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hCLASS[LJAVA.LANG.STRI" + "'", str1, "hCLASS[LJAVA.LANG.STRI");
    }

    @Test
    public void test06292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("a###################################################################       444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a###################################################################       444444444444444444444444444" + "'", str1, "a###################################################################       444444444444444444444444444");
    }

    @Test
    public void test06293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06293");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                 hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H", '4');
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.split("                                                 hi!", "h                                                                                                   ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("hihi!");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                       HI!HI!HI!H", strArray11, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih 0 0.001 1- !ih 1-", strArray7, strArray11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                            hi!hi!hi!h                                                                                                                                                                                       ", strArray2, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 50 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "i!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hihi!" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                       HI!HI!HI!H" + "'", str14, "                                       HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "!ih 0 0.001 1- !ih 1-" + "'", str15, "!ih 0 0.001 1- !ih 1-");
    }

    @Test
    public void test06294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", (java.lang.CharSequence) "hIhIhI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 239);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("AA###############################################################################################                                   ", "i!HA################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA###############################################################################################                                   " + "'", str2, "AA###############################################################################################                                   ");
    }

    @Test
    public void test06297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444" + "'", str2, "        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444");
    }

    @Test
    public void test06298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06298");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h                                h                                h                                ", "hi");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                                ", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h                                h                                h                                " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h                                h                                h                                " + "'", str4, "h                                h                                h                                ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "h                                h                                h                                " + "'", str6, "h                                h                                h                                ");
    }

    @Test
    public void test06300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06300");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...###############################################h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06302");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...!HI!HI!HI!HI!HI!HI!HI!HI!HI...", (java.lang.CharSequence) "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06303");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AA#################################################################################################AAA######################################################################################hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "...!HI!HI!HI!HI!HI!HI!HI!HI!HI...", 60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...", "                     h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ..." + "'", str2, "h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
    }

    @Test
    public void test06306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!" + "'", str2, "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!");
    }

    @Test
    public void test06307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06307");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "H!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06308");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         h", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hihi", 165);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hihi" + "'", str2, "Hihi");
    }

    @Test
    public void test06310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06310");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "444444444444444444HIHHIH!HH!HH!HH!HH!HH!HH!HH!HH!IHH                      ", (java.lang.CharSequence) "                                            I         I         I         I  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06311");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               #################################################################hi               4444444444444444444444444444444444444444444444", "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 81 + "'", int2 == 81);
    }

    @Test
    public void test06312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "444444444444444444HIHHIH!HH!HH!HH!HH!HH!HH!HH!HH!IHH                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06313");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 233, "-1 hi! -1 100.0 0 hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 1-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 10" + "'", str3, "-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 1-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 10");
    }

    @Test
    public void test06314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06314");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("    #       #       #       #   ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    #       #       #       #   " });
    }

    @Test
    public void test06315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06315");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test06316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06316");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                 #Hi", "#################################", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                 ", "Hi" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                 4Hi" + "'", str5, "                                                 4Hi");
    }

    @Test
    public void test06317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hIhIhIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "IhIhIhIhIhIhIhIhIhIhHI!HI!HI!HhIhIhIhIhIhIhIhIhIhIh", "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hIhIhIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "hIhIhIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test06318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06318");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) 100, (byte) 10, (byte) 10, (byte) 10 });
    }

    @Test
    public void test06319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06320");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("               #################################################################hi               4444444444444444444444444444444444444444444444", 125, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test06321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06321");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "I!I!I!I!I!I!I!I!I!I", (java.lang.CharSequence) "!!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHi!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 146 + "'", int2 == 146);
    }

    @Test
    public void test06322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("ai");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ai" + "'", str1, "Ai");
    }

    @Test
    public void test06323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06323");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hIhIhIhIhIhIhIhIhIhIhHI!HI!HI!HhIhIhIhIhIhIhIhIhIhIh", "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hIhIhIhIhIhIhIhIhIhIhHI!HI!HI!HhIhIhIhIhIhIhIhIhIhIh" });
    }

    @Test
    public void test06324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06324");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", 48);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                                                                                                         ", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 70 vs 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test06325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "I!I!I!I!I!I!I!I!I!I", (java.lang.CharSequence) "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06326");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 4, 105);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str4, "h !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test06327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06327");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", (java.lang.CharSequence) "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa!Ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hI!                          ...", "                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!                          ..." + "'", str2, "hI!                          ...");
    }

    @Test
    public void test06329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hI!                          ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!                          ..." + "'", str1, "hI!                          ...");
    }

    @Test
    public void test06330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "a#################################################################################################aa               Hii               a#################################################################################################aa", (java.lang.CharSequence) "ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06333");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!", (java.lang.CharSequence) "    #       #       #       #   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test06334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06334");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                     h!ih!ih!ih                     ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06335");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", charSequence2, "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06336");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4h         44444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hIhIhI", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("AA#################################################################################################", '4');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4", "h", "         ", "44444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "AA#################################################################################################" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test06337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06337");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444aaaa", 20, "                      H!iIH!IH!IH!IH!IH!IH!IH!IH!IHiH!ih444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444aaaa" + "'", str3, "44444444444444444444444444444444444aaaa");
    }

    @Test
    public void test06338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("a########################a########################a#######################hi!h                                h                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A########################A########################A#######################HI!H                                H                            " + "'", str1, "A########################A########################A#######################HI!H                                H                            ");
    }

    @Test
    public void test06339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("HI!HI!HI!HaIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HaIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi" + "'", str1, "HI!HI!HI!HaIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi");
    }

    @Test
    public void test06340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06340");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       ", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06341");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "A#################################################################################################aa               Hii               a#################################################################################################aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii" + "'", str2, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test06343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444444444444444444", 2, "!ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!#################################################################", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#################################################################" + "'", str2, "!#################################################################");
    }

    @Test
    public void test06345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06345");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444hi44444444444444444", 124, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444hi44444444444444444                                                                                         " + "'", str3, "4444444444444444hi44444444444444444                                                                                         ");
    }

    @Test
    public void test06346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06346");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!#################################################################                                ", (java.lang.CharSequence) "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("H#################################################################################################               #################################################################hi               #################################################################################################i#################################################################################################               #################################################################hi               #################################################################################################!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H#################################################################################################               #################################################################hi               #################################################################################################i#################################################################################################               #################################################################hi               #################################################################################################!" + "'", str1, "H#################################################################################################               #################################################################hi               #################################################################################################i#################################################################################################               #################################################################hi               #################################################################################################!");
    }

    @Test
    public void test06348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...###############################A", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...###############################A" + "'", str3, "...###############################A");
    }

    @Test
    public void test06349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06349");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "i!Hi!Hi!Hi", (java.lang.CharSequence) "                                                                      !ih 0 0.001 1- !ih 1-");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06350");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         h", 33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06351");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 91, "!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!");
    }

    @Test
    public void test06352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                 #                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test06354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("...#############hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...##############", "#################################################################################################################################          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test06356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06356");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "i!H", (java.lang.CharSequence) "                                                             a########################a#############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06357");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "ASS [LJAVA.LANG.STRING;         ...", (java.lang.CharSequence) "                                 hI!hI!hI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06358");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aiii!ii!ii!i                            ", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                 4Hi", 58, "AA#################################################################################################AAA######################################################################################hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AA#                                                 4HiAA#" + "'", str3, "AA#                                                 4HiAA#");
    }

    @Test
    public void test06360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi##############Hi#############hi##############Hi#############hi##############Hi#############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06361");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("...i!h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...i!h..." + "'", str1, "...i!h...");
    }

    @Test
    public void test06362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                     H!IH!IH!IH                     ", (java.lang.CharSequence) "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06363");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#HI!#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#.");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 124 + "'", int1 == 124);
    }

    @Test
    public void test06364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06364");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "h##h##h##h##h##h#...", (java.lang.CharSequence) "   ################################    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06365");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween(";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                          hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hhi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06367");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06368");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", (int) (short) 10, "##aa               Hii               a###########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str3, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test06369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06369");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hIhIhIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (java.lang.CharSequence) "444444444444444444444444444444444444444...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!44444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06371");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("# ## ## ## ## ## #...", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "# ## ## ## ## ## #..." + "'", str2, "# ## ## ## ## ## #...");
    }

    @Test
    public void test06373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 1-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih", "     hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test06375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06375");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                HI!", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                HI!" + "'", charSequence2, "                                HI!");
    }

    @Test
    public void test06376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;", "          ", 124);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str3, "              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test06377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06377");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str1, "                                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test06378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06378");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "...i!h..", (java.lang.CharSequence) "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa!Ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06379");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06381");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                        hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        hi!" + "'", str1, "                        hi!");
    }

    @Test
    public void test06382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06382");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4h         44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06383");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", (java.lang.CharSequence) "i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
    }

    @Test
    public void test06385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06385");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aiii!ii!ii!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                       ", (int) (byte) -1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                       " + "'", str3, "                                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test06387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("H         ", "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06388");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "I!HI!H...", (java.lang.CharSequence) "AHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444444444", "aaa                                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444");
    }

    @Test
    public void test06390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06390");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                     h!ih!ih!ih                     ", "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      ", 4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                     h!ih!ih!ih                     " });
    }

    @Test
    public void test06391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06391");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06392");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "ahi!", (java.lang.CharSequence) "...###############################", 483);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06393");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa!Ih!", 2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06394");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h                                                                                                   ", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############################h                                ###############################", charArray10);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhHI!HI!HI!HhIhIhIhIhIhIhIhIhIhIh", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", charArray10);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] {});
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test06395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06395");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ahi!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "ahi", "!" });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06396");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "...###############################A");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06397");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test06398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06398");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test06399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 482, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "a########################a########################a#######################hi!h                                h", (java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...###############################################H", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06402");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "Hi##################################################################################################", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi##################################################################################################");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test06403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06403");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h                                h                                h                                ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test06404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "###############################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06405");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", (java.lang.CharSequence) "h###############################################...", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Hihi!", 482);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...###############################A", (int) (byte) 0, "A#################################################################################################aaHiia#################################################################################################aa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...###############################A" + "'", str3, "...###############################A");
    }

    @Test
    public void test06408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                 #Hi", "! I! I! I! I! I! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 #Hi" + "'", str2, "                                                 #Hi");
    }

    @Test
    public void test06409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06409");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!", (java.lang.CharSequence) "#################################################################################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06410");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#################################################################################################", "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################################################" + "'", str2, "#################################################################################################");
    }

    @Test
    public void test06411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06411");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HIhIhI444444444444444444444444444444444444444444444444444444444", 234, "...!aaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa....HIhIhI444444444444444444444444444444444444444444444444444444444...!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa....." + "'", str3, "...!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa....HIhIhI444444444444444444444444444444444444444444444444444444444...!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa.....");
    }

    @Test
    public void test06412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06412");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", "                                                                                HI!HI!HI!", 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test06413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06413");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!", (java.lang.CharSequence) "          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06414");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                                                                                                                                                    ######hi!hi!hi!h#####", (java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HIHi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                HI!HI!HI!HI!HI!HI", 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                              ", "hi!Hi!Hi!Hi!Hi!Hi!Hi!HihIhIhhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 255);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                              " + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                              ");
    }

    @Test
    public void test06416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06416");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(charSequence0, (java.lang.CharSequence) "a#################################################################################################aaHiia#################################################################################################aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "A#################################################################################################AA               #################################################################HI               A#################################################################################################AA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06418");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444", "...#############hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...##############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06419");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                             a########################a#############", 103);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06420");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                          I!I!I!I!I!I!I!I!I!I!", "hhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                          I!I!I!I!I!I!I!I!I!I!" + "'", str2, "                                                                          I!I!I!I!I!I!I!I!I!I!");
    }

    @Test
    public void test06422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str1, "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test06423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06423");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "h class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 483);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06424");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         h" + "'", str1, ";gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         h");
    }

    @Test
    public void test06425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("######################################################################################aiiHaa##", 165);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######################################################################################aiiHaa##" + "'", str2, "######################################################################################aiiHaa##");
    }

    @Test
    public void test06426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("AA###############################################################################################                                   ", 3, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AA###############################################################################################                                   " + "'", str3, "AA###############################################################################################                                   ");
    }

    @Test
    public void test06427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                           hihi!", "               ..................................................................i               ................................", 255);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                           hihi!" + "'", str3, "                                                                                           hihi!");
    }

    @Test
    public void test06428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING; ..." + "'", str1, "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING; ...");
    }

    @Test
    public void test06429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;", 293, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################################################################################################################              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str3, "##################################################################################################################################################################################################              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test06430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06430");
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hclass[Ljava.lang.String;class[Ljava.lang.String;cla!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", (java.lang.CharSequence) "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Threshold must not be negative");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                      Hi!                       ", "                                                              a########################a########################a######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      Hi!                       " + "'", str2, "                      Hi!                       ");
    }

    @Test
    public void test06432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06432");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "...!AAAAAAAAAAAAAA...", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test06433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06433");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("I!HI!HI!", "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 66, 247);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HI!HI!h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str4, "I!HI!HI!h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test06434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06434");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...!aaaaaaaaaaaaaa...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06435");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "#################################################################################################################################          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HI!HI!HI!HiI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06437");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...", (java.lang.CharSequence) "                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06438");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06439");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "a###################################################", (java.lang.CharSequence) "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "a###################################################" + "'", charSequence2, "a###################################################");
    }

    @Test
    public void test06440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("44444444444444444444444444444444", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test06441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06441");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", 69, "AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str3, "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test06442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06442");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" });
    }

    @Test
    public void test06443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                              hIhIhI", "Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str2, "Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test06444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06444");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 0, (int) (short) -1);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence[]) strArray3);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "aaa" + "'", str10, "aaa");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test06445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06445");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!h", "!ih                                                                                                                              ", "HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h" + "'", str3, "hi!hi!hi!h");
    }

    @Test
    public void test06446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06446");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                        hi!", (java.lang.CharSequence) "hi##############Hi#############hi##############Hi#############hi##############Hi#############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06447");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 139, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str3, "4444444444444444444444444444444444444hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test06448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test06449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444444444444444444", "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06450");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                     HI!HI!HI!H                     ", (java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test06451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHi!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06452");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!#################################################################", "...i!h..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str3, "iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test06453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06453");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H", "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih" + "'", str1, "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih");
    }

    @Test
    public void test06455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06455");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                     ...!AAAAAAAAAAAAAA...                                     ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                     ...!AAAAAAAAAAAAAA...                                     " + "'", str2, "                                     ...!AAAAAAAAAAAAAA...                                     ");
    }

    @Test
    public void test06456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06456");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "a########################a########################a#######################hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ai", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                            ai" + "'", str2, "                                                            ai");
    }

    @Test
    public void test06458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06458");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06459");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "a###################################################################       ", (java.lang.CharSequence[]) strArray3);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi" + "'", str6, "hi");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test06460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06460");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "H!IH!IH!IH", (java.lang.CharSequence) "hI!                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06461");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###############################h                                ###############################", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertArrayEquals(charArray3, new char[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test06462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06462");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test06463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06463");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "########################a########################a#######################hi!h h", "Hi##############Hi##############HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06464");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                       ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06465");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444444444444444444444", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444" + "'", str5, "4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test06466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06466");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str1, "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test06467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06467");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#HI!#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#.", "hi!", "a#################################################################################################aa               Hii               a#################################################################################################aa", 31);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#HI!#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#." + "'", str4, "#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#HI!#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#.");
    }

    @Test
    public void test06468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", "                           hi##############Hi#############                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test06470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06470");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("################################       ", "Hi#########################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "################################       " });
    }

    @Test
    public void test06471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h    ", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h    " + "'", str2, "h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h    ");
    }

    @Test
    public void test06472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06472");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "                                ", (java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HIHi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test06473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06473");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "A...", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06474");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "###############################h                                ###############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                        I         I         I         I  ", 483);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                  I         I         I         I  " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                  I         I         I         I  ");
    }

    @Test
    public void test06476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str1, "AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test06477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06477");
        byte[] byteArray5 = new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "HI!HI!H...");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: HI!HI!H...");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 100, (byte) 100, (byte) 100, (byte) 10, (byte) 0 });
    }

    @Test
    public void test06478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                             a########################a#############", "################################       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                             a########################a#############" + "'", str2, "                                                             a########################a#############");
    }

    @Test
    public void test06479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii################################", "                     H!IH!IH!IH                     ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test06480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06480");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) ".");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", (java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test06482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06482");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "I!I!I!I!I!I!I!I!I!I", (java.lang.CharSequence) "h         hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06483");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI...", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06484");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   ", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!HI!", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test06485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06485");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "..." });
    }

    @Test
    public void test06486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H", "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H" + "'", str2, "          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H");
    }

    @Test
    public void test06487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06487");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06488");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("A############################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A############################..." + "'", str1, "A############################...");
    }

    @Test
    public void test06489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06489");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444444444444444444444444444", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444");
    }

    @Test
    public void test06491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06491");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!ih                                                                                                                              ", "...###############################################h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                                                              " + "'", str2, "!ih                                                                                                                              ");
    }

    @Test
    public void test06492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06492");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test06493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "-1 HI! -1 100.0 0 HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test06495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4" + "'", str1, "!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4");
    }

    @Test
    public void test06496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06496");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06497");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "-1 HI! -1 100.0 0                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test06498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("...###############################################H", "         H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test06499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06499");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test06500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test06500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!" + "'", str2, "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!");
    }
}

