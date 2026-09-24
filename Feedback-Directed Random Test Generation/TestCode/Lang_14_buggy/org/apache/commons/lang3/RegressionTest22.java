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
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A#################################################################################################AA               #################################################################HI               A#################################################################################################AA", (java.lang.CharSequence) "#################################################################################################...", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11002");
        byte[] byteArray6 = new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "#################################################################hi");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: #################################################################hi");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) 100, (byte) 10, (byte) 1, (byte) 1, (byte) 100, (byte) 1 });
    }

    @Test
    public void test11003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih" + "'", str2, "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih");
    }

    @Test
    public void test11004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11004");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("h                                h                                h                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "                                ", "h", "                                ", "h", "                                                                                                    " });
    }

    @Test
    public void test11005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hH                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "-1 HI! -1H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hH                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "i!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hH                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test11006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11006");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AA#################################################################################################A", "hi##############Hi#############hi##############Hi#############hi##############Hi#############");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11007");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...       ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." });
    }

    @Test
    public void test11008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test11009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11009");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi", "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test11010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                       HI!HI!HI!H", "...h!ih!ih!ih!i...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       HI!HI!HI!H" + "'", str2, "                                       HI!HI!HI!H");
    }

    @Test
    public void test11011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11011");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11012");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence) "!Hi!Hi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "aa#hi               a#aa               #a", (java.lang.CharSequence) "               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11015");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "-1 HI! -1 100.0 0                                                                                                                                                    4444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test11016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11016");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                                                                                                                    ######hi!hi!hi!h#####", (java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11017");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "i!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i4!4HA4################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i4!4HA4################" + "'", str2, "i4!4HA4################");
    }

    @Test
    public void test11020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "h         hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI                                                 ", "444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hh!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aiii!ii!ii!i                            ", "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aiii!ii!ii!i                            " + "'", str2, "aiii!ii!ii!i                            ");
    }

    @Test
    public void test11022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11022");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11023");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11024");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11025");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("#################################################################hi", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String", (int) (short) 100);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "###############################h                                ###############################");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("!", strArray6, strArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!", (java.lang.CharSequence[]) strArray6);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              ", "Hi##################################################################################################", 10);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("a###################################################################", strArray6, strArray19);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray19, '4', 23, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 23 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "#################################################################h" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!" + "'", str13, "!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              " });
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "a###################################################################" + "'", str20, "a###################################################################");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              " + "'", str22, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              ");
    }

    @Test
    public void test11026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11026");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i!H                      ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!H                      " + "'", str2, "i!H                      ");
    }

    @Test
    public void test11027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str1, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test11028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("h                                h                                h                                                                                                                                                                                                     ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h                                h                                h                                                                                                                                                                                                     " + "'", str2, "h                                h                                h                                                                                                                                                                                                     ");
    }

    @Test
    public void test11029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I" + "'", str1, "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
    }

    @Test
    public void test11030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11031");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, "444444444444444444hi!HiHI!HI!HI!HI!HI!HI!HI!HI!HIi!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11032");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI", 9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H", "!H", "!H", "!H", "!H", "!H", "!H", "!H", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" });
    }

    @Test
    public void test11033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11033");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               ", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A444444444444444444444444444444444a########################a########################a#######################A4444444444444444444444444444444444", strArray3, strArray7);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "A444444444444444444444444444444444a########################a########################a#######################A4444444444444444444444444444444444" + "'", str8, "A444444444444444444444444444444444a########################a########################a#######################A4444444444444444444444444444444444");
    }

    @Test
    public void test11034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaa                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa" + "'", str1, "aaa");
    }

    @Test
    public void test11035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11035");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih                                ", (java.lang.CharSequence) "444444444444444444HHHHHHHHHHHHHHHHHHHHH                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11036");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI..", 39, "...!aaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI.." + "'", str3, "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI..");
    }

    @Test
    public void test11037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HiHiHHI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaa", "                                                                                                                                                             hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiHiHHI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaa" + "'", str2, "HiHiHHI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11038");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444444444444444444444444444444444444444444H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444H!IH!IH!IH" + "'", str1, "444444444444444444444444444444444444444444444444444444444H!IH!IH!IH");
    }

    @Test
    public void test11039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", 122);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!" + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
    }

    @Test
    public void test11040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11040");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" });
    }

    @Test
    public void test11041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11041");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "h                                h                                h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11042");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HA###############################################################################...", "Hi!Hi!Hi!HHI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A###############################################################################..." });
    }

    @Test
    public void test11043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      ", "4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      " + "'", str2, "hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      ");
    }

    @Test
    public void test11044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11044");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#########################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#########################################################" });
    }

    @Test
    public void test11045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "4444444444444444HI44444444444444444                                                                                        ", "-1 HI! -1 100.0 0                                                                                                                                                    4444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          " + "'", str1, "          ");
    }

    @Test
    public void test11047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11047");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 25);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test11048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11048");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(charSequence0, (java.lang.CharSequence) "##############################################AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11049");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                 ", 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11050");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", (int) (short) 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join(strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI!", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A#################################################################################################aa               Hii               a#################################################################################################aa", (java.lang.CharSequence[]) strArray5);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "4444444444444444hi44444444444444444", 509, 93);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HI!" + "'", str9, "HI!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test11051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11051");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                      ;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH", "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11052");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hI!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" + "'", str1, "HI!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
    }

    @Test
    public void test11053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11053");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aiii!ii!ii!i                             ", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11054");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "    hIhIhI", 63, 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11055");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 0, 14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11056");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "#################################################################################################aHiiaA#################################################################################################", (java.lang.CharSequence[]) strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str5, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11057");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##################################               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...##################################", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11058");
        byte[] byteArray6 = new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.toString(byteArray6, "aaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: aaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] { (byte) -1, (byte) -1, (byte) 10, (byte) 100, (byte) 100, (byte) -1 });
    }

    @Test
    public void test11059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11059");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaa                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "###############################aa", 121);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test11062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11062");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                              a########################a########################a######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################a########################a########################a                                                              " + "'", str1, "######################a########################a########################a                                                              ");
    }

    @Test
    public void test11063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", "                                            I         I         I         I  ", "                                                 #");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" + "'", str3, " !HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
    }

    @Test
    public void test11064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String", 509, "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String" + "'", str3, "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String");
    }

    @Test
    public void test11065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("I!HI!HI!HI!HI!HI...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ihHiHiHHI!HI!HI!HI!HI!HI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ihHiHiHHI!HI!HI!HI!HI!HI" + "'", str2, "I!HI!HI!HI!HI!HI...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ihHiHiHHI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test11068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  ...", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11069");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4h         44444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4", "h", "         ", "44444444444444444444444444444" });
    }

    @Test
    public void test11070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11070");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...!", "!", "!", "!", "!", "!", "!", "!", "!", "..." });
    }

    @Test
    public void test11071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi!hi!hi!hi!hi!hi!hi!hii!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                      h!iih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                      h!iih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test11073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11073");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!hI!hI!hI!hI!hI!h", "a#################################################################################################aa               #################################################################hi               a#################################################################################################aa", "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!hi!hi!hi!hi..." + "'", str1, "!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test11075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaH                                H                                Haaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaah                                h                                haaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaah                                h                                haaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11076");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hIhIhIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                     h!ih!ih!ih                     ", "I!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("A#...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A#...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "A#...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11079");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!                                                                                                                                                                                                                                            ", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!" });
    }

    @Test
    public void test11080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11080");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11081");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                 h                                                                  ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 52, 34);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str1, "...   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test11083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11083");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "##########################################################################class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i###########################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("##################################################################################################################################################################################################              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", "               ###############################################aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" + "'", str2, "##################################################################################################################################################################################################              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test11085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11086");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 31, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               " + "'", str3, "                               ");
    }

    @Test
    public void test11087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11087");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiai", "##aaHiia######################################################################################", 67, 84);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiai##aaHiia######################################################################################" + "'", str4, "aiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiai##aaHiia######################################################################################");
    }

    @Test
    public void test11088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                               ", "...       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test11089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11089");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h                                h                                h                                ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                          ###################################################################################################", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test11090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("AAA", (int) '#', "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444AAA" + "'", str3, "44444444444444444444444444444444AAA");
    }

    @Test
    public void test11091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###############################H                                ###############################", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                ###############################" + "'", str2, "                                ###############################");
    }

    @Test
    public void test11092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11092");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444", 91);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11093");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                              a########################a########################a#######################hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               ", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih          ..." + "'", str2, "!ih          ...");
    }

    @Test
    public void test11096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("AHI", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI" + "'", str2, "AHI");
    }

    @Test
    public void test11097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11098");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih                                                                                                                              ", "                                                                                                                                                                                                                                                                                                   !h!h!h!h!h!h...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test11100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11100");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "A########################A########################A#######################HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11101");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "h class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11102");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test11103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11103");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hI!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444HI44444444444444444                                                                                        ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test11104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hI!hI!hI!hI!hI!hI!hI!hI!h", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    hI!hI!hI!hI!hI!hI!hI!hI!h                                     " + "'", str2, "                                    hI!hI!hI!hI!hI!hI!hI!hI!h                                     ");
    }

    @Test
    public void test11105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11105");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH", (java.lang.CharSequence) "##################################################################################################################################################################################################              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH" + "'", charSequence2, "H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH");
    }

    @Test
    public void test11106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11106");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...!AAAAAAAAAAAAAA...", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...!AAAAAAAAAAAAAA..." });
    }

    @Test
    public void test11107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11107");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11108");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "         H", 126);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test11110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11110");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4h         44444444444444444444444444444                                                                                                                                                                                                  ", (java.lang.CharSequence) "!!!        hI######Hi####################Hi####################Hi####################Hi#!!!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11112");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHa", "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHa" });
    }

    @Test
    public void test11113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11113");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("               #################################################################hi               ################################", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#################################################################hi", "################################" });
    }

    @Test
    public void test11114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11114");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                h", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                h" });
    }

    @Test
    public void test11115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("-1 hi! -1 100.0 0444444444444444444444444444444444444444444444444", "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 hi! -1 100.0 0444444444444444444444444444444444444444444444444" + "'", str2, "-1 hi! -1 100.0 0444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11116");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "44444444444444444444444444444444", (java.lang.CharSequence) "ahi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11117");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("a########################a########################a####################### i!                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a########################a########################a#######################i!" + "'", str1, "a########################a########################a#######################i!");
    }

    @Test
    public void test11118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#" + "'", str1, "#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#");
    }

    @Test
    public void test11119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11119");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "                      h");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", charSequence2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test11120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444                                hiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444                                hiclicliclicliclicliclicliclicliclicliclicliclicliclicli[[[44444444444444444" + "'", str1, "4444444444444444                                hiclicliclicliclicliclicliclicliclicliclicliclicliclicli[[[44444444444444444");
    }

    @Test
    public void test11121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", (-1), 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str3, "i!H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test11122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11123");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi..." });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi..." });
    }

    @Test
    public void test11124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11124");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                            hi!hi!hi!h                                                         hi!hi!hi!h                                                         hi!hi!hi!h                 CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", "                                                 #                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                             CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str3, "                                                                                                                                                                                             CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test11125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11125");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "HiHiHHI!HI!HI!HI!HI!HI...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ihHiHiHHI!HI!HI!HI!HI!H", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Ii!ii!ii!i", "a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test11127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11127");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Lja###############################################################################################################################################################################################################################################################", 35, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11128");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray12 = new char[] {};
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray12);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray12);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray12);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############################h                                ###############################", charArray12);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h                                                                                                   ", charArray12);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String", charArray12);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#################################", charArray12);
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "###############################H                                ###############################", charArray12);
        int int22 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!H", charArray12);
        boolean boolean23 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hIhIhI4444444444444444444444444444444444444444444444444444", charArray12);
        boolean boolean24 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, charArray12);
        org.junit.Assert.assertNotNull(charArray12);
        org.junit.Assert.assertArrayEquals(charArray12, new char[] {});
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test11129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11129");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...i!h...##aa               Hii               a###########################################################################################                                                                                                                              ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("-1 hi! -1 100.0 0", "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi", "         I-1 HI! -1 100.0 0 HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-1 hi! -1 100.0 0" + "'", str3, "-1 hi! -1 100.0 0");
    }

    @Test
    public void test11131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11131");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h", "4");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", "...i!h...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...i!h..." + "'", str2, "...i!h...");
    }

    @Test
    public void test11133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                          " + "'", str2, "                                                                          ");
    }

    @Test
    public void test11134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!IH", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test11135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "H!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test11136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11136");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(".");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "." });
    }

    @Test
    public void test11137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11137");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("h...", 96, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11138");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "Ahihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!#######aa               Hii               ahihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!#######aa", (java.lang.CharSequence) "...i!h..", 101);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11140");
        byte[] byteArray5 = new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: !Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 1, (byte) -1, (byte) -1, (byte) 0, (byte) 100 });
    }

    @Test
    public void test11141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11141");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", "                                hi!", 0);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi", (java.lang.CharSequence[]) strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI!                                ", (java.lang.CharSequence[]) strArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test11142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11142");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "A444444444444444444444444444444444a########################a########################a#######################A4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11143");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Lja###############################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11144");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ..." + "'", str1, "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
    }

    @Test
    public void test11145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "A########################A########################A#######################HI!H                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11146");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "A...", (java.lang.CharSequence) "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 263 + "'", int2 == 263);
    }

    @Test
    public void test11147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11147");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...IH!IH!IH!IH!IH!IH!", 483);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!", (java.lang.CharSequence) "##aa               Hii               a###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11149");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "H!IH!IH!IH", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11150");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Lj", (java.lang.CharSequence) "# ## ## ## ## ## #...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11151");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                      ", "!!!!!!!!!!!!!!!#################################################################hi!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                      " });
    }

    @Test
    public void test11152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11152");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11153");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a########################a########################a#######################hi!h                                ", "44444444444                                                                     44444444444", "-1 HI! -1 100.0 0                                                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a########################a########################a#######################hi!h                                " + "'", str3, "a########################a########################a#######################hi!h                                ");
    }

    @Test
    public void test11154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11154");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH", "                                                 #                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH" + "'", str2, "H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH");
    }

    @Test
    public void test11155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!Hi!Hi...                                                                                                 44444444444444444444444444444444444", 730);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Hi!Hi...                                                                                                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "!Hi!Hi...                                                                                                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test11156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11156");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#######################################                               ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11157");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "        !ih00.0011-!ih1-        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test11158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11158");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "       ", (java.lang.CharSequence) "                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11159");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 ", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#################################################################################################################################          ", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "         H", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aa#################################################################################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test11160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11160");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "###############################h                                ###############################", 32);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########", (java.lang.CharSequence[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test11161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!hhi!", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               !hhi!               " + "'", str2, "               !hhi!               ");
    }

    @Test
    public void test11162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11162");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                           ", "I!I!I!I!I!I!I!I!I!I!", (int) ' ', 70);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                I!I!I!I!I!I!I!I!I!I!                     " + "'", str4, "                                I!I!I!I!I!I!I!I!I!I!                     ");
    }

    @Test
    public void test11163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11163");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "-1 hi! -1 100.0 0 ", 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11164");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 74, 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!H" + "'", str3, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test11165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11165");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                                      AHI!", (java.lang.CharSequence) "h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11166");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...", "aaa                                                                 HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", "                                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!..." + "'", str3, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!...");
    }

    @Test
    public void test11167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11167");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h         ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "H         ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!hI!hI!hI!hI!hI!hI...", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h         cl#ss [Lj#v#.l#ng.String;cl#ss hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test11168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11168");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a########################a########################a#######################hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "########################", "########################", "#######################hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4########################4########################4#######################hi!" + "'", str4, "4########################4########################4#######################hi!");
    }

    @Test
    public void test11169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", "Hi#                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               " + "'", str2, "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ");
    }

    @Test
    public void test11170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11170");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                            I         I         I         I  ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11172");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "A########################A########################A#######################HI!H                                ", "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("CLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[" + "'", str2, "CLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[");
    }

    @Test
    public void test11174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str1, "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test11175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11175");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hihi!", (java.lang.CharSequence) "AAA...                                     aaaaaaaaaa", 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444" + "'", str1, "44444444");
    }

    @Test
    public void test11177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!hhi!", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11178");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i", (java.lang.CharSequence) "!!!!!!!!!!!!!!!#################################################################hi!!!!!!!!!!!!!!!", 247);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!HHi!", "aiii!ii!ii!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!HHi!" + "'", str2, "###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!###AAA###############i!HHi!");
    }

    @Test
    public void test11180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11180");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hii!h                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi" + "'", str1, "Hi");
    }

    @Test
    public void test11182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("a#################################################################################################aaia#################################################################################################aa #################################################################hi a#################################################################################################aa!", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a#################################################################################################aaia#################################################################################################aa##################################################################hi#a#################################################################################################aa!" + "'", str3, "a#################################################################################################aaia#################################################################################################aa##################################################################hi#a#################################################################################################aa!");
    }

    @Test
    public void test11183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11183");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "      !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                    ", "AAA...                                     aaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4444444444444444hi44444444444444444                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...!HI!HI!HI!HI!...", 91, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!HI!HI!HI!HI!...444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "...!HI!HI!HI!HI!...444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("a########################a########################a####################### i!                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a########################a########################a####################### i!                                                              " + "'", str1, "a########################a########################a####################### i!                                                              ");
    }

    @Test
    public void test11188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11188");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "h                                ");
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "##########", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "!");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        int int21 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################################################", (java.lang.CharSequence[]) strArray20);
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.split("hI!", "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEach("!", strArray20, strArray24);
        boolean boolean26 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "a#################################################################################################aa", (java.lang.CharSequence[]) strArray24);
        java.lang.String str28 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray24, "                                                 hi!");
        java.lang.String[] strArray31 = org.apache.commons.lang3.StringUtils.split("hihi!", '#');
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEach("44444444", strArray24, strArray31);
        int int33 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = org.apache.commons.lang3.StringUtils.replaceEach("      hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi", strArray12, strArray31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h                                h                                h                                " + "'", str10, "h                                h                                h                                ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "!" + "'", str25, "!");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "I" + "'", str28, "I");
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hihi!" });
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "44444444" + "'", str32, "44444444");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test11189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11189");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11190");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "hi!" };
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "hi!", charSequenceArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequenceArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "               #################################################################hi               ", charSequenceArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa", charSequenceArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "...###################################...", charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test11191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                                " + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                                ");
    }

    @Test
    public void test11192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "h  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11193");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "!I!I!I!I!I!I!I!I!I!I", 730);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11194");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test11195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11195");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11196");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!", charSequence1, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "##################################################################################################a#H#iia#A##################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11198");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "############################4#i##i##i##44444444############;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!H...444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test11199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11199");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("iHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11200");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
    }

    @Test
    public void test11201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11201");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444444444444444               ih#################################################################", "ii!ii!ii!i", 105, 129);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444               ih##########################################ii!ii!ii!i" + "'", str4, "4444444444444444444444444444444444444444444444               ih##########################################ii!ii!ii!i");
    }

    @Test
    public void test11202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", "a                                 a########################a########################a#######################a                                  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11203");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi", 95);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "...                                                              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test11204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11204");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "HA#################################################################################################AA #################################################################HI A#################################################################################################AAIA#################################################################################################AA #################################################################HI A#################################################################################################AA!", (java.lang.CharSequence) "               ..................................................................I               ................................");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "                       AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11206");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ", (java.lang.CharSequence) "444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      444444444444444444hh!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("    #       #       #       #   ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    #       #       #       #   " + "'", str3, "    #       #       #       #   ");
    }

    @Test
    public void test11208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                              4444444444444444hi44444444444444444                                                                                                              ", "HIhIhI444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                              4444444444444444hi44444444444444444                                                                                                              " + "'", str2, "                                                                                                              4444444444444444hi44444444444444444                                                                                                              ");
    }

    @Test
    public void test11209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11209");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("A########################A########################A#######################HI!H                                ", "                                                 #                                                  ", 263);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "A########################A########################A#######################HI!H                                " });
    }

    @Test
    public void test11210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi..." + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
    }

    @Test
    public void test11211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;" + "'", str1, "H CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;");
    }

    @Test
    public void test11212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11212");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44444444444444444444444444444444444aaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI..." + "'", str3, "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...");
    }

    @Test
    public void test11213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                                                          hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaa!ih!", (java.lang.CharSequence) "I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11214");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("##############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 297, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                 " + "'", str3, "##############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                 ");
    }

    @Test
    public void test11215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11215");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...", (java.lang.CharSequence) "Hi##############Hi#############", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...                      hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi", 233);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                      hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                                                                                " + "'", str2, "...                      hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                                                                                ");
    }

    @Test
    public void test11217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("i", "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                                                         ", "                                          ##########             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test11218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "tring;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11219");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "               ..................................................................I               ................................A#################################################################################################AA ###", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "..................................................................i................................", "aiii!ii!ii!i                            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11221");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("I!HI!HI!iiiiiiiiiiiiiiiiii", "                                              hIhIhI", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!HI!iiiiiiiiiiiiiiiiii" + "'", str3, "I!HI!HI!iiiiiiiiiiiiiiiiii");
    }

    @Test
    public void test11222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11222");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "i", (java.lang.CharSequence) "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                     h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                     h!ih!ih!ih                     " + "'", str1, "                     h!ih!ih!ih                     ");
    }

    @Test
    public void test11224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11224");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "h");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 92 + "'", int5 == 92);
    }

    @Test
    public void test11225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11225");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i!" + "'", str1, "HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i!");
    }

    @Test
    public void test11226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("H!IH!IH!IH!IH!IHHIHIHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...IH!IH!IH!IH!IH!IHHIHIH", "                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11227");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                   ##############", "444444444444444444444444444444444444444...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!44444444444444444444444444444444444444444", "hclass[Ljava.lang.String;class[Ljava.lang.String;cla!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                   ##############" + "'", str3, "                                                                                   ##############");
    }

    @Test
    public void test11228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("################################       ", 189, 58);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11229");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!                                ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "! i! i! i! i! i! ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!                                " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test11230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444-1 hi! -1 100.0 0", (int) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444-1 hi! -1 100.0 0" + "'", str3, "444444444444444444-1 hi! -1 100.0 0");
    }

    @Test
    public void test11231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                      h!iih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11232");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                         ", "################################       ", 233);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                         " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
    }

    @Test
    public void test11233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11233");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11234");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                            hi!hi!hi!h                             ", (java.lang.CharSequence) "a#################################################################################################aa #################################################################hi A#################################################################################################aa", 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11235");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "IhIhIhIhIA...HIhIhIhIhIh", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11237");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11238");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 263);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11239");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11240");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               ", 67, 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       " + "'", str3, "       ");
    }

    @Test
    public void test11241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11242");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hIhIhhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "hIhIhhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11243");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "a########################a########################a#######################i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 76 + "'", int1 == 76);
    }

    @Test
    public void test11244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                 #", "AHIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444" + "'", str2, "AHIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444");
    }

    @Test
    public void test11245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11245");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "...######################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ...######################");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) -1, (byte) 1 });
    }

    @Test
    public void test11246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11246");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("#################################################################hi", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String", (int) (short) 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (int) (byte) 0);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "###############################h                                ###############################");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("!", strArray4, strArray8);
        java.lang.Class<?> wildcardClass12 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#################################################################h" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!" + "'", str11, "!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11247");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI", "hi!", 127);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("h                                ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "I" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "h                                " + "'", str8, "h                                ");
    }

    @Test
    public void test11248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#################################################################################################", 57, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################" + "'", str3, "#################################################################################################");
    }

    @Test
    public void test11249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11249");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444444444444444444444444444444444444444444444                                                                                         ", 484, 105);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11250");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hclass[Ljava.lang.String;class[Ljava.lang.String;cla!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", (java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hiH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               !" + "'", str8, "hiH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               !");
    }

    @Test
    public void test11251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hhh", "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhh" + "'", str2, "hhh");
    }

    @Test
    public void test11252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11252");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str1, "class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test11253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11253");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("aA#################################################################################################AAA######################################################################################hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aA#################################################################################################AAA######################################################################################hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str1, "aA#################################################################################################AAA######################################################################################hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test11254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11254");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("####################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "####################################################################################" });
    }

    @Test
    public void test11255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11255");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hIhIh", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11256");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!", 247, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
    }

    @Test
    public void test11257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11257");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hIhIhhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aiii!ii!ii!i                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhIhhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "hIhIhhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hiAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test11258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################ah", "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("44444444444444444444444444444444", "  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##################################################################H                                ##################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444");
    }

    @Test
    public void test11260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11260");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 72 + "'", int2 == 72);
    }

    @Test
    public void test11261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11261");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                 hi!", "h                                                                                                   ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hihi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                       HI!HI!HI!H", strArray3, strArray5);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "##############aa Hiia##############################################################################");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "i!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hihi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                       HI!HI!HI!H" + "'", str6, "                                       HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "!" });
    }

    @Test
    public void test11262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11262");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "444444444444####################", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11263");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhHI!HI!HI!HhIhIhIhIhIhIhIhIhIhIh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11264");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "##################################################################################################################################################################################################              H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", (java.lang.CharSequence) "44444444444                                                                     44444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11265");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", "                 aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" + "'", str3, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
    }

    @Test
    public void test11267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("h         ", "a#################################################################################################aa               Hii               a#################################################################################################aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h         " + "'", str2, "h         ");
    }

    @Test
    public void test11268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("a#################################################################################################aa", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################################################" + "'", str2, "#################################################################################################");
    }

    @Test
    public void test11269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("h                                                                                                   ", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test11270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11270");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "!ih 0 0.001 1- !ih 1-", (java.lang.CharSequence) "                                                                                                    ", 135);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11271");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "#####################################################################################################################################################################", (java.lang.CharSequence) "hIhIhI444444444444444444444444444444444444444444444444444444444                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11272");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h##h##h##h##h##h#...", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...   ", "                                     ...!AAAAAAAAAAAAAA...                                     aaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11273");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                                    ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...!HI!HI!HI!HI!HI!HI!HI!HI!HI...", '#');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i", strArray2, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                    " + "'", str4, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "...!HI!HI!HI!HI!HI!HI!HI!HI!HI..." });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "...!HI!HI!HI!HI!HI!HI!HI!HI!HI..." });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i" + "'", str9, "h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                    " + "'", str10, "                                                                                                    ");
    }

    @Test
    public void test11274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11274");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "a########################a########################a####################### i!                                                              ", (java.lang.CharSequence) "h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11275");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         I", "!ih                                                 ", 35);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h                                h                                h                                ", ' ');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray9);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray9);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "         I" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test11276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "... ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11277");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test11278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11278");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1 hi! -1 100.0 0 ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "  ", (java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "-1", "hi!", "-1", "100.0", "0" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "-1", "h", "-1", "100.0", "0" });
    }

    @Test
    public void test11279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11279");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih 0 0.001 1- !ih 1-");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "A################################################################### 444444444444444444444444444", 146, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!", "ih", " ", "0", " ", "0", ".", "001", " ", "1", "-", " ", "!", "ih", " ", "1", "-" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test11280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str2, "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test11281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!!!!!!!!!!!!!!!!hi!!!!!!!!!!!!!!!!!                                                                                        ", 128, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     !!!!!!!!!!!!!!!!hi!!!!!!!!!!!!!!!!!                                                                                        " + "'", str3, "     !!!!!!!!!!!!!!!!hi!!!!!!!!!!!!!!!!!                                                                                        ");
    }

    @Test
    public void test11282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444a#################################################################################################aaHiia#################################################################################################aa444444444444444444444444444444444444444444444", "hi!Hi!Hi!Hi!Hi!Hi!Hi!HihIhIhhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "!ih  4444444444444444444444444444444444444444444444444444444444                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444a#################################################################################################aa iia#################################################################################################aa444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444a#################################################################################################aa iia#################################################################################################aa444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11283");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4iii!ii!ii!i                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4iii!ii!ii!i                            " + "'", str1, "4iii!ii!ii!i                            ");
    }

    @Test
    public void test11284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11284");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "#################################################################hi");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test11285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "hIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str2, "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test11286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11286");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444444-1 hi! -1 100.0 0", 530, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("iHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "iHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11288");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "                                                                                                                            ", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hIhIhI444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11290");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih", "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!          ..................................................................I               ................................A#################################################################################################AA ###");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih" });
    }

    @Test
    public void test11291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#######################################                               ", "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################                               " + "'", str2, "#######################################                               ");
    }

    @Test
    public void test11292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH" + "'", str2, "H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH");
    }

    @Test
    public void test11293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11293");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", "                               ", 96);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!", (java.lang.CharSequence[]) strArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "#########################################################", (java.lang.CharSequence[]) strArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!ihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", (java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi..." });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test11294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                 a", "I!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hihi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi" + "'", str1, "hihi");
    }

    @Test
    public void test11297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11297");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hihi!", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Hi Hi Hi Hi Hi Hi HiAA###############################################################################################   i Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hihi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hihi!" + "'", str4, "Hihi!");
    }

    @Test
    public void test11298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11299");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h", (java.lang.CharSequence) "h                                h                                h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11300");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "!ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11301");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(charSequence0, (java.lang.CharSequence) "#################################################################hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11302");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 66);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                                         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi", "                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi" + "'", str2, "                                                                                                                                         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
    }

    @Test
    public void test11304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11304");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#################################################################################################aHiiaA#################################################################################################", 25, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################################################################################aHiiaA#################################################################################################" + "'", str3, "#################################################################################################aHiiaA#################################################################################################");
    }

    @Test
    public void test11305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11305");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "########...", (java.lang.CharSequence) "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!" + "'", str1, "!HI!");
    }

    @Test
    public void test11307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa!Ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH HI!HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAA!IH!" + "'", str1, "...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH HI!HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAA!IH!");
    }

    @Test
    public void test11308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11308");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AA#################################################################################################A", (java.lang.CharSequence) "              aaaaaaaaaaaaaaaaaaaaaaaaaH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHi!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11310");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                                 #                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                          HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa                                                          ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test11311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11311");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h                                ", "-1 hi! -1 100.0 0 ");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                       HI!HI!HI!H", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("A", "A#################################################################################################aa               #################################################################hi               a#################################################################################################aa", 97);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi", strArray4, strArray9);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "A########################A########################A#######################");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "h                                " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi" + "'", str10, "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "h                                " });
    }

    @Test
    public void test11312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test11313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AA#################################################################################################A", 125);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA#################################################################################################A" + "'", str2, "AA#################################################################################################A");
    }

    @Test
    public void test11314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11314");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "!hhi!", (java.lang.CharSequence) "               ..................................................................I               ................................A#################################################################################################AA ###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11315");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444" + "'", charSequence2, "HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11316");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                    ...", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str2, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test11318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11318");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h" + "'", str1, "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h");
    }

    @Test
    public void test11319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11319");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HiHiHiH", (java.lang.CharSequence) "iaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiai", 465);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 316 + "'", int3 == 316);
    }

    @Test
    public void test11320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11320");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                                                 hi!");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "!");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "                                                                                                    ");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "h         ", (java.lang.CharSequence[]) strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "4h         44444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi" });
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi" + "'", str16, "hi");
    }

    @Test
    public void test11321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11321");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("a###################################################################       444444444444444444444444444", "aA#################################################################################################AAA######################################################################################hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444444" });
    }

    @Test
    public void test11322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11322");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 49, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test11323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih          ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih          ..." + "'", str1, "!ih          ...");
    }

    @Test
    public void test11324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11324");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       " + "'", str2, "                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ");
    }

    @Test
    public void test11325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!", "                                H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!" + "'", str2, "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!");
    }

    @Test
    public void test11326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11326");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                 ", 15, 248);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                  " + "'", str3, "                  ");
    }

    @Test
    public void test11327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "..aaaaaaaaaaaaaa!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("ih", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ih" + "'", str2, "        ih");
    }

    @Test
    public void test11329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11329");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hh!", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hh!                             " + "'", str2, "hh!                             ");
    }

    @Test
    public void test11330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4########################4########################4#######################hi!", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4########################4########################4#######################hi!" + "'", str2, "4########################4########################4#######################hi!");
    }

    @Test
    public void test11331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11331");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "###################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11332");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hIHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11333");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", (java.lang.CharSequence) "HIhIhIhIhIA...HIhIhIhIhIh", 233);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11334");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hI!                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11335");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!h!h!h!h!h!h...", 87, 221);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11337");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("I!HI!HI!IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a##############HIhIhI444444444444444444444444444444444444444444444444444444444a##############", "i!HA################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11339");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "##aa               Hii               a#######...", 165);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444aa               Hii               a4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11340");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4h         44444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str3, "AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test11342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11342");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Ai", 0, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ai" + "'", str3, "Ai");
    }

    @Test
    public void test11343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11343");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11344");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11345");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11346");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("######################################################################444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "######################################################################", "444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test11347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11347");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaa                                                                 ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HI!HI!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444", "#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################aH");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaa                                                                 " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "44444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str7, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test11348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11348");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("..aaaaaaaaaaaaaa!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                         ", 93, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..aaaaaaaaaaaaaa!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                         " + "'", str3, "..aaaaaaaaaaaaaa!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                         ");
    }

    @Test
    public void test11349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11349");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "#####Hi", "##################################################################H                                ##################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("         hi##############Hi#############", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         hi##############Hi#############" + "'", str2, "         hi##############Hi#############");
    }

    @Test
    public void test11351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11351");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                       " });
    }

    @Test
    public void test11352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444####################", 85);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                     444444444444####################" + "'", str2, "                                                     444444444444####################");
    }

    @Test
    public void test11353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11353");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!IH 0 0.001 1- !IH 1-                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11354");
        char[] charArray0 = new char[] {};
        char[] charArray1 = new char[] {};
        char[] charArray2 = new char[] {};
        char[][] charArray3 = new char[][] { charArray0, charArray1, charArray2 };
        char[][][] charArray4 = new char[][][] { charArray3 };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(charArray4);
        org.junit.Assert.assertNotNull(charArray0);
        org.junit.Assert.assertArrayEquals(charArray0, new char[] {});
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertArrayEquals(charArray1, new char[] {});
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertArrayEquals(charArray2, new char[] {});
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void test11355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11355");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444", "hIhIhI444444444444444444444444444444444444444444444444444444444                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11356");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                         ", 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11357");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("i!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                              H                                                                              ", (java.lang.CharSequence) "A#...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11359");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hIhIhI444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) ";GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH", 730);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11361");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                                          ", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11362");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.toString(byteArray0, "i!Hi!Hi!Hi!Hi!HihIhIhI444444444444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11363");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hh!", (java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 80 + "'", int2 == 80);
    }

    @Test
    public void test11364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11364");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("Ahihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!#######aa               Hii               ahihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!#######aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ahihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!#######aa Hii ahihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!#######aa" + "'", str1, "Ahihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!#######aa Hii ahihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!#######aa");
    }

    @Test
    public void test11365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11365");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH" + "'", str1, "hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH");
    }

    @Test
    public void test11366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a###################################################################                                ", (java.lang.CharSequence) "H                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11367");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A############################...", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("IIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIII" + "'", str1, "IIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test11369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11369");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HIhIhIhIhIA...HIhIhIhIhIh", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HIhIhIhIhIA...HIhIhIhIhIh" });
    }

    @Test
    public void test11370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11370");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("a##############4444444444##################a#######################hi!h                                ", "HIhIhI444444444444444444444444444444444444444444444444444444444", "                                HI!", 20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a##############4444444444##################a#######################hi!h                                " + "'", str4, "a##############4444444444##################a#######################hi!h                                ");
    }

    @Test
    public void test11371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11372");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!", "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I" + "'", str4, "I");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "######################################################################444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11374");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                        ", 483, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################################################################################################################################################################################################################################################################################################################################################################                                                                                                        " + "'", str3, "###########################################################################################################################################################################################################################################################################################################################################################################################                                                                                                        ");
    }

    @Test
    public void test11375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "a########################a########################a#######################hi!h                                h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "                    ...", "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test11377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11377");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444                                                                                         ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444" });
    }

    @Test
    public void test11378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test11379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11379");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AA#                                                 4HiAA#", "a##################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AA#                                                 4HiAA#" });
    }

    @Test
    public void test11380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11380");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#" + "'", str3, "#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#");
    }

    @Test
    public void test11381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11381");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", (int) (short) 0, 77);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str3, "hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test11382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHa   ", "! I! I! I! I! I! ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHa   " + "'", str2, "  aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHa   ");
    }

    @Test
    public void test11383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11383");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("#    IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I#", "###########################################################################################################################################################################################################################################################################################################################################################################################                                                                                                        ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aIH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHhH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!Ia" + "'", str3, "aIH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHhH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!Ia");
    }

    @Test
    public void test11384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11384");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                                         " + "'", str1, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                                         ");
    }

    @Test
    public void test11385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11385");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", "a########################a########################a#######################                                                                                                                                                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11386");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("class[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;", 120, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test11387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("         I-1 HI! -1 100.0 0 HI!", 69);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         I-1 HI! -1 100.0 0 HI!" + "'", str2, "         I-1 HI! -1 100.0 0 HI!");
    }

    @Test
    public void test11388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11388");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                      ;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      ;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH" + "'", str2, "                      ;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALC;GNIRTS.GNAL.AVAJL[SSALCH");
    }

    @Test
    public void test11389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11389");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444i!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test11390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11390");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (int) '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test11391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("##############aa Hii", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##############aa Hii" + "'", str2, "##############aa Hii");
    }

    @Test
    public void test11392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hi#########################################################################################################################", (java.lang.CharSequence) "IhIhIhIhIhIhIhIhIhIhHI!HI!HI!HhIhIhIhIhIhIhIhIhIhIh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("###############################H                                ###############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################H###############################" + "'", str1, "###############################H###############################");
    }

    @Test
    public void test11394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11394");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "!ih  4444444444444444444444444444444444444444444444444444444444                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11395");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11396");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("   ", "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih", (int) (byte) 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "...I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!......I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "   " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test11397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11397");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "#################################################################hi               4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                   ###############", "hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                ", 14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11400");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "444444444444444444HHHHHHHHHHHHHHHHHHHHH                      ", (java.lang.CharSequence) "I!HI!HI!iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!Hi!Hi...                                                                                                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Hi!Hi...                                                                                                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             " + "'", str2, "!Hi!Hi...                                                                                                 44444444444444444444444444444444444                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
    }

    @Test
    public void test11402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11402");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               ", "a#################################################################################################aaia#################################################################################################aa #################################################################hi a#################################################################################################aa!", 25);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "          hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               " });
    }

    @Test
    public void test11403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11403");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "A###################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11404");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 122);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("      !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!      " + "'", str1, "      !hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi! hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!      ");
    }

    @Test
    public void test11406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11406");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                 Hi", (java.lang.CharSequence) "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################aH", 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11407");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11408");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                       ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;                                       " });
    }

    @Test
    public void test11409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11409");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("                                                                                        44444444444444444IH4444444444444444", "...###############################A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        44444444444444444IH4444444444444444" + "'", str2, "                                                                                        44444444444444444IH4444444444444444");
    }

    @Test
    public void test11410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi##############Hi#############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi##############Hi#############" + "'", str1, "hi##############Hi#############");
    }

    @Test
    public void test11411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11411");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hh!                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11412");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! ", "i4!4HA4################", "...ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                                                                          hi!hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaa!ih!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str1, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test11414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11414");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", 32);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################ah", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "hI!                                ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("a###################################################################", strArray5, strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ..." });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "a###################################################################" + "'", str12, "a###################################################################");
    }

    @Test
    public void test11415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11415");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...###############################################H");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "...###############################################", "H" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11416");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", (java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 84);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11417");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44444444444444444444444444444", "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11418");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "######################a########################a########################a                                                              ", 14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11419");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a########################a########################a####################### i!                                                              ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str6, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test11420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11420");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...aaaaaaaaaaaaaa!...", 34, 134);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11421");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HA#################################################################################################AA #################################################################HI A#################################################################################################AAIA#################################################################################################AA #################################################################HI A#################################################################################################AA!", "hi!hi!hi!hi!hi!hi!hi!hi!hii!h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HA#################################################################################################AA #################################################################HI A#################################################################################################AAIA#################################################################################################AA #################################################################HI A#################################################################################################AA" });
    }

    @Test
    public void test11422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11422");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...i!h...##aa               Hii               a###########################################################################################                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...i!h...##aa               Hii               a###########################################################################################" + "'", str1, "...i!h...##aa               Hii               a###########################################################################################");
    }

    @Test
    public void test11423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11423");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h                                h                                h                                ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11424");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444444444444444444444444444                                    HI!                          ...                                     4444444444444444444444444444444444444444444444444444444444444444444", "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test11425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11425");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444                                                                                         ", (java.lang.CharSequence) "#########################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11426");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI..." + "'", str2, "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
    }

    @Test
    public void test11428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11428");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!                                hi!                                hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi!", "hi!", "hi!" });
    }

    @Test
    public void test11429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11429");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                     ", "ahi!", 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           ahi!           " + "'", str3, "           ahi!           ");
    }

    @Test
    public void test11430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "H CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", (java.lang.CharSequence) "              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11431");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                      ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11432");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "I", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi##################################################################################################", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaa                                                              ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test11433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11433");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AA###############################################################################################   ", (java.lang.CharSequence) "#h##h##h##h##h##h#...", 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11434");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "AIAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHAHIHIHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11435");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                 hI!hI!hI", (java.lang.CharSequence) "aaa                                                                 HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "A###################################################################       444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11437");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11438");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "#Hi", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11439");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               ", (java.lang.CharSequence) "      hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11440");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                   ", 57);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11441");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                              hiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLiCLi[[[", (java.lang.CharSequence) "                                                                                                                                                                                    ######hi!hi!hi!h#####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11442");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("####################", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "####################" });
    }

    @Test
    public void test11443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444aaaaaaaaaaaaaaaaa", "HI!HI!HI!H                     aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444aaaaaaaaaaaaaaaaa" + "'", str2, "44444444444444444444444444444444444aaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test11444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11444");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HIhI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("A########################A########################A#######################HI!", "##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAA#HI!" + "'", str2, "AAA#HI!");
    }

    @Test
    public void test11446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11446");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaahi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test11447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("######Hi###################Hi###################Hi#############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######Hi###################Hi###################Hi#############" + "'", str1, "######Hi###################Hi###################Hi#############");
    }

    @Test
    public void test11448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11448");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hIhIhhi!hi!hi!hi!hi!hi...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!IHhIhIhhi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "hiH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               !", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11449");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(".........!aaaaaaaaaaaaaa....HIhIhI444444444444444444444444444444444444444444444444444444444...!aaaaaaaaaaaaaa......!aaaaaaaaaa...", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { ".........!aaaaaaaaaaaaaa....HIhIhI", "...!aaaaaaaaaaaaaa......!aaaaaaaaaa..." });
    }

    @Test
    public void test11450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11450");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a#################################################################################################aa");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "                                 h                                                                  ", 33, 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "a#################################################################################################aa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "a#################################################################################################aa" + "'", str7, "a#################################################################################################aa");
    }

    @Test
    public void test11451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11451");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!IH", "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444       ", "444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test11452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11452");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...###############################A", "aaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...###############################A" });
    }

    @Test
    public void test11453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("          4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...44444444444444444444444444444444aaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...44444444444444444444444444444444aaaa" + "'", str2, "4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...44444444444444444444444444444444aaaa");
    }

    @Test
    public void test11454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11454");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("###################################################################aaa                                                                 HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH###################################################################", "I!HI!HI!iiiiiiiiiiiiiiiiii", 57, 189);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#########################################################I!HI!HI!iiiiiiiiiiiiiiiiii##################################################" + "'", str4, "#########################################################I!HI!HI!iiiiiiiiiiiiiiiiii##################################################");
    }

    @Test
    public void test11455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11455");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence) "..........");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "###############################H                                ###############################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11457");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!ih 0 0.001 1- !ih 1-");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11458");
        byte[] byteArray2 = new byte[] { (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = org.apache.commons.lang3.StringUtils.toString(byteArray2, "                                                     444444444444####################");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                      444444444444####################");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] { (byte) 10, (byte) -1 });
    }

    @Test
    public void test11459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11459");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11460");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "-1 HI! -1H", (java.lang.CharSequence) "!Hi!Hi...                                                                                                 44444444444444444444444444444444444", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hiH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               !", 77);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               !" + "'", str2, "hiH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               !");
    }

    @Test
    public void test11462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI!H...", "   ################################    ", "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!H..." + "'", str3, "HI!HI!H...");
    }

    @Test
    public void test11463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11463");
        java.lang.String[] strArray5 = new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "   #                               ", "                                                                                                                                 ...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "#################################################################hi               4444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a', 57, 233);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 57 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "   #                               ", "                                                                                                                                 ...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", "", "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!" });
    }

    @Test
    public void test11464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h" + "'", str1, "h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h!h");
    }

    @Test
    public void test11465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11465");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11466");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               ..................................................................I               ................................A#################################################################################################AA ###", 730, 238);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11468");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("h                                ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "                                " });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test11469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11469");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "A444444444444444444444444444444444a########################a########################a#######################A4444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Hi##############Hi##############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI##############hI##############" + "'", str1, "hI##############hI##############");
    }

    @Test
    public void test11471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11471");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih                                                 ", 129);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test11472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11472");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(".iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.Stri");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { ".iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih", "", "", "", "", "", "", "", "", "class", "[Ljava.lang.Stri" });
    }

    @Test
    public void test11473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!iclass [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String", "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test11474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih", "a#################################################################################################aa               Hii               a#################################################################################################aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih" + "'", str2, "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test11475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11475");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", (java.lang.CharSequence) "hh!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11476");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAA", "                          !ihih                          ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAA" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAA" });
    }

    @Test
    public void test11477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11477");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test11478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11478");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "HA###############################################################################...", (-1));
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "         CL", "SS [lJ", "V", "", "L", "NG", "sTRING;CL", "SS [lJ", "V", "", "L", "NG", "sTRING;CL", "SS [lJ", "V", "", "L", "NG", "sTRING;" });
    }

    @Test
    public void test11479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11479");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                            hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test11480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11480");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) ".iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.Stri", (java.lang.CharSequence) "CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "aaa", 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11482");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###################################################################################################", "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...", 103);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 483, 93);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###################################################################################################" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test11483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11483");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test11484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11484");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi" + "'", str1, "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi");
    }

    @Test
    public void test11485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Hi#                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi#                                                 " + "'", str1, "Hi#                                                 ");
    }

    @Test
    public void test11486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", (java.lang.CharSequence) "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444...", 95, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##############################44444444444444444444444444444444...##############################" + "'", str3, "##############################44444444444444444444444444444444...##############################");
    }

    @Test
    public void test11489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11489");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444444444444444444444", "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi", 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi4444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test11490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                   !h!h!h!h!h!h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...h!h!h!h!h!h!                                                                                                                                                                                                                                                                                                   " + "'", str1, "...h!h!h!h!h!h!                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test11491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11491");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                      H!iIH!IH!IH!IH!IH!IH!IH!IH!IHiH!ih444444444444444444", (java.lang.CharSequence) "hI!                          ...                                    i!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHhI!                          ...                                     ", 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11492");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AHI!", "!ih", 294);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!ih 0 0.001 1- !ih 1-");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 129, 742);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 129 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AHI" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AHI" + "'", str5, "AHI");
    }

    @Test
    public void test11493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11493");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "a########################a########################a#######################", (java.lang.CharSequence) "ihIhIhIhIA...HIhIhIhIhIh", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test11494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii################################" + "'", str2, "aiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii################################");
    }

    @Test
    public void test11495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11495");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...##########################################################################a               ih##...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...##########################################################################a               ih##..." + "'", str1, "...##########################################################################a               ih##...");
    }

    @Test
    public void test11496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11496");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ai");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test11497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "...##!##!##!##!##!##!##!##!##!##!##!##!##!##!##!##!##!##!##!##!##H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;               ", (java.lang.CharSequence) "I!hI!hI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test11498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...!AAAAAAAAAAAAAA...aaaaaaaaaa", 32, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!AAAAAAAAAAAAAA...aaaaaaaaaa#" + "'", str3, "...!AAAAAAAAAAAAAA...aaaaaaaaaa#");
    }

    @Test
    public void test11499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11499");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "                                ###############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test11500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest22.test11500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                          HI!HI!HI!", "HI!HI!HI!HaIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          HI!HI!HI!" + "'", str2, "                                                                                          HI!HI!HI!");
    }
}

