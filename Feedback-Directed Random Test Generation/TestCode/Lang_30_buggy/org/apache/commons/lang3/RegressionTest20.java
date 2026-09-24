package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20 {

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
    public void test10001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444" + "'", str3, "H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444H444444444444444444H444444444H444444444H444444444H44444444HI!444444444H444444444H444444444H444444444");
    }

    @Test
    public void test10002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10003");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih!ih###################################", "!I!I");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih", "ih###################################" });
    }

    @Test
    public void test10004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10004");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI#HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10005");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H", (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10006");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!444", "         H         H         H         H        hi!         H         H         H         H         ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!444" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!444" + "'", str4, "I!444");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I!444" + "'", str5, "I!444");
    }

    @Test
    public void test10007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI4444444444444444444444444444444444444444#############################################HI!HI", "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444", 5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "I4444444444444444444444444444444444444444#############################################HI!HI" });
    }

    @Test
    public void test10008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 36, "hi!hihi!hih################################    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hihi!hih#########################" + "'", str3, "hi!hihi!hih#########################");
    }

    @Test
    public void test10009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10009");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("           hi!hiHi!hiHIhi!hiHi!hihi!h", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10010");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                        hI!HI            ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI" + "'", str2, "hI!HI");
    }

    @Test
    public void test10011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4            4", "H         H         H         H        hi!         H         H         H         H", "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10012");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "  4444444444444444444444444444444444444444444444!   ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!hi###########################hi!hi############hihi!hi###########################hi!hi############", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test10013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" H     hi!hi                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H     hi!hi" + "'", str1, "H     hi!hi");
    }

    @Test
    public void test10014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("############ih!ih##################################", "!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("i!hihi!hihihi!hihi!hi", "h################################ hi#hi hi#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hihi!hihihi!hihi!hi" + "'", str2, "i!hihi!hihihi!hihi!hi");
    }

    @Test
    public void test10016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10016");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaa", "444   4444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaa" });
    }

    @Test
    public void test10017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                    ...", (java.lang.CharSequence) "     4444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10018");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("################################", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444HIHi!hiHi!hi#Hi!hiHi!hiH", 460);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10019");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10020");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!hi", "Hi!hi", "HIhi!hi", "Hi!hi" });
    }

    @Test
    public void test10021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10021");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "h################################ Hi!hi hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                          ", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          " + "'", str2, "                                          ");
    }

    @Test
    public void test10023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10023");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444  aaaaaaa                         aaaaaaa     hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444   ", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "HI!HI                           HI!HI                           H################################                                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10024");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                ", 296, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "                                                                                                44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10025");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi! ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi! " });
    }

    @Test
    public void test10026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10026");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hhi!hihi!hih################################    ", "#############################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hhi!hihi!hih################################    " + "'", str2, "Hhi!hihi!hih################################    ");
    }

    @Test
    public void test10028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444!IH444", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444!IH444" + "'", str2, "4444!IH444");
    }

    @Test
    public void test10029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10029");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...hhi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hhi..." + "'", str1, "...hhi...");
    }

    @Test
    public void test10030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10030");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("!ihaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test10031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                          !IHHI            ", 41);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          !IHHI          " + "'", str2, "                          !IHHI          ");
    }

    @Test
    public void test10032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10032");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HI!HI!", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#I!HI#I!HI", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test10033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                             ##", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                           ##" + "'", str2, "                                                                                                           ##");
    }

    @Test
    public void test10034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10034");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("###############################################hi#!#hi#", "hih!ihih!ih############################### hi#hi hi#hi", 11);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
    }

    @Test
    public void test10035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hi", 96, "44hi!hi!44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hi" + "'", str3, "hihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hihihi!hihihi!hihi!hi");
    }

    @Test
    public void test10036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#####    H", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####    H" + "'", str2, "#####    H");
    }

    @Test
    public void test10037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hI#HI!HI                           HI!HI            ..", 50, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI#HI!HI                           HI!HI            .." + "'", str3, "hI#HI!HI                           HI!HI            ..");
    }

    @Test
    public void test10038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10038");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", "hi!hi                           hi!hi            ..", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10039");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "           H44H4h44H4hiH44H4h44H4H44H", "HI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HIHI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test10040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!hi!hihi!hih################################hi", "HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test10041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10041");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10042");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "4444!ih444                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10043");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaHI!HI!", "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaHI!HI!" });
    }

    @Test
    public void test10044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa", "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  444!       H      H      H      H      ###############################################   hi#hihi#hih################################h", "4444444HIHi!hiHi!hiH#########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10046");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "", 3);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 8, 98);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 8 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "                              " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!                              " + "'", str4, "hi!                              ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!                              " + "'", str6, "hi!                              ");
    }

    @Test
    public void test10047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10047");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny(charSequence5, charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hiHi!hi", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##!ih", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi                           Hi!hi            HIhi!hi                           Hi!h", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test10048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 38);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "...#####################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10049");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                    HIaHI                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!i!!i                           ii!!i            ii!i!!i                           ii!!i", "                                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!!i                           ii!!i            ii!i!!i                           ii!!i" + "'", str2, "!i!!i                           ii!!i            ii!i!!i                           ii!!i");
    }

    @Test
    public void test10051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!44...", "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!Hhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhhhhhhhhhhhhhhhhhhhhi!hhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10052");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10053");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "44!IH!IH4444!IH!IH4444!IH!IH44                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44!IH!IH4444!IH!IH4444!IH!IH44                " + "'", str1, "44!IH!IH4444!IH!IH4444!IH!IH44                ");
    }

    @Test
    public void test10054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10054");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!hi! HI!HI                           hI!HI            hiHI!HI       !  !   hi!hihi!hih################################hi!  !   hi!hihi!hih################################hi!  !   hi!h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444444HI!H444", "           hI!HI   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10056");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10057");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaahi!hihi!hihihi!h", "##############hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!4444    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!4444    " + "'", str1, "HI!4444    ");
    }

    @Test
    public void test10059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10059");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaahi!hihi!hihihi!h", "444!       H      H      H      H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10060");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi!hi!hihi!hih################################hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                    ", "ihHhihihihih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test10062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10062");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("I!HI                                       hiHI!HI                                       ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "I", "!", "HI", "                                       ", "hi", "HI", "!", "HI", "                                       " });
    }

    @Test
    public void test10063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444H   aaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444   hiHI!HI                           hI!HI", "           hi!hiHi!hiHIhi!hiHi!hihi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", "HII!HI                                       hiHI!HII!HI                           hI!HI        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####!#####" + "'", str2, "#####!#####");
    }

    @Test
    public void test10066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10066");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("###############################################hi#!#hi#", "    H     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10067");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...44444444444444444HIHi!hiHi!h......444ih!ihih!ih...44444444444444444HIHi!hiHi!h......444", "         H         H         H         H                    H         H         H         H      ", (int) (byte) -1, 236);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         H         H         H         H                    H         H         H         H      " + "'", str4, "         H         H         H         H                    H         H         H         H      ");
    }

    @Test
    public void test10068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!iih!iH                           ih!ihIH            ih!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!ih!ih", (int) '4', 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10070");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 865, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("############444hi!4444     ###############", "                                                                                                                                                                                         HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10072");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih!ih##################################", "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI", 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "ih!ih##################################" });
    }

    @Test
    public void test10073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10073");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaaaaaaaaaaaaaa#IH#!#IH###############################################aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaa#IH#!#IH###############################################aaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaa#IH#!#IH###############################################aaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10074");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("i!hiHi!hiH################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i", "!", "hi", "H", "i", "!", "hi", "H", "################################" });
    }

    @Test
    public void test10075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4", 18);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...", "!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####..." + "'", str2, "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi####...");
    }

    @Test
    public void test10077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hI   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HIHI!HI!HIHI!HI!", 2, 51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI" + "'", str3, "   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI");
    }

    @Test
    public void test10078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10078");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444   hiHI!HI                           hI!HI", "###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10079");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HII!HI                                       hiHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hii!hi                                       HIhi!hi" + "'", str1, "hii!hi                                       HIhi!hi");
    }

    @Test
    public void test10080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H4444444444444444" + "'", str1, "HI#HI#I#HI##HI#HI#I#HIHI#H4444444444444444");
    }

    @Test
    public void test10081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10081");
        char[] charArray9 = new char[] { 'a', '#', '#' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hiHi!hi", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                       A#############################################AHIA!AHIA                        ", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test10082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10082");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###############################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###############################" });
    }

    @Test
    public void test10083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("H         H         H         H                    H         H         H         H", "4444444444444444444444444           H44H4h44H4hiH44H4h44H4H44H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         H         H         H                    H         H         H         H" + "'", str2, "H         H         H         H                    H         H         H         H");
    }

    @Test
    public void test10084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10084");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "I!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" });
    }

    @Test
    public void test10085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10085");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 342 + "'", int1 == 342);
    }

    @Test
    public void test10086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10086");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI#H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hI#H" });
    }

    @Test
    public void test10087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hI!HI                           hI!HI                           h################################", "I#I#HIHI#H44444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str2, "hI!HI                           hI!HI                           h################################");
    }

    @Test
    public void test10088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10088");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                        IH!IH#############################################                       ", "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "i!hihi!hihihi!hihi!hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10089");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str1, "                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test10090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "H44H4h44H4hiH44H4h44H4H44H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10091");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "HI!HI");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test10092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H################################ Hi!hi hi!hi", "hi!hihi!hihihi!hihi!hi444HI!H444hi!hihi!hihihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10093");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("#############################################HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################HI!HI" + "'", str1, "#############################################HI!HI");
    }

    @Test
    public void test10094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10094");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hiaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hiaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "HIaHIa#############################444444444...HIa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                      444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "44hi!4444444hi!4444444hi!4444444hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa#hi!hi#hihihi#haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa#hi!hi#hihihi#haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa" + "'", str2, "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa#hi!hi#hihihi#haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa");
    }

    @Test
    public void test10099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10099");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#############################################HI!HI!##############################################", "HI ! HI ! HI ! HI");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "##########################################################################################################################################################################");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#############################################", "##############################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#####################################################################################################################################################################################################################################################################" + "'", str4, "#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 45 + "'", int5 == 45);
    }

    @Test
    public void test10100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10100");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "         H", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                                            hI!HIhi!                                             ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test10101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10101");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI   Hi!hiHi!hiH", "HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("#####hi!hi", "hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####hi!hi" + "'", str2, "#####hi!hi");
    }

    @Test
    public void test10103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10103");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("##############################################################################################################################################################################################################################################################################################################################################################");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##############################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##############################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test10104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10104");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!hi", "!44...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10105");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                                                                                 ", "HI!HI", 52);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "I                    ", 34, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test10106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10106");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444", 3, "    H     hi!hi                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hI   Hi!hiHi!hiH               Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI   Hi!hiHi!hiH               Hi" + "'", str1, "hI   Hi!hiHi!hiH               Hi");
    }

    @Test
    public void test10108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10108");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                   I!                        ", "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10109");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "                                                                                              I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10110");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test10111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10111");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!", (java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!" + "'", charSequence2, "!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
    }

    @Test
    public void test10112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10112");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI", "hi!                              ", 27, 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI#########################hi!                              HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI" + "'", str4, "HI#########################hi!                              HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI");
    }

    @Test
    public void test10113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10113");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...HIaHIaIaHIaaHIaHIaIaHIHIaH444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "HI", "I", "HI", "", "HI", "HI", "I", "HIHI", "H44444444444...HI", "HI", "I", "HI", "", "HI", "HI", "I", "HIHI", "H444" });
    }

    @Test
    public void test10114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10114");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("          IH!IH                           IH!IHIH            IH!IH  #############################", ' ', 105);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi                           hi!hi            hihi!hi                           hi!hi" + "'", str1, "Hi!hi                           hi!hi            hihi!hi                           hi!hi");
    }

    @Test
    public void test10116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "IH!IH##########Hi!hiHi!hiH##################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   " + "'", str2, "444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   444!   ");
    }

    @Test
    public void test10118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10118");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                                                                                                        #############################################hi!hi                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10119");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I!HI                           hI!HI            hiHI!HI                           hI!HI            #", "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hi", "...!IH!IH4444444444444444444444444444444444444444444444                   ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            #" + "'", str3, "I!HI                           hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test10120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10120");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ", (int) (byte) 10, "!   hi!hihi!hih################################hi4!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   " + "'", str3, "!ihhh!ihhh!ihhh!ihhh!ihhh!ihhh                                   ");
    }

    @Test
    public void test10122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10122");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!hihi!hih################################hih################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hihI!HI4444444444444444444444444444444444444444444444!HI!HI", "HI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "        ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444     hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           " + "'", str3, "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444     hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
    }

    @Test
    public void test10124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10124");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10125");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#####################################################################################################################################################################################################################################################################", "hI   Hi!hiHi!hiH    ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "###############################################hi#!#hi#############################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#####################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#####################################################################################################################################################################################################################################################################" + "'", str4, "#####################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10126");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("i!hihi!hii!hihi!hii!hihi!hii4444444444444444444444444444444444444444444i!hihi!hii!hihi!hii!hihi!hii!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test10127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("           hI!HI   ", "                                                               ......!ih!ih!ih!ih!ih!ih!ih", 78);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "           hI!HI   " + "'", str3, "           hI!HI   ");
    }

    @Test
    public void test10128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10128");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...###################################hi#!#hi#", "#########################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                  ", "                 444!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  " + "'", str2, "                                  ");
    }

    @Test
    public void test10130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10130");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##############444hi!4444###############", "HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10131");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hi", "hi!hi                           Hi!hi            HIhi!hi                           Hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hi" + "'", str2, "#######################################4444444444444444444444444444444444444444444444!hi!hihi!hi");
    }

    @Test
    public void test10132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10132");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("##############hihi!hi4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################", "                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44hi!hi!4444hi!hi!4444hi!hi!44", "                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           hI!HI            hiHI!HI                           hI!HI            #" + "'", str2, "                           hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test10134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10134");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         H", "Hi!hi                           Hi!hi                           H################################", 6);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("################################...", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 100, 48);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "         H" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10135");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10136");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", "                                                                                                 ", 44);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("#hi!hi#hihihi#", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test10137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                    ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                    " + "'", str2, "                                                                                    ");
    }

    @Test
    public void test10138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10138");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("            HIhi!hi                           ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test10139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10139");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!Haaaaaaa                         aaaaaaa     HI!H", '#', 393);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10140");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                44hi!hi!4444hi!hi!4444hi!hi!44", "I!HI  ...", 51);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                44hi!hi!4444hi!hi!4444hi!hi!44" });
    }

    @Test
    public void test10141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!hihi!hihihi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HIHIHI!HIHI!HI" + "'", str1, "HI!HIHI!HIHIHI!HIHI!HI");
    }

    @Test
    public void test10142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10142");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!hihi!hih#########################", "4444444444HI!HI!...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("AA", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AA" + "'", str2, "AA");
    }

    @Test
    public void test10144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10144");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10145");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "                                          444hi!4444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10146");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 69, 40);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", 58, "HI!HIHI!HIH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str3, "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }

    @Test
    public void test10148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10148");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          IH!IH                           IH!IHIH            IH!IH  #############################", "I!HIhI!HIh################################", 277);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "          IH!IH                           IH!IHIH            IH!IH  #############################" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "IH!IH                           IH!IHIH            IH!IH  #############################" });
    }

    @Test
    public void test10149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10149");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI" + "'", str1, "HI!HI");
    }

    @Test
    public void test10150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10150");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                               HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", "!44...", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                               HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI" + "'", str3, "                                                                                                                                                                                                                                                                                               HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
    }

    @Test
    public void test10151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10151");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("IH!IH###################################", "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test10152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10152");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##############hihHhihihihih################################hih################################!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444!   ", "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test10154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10154");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray5, strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "         H         H         H         H        hi!         H         H         H         H         ");
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         ", strArray5);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!HIHI!HI", '#');
        java.lang.String[] strArray19 = org.apache.commons.lang3.StringUtils.stripAll(strArray18);
        boolean boolean20 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                 !IH", strArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray5, strArray18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!                                " + "'", str10, "hi!                                ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "!HIHI!HI" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "!HIHI!HI" });
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str21, "  hiHI!HI                           hI!HI           aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10155");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                            hi!hi", "                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10156");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###############################################");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "##########################################################################################################################################################################");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("   ", strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###############################################" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test10157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test10158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("       H         H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         H       " + "'", str1, "H         H       ");
    }

    @Test
    public void test10160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10160");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...HIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hiHi!hiHi!hiHi!hiHIHIHi!hi...", "aaaaaaa                         aaaaaaa", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10161");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!444!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test10162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                           ih!ihih!ih                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10163");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#" });
    }

    @Test
    public void test10164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10164");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "             hi   hI!HIhI!HIh                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("4444444444444444444444444444444444444444444", "hi!##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444");
    }

    @Test
    public void test10166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##############################################################################################################################################################################################################################################################################################################################################################", (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10167");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10168");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444Hi!hiHi!hi", "                                                            444!   ", "hhi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HihiHihi" + "'", str3, "HihiHihi");
    }

    @Test
    public void test10169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10169");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("44444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "44444444AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10170");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "       ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10171");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("############444hi!4444     ###############", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...", 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############444hi!4444     ###############" + "'", str3, "############444hi!4444     ###############");
    }

    @Test
    public void test10172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI            hiHI!HI                           hI!HI            #" + "'", str1, "hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test10173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10173");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("###################...###################################hi#!#hi#...#####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################...###################################hi#!#hi#...#####################" + "'", str1, "###################...###################################hi#!#hi#...#####################");
    }

    @Test
    public void test10174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10174");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("        HI!         H         H         H         H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H         H         H         H         !IH        " + "'", str1, "H         H         H         H         !IH        ");
    }

    @Test
    public void test10175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa#hi!hi#hihihi#haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa#hi!hi#hihihi#haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa" + "'", str2, "haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa#hi!hi#hihihi#haaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaa");
    }

    @Test
    public void test10176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10176");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!HIHI!HIH##############...", "hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444  aaaaaaa                         aaaaaaa     hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444    hi!4444   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10177");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "...                                !IH!IH!IH!IH!IH!IH!IHAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test10178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10178");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("          ", "         ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test10179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HIaHIa#############################444444444...HIa", 62, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIaHIa#############################444444444...HIaaaaaaaaaaaaa" + "'", str3, "HIaHIa#############################444444444...HIaaaaaaaaaaaaa");
    }

    @Test
    public void test10180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10180");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!                                ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                " + "'", str3, "hi!                                ");
    }

    @Test
    public void test10181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10181");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                           ", "#############################################HI!HI", "hi!                               ", 258);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                       HI!HI!HI                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test10182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaHI#HIaa", "i!hiHi!hiH################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaHI#HIaa" + "'", str2, "aaHI#HIaa");
    }

    @Test
    public void test10183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!HI                           hI!HI            hiHI!HI                           hI!H...", "  IH!Ih4444444444444444444444444444444444444444444444  ", "...                   4444444444444444444444444444444444444444444444HI!HI!...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("################################...######################################################", (int) '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################...######################################################" + "'", str3, "################################...######################################################");
    }

    @Test
    public void test10186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                            444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!" + "'", str1, "444!                                                                                                                                                                                                                                                   hihi#hi!hi#hihihi#hi!");
    }

    @Test
    public void test10187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10187");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "     4444444444444444444444444444444444444444444444 hI!HI                           ", (java.lang.CharSequence) "hi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hihi4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 370 + "'", int2 == 370);
    }

    @Test
    public void test10188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("############444hi!4444     ###############", "ih!iH                           ih!ihIH            ih!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10189");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!ihih!ih", "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "          " + "'", str5, "          ");
    }

    @Test
    public void test10190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i", "!HIhI!HIh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i" + "'", str2, "hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i");
    }

    @Test
    public void test10191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("############################hi#!#hi#", "ihHhihihihih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################hi#!#hi#" + "'", str2, "############################hi#!#hi#");
    }

    @Test
    public void test10192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10192");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                            ", "         h####################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("I!HI                         HI!HIHI!HIH################################!HI                           hI!H...", 54);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                         HI!HIHI!HIH################################!HI                           hI!H..." + "'", str2, "I!HI                         HI!HIHI!HIH################################!HI                           hI!H...");
    }

    @Test
    public void test10194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("I!HI                           hI!HI                           h###############################", "                        hI!HI            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI   " + "'", str2, "I!HI   ");
    }

    @Test
    public void test10195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH" + "'", str1, "IH!IHIH!IhIH!IHihIH!IhIH!IH!4444444444444444444444444444444444444444444444H!IHIH!IhIH!IHihIH!IhIH!IH");
    }

    @Test
    public void test10196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Ih!iHi!444Ih!iHIh!iHi!444Ih!iHIh!iHi!444Ih!iH", "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih!iHi!444Ih!iHIh!iHi!444Ih!iHIh!iHi!444Ih!iH" + "'", str2, "Ih!iHi!444Ih!iHIh!iHi!444Ih!iHIh!iHi!444Ih!iH");
    }

    @Test
    public void test10197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10197");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("I!HI                           hI!HI            hiHI!HI                           hI!H..", "# Hi!hi hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!H.." + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!H..");
    }

    @Test
    public void test10199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10199");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10200");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  a#HI!hi!hi!aa       a###                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10201");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 229, 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                               ###################", 232);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               ###################                                                                                                                                                                                      " + "'", str2, "                               ###################                                                                                                                                                                                      ");
    }

    @Test
    public void test10203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Ih!iH                           ih!ihIH            ih!iH                        ...", "##############444hi!4444     ##############");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test10204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10204");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                       4#############################################4hi4!4hi4                        ", "HIHi!hi!hihi!hih################################iHi!hiH", 75, 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                       4#############################################4hi4!4HIHi!hi!hihi!hih################################iHi!hiH     " + "'", str4, "                       4#############################################4hi4!4HIHi!hi!hihi!hih################################iHi!hiH     ");
    }

    @Test
    public void test10205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10205");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 91 + "'", int1 == 91);
    }

    @Test
    public void test10206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10206");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                                                                                    ", "################################");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hI#HI");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10207");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "             HI   Hi!hi!hihi!hih################################    iHi!hiH                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!hihi!hi", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test10209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("4444444444444444444444444444444444444444444444hI!HI", "A#############################################AHIA!AHIA                                                 !HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444hI!HI" + "'", str2, "4444444444444444444444444444444444444444444444hI!HI");
    }

    @Test
    public void test10210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10210");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" H         H         H         H                    H         H         H         H", "                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " H         H         H         H                    H         H         H         H" + "'", str2, " H         H         H         H                    H         H         H         H");
    }

    @Test
    public void test10211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10211");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I!HI                           hI!HI            hiHI!HI                           hI!H...", "hI!                               ", 71);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                 444!   ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4444444444444444444444444444444444444444444444444h4444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!H..." });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!H..." + "'", str5, "I!HI                           hI!HI            hiHI!HI                           hI!H...");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!H..." });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "I!HI                           hI!HI            hiHI!HI                           hI!H..." });
    }

    @Test
    public void test10212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10212");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("H################################ hi#hi hi#hi", "                                            HI!HI!HI", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10213");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ihih ihih hi!hihi!hih", "                               ###################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10214");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!HI                           hI!HI  444   4444hI!HI                           hI!HI ", "hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 460);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "I                           ", "I", "I  444   4444", "I", "I                           ", "I", "I " });
    }

    @Test
    public void test10215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10215");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi!hiHi!hi!ih!ih4444444444444444444444444444444444444444444444HIhi!hiHi!hi");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test10216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10216");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aAAAAihAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAIHAAA" + "'", str1, "AAAAAIHAAA");
    }

    @Test
    public void test10217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10217");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                    IH!I", "############################hi#!#hi#", "                HI!HI!HI!AA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                    IHI" + "'", str3, "                                                                                                                                                                                                                                    IHI");
    }

    @Test
    public void test10218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI                           H################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           H################################" + "'", str1, "HI!HI                           H################################");
    }

    @Test
    public void test10219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("         H         H         H         H        HI!         H         H         H         H         ", "                       a#############################################ahia!ahia");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H         H         H         H        HI!         H         H         H         H         " + "'", str2, "         H         H         H         H        HI!         H         H         H         H         ");
    }

    @Test
    public void test10220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10220");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("         h");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("44HI444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         ", "h" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10221");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hihi!hihihi!hihi!hi                                                                                                                                                                                                                                                                   ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10222");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray9, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray4, strArray9);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " " + "'", str13, " ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!                                " + "'", str14, "hi!                                ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test10223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10223");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("########################", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 342);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("H#################################hi#hi#hi#hi", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10225");
        java.lang.CharSequence charSequence0 = null;
        char[] charArray10 = new char[] { 'a', '#', '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hI!HI", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                            HI!HI!HI!AA", charArray10);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!                                                                                                 ", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "    H                                      ", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test10226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10226");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H         H         H         H        hi!         H         H         H         H", (int) (short) 100, "HI!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H         H         H         H        hi!         H         H         H         HHI!HIhI!HIh#######" + "'", str3, "H         H         H         H        hi!         H         H         H         HHI!HIhI!HIh#######");
    }

    @Test
    public void test10227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10227");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################", "#############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10228");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
    }

    @Test
    public void test10229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10229");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!4444    ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!hi!hi                           Hi!hi            HIhi!hi              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!hi                           Hi!hi            HIhi!hi              " + "'", str3, "!hi!hi                           Hi!hi            HIhi!hi              ");
    }

    @Test
    public void test10231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10231");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str2, "HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test10232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10232");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H                  H         H         H         H        HI!         H         H         H         H        ", ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                             ", "hi!HI!HI!HI!HI!                              ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 534 vs 46");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test10233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10234");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...", 105);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444..." + "'", str2, "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...");
    }

    @Test
    public void test10236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10236");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################", 387);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test10237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hhhhhhhhhhhhhhhhhhhhhhh", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hi!hhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test10238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                           hI!HI            hiHI!HI                           hI!HI            #", "HI!HHHHHHHHHHHHHHHHHHHHHHH");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                           h", "", "", "", "            hi", "", "", "", "", "                           h", "", "", "", "            #" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test10239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h", "I!444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h" + "'", str2, "hi!hi!hi                           Hi!hi            HIhi!hi                           Hi!hhi!hi                           Hi!hi            HIhi!hi                           Hi!h");
    }

    @Test
    public void test10240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10240");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                            HI#HI                            ", "44444444444444444444444...", 42);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                            HI#HI                            " });
    }

    @Test
    public void test10241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#############################################", "###############################################   hi#hihi#hih################################h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################" + "'", str2, "#############################################");
    }

    @Test
    public void test10242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444hihiahi!hiahihihiahi!44444444444444444444444444444", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444hihiahi!hiahihihiahi!44444444444444444444444444444" + "'", str2, "4444444444444444444444444444hihiahi!hiahihihiahi!44444444444444444444444444444");
    }

    @Test
    public void test10243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10243");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h#################################hi#hi#hi#hi", "A#############################################AHIA!AHIA                                                 !HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h#################################hi#hi#hi#hi" });
    }

    @Test
    public void test10244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10244");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!hi!hihi!hih################################hi4!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hihi!hih################################hi4!" + "'", str1, "!hi!hihi!hih################################hi4!");
    }

    @Test
    public void test10245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10245");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                              HI#HI                                              ", "HI!HIhI!HIhiHI!HIhI!HI", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10246");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 47, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                               " + "'", str3, "                                               ");
    }

    @Test
    public void test10247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10247");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                         HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA" + "'", str2, "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaha...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hihi!hih################################", "##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hih################################" + "'", str2, "hi!hihi!hih################################");
    }

    @Test
    public void test10251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10251");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10252");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!HIHI!HI", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10253");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("4            4                           ", "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!HI                           hI!HI            hiHI!HI                           hI!HI", 229, 75);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10255");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("4            4", "     4444444444444444444444444444444444444444444444 Hi!hi                           ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444", "HIHi!hiHi!hi#Hi!hiHi!hiHIHI!HI!AAAAAAAAAAAAAAAAAAAAA", "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444     hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444HIHHI HHHI HH44444444444444444444444444444444IHI444444444444444444444444444444 44444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444HIHHI HHHI HH44444444444444444444444444444444IHI444444444444444444444444444444 44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test10257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ", "hI!IIhI!II");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10258");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!i!!i                           ii!!i            ii!i!!i                           ii!!i", "hh##hhh##hh################################", "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!!i                           ii!!i            ii!i!!i                           ii!!i" + "'", str3, "!i!!i                           ii!!i            ii!i!!i                           ii!!i");
    }

    @Test
    public void test10259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10259");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                    ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("hI!HI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test10260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "    H     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10261");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(".....................IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII......................", "hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!h", "hi!hhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10262");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "######################################", (java.lang.CharSequence) "                                             !ihIH!Ih                                            !i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10263");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi! HI!HI                           hI!HI            hiHI!HI       ", "HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI###################################HI!HI################!###################################HI!HI################HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test10264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10264");
        char[] charArray6 = new char[] { 'a', '#', '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI   Hi!hiHi!hiH               Hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test10265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10265");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                              ", 137, "                          hI!HI               ##############     4444!ih444##############");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          hI!HI               #############                                                                              " + "'", str3, "                          hI!HI               #############                                                                              ");
    }

    @Test
    public void test10266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               ", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               " + "'", str2, "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               ");
    }

    @Test
    public void test10267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10267");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaah");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaa!ih!ih");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str5, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aaa", "!", "ih", "!", "ih" });
    }

    @Test
    public void test10268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hiaaaaaaaaaaaaaaaa", 57, "Ih!iH                           ih!ihIH            ih!iH                        ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih!iH              hiaaaaaaaaaaaaaaaaIh!iH               " + "'", str3, "Ih!iH              hiaaaaaaaaaaaaaaaaIh!iH               ");
    }

    @Test
    public void test10269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!HI                           hI!HI                           h", 35, 137);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           h" + "'", str3, "                           h");
    }

    @Test
    public void test10270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10270");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AA", "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ", 36);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AA" });
    }

    @Test
    public void test10271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10271");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi     ", "                               ###################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                     ", "hi!#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                     " + "'", str2, "                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test10273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10273");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#############################################hi!hi!#############################################", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi###", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaah", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test10274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10274");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "44aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH", "HI   HI!HIHI!HIH################################    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10275");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("444444444444444444444444444444             ", "  44444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10276");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "H################################ Hi!hi hi!hi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10277");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     hi!hi", "ih!ih                                             4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10278");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I#I#HIHI#H44444444444444444", "HI!HI!HI!HHI!HI!HI!HHI!HI!HI!H4444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "#", "#", "", "", "", "#", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test10279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10279");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi#h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
    }

    @Test
    public void test10280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10280");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HIHi!hiHi!hi#Hi!hiHi!hiHI", "                   4444444                                                                          ", 17);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HIHi!hiHi!hi#Hi!hiHi!hiHI" });
    }

    @Test
    public void test10281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10281");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...#", "###################################hi!hi", 81);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "4");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...#" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "...#" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "...#" + "'", str6, "...#");
    }

    @Test
    public void test10282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("H         H         H         H                    H         H         H         H", "    H  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10283");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#############################################HI!HI!##########################################...                       #############################################hi!hi                                               #############################################hi!hi                                               #############################################hi!hi                                               #############################################hi!hi", "                                 hiaaaaaaaaaaaaaaaa", "H");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10284");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("H         H         H         H         !IH        ", "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10285");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                444!       H      H      H      H   ", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                444!       H      H      H      H   " });
    }

    @Test
    public void test10286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hi##############################################################################################################################################################################################################################################################################################################################################################################################################################", "i!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" ", "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test10288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            ih!ih                           ih!ihih            ih!ih                           ih!ih" + "'", str1, "            ih!ih                           ih!ihih            ih!ih                           ih!ih");
    }

    @Test
    public void test10289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10289");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI                           HI!HI                           H################################                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       " + "'", str2, "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ");
    }

    @Test
    public void test10291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10291");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("#############", "##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("     ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test10293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10293");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("h h h h h h h h h h h h", "HI!HI                           HI!HI                           H###############################################################################..##..############################################################################################..##..#################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10294");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4');
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", "hI!HI                           ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH!IH#############################################", strArray4, strArray9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "            ih!ih                           ih!ihih            ih!ih                           ih!ih", 37, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 37 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "IH!IH#############################################" + "'", str10, "IH!IH#############################################");
    }

    @Test
    public void test10295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10295");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h    h    h    h    h    h                                 ...", "                                                            444!   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("  44444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  44444444444444444444444444444444444..." + "'", str1, "  44444444444444444444444444444444444...");
    }

    @Test
    public void test10297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10297");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444hi!4444", "  hiHI!HI                           hI!HI           ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444hi!4444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hi!4444" + "'", str3, "444hi!4444");
    }

    @Test
    public void test10298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################" + "'", str1, "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################");
    }

    @Test
    public void test10299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10299");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hI!HIhI!HIh", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10301");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####", "ih!iH                           ih!ihIH            ih!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####" + "'", str2, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####");
    }

    @Test
    public void test10302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "hi!hi                           hi!hi            hihi!hi                           hi!hi            ", "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                   aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("      Hhi!                                     ", "I!HI                           hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      Hhi!                                     " + "'", str2, "      Hhi!                                     ");
    }

    @Test
    public void test10304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10304");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                444!       H      H      H      H   ", (java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10305");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray2, strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 69, 63);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!HI" + "'", str6, "hI!HI");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test10306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                 ih!ih     H ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 ih!ih     H " + "'", str2, "                 ih!ih     H ");
    }

    @Test
    public void test10307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                              hi!hihi!hih################################                                                                                                   ", "4444444444444444444444444444444!   444hi!4444   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              hi!hihi!hih################################" + "'", str2, "                                                                                              hi!hihi!hih################################");
    }

    @Test
    public void test10308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10308");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#####################################", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hI#HHI   Hi!hiHi!hiH################################", "aaaaaaaaaaaaaaaaaaaaa#IH#!#IH###############################################aaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#HHI   Hi!hiHi!hi" + "'", str2, "hI#HHI   Hi!hiHi!hi");
    }

    @Test
    public void test10310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10310");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", "      HI!HI#################################hi!hi                        ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  " });
    }

    @Test
    public void test10311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10311");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444hihi!hihi!hih################################!hi#####", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test10312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
    }

    @Test
    public void test10313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HIHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHI!HI" + "'", str1, "HIHI!HI");
    }

    @Test
    public void test10314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 873);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test10315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI", "44444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI" + "'", str2, "   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI");
    }

    @Test
    public void test10316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10316");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaHI#HIaahI!IIhI!IIhhI!IIhI!IIhhI!II");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aa", "HI", "#", "H", "Iaah", "I", "!", "I", "Ih", "I", "!", "I", "Ihh", "I", "!", "I", "Ih", "I", "!", "I", "Ihh", "I", "!", "II" });
    }

    @Test
    public void test10317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10317");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Ih!iHi!444Ih!iHIh!iHi!444Ih!iHIh!iHi!444Ih!iH", "HIhHIHIhHIH                                HIH                                4444444444444444444444444444444444444444444444hHIhHIHIhHIH                                HIHIhHI4444444444444444444444444444444444444444444444hHIhHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444       " + "'", str2, "      HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444       ");
    }

    @Test
    public void test10319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I                                                                                              I               I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10320");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi                           hi!hi                           h################################", "IH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10321");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10322");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                  hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                  hI!HI" + "'", str1, "                  hI!HI");
    }

    @Test
    public void test10323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10323");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444IH!IH##################################4444", "HI!HI                           HI!HI            HIHI!HI                           HI!HI", 48);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444", "##################################4444" });
    }

    @Test
    public void test10324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("444HI!H444", "###########HI", 874);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444HI!H444" + "'", str3, "444HI!H444");
    }

    @Test
    public void test10325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10325");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hI   Hi!hiHi!hiH               Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10326");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                       a#############################################ahia!ahia                        ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("44444444444444444444444444444444444444444444444Hi!hi                           hi!hi            hihi!hi                           hi!hi            444444444444444444444444444444444444444444444", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                       ", "a", "#############################################", "ahia", "!", "ahia", "                        " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 132 + "'", int3 == 132);
    }

    @Test
    public void test10327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10327");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI", "HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h4444444444444444444444444444444444444444444444444444444444444444444444############444hi!4444     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10328");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           " + "'", str1, "Ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ");
    }

    @Test
    public void test10329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10329");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      H         H         H         H         !ih        H         H         H         H         ", "hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hI#HHI   Hi!hiHi!hiH################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#HHI   Hi!hiHi!hiH################################" + "'", str2, "hI#HHI   Hi!hiHi!hiH################################");
    }

    @Test
    public void test10331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10331");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "##### ######hi!hi", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10332");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa", "                       A#############################################AHIA!AHIA                        ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI                           HI!HI            HIHI!HI                           HI!HI", '#');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("I!HI!HI!HI!HI!H", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaa###############################################HI#!#HI#aaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI!HI                           HI!HI            HIHI!HI                           HI!HI" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "I!HI!HI!HI!HI!H" + "'", str7, "I!HI!HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str8, "HI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test10333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10333");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#################################hi!ihi!aaaaaaaaaaaaaaaaa####################################", '4', 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10334");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444" });
    }

    @Test
    public void test10335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10335");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI!HI                           hI!HI                           h################################", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", (int) (byte) -1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 349, 66);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hI!HI                           hI!HI                           h################################" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test10336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "                    HI#HI                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    HI#HI                    " + "'", str2, "                    HI#HI                    ");
    }

    @Test
    public void test10337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test10338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10338");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("H#################################hi#hi#hi#hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H#################################hi#hi#hi#hi" + "'", str1, "H#################################hi#hi#hi#hi");
    }

    @Test
    public void test10339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10339");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   Hi!hiHi!hiH               Hi!!HIHI!HI!HIHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   hi!hihi!hih               hi!!hihi!hi!hihi!hi!hi" + "'", str1, "   hi!hihi!hih               hi!!hihi!hi!hihi!hi!hi");
    }

    @Test
    public void test10340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10340");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444hihI!HIhI!HIh################################!hi###", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 !hihi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10341");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  IH!Ih4444444444444444444444444444444444444444444444  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "  ", "IH", "!", "Ih", "4444444444444444444444444444444444444444444444", "  " });
    }

    @Test
    public void test10342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "I!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################IH#IhI!HIhI!HIh################################", "###########################################        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("    H        HI!         H         H         H         H         ", 86);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(".........I#I#HIHI#H44444444444444444", "...# #444444444444...aaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........I#I#HIHI#H44444444444444444" + "'", str2, ".........I#I#HIHI#H44444444444444444");
    }

    @Test
    public void test10345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...", "    !I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10346");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!iI!HI!HI!HI!HI!hi!hi                           hi!hi            hihi!hi                           hi!hi", "hi!hiHih!ih##################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10347");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("HI ! HI ! HI ! HI", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI", strArray2, strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "hi!                                ", 0);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("################################", strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray2, strArray11);
        java.lang.Class<?> wildcardClass14 = strArray11.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str6, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10348");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI                           hI!HI            hiHI!HI                           hI!HI", "HI!HI!HI!HI");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI                           hI!HI            hiHI!HI                           hI!HI" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str3, "HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test10349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10349");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("444444444444444444444444444444444444444h44444444444444444444444444444444444444444444", "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "444444444444444444444444444444444444444h44444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10351");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############", "IH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IHIH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10352");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!HHI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                      ", "...###################################hi#!#hi#", 236, 43);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI...###################################hi#!#hi#                                                                                                                 " + "'", str4, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI...###################################hi#!#hi#                                                                                                                 ");
    }

    @Test
    public void test10353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10353");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("......!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "......!ih!ih!ih!ih!ih!ih!i" + "'", str1, "......!ih!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test10355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10355");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa", "#############");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaa444HI!H444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hihihi!hihi!hiaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10357");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ", "I!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10358");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                              ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test10359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444     hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", 54, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444     hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           " + "'", str3, "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444     hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
    }

    @Test
    public void test10360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10360");
        java.lang.CharSequence charSequence5 = null;
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence5, charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "       ################################        ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h################################ hI!HI HI!HI", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###################", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#############################################################################################################################################################################################################################################", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "i!hihi!hii!hihi!hii!hihi!hii4444444444444444444444444444444444444444444i!hihi!hii!hihi!hii!hihi!hii!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test10361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10361");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h################################ Hi!hi hi!h", "AAAAAAA                         AAAAAAA     ", "...I   ...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("H  ", "HhI!HI            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H  " + "'", str2, "H  ");
    }

    @Test
    public void test10363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10363");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444444hi!4444", "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10364");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#############################################HI!HI!##############################################", "...##########################################################################################...", 35);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################HI!HI!##############################################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "#############################################HI!HI!##############################################" + "'", str6, "#############################################HI!HI!##############################################");
    }

    @Test
    public void test10365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10365");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "", "#################                                                                                                                                                                                                                                                             !hihi!hi##################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10366");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                                              444444", "            hiHI!HI                                       hiHI!HI               4444444444444444444", 21, 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                            hiHI!HI                                       hiHI!HI               4444444444444444444                                                                         444444" + "'", str4, "                            hiHI!HI                                       hiHI!HI               4444444444444444444                                                                         444444");
    }

    @Test
    public void test10367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10367");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("h         h         h         h        hi!         h         h         h         h", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10368");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA         H         H         H         H        HI!         H         H         H         H         iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHiHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "               ", 61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10369");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                      444444444", (java.lang.CharSequence) "#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "HI!HI!HIHI!HIH################################HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "aaaaaaa ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aaaaaaa ..." + "'", str1, "Aaaaaaa ...");
    }

    @Test
    public void test10372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("IAHI                           hIAHI            hAHIAHI                           hIAHI", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IAHI                           hIAHI            hAHIAHI                           hIAHI" + "'", str2, "IAHI                           hIAHI            hAHIAHI                           hIAHI");
    }

    @Test
    public void test10373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10373");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI   Hi!hiHi!hiH################################44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 349);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "I!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str5, "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str8, "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10374");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                          444hi!4444", '#', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10375");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("h h h h h h h h h h h h", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h", "h" });
    }

    @Test
    public void test10376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10376");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#######################################4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi#HI!HI!##########################################...", "HI                           hI!HI            hiHI!HI     ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10377");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("####HHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH#####HHHHHHHHHHHHHHHHHHHHHHHHHHH", "HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI!HI                           HI!HI                           H###############################################################################..##..############################################################################################..##..#################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10379");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hihi!hi", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi" + "'", str2, "hi!hihi!hi");
    }

    @Test
    public void test10380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444hi!4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444!ih444444444444444444444444" + "'", str1, "4444444444444444444444444!ih444444444444444444444444");
    }

    @Test
    public void test10381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10381");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "            HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Hi!hiHi!hi", "#############################################hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiH" + "'", str2, "Hi!hiH");
    }

    @Test
    public void test10383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10383");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI   Hi!hiHi!hiH################################      hiHI!HI          ", "HI   Hi!hiHi!hiH################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10384");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!HIHI!HIH##############...", "         h         h         h         h        hi!         h         h         h         h         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10385");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaah");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("##################################", strArray4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str5, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str6, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test10386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10386");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10387");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("############################################################################################################################################################################################################################################", "                                                                                                             HI!Haaaaaaa                         aaaaaaa     HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "############################################################################################################################################################################################################################################" + "'", str2, "############################################################################################################################################################################################################################################");
    }

    @Test
    public void test10388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10389");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                        ih!ih#############################################                       ", "I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        ih!ih#############################################                       " + "'", str2, "                        ih!ih#############################################                       ");
    }

    @Test
    public void test10390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10390");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("####################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################################################################" + "'", str1, "###################################################################################################");
    }

    @Test
    public void test10391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10391");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10392");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("############...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...############" + "'", str1, "...############");
    }

    @Test
    public void test10393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10393");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##############444hi!4444###############", "HhI!HI            ", "                                             !ihIH!Ih                                            !i");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10394");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  4444444444444444444444444444444444444444444444!   ", "                  ########                  ########", "4444444hI!HI                           hI!HI                           h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  4444444444444444444444444444444444444444444444!   " + "'", str3, "  4444444444444444444444444444444444444444444444!   ");
    }

    @Test
    public void test10395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10395");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", "4 4");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI                           hI!HI            hiHI!HI                           hI!HI           " });
    }

    @Test
    public void test10396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10396");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("####################################################################################################", "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h", "                               ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test10397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10397");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HI!HI                           HI!HI                           H################################");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "...                   4444444444444444444444444444444444444444444444HI!HI!...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10398");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                            h          ", (java.lang.CharSequence) "                  ########                  #######HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 18 + "'", int2 == 18);
    }

    @Test
    public void test10399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10399");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II", "444   4444", 277);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II" });
    }

    @Test
    public void test10400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10400");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                                                                                 ", "HI!HI", 52);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!", strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("Ih!iHi!444Ih!iH", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Ih!iHi!444Ih!iH" + "'", str9, "Ih!iHi!444Ih!iH");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str10, "4444444444444444444444444444444444444444444444HI!HI!");
    }

    @Test
    public void test10401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("", "4444444444HI!HI!...        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10402");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                          ", '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                           HI!HI                           H################################", "   !4444444444444444444444444444444");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("4444444HIHi!hiHi!hiH#########", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                          " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                           HI!HI                           H################################" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444HIHi!hiHi!hiH#########" + "'", str7, "4444444HIHi!hiHi!hiH#########");
    }

    @Test
    public void test10403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!HHI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test10404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10404");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IH#####!#####IH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IHIH!IH");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10405");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih##################################ih!ih##################################ih!ih###############################hI!HI                           ih!ih##################################ih!ih##################################ih!ih###############################", "444!hi!h444444444444444444444444444hi!h4444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ih!ih##################################ih!ih##################################ih!ih###############################hI!HI                           ih!ih##################################ih!ih##################################ih!ih###############################" });
    }

    @Test
    public void test10406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10406");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                                                                                                                                                                                        ", "44hi!hi!44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10407");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "##############444hi!4444     ##############");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10408");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#################44HI444", ' ', 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10409");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                          444hi!4444", "HI!HIHI!HIH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                          444hi", "4444" });
    }

    @Test
    public void test10410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10410");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...###################################hi#!#hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10411");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("    h     ", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10412");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                ", "HIaHIaIaHIaaHIaHIaIaHIHIaH44444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                " + "'", str2, "                                                                                                ");
    }

    @Test
    public void test10413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10413");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                            hI!HIhi!                                             ", "", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "", "", "", "", "", "", "", "                                   hI!HIhi!                                             " });
    }

    @Test
    public void test10414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10414");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444", "", (int) (byte) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "AAAAAAAAAAAAAAAA44444444444444444444AAAAAAAAAAAAAAA##");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444444H44444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "H" });
    }

    @Test
    public void test10415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10415");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444...", "###############################################hi#!#hi#############################################", 0, 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###############################################hi#!#hi#############################################" + "'", str4, "###############################################hi#!#hi#############################################");
    }

    @Test
    public void test10416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...                        hI!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HihiHihi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test10418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10418");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi                             ", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 342);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10419");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 46, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              " + "'", str3, "                                              ");
    }

    @Test
    public void test10420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10420");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("       ...", "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i", "############ih!ih##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i" + "'", str2, "ih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           ih!ihih!ih                           ih!ihih            ih!ih                           i");
    }

    @Test
    public void test10422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I!    ", 324, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "I!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10423");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ihih ihih hi!hihi!hih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihih ihih hi!hihi!hih" + "'", str1, "ihih ihih hi!hihi!hih");
    }

    @Test
    public void test10424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10424");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "                                                                                                    ", "################################");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hI#HI");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test10425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("     4444444444444444444444444444444444444444444444 hI!HI                           ", "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444 hI!HI                           " + "'", str2, "     4444444444444444444444444444444444444444444444 hI!HI                           ");
    }

    @Test
    public void test10426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10426");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", ' ', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10427");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI", strArray4, strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("!4444444444444444444444444444444444444444444444");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("                          !IHHI            ", strArray7, strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih", strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hI!HI" + "'", str8, "hI!HI");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                          !IHHI            " + "'", str11, "                          !IHHI            ");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "!4444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str13, "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test10428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10428");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#####    H", "HHHHH###########################IHHHH############IHHHHHH###########################IHHHH############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10429");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI" + "'", str1, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI");
    }

    @Test
    public void test10430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!HIhI!HIh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10431");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################", "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "################################..");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 91, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test10432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10432");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                           ###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################" + "'", str1, "###################");
    }

    @Test
    public void test10433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!4444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10434");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("     4444444444444444444444444444444444444444444444                                                                                                                                                                                          ", "############ih!ih###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444                                                                                                                                                                                          " + "'", str2, "     4444444444444444444444444444444444444444444444                                                                                                                                                                                          ");
    }

    @Test
    public void test10435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10435");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                       hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!hihi!h", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10436");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "aaaaaaaaah");
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH               ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str4, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str6, "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test10437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10437");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################HI!HI!##########################################...", "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("", "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI  ");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444444444H   aaaaaaaaaaaaa", strArray3, strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################HI", "HI", "##########################################..." });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444444444444444444444H   aaaaaaaaaaaaa" + "'", str7, "4444444444444444444444444444444H   aaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test10438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10438");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("IhI!                                     HI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10439");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#########h#####", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#########h#####" });
    }

    @Test
    public void test10440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10440");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!i!i!", "#####################################", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10441");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                       a#############################################ahia!ahia", "                                                                                                                        hI   Hi!hiHi!hiH                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10442");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...!IH!IH4444444444444444444444444444444444444444444444                   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!IH!IH4444444444444444444444444444444444444444444444                   ..." + "'", str1, "...!IH!IH4444444444444444444444444444444444444444444444                   ...");
    }

    @Test
    public void test10443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10443");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "h    h    h    h    h    h                                             h    h    h    h    h    h  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("h    h    h    h    h    h                                             h    h    h    h    h    h   ", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h    h    h    h    h    h                                             h    h    h    h    h    h   " + "'", str2, "h    h    h    h    h    h                                             h    h    h    h    h    h   ");
    }

    @Test
    public void test10445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10446");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI ! HI ! HI ! HI44444444444444444444444444444", "          IH!Ih                           IH!IHih   ", 78);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI ! HI ! HI ! HI44444444444444444444444444444" + "'", str3, "HI ! HI ! HI ! HI44444444444444444444444444444");
    }

    @Test
    public void test10447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10447");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hI!HI            hiHI!HI                           hI!HI            #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI            hiHI!HI                           hI!HI            #" + "'", str1, "hI!HI            hiHI!HI                           hI!HI            #");
    }

    @Test
    public void test10448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10448");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##############################i!!                               #################################", "                          !IHHI            ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##############################i", "#################################" });
    }

    @Test
    public void test10449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         ", "             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH             IH!IhH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "HI   Hi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI   Hi!hiHi!hiH" + "'", str1, "HI   Hi!hiHi!hiH");
    }

    @Test
    public void test10451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10451");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH", "IHI!HI!II!                IIHI!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH!IH" });
    }

    @Test
    public void test10452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10452");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                  ", "               4               ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                  " });
    }

    @Test
    public void test10453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10453");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("    H  ", "Hi!hiHi!hiH########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10454");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!   hi!hihi!hih################################hi4!  ", "       ################################        ", 236, 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!   hi!hihi       ################################        " + "'", str4, "!   hi!hihi       ################################        ");
    }

    @Test
    public void test10455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10455");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "!i!i!i!", (java.lang.CharSequence) "IH!IH##########Hi!hiHi!hiH##################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10456");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str1, "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test10458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("     4444444444444444444444444444444444444444444444 HI!HI                           ", 88, 137);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     4444444444444444444444444444444444444444444444 HI!HI                           " + "'", str3, "     4444444444444444444444444444444444444444444444 HI!HI                           ");
    }

    @Test
    public void test10459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10459");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("         ", "###################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10460");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4444444444444444444444444444444H   aaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444", "H", "   ", "aaaaaaaaaaaaa" });
    }

    @Test
    public void test10461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10461");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaa", "###############################################", 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test10462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HI!HIHI!HI", "#############################################HI!HI!##############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hh##hhh##hh################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test10464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "##############hihI!HI4444444444444444444444444444444444444444444444!hi!hihi!hih################################hih################################                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10465");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaa", " #############################################", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10466");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("####################################################", "aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaa################################HhI!HI            ##ahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaa", 43);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "####################################################" });
    }

    @Test
    public void test10467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10467");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             HhI!HI             ", "   !4444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test10468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10468");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444HI!H444", "###a                       44!ih!ih4444!ih!ih4444!ih!ih44                ###a                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "H" });
    }

    @Test
    public void test10469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10469");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HHHHHI!HHHH", "ih!ih##################################ih!ih##################################ih!ih###############################hI!HI                           ih!ih##################################ih!ih##################################ih!ih###############################", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10470");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("        444hi!4444              ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10471");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaa                         aaaaaaa     ", "HI!HI                           HI!HI            ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         ", "iHi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHHHHHHHHHHHHHHHHHHHHI!HHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         " + "'", str2, "                                                                                                                                                         hI!HIhI!HIh################################                                                                                                                                                         ");
    }

    @Test
    public void test10473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10473");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!IHHI", "                                                                                                 I!                                                                                                 ", 126, (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IHHI                                                                                                 I!                                                                                                 " + "'", str4, "!IHHI                                                                                                 I!                                                                                                 ");
    }

    @Test
    public void test10474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10474");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "####");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test10475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10475");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!i!i", "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####", 75);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!i!i" });
    }

    @Test
    public void test10476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10476");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("I!HI   ", (int) ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################I!HI   " + "'", str3, "#########################I!HI   ");
    }

    @Test
    public void test10477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10477");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "             hI!HI             hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test10478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10478");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI!HI            hiHI!HI                           hI!HI            #", "#### ######hi!hi", 53, 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!HI            hiHI!HI                           hI#### ######hi!hi" + "'", str4, "hI!HI            hiHI!HI                           hI#### ######hi!hi");
    }

    @Test
    public void test10479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10479");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!hi!" + "'", str5, "hi!hi!");
    }

    @Test
    public void test10480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10480");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     ", "                                            HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "44hi!hi!4444hi!hi!4444hi!hi!44hI!HI     " });
    }

    @Test
    public void test10481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10481");
        char[] charArray10 = new char[] { 'a', '#', '#' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#############################################", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "I", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertArrayEquals(charArray10, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test10482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10482");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("    h     ", "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test10483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10483");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444hi!4444     ", "aaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10484");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!hihi!hih################################hih################################ 4444444444444444444444444444444444444444444444! hi!hihi!hih################################hihI!HI 4444444444444444444444444444444444444444444444! HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10485");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI   Hi!hiHi!hiH               Hi!", '#', 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test10486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test10487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10487");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI" + "'", str1, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI");
    }

    @Test
    public void test10488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10488");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("I!HI                                       hiHI!HI                                       ", 93, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaI!HI                                       hiHI!HI                                       " + "'", str3, "aaaaI!HI                                       hiHI!HI                                       ");
    }

    @Test
    public void test10489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10489");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hiHi!hiHIhi!hiHi!h");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "hi", "H", "i", "!", "hi", "HI", "hi", "!", "hi", "H", "i", "!", "h" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hia!ahiaHaia!ahiaHIahia!ahiaHaia!ah" + "'", str3, "hia!ahiaHaia!ahiaHIahia!ahiaHaia!ah");
    }

    @Test
    public void test10490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!4444444hi!4444444hi!4444444hi!4444444hi!4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", 11, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  " + "'", str3, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
    }

    @Test
    public void test10492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444hi!4444     ", "...                        hI!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test10493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("H         H         H         H        HI!         H         H         H         H", "HhI!HI             HhI!HI                                                                                                      !IHHhI!HI             HhI!HI      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H         H         H         H        HI!         H         H         H         H" + "'", str2, "H         H         H         H        HI!         H         H         H         H");
    }

    @Test
    public void test10494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10494");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("444hi!4444", 18, 161);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hi!4444" + "'", str3, "444hi!4444");
    }

    @Test
    public void test10495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HIHHI HHHI HH44444444444444444444444444444444IHI444444444444444444444444444444 44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("           H44H4h44H4hiH44H4h44H4H44H", 126);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test10497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10497");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("###############################################HI################################################", "hi#hi#i#hi##hi#hi#i#hihi#h44444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test10498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10498");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test10499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10499");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "" };
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray7);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray15);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray7);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "" };
        int int25 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray24);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray24, strArray32);
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "", "" };
        int int40 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray39);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str48 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray39, strArray47);
        java.lang.String str49 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray32, strArray39);
        java.lang.String str50 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray7, strArray39);
        java.lang.String[] strArray51 = org.apache.commons.lang3.StringUtils.stripAll(strArray39);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray39, "AaaaaaaaaaaaaaaaaaaaaaaaHI!HI#################################hi!hi         aaaaaaaaaaaaaaaaaaaaaaa", 0, 260);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 3 + "'", int40 == 3);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + " " + "'", str50, " ");
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertArrayEquals(strArray51, new java.lang.String[] { "hi!", "", "" });
    }

    @Test
    public void test10500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest20.test10500");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Ih!iHi!444Ih!iH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Ih!iHi!444Ih!iH" });
    }
}

