package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

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
    public void test08501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08501");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08502");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 143);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiHiHHI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaa" + "'", str3, "HiHiHHI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08503");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08504");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08505");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08506");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test08507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08507");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08508");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi##############Hi#############");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi##############Hi#############" });
    }

    @Test
    public void test08509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08509");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!#################################################################", "                                H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4" + "'", str1, "!44#################################################################################################4               ih#################################################################               44#################################################################################################4i44#################################################################################################4               ih#################################################################               44#################################################################################################4");
    }

    @Test
    public void test08511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi..." + "'", str1, "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...");
    }

    @Test
    public void test08512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ASS [LJAVA.LANG.STRING;         ...", 81);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ASS [LJAVA.LANG.STRING;         ..." + "'", str2, "ASS [LJAVA.LANG.STRING;         ...");
    }

    @Test
    public void test08514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08514");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("-1HI!-1100.00HI!", "                                4444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1HI!-1100.00HI!" + "'", str2, "-1HI!-1100.00HI!");
    }

    @Test
    public void test08516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08516");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aa#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aa#################################################################################################" + "'", str1, "aa#################################################################################################");
    }

    @Test
    public void test08517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test08518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08518");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi##############Hi#############hi##############Hi#############hi##############Hi#############", "!ih");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aiii!ii!ii!i                            ");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                44444444", (java.lang.CharSequence[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "##############H", "#############", "", "##############H", "#############", "", "##############H", "#############" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "", "##############H", "#############", "", "##############H", "#############", "", "##############H", "#############" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test08519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08519");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################ah", "A################################################################################################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08520");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str3, "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test08521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", "h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                   ###############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                   ##############" + "'", str1, "                                                                                   ##############");
    }

    @Test
    public void test08523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08523");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                 Hi", 146, "h !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h !haaaaaaa                                                 Hih !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h !haaaaaaaa" + "'", str3, "h !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h !haaaaaaa                                                 Hih !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h !haaaaaaaa");
    }

    @Test
    public void test08524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08524");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Ha################################################################Hi#############");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "    ################################   ", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Ha", "################################################################", "Hi", "#############" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 23 + "'", int3 == 23);
    }

    @Test
    public void test08525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                          hi!hi!hi!h", "################################################################################################", "Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08526");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                       ", "i!H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                       " });
    }

    @Test
    public void test08527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI");
    }

    @Test
    public void test08528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08528");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aa#################################################################################################", "44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 75);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#################################################################################################" });
    }

    @Test
    public void test08529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08529");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "I!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08530");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "                                                 4Hi", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08531");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a#################################################################################################aa", (java.lang.CharSequence) "a#################################################################################################aa #################################################################hi A#################################################################################################aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08532");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...##################################hi               a#################################################################################################aaia################################################################################################...", 482, 87);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08533");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!                                                                                                                                                                                                                                            ", "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!ang.String;cla.lavass[Ljang.String;cla.lavass[Ljahcl");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!                                                                                                                                                                                                                                            " });
    }

    @Test
    public void test08534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!HI", 233);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                   hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!HI                                                                   " + "'", str2, "                                                                   hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!HI                                                                   ");
    }

    @Test
    public void test08535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("H                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test08536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("##################################################################################################iH", "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi", "A#################################################################################################AA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################################################################################iH" + "'", str3, "##################################################################################################iH");
    }

    @Test
    public void test08537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08537");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  ...", 15, 31);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08538");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" });
    }

    @Test
    public void test08539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08539");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 742, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...      Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...      Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08540");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                  ", (java.lang.CharSequence) "ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08541");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("-1 HI! -1H");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "-1", "HI!", "-1H" });
    }

    @Test
    public void test08542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08542");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08543");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC ", 127, "hihi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihihihihihihihihihihihihihihihi               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC " + "'", str3, "hihihihihihihihihihihihihihihihihihi               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC ");
    }

    @Test
    public void test08544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!" + "'", str1, "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!");
    }

    @Test
    public void test08545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hI", "hh!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test08546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!#################################################################", "                                                               ...HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HI!HI!HI!HiI!HI!HI!!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08547");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi" + "'", str1, "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
    }

    @Test
    public void test08549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08549");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "#################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test08550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08550");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI!                                ", (java.lang.CharSequence) "#####################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08551");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih", (java.lang.CharSequence) "-1 HI! -1 100.0 0                                                                                                                                                    ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08552");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "Ha################################################################Hi#############");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08553");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##" + "'", str2, "##");
    }

    @Test
    public void test08554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08555");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 92);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi", "hi", "hi", "hi", "hi", "hi", "hi", "hi", "hi", "hi", "hi" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08556");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("A", "A#################################################################################################aaHiia#################################################################################################aa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test08557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08557");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         h", "                                                                                         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...                                                                                          ", "################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         h" + "'", str3, "...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         h");
    }

    @Test
    public void test08558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08558");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h", (int) '4', 139);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!" + "'", str3, "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test08559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("! I! I! I! I! I! ", 39, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "! I! I! I! I! I!                       " + "'", str3, "! I! I! I! I! I!                       ");
    }

    @Test
    public void test08560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08560");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 129 + "'", int1 == 129);
    }

    @Test
    public void test08561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08561");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaa                                                              ", (java.lang.CharSequence) "44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hI!hI!hI!hhi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!h!h!h!h!h!h...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!h!h!h!h!h!h..." + "'", str2, "!h!h!h!h!h!h...");
    }

    @Test
    public void test08564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08564");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "-1 hi! -1 100.0 0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" });
    }

    @Test
    public void test08565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08565");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test08566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                                                          HI!HI!HI!H", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08567");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444444444444444444444", (java.lang.CharSequence) "! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08568");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 264 + "'", int1 == 264);
    }

    @Test
    public void test08569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08569");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "   AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI", (java.lang.CharSequence) "     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test08570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("4444444444444444hi44444444444444444                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444HI44444444444444444                                                                                        " + "'", str1, "4444444444444444HI44444444444444444                                                                                        ");
    }

    @Test
    public void test08571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08571");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("..aaaaaaaaaaaaaa!...", "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444hi!HiHI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      ", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "..aaaaaaaaaaaaaa", "..." });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "444444444444444444hi!HiHI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      " });
    }

    @Test
    public void test08572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08572");
        byte[] byteArray5 = new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.toString(byteArray5, "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: !Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] { (byte) 10, (byte) -1, (byte) 10, (byte) 10, (byte) -1 });
    }

    @Test
    public void test08573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08573");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("         I", "I!HI!H...", 25, 95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "         II!HI!H..." + "'", str4, "         II!HI!H...");
    }

    @Test
    public void test08574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08574");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("hi!", "");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a###################################################################", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, ' ');
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.split("hi!");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray10, strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                    ", strArray4, strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" + "'", str12, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" + "'", str13, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str16, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                    " + "'", str17, "                                                    ");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test08575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!iH", "                      H!iIH!IH!IH!IH!IH!IH!IH!IH!IHiH!ih444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test08577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08577");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                             I!HI!H...                                                                                                                                                                                                                                             ", (java.lang.CharSequence) "   ################################    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("H!IH!IH!IH", "hI!hI!hI!hhi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H!IH!IH!IH" + "'", str2, "H!IH!IH!IH");
    }

    @Test
    public void test08579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08579");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", (int) (short) 10, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("a###################################################################                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A###################################################################                                " + "'", str1, "A###################################################################                                ");
    }

    @Test
    public void test08581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08581");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "I!HI!HI!HI!HI!HI...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ihHiHiHHI!HI!HI!HI!HI!HI", (java.lang.CharSequence) "#################################################################hi               ################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                         hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }

    @Test
    public void test08583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...44444444444444444444444444444444aaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hI!                                                                                                                                                                                                                                            ", "################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!                                                                                                                                                                                                                                            " + "'", str2, "hI!                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test08585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08585");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##################################################################H                                ##################################################################", "A...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##################################################################H                                ##################################################################" });
    }

    @Test
    public void test08586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("###############################H                                ###############################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################H                                ###############################" + "'", str1, "###############################H                                ###############################");
    }

    @Test
    public void test08587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", "              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08588");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "ai");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: ai");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 1 });
    }

    @Test
    public void test08589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08589");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "i", "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str3, "IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08590");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str1, "                                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test08591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08591");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("        hI######Hi####################Hi####################Hi####################Hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI######Hi####################Hi####################Hi####################Hi#" + "'", str1, "hI######Hi####################Hi####################Hi####################Hi#");
    }

    @Test
    public void test08592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08592");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa....HIhIhI444444444444444444444444444444444444444444444444444444444...!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa.....", (java.lang.CharSequence) "i!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08593");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08594");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444                                                                                         ", 80);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi", 34, 294);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444i!Hi!Hi!Hi!Hi!Hi" + "'", str3, "44444444444444i!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test08596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08596");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;", 67);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08597");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", (int) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str3, "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!Ihhi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test08598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08598");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08599");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                      ", (java.lang.CharSequence) "4444                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08600");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("         H");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Hi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, ' ');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", 'a');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "AHI!");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("H#########", strArray8, strArray13);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("h                                h                                h                                ", strArray4, strArray8);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "         ", "H" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi" + "'", str15, "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "H#########" + "'", str16, "H#########");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "h                                h                                h                                " + "'", str17, "h                                h                                h                                ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test08601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08601");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h !h    ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08602");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", "hIhIhI");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                     ...!AAAAAAAAAAAAAA...                                     aaaaaaaaaa");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "#################################################################hi               ################################");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "a###################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" });
    }

    @Test
    public void test08603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#HI!#h##h##h##h##h##h#...#h##h##h##h##h##h#...#h##h##h##h##h##h#.");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08604");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("...                                                                                                                                                                                                                                                                                                ...", "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i", 239);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                           class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i                                                           ..." + "'", str3, "...                                                           class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i                                                           ...");
    }

    @Test
    public void test08605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08605");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "444444444444...i!h..444444444444", (java.lang.CharSequence) "###################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08606");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hI!                          ...                                     ", 10, "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!                          ...                                     " + "'", str3, "hI!                          ...                                     ");
    }

    @Test
    public void test08607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08607");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!HI", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!HI" + "'", str2, "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!HI");
    }

    @Test
    public void test08608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444", (java.lang.CharSequence) "A############################################H         A############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08609");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence) "a########################a########################a#######################hi!", 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08610");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!                                                                                         HI!HI!HI!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "-1 HI! -1 100.0 0 HI!", (java.lang.CharSequence) "                                       hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08612");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "A################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test08614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "ha#################################################################################################aa #################################################################hi a#################################################################################################aaia#################################################################################################aa #################################################################hi a#################################################################################################aa!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08615");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08616");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H", (java.lang.CharSequence) "a########################a########################a#######################hi!h                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08618");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!ihihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08619");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("h         class [Ljava.lang.String;class hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 102, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                              ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                              " + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                              ");
    }

    @Test
    public void test08621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08621");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("          ", 146, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          " + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444          ");
    }

    @Test
    public void test08622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08622");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hi");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hihi!" + "'", str4, "hihi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi", "!" });
    }

    @Test
    public void test08623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08623");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!h-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!h100!hI!hI!hI!hI!hI!h.!hI!hI!hI!hI!hI!h0!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!h0!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!", (int) (short) -1, 75);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!!h" + "'", str3, "-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!!h");
    }

    @Test
    public void test08624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;               ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08625");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a########################a########################a#######################", "HiHiHHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!", 31);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "a########################a########################a#######################" });
    }

    @Test
    public void test08626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08626");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 10, "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08627");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08628");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08629");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a########################a########################a#######################hi!h                     ", 65, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08630");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 0, (int) (short) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "h                                ");
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "##########", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray12, "!");
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#################################################################hi", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray14, strArray17);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray17);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "h                                h                                h                                " + "'", str10, "h                                h                                h                                ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "#################################################################hi" });
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test08631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08632");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                      ", "A#################################################################################################aa               Hii               a#################################################################################################aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                      " + "'", str2, "                                                                      ");
    }

    @Test
    public void test08633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08633");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 0, (int) (short) -1);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "h                                ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", 100);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("###################################################################################################", strArray11, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "h                                h                                h                                " + "'", str9, "h                                h                                h                                ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str17, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08634");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hIhIhI4444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIhIhI4444444444444444444444444444444444444444444444444444" + "'", str2, "hIhIhI4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               " + "'", str2, "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih                               ");
    }

    @Test
    public void test08636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08636");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "          ", (java.lang.CharSequence) "   AIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAIAI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 483, 87);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                     ", 134);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                     " + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi                                                     ");
    }

    @Test
    public void test08639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08639");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!HI", "hhh", (int) ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!HI" });
    }

    @Test
    public void test08640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "!!!        hI######Hi####################Hi####################Hi####################Hi#!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08641");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444444444444444hi44444444444444444", 60, 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08642");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(charSequence0, (java.lang.CharSequence) "######Hi##############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08643");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "##aa               Hii               a###########################################################################################                                                                                                                              ", (java.lang.CharSequence) "IIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08644");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("I!HI!HI!h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HI!HI!hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;" + "'", str1, "I!HI!HI!hclass[Ljava.lang.String;class[Ljava.lang.String;class[Ljava.lang.String;");
    }

    @Test
    public void test08645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08645");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("IIIIIIIIIIIIIIIIIIIIIIII", "H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;H         CLASS [lJAVA.LANG.sT         I", 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIIIIIIIIIIIIIIIIIIIIIII" + "'", str3, "IIIIIIIIIIIIIIIIIIIIIIII");
    }

    @Test
    public void test08646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4", 297);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test08647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08647");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "-1 hi! -1 100.0 0 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08648");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.L", (java.lang.CharSequence) "444444444444444444hi!HiHI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      ", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                         hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "HiHiHHI!HI!HI!HI!HI!HI...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ihHiHiHHI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                         hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "                         hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("##################################################################################################################################################################################################              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################################################################################################################################################################################              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;" + "'", str2, "##################################################################################################################################################################################################              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
    }

    @Test
    public void test08651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08651");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#########################################################", "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H" + "'", str1, "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H");
    }

    @Test
    public void test08653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08653");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                               ...", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               ..." + "'", str3, "                                                               ...");
    }

    @Test
    public void test08654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence) "                                                 a            ################################   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str1, "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test08656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08656");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hIhIhI################################", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test08657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08657");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                              ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08658");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                       hi!hi!hi!h", 48, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                       hi!hi!hi!h" + "'", str3, "                                       hi!hi!hi!h");
    }

    @Test
    public void test08659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08659");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "44", (java.lang.CharSequence) "hi!HiHI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08661");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i" + "'", str1, "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!i");
    }

    @Test
    public void test08663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("##############aa               Hii           ", 483, 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08664");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "! i! i! i! i! i! ", "h                                h                                h                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test08665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08665");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                       a###################################################################                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08666");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(charSequence0, (java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08667");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              ", "!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              " + "'", str2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              ");
    }

    @Test
    public void test08668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08668");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", 125);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08669");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test08670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi " + "'", str3, "Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi ");
    }

    @Test
    public void test08671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08671");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("A###################################################################       444444444444444444444444444", 238, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################A###################################################################       444444444444444444444444444####################################################################" + "'", str3, "####################################################################A###################################################################       444444444444444444444444444####################################################################");
    }

    @Test
    public void test08672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii!iaiii!ii!ii################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08674");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08675");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("a########################a########################a#######################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A########################A########################A#######################" + "'", str1, "A########################A########################A#######################");
    }

    @Test
    public void test08676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08676");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ", (java.lang.CharSequence) "Hi##############Hi##############HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08677");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "##aa               Hii               a###########################################################################################                                                                                                                              ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08678");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 91 + "'", int1 == 91);
    }

    @Test
    public void test08679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i!" + "'", str1, "! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i!");
    }

    @Test
    public void test08680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08680");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "A#################################################################################################aaHiia#################################################################################################aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08681");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                            hi!hi!hi!h                             ", "###############################aa", "", 20);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                            hi!hi!hi!h                             " + "'", str4, "                            hi!hi!hi!h                             ");
    }

    @Test
    public void test08682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ", "                                                              a########################a########################a#######################hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              a########################a########################a#######################hi!" + "'", str2, "                                                              a########################a########################a#######################hi!");
    }

    @Test
    public void test08685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08685");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH" + "'", str1, "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
    }

    @Test
    public void test08686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08686");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h                                h                                h                                ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Lj", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test08687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...##########################################################################a               ih##...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08688");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("IaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiH" + "'", str1, "IaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiH");
    }

    @Test
    public void test08689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hIhIhI44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08690");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                            hi!hi!hi!h                             ", "###############################h                                ###############################");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                            hi!hi!hi!h                             " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                            hi!hi!hi!h                             " + "'", str4, "                            hi!hi!hi!h                             ");
    }

    @Test
    public void test08691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08691");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHiaI                                                 #HiaIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHiaIa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08692");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("##########################################################", (int) (byte) 1, 81);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########################################################" + "'", str3, "#########################################################");
    }

    @Test
    public void test08693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "iH!iH!iH!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08694");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hihi!", "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hihi!" + "'", str2, "Hihi!");
    }

    @Test
    public void test08695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08695");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h         ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!ih", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1HI!-1100.00HI!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08696");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("-1 hi! -1 100.0 0 ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "  ", (java.lang.CharSequence[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "-1", "hi!", "-1", "100.0", "0" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test08697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "H         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08698");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               ;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc;gnirts.gnal.avajl[ ssalc         hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", (java.lang.CharSequence) "                           hi##############Hi#############                           ", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08699");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", (int) (short) 10);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "                                ", (java.lang.CharSequence[]) strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (java.lang.CharSequence[]) strArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "###################################################################################################", (java.lang.CharSequence[]) strArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "H#########", (java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test08700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         h", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         h" + "'", str2, "...         ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         h");
    }

    @Test
    public void test08701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08701");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ihihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih                                !ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!", (java.lang.CharSequence) "h         CLASS [LJAVA.LANG.STRI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08702");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" });
    }

    @Test
    public void test08703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08703");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                         ", 146, "..aaaaaaaaaaaaaa!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..aaaaaaaaaaaaaa!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                         " + "'", str3, "..aaaaaaaaaaaaaa!...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                         ");
    }

    @Test
    public void test08704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih", "                       aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ", "h                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
    }

    @Test
    public void test08705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08705");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444", 127);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08706");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("               ..................................................................i               ................................");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               ..................................................................I               ................................" + "'", str1, "               ..................................................................I               ................................");
    }

    @Test
    public void test08707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!!h", "                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!!h" + "'", str2, "-!hI!hI!hI!hI!hI!h1!hI!hI!hI!hI!hI!h!hI!hI!hI!hI!hI!hHI!hI!hI!hI!hI!hI!h!!h");
    }

    @Test
    public void test08708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08708");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08709");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 69, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test08711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08711");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08712");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence) "HIhIhI444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08713");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H", '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("                                                 hi!", "h                                                                                                   ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hihi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                       HI!HI!HI!H", strArray7, strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!ih 0 0.001 1- !ih 1-", strArray3, strArray7);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                                       ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "i!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hihi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                       HI!HI!HI!H" + "'", str10, "                                       HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!ih 0 0.001 1- !ih 1-" + "'", str11, "!ih 0 0.001 1- !ih 1-");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H" + "'", str13, "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H");
    }

    @Test
    public void test08714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08714");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi", (java.lang.CharSequence) "HCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", charSequence2, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08715");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "4444444444444444hi44444444444444444                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08716");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!..." });
    }

    @Test
    public void test08717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("#HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444#...", "hi#########################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444#..." + "'", str2, "#HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444##HIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444#...");
    }

    @Test
    public void test08718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08718");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("A############################################H         A############################################", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A############################################H         A############################################" + "'", str2, "A############################################H         A############################################");
    }

    @Test
    public void test08719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08719");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                         ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!", "");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "a###################################################################", (java.lang.CharSequence[]) strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", '#');
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("hi!");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", strArray13, strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                    ", strArray7, strArray18);
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hIhIh", strArray2, strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                         " });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" + "'", str15, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" + "'", str16, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!" + "'", str19, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                    " + "'", str20, "                                                    ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hIhIh" + "'", str21, "hIhIh");
    }

    @Test
    public void test08720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08720");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a########################a########################a#######################hi!h                                ", "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a########################a########################a#######################hi!h                                " + "'", str2, "a########################a########################a#######################hi!h                                ");
    }

    @Test
    public void test08721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08721");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "    hIhIhI", (java.lang.CharSequence) "##############################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 255);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08722");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!...", "                                                             a########################a#############", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!..." });
    }

    @Test
    public void test08723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "#################################################################hi               ################################", (java.lang.CharSequence) "i!Hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 1-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test08725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08725");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                 ", "Hi Hi Hi Hi Hi Hi HiAA###############################################################################################   i Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08726");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi##################################################################################################", 483);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi##################################################################################################" + "'", str2, "Hi##################################################################################################");
    }

    @Test
    public void test08727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08727");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi", (int) (short) 1, 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08728");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "-1 hi! -1 100.0 0444444444444444444444444444444444444444444444444", "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test08729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     " + "'", str1, "     ");
    }

    @Test
    public void test08730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08730");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" };
        boolean boolean3 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "h         ", charSequenceArray2);
        java.lang.Class<?> wildcardClass4 = charSequenceArray2.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa....HIhIhI444444444444444444444444444444444444444444444444444444444...!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa......!aaaaaaaaaaaaaa.....", "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08732");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                 hi!", (java.lang.CharSequence) "a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08733");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("...       ", "  ", 74, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...         " + "'", str4, "...         ");
    }

    @Test
    public void test08734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08734");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi", "classa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi" });
    }

    @Test
    public void test08735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08735");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 26, 233);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" });
    }

    @Test
    public void test08736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08736");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08737");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(charSequence0, (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08739");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HI!HI!HI!HiI!HI!HI!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444", 134);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                         44444444444444444444444444444" + "'", str2, "                                                                                                         44444444444444444444444444444");
    }

    @Test
    public void test08741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08741");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a########################################################################################### Hii ##aa", 122, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test08742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08742");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "i!HA################", (java.lang.CharSequence) "A#################################################################################################aa               Hii               a#################################################################################################aa", 58);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08743");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!HI!H", "..........");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!H" + "'", str2, "!HI!H");
    }

    @Test
    public void test08744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08744");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (java.lang.CharSequence) "               #################################################################hi               4444444444444444444444444444444444444444444444", 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("########################a########################a#######################hi!h h", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################a########################a#######################hi!h h" + "'", str2, "########################a########################a#######################hi!h h");
    }

    @Test
    public void test08746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08746");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "###############################H                                ###############################", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08747");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08748");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "h", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("###################################################################a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################################################a" + "'", str1, "###################################################################a");
    }

    @Test
    public void test08750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08750");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "h !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h !haaaaaaa                                                 Hih !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa...h !haaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 146 + "'", int1 == 146);
    }

    @Test
    public void test08751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih" + "'", str1, "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih");
    }

    @Test
    public void test08752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08752");
        char[] charArray10 = new char[] {};
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray10);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h         ", charArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!", charArray10);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############################h                                ###############################", charArray10);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!Hi!H...", charArray10);
        int int20 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!hi", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test08753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08753");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;h         class [ljava.lang.st         i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("a#################################################################################################aa               #################################################################hi               a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!", "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#################################################################################################aa               #################################################################hi               a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa" + "'", str2, "a#################################################################################################aa               #################################################################hi               a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa");
    }

    @Test
    public void test08755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08755");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(".iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.Stri", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.Stri" + "'", str2, ".iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.Stri");
    }

    @Test
    public void test08756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08756");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444                          hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hhi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08757");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aIaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHaHiHiHi", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "4Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08759");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "44444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test08760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "IhIhIhIhIhIhIhIhIhIhHI!HI!HI!HhIhIhIhIhIhIhIhIhIhIh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08761");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                          hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hhi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hhi" + "'", str1, "                          hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hi hhi");
    }

    @Test
    public void test08762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08762");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Ljclass [Ljava.lang.String;class [Lj", (java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08763");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08764");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hI", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                 ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "i", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#################################################################################################################################          ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08765");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AHI!", "!ih", 294);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!ih 0 0.001 1- !ih 1-");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "I!HI!H...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AHI" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AHI" + "'", str5, "AHI");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "AHI" + "'", str7, "AHI");
    }

    @Test
    public void test08766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08766");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                               hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                               ", "hi", "!", "hi", "!", "hi", "!", "h" });
    }

    @Test
    public void test08767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08767");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#################################################################################################" });
    }

    @Test
    public void test08768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08768");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                44444444", "                                                                                   ###############");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                44444444" });
    }

    @Test
    public void test08769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08769");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ASS [LJAVA.LANG.STRING;         ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08770");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                                                                                          HI!HI!HI!H", (java.lang.CharSequence) "Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi Hi ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08771");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("h                                ", "                                                 hi!", (int) (short) 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "..................................................................i................................", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "h                                " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "h                                " + "'", str5, "h                                ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test08772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "h                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08773");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", "                                                                      !ih 0 0.001 1- !ih 1-");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
    }

    @Test
    public void test08774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08774");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "!HI!HI!HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08775");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 25 + "'", int1 == 25);
    }

    @Test
    public void test08776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08776");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                4444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08777");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 0, (int) (short) -1);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence[]) strArray4);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        int int12 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "aaa" + "'", str11, "aaa");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 165 + "'", int12 == 165);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "", "", "" });
    }

    @Test
    public void test08778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08778");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hhh", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("a#################################################################################################aa               #################################################################hi               a#################################################################################################aa", "h         cl#ss [Lj#v#.l#ng.String;cl#ss hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a#################################################################################################aa               #################################################################hi               a#################################################################################################aa" + "'", str2, "a#################################################################################################aa               #################################################################hi               a#################################################################################################aa");
    }

    @Test
    public void test08780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str1, "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test08781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08781");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", "4Hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08782");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!hhi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08783");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                            ai", (java.lang.CharSequence) "                                     ...!AAAAAAAAAAAAAA...                                     aaaaaaaaaa", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08784");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                      ", 69);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih", "", "", "", "", "", "", "", "", "cl", "ss", "[Lj", "v", ".l", "ng.String;cl", "ss", "[Lj", "v", ".l", "ng.String;cl", "ss", "[Lj", "v", ".l", "ng.String;" });
    }

    @Test
    public void test08785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi" + "'", str2, "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test08786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08786");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test08787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) " aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi! ", (java.lang.CharSequence) "               #################################################################hi               ###############################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...##################################hi               a#################################################################################################aaia################################################################################################..", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...######################" + "'", str2, "...######################");
    }

    @Test
    public void test08789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                HI!HI!HI!HI!HI!HIHi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                HI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                HI!HI!HI!HI!HI!HIHi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                HI!HI!HI!HI!HI!HI" + "'", str1, "                                HI!HI!HI!HI!HI!HIHi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test08790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08790");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                 44444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08791");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", 25);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(".........................................................h         ", "...######################", "444444444444444444-1 hi! -1 100.0 0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ".........................................................h         " + "'", str3, ".........................................................h         ");
    }

    @Test
    public void test08793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08793");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08794");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.L", "##################################################################################################a#H#iia#A##################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.L" });
    }

    @Test
    public void test08795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08795");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "!ihih", 80);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08796");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08797");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4h         44444444444444444444444444444", 234);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4h         44444444444444444444444444444                                                                                                                                                                                                  " + "'", str2, "4h         44444444444444444444444444444                                                                                                                                                                                                  ");
    }

    @Test
    public void test08799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08799");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!", (java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "                                                 hi!");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "!");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi##############Hi#############");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray11, strArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, ' ', (int) '4', 20);
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
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "Hi##############Hi#############" });
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test08800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("##########################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################" + "'", str2, "##########################################################");
    }

    @Test
    public void test08801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 255);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08802");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", (java.lang.CharSequence) "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI                                                               ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08803");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ...", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "  ..." });
    }

    @Test
    public void test08804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08804");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08805");
        byte[] byteArray4 = new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.toString(byteArray4, "IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message: IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                hH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertArrayEquals(byteArray4, new byte[] { (byte) -1, (byte) 1, (byte) 10, (byte) 0 });
    }

    @Test
    public void test08806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("a###################################################################", "H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#H#HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a###################################################################" + "'", str2, "a###################################################################");
    }

    @Test
    public void test08807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08807");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 139, 234);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "-1 hi! -1 100.0 0                                                                                                                                                                                                                                              ", (java.lang.CharSequence) "!!!        hI######Hi####################Hi####################Hi####################Hi#!!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08809");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hI!hI!hI!hI!hI!hI!hI!hI!h", 11);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                 ", "####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test08811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08811");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", "                                                                                                                            ", "A########################A########################A#######################HI!H");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08812");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "! I! I! I! I! I! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08813");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "   ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a################################################################################################...", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#################################################################################################################################", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "H                                H                                H                                ", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test08814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08814");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#######################################                               ", "!ih", 18);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########!ih       " + "'", str3, "########!ih       ");
    }

    @Test
    public void test08815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08815");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", " ");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!hI!hI!hI!hI!hI!hI...", (java.lang.CharSequence[]) strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ihih", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("a#################################################################################################aa", "hI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("        hI######Hi####################Hi####################Hi####################Hi#        hI######Hi####################Hi########4444444444", strArray5, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 36 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "a#################################################################################################aa" });
    }

    @Test
    public void test08816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################aH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 84);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test08818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08818");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "-1 hi! -1 100.0 0", (java.lang.CharSequence) "i!Hi!Hi!Hi", 26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                             a########################a#############", "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       " + "'", str2, "                                       ");
    }

    @Test
    public void test08821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08821");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(charSequence0, (java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhHI!HI!HI!HhIhIhIhIhIhIhIhIhIhIh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08822");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hii!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08823");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...IH!IH!IHaaaaaaaaaaaaaaaaaaaaaaaaaH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA...IH!IH!IH!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...IH!IH!IHH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA...IH!IH!IH!" + "'", str2, "...IH!IH!IHH         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LA...IH!IH!IH!");
    }

    @Test
    public void test08824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08824");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", "#################################################################################################aa!", "I!HI!H...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi..." + "'", str3, "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
    }

    @Test
    public void test08825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08825");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#################################################################################################aa!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08826");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###################################################################################################", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "###################################################################################################" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test08827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08827");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08828");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                                                       ", "4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...44444444444444444444444444444444aaaa", (int) (short) 10, 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...44444444444444444444444444444444aaaa" + "'", str4, "          4hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...44444444444444444444444444444444aaaa");
    }

    @Test
    public void test08829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08829");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H", "                                                    ", 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H" });
    }

    @Test
    public void test08830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08830");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "######################################################################444444444444444444444444444444444444444444444444444444444", 482, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                              a########################a########################a#######################hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08832");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC ", "######hi!hi!hi!h#####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC " + "'", str2, "               ;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC ");
    }

    @Test
    public void test08834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("    #       #       #       #   ", "                                                            ai");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    #       #       #       #   " + "'", str2, "    #       #       #       #   ");
    }

    @Test
    public void test08835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08835");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Hi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444", "################################       ", 95, 92);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444################################       " + "'", str4, "Hi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444################################       ");
    }

    @Test
    public void test08836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08836");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iiiiiiiiiiiii#################################################################iiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "iiiiiiiiiiiii#################################################################iiiiiiiiiiiii" });
    }

    @Test
    public void test08837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08837");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "######hi!hi!hi!h#####", 33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test08838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08838");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...!hI!hI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08839");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("a#################################################################################################aa #################################################################hi A#################################################################################################aa", "hi!hi!hi!hhi!hi!hi!h", 483, 66);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a#################################################################hi!hi!hi!hhi!hi!hi!h" + "'", str4, "a#################################################################hi!hi!hi!hhi!hi!hi!h");
    }

    @Test
    public void test08840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08840");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "a########################a########################a#######################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                 ", "hi!", 67);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08842");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!ang.String;cla.lavass[Ljang.String;cla.lavass[Ljahcl");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "lchajL[ssaval.alc;gnirtS.gnajL[ssaval.alc;gnirtS.gna!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!" + "'", str1, "lchajL[ssaval.alc;gnirtS.gnajL[ssaval.alc;gnirtS.gna!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!");
    }

    @Test
    public void test08843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("################################       ", "IhIhIhIhIA...HIhIhIhIhIh", "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################       " + "'", str3, "################################       ");
    }

    @Test
    public void test08844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08844");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Hi#########################################################################################################################", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H", 139);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08845");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!", (java.lang.CharSequence) "                  I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08846");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "h", "                                   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                                                                          hi!hi!hi!h");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                                                                                          ", "hi", "!", "hi", "!", "hi", "!", "h" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!" + "'", str7, "!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!");
    }

    @Test
    public void test08847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08847");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("IhIhIhIhIA...HIhIhIhIhIh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ihIhIhIhIA...HIhIhIhIhIh" + "'", str1, "ihIhIhIhIA...HIhIhIhIhIh");
    }

    @Test
    public void test08849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08849");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    #I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    #", "                                                             a########################a#############", 8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "    #I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    #" });
    }

    @Test
    public void test08850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08850");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#####################################################################################################################################################################");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "#####################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "H         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08852");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("hi!", "");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", (java.lang.CharSequence[]) strArray5);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a');
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "Hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, ' ');
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("I!", strArray5, strArray13);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "I!" + "'", str16, "I!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test08853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08853");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("H                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test08854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08854");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("##aaHiia######################################################################################", 57);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##aaHiia##############################################..." + "'", str2, "##aaHiia##############################################...");
    }

    @Test
    public void test08855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("a############################################H         a############################################", "hIhIhI444444444444444444444444444444444444444444444444444444444                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a############################################H         a############################################" + "'", str2, "a############################################H         a############################################");
    }

    @Test
    public void test08856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08856");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################hi", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!H", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "H         ", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##############aa               Hii           ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test08857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08857");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "I!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahI!hI!hI!hI!hI!hI!hI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08858");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("h         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;         ...", "aaa                                                                 HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH", 105);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h", "CLASS", "[LJAVA.LANG.STRING;CLASS", "[LJAVA.LANG.STRING;CLASS", "[LJAVA.LANG.STRING;", "..." });
    }

    @Test
    public void test08859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08859");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AA#################################################################################################A", "hi##############Hi#############hi##############Hi#############hi##############Hi#############");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test08860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08860");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H4444444444444444444444444                                                       ", (java.lang.CharSequence) "-1 hi! -1 100.0 0                                                                                                                                                                                                                                              ", 103);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08861");
        byte[] byteArray3 = new byte[] { (byte) 10, (byte) 1, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.toString(byteArray3, "                                                 a            ################################   ");
            org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException; message:                                                  a            ################################   ");
        } catch (java.io.UnsupportedEncodingException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] { (byte) 10, (byte) 1, (byte) 10 });
    }

    @Test
    public void test08862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08862");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", "                                hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 0, (int) (short) -1);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", (java.lang.CharSequence[]) strArray3);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "######Hi#############");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "", "", "" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "######Hi###################Hi###################Hi#############" + "'", str12, "######Hi###################Hi###################Hi#############");
    }

    @Test
    public void test08863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI4444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08864");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("               #################################################################hi               ################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "               #################################################################hi               ################################" + "'", str1, "               #################################################################hi               ################################");
    }

    @Test
    public void test08865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08865");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444444444444H!IH!IH!IH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444hi44444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444H!IH!IH!IH" + "'", str3, "444444444444444444444444444444444444444444444444444444444H!IH!IH!IH");
    }

    @Test
    public void test08866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444444444444444444444444444444444444444444444444444                                                                                         ", "hIhIhIhIhIhIhIhIhIhIhIhIhIhI4hi!hi!hi!h44444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444444444444                                                                                         " + "'", str2, "444444444444444444444444444444444444444444444444444444444                                                                                         ");
    }

    @Test
    public void test08867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "-1 HI! -1 100.0 0 HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08868");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                4444444444444444444444444444444444444", "classa[Ljava.lang.String;classa[Ljava.lang.String;classa[Ljava.lang.String", "i!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08871");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!", "###################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test08872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                  I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI                   ", "aHI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08873");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!        ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08874");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HIhIhIhIhIA...HIhIhIhIhIh", "H                                H                                H", "h                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIhIhIhIhIA...HIhIhIhIhIh" + "'", str3, "HIhIhIhIhIA...HIhIhIhIhIh");
    }

    @Test
    public void test08875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("-1 hi! -1 100.0 0                                                                                                                                                                                                                                              ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "-1 hi! -1 100.0 0                                                                                                                                                                                                                                              " + "'", str2, "-1 hi! -1 100.0 0                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test08876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08876");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                      ", (java.lang.CharSequence) "a########################a########################a#######################hi!h                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08877");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "    #I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI    #", (java.lang.CharSequence) "H                                H                                H", 128);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 60);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                ", "A########################A########################A#######################HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                " + "'", str2, "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH                                ");
    }

    @Test
    public void test08880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", "                     HI!HI!HI!H                     ", "!ihh!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii" + "'", str3, "hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!hiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihiihhii");
    }

    @Test
    public void test08881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08881");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("-1 hi! -1 100.0 0", 97, "...                      hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                      hi!hi!hi!hi!hi!-1 hi! -1 100.0 0...                      hi!hi!hi!hi!hi!" + "'", str3, "...                      hi!hi!hi!hi!hi!-1 hi! -1 100.0 0...                      hi!hi!hi!hi!hi!");
    }

    @Test
    public void test08882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08882");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "h       ...", 128);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08883");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#########################################################", "H#########");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
    }

    @Test
    public void test08884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08884");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         I", "!ih                                                 ", 35);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h                                h                                h                                ", ' ');
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "   hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "A#...", (java.lang.CharSequence[]) strArray12);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "         I" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test08885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("h##h##h##h##h##h#...", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h##h##h##h##h##h#..." + "'", str2, "h##h##h##h##h##h#...");
    }

    @Test
    public void test08886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi", "                                                              a########################a########################a######################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi" + "'", str2, "444444444444444444444444444444444444444444444444i!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test08887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08887");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                              hIhIhI", "...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "A################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                              hIhIhI" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                              hIhIhI" + "'", str4, "                                              hIhIhI");
    }

    @Test
    public void test08888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08888");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "        !ih00.0011-!ih1-        ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Hihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08890");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                            ai", "444444444444444444hiHHiH!HH!HH!HH!HH!HH!HH!HH!HH!iHH                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08891");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "a##############HIhIhI444444444444444444444444444444444444444444444444444444444a##############", 123);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08892");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H", '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "H" });
    }

    @Test
    public void test08893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08893");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("h       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h       ..." + "'", str1, "h       ...");
    }

    @Test
    public void test08894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08894");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###################################################################################################", 'a');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###################################################################################################" });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08895");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#################################################################################################################################", "                                 hI!hI!hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################################################################################" + "'", str2, "#################################################################################################################################");
    }

    @Test
    public void test08896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('a', 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi#########################################################################################################################", 2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 5, 60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test08898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH" + "'", str1, "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiH");
    }

    @Test
    public void test08899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444                                                                                         ", "-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 1-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 100.0 0 hi!-1 hi! -1 10", "h                                h                                h                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444                                                                                         " + "'", str3, "4444                                                                                         ");
    }

    @Test
    public void test08900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("i!Hi!Hi!Hi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi" + "'", str2, "i!Hi!Hi!Hi");
    }

    @Test
    public void test08901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08902");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                          ###################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08904");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                      ", "                          hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi", "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test08905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################ah", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!I!I!I!I!I!I!I!I!I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!", "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test08908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08908");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                   ", (java.lang.CharSequence) "!ih                               hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 103 + "'", int2 == 103);
    }

    @Test
    public void test08909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!H", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!H" + "'", str3, "i!H");
    }

    @Test
    public void test08910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08910");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                          !ihih                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!" + "'", str2, "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
    }

    @Test
    public void test08912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08912");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str2, "hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test08913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08913");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HI!HI!HI!HiI!HI!HI!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!IH!IH!IiH!IH!IH!IH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH" + "'", str1, "!!IH!IH!IiH!IH!IH!IH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH!IH!IH!I!!IH!IH!IiH");
    }

    @Test
    public void test08914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("a###################################################################                                ", (int) (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a###################################################################                                " + "'", str3, "a###################################################################                                ");
    }

    @Test
    public void test08915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                                                                                                                                          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08916");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "4h         44444444444444444444444444444                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str1, "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08918");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "C;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC", (java.lang.CharSequence) "4444444444444444hi44444444444444444                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "AAA!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test08920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "ahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08921");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                              a########################a########################a######################", (java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08922");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#########################################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI..." });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI..." + "'", str4, "                                  HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI...");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "HI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI" });
    }

    @Test
    public void test08923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08923");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "h         hIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhIhI                                                 ", (java.lang.CharSequence) "!hI!hI!hI!hI!hI!h", 102);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.Object;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test08925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08925");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                         44444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444" + "'", str1, "44444444444444444444444444444");
    }

    @Test
    public void test08926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08926");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("444444444444444444444444444444444444444444444444444444444", "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!iHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test08927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08927");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "        hI", (java.lang.CharSequence) "               ..................................................................i               ................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08928");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI", "                          !ihih                          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI" });
    }

    @Test
    public void test08929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08929");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence0, (java.lang.CharSequence) "                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08930");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "Hi!Hi!Hi!HHI!HI!HI!H", (java.lang.CharSequence) "                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08931");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                              hIhIhI", (java.lang.CharSequence) "i!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08932");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", 11, "                                     ...!AAAAAAAAAAAAAA...                                     aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI" + "'", str3, "I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI");
    }

    @Test
    public void test08933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###############################H                                ###############################", "!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################H                                ###############################" + "'", str2, "###############################H                                ###############################");
    }

    @Test
    public void test08934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08934");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", (java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 530);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi##################################################################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi##################################################################################################" + "'", str2, "Hi##################################################################################################");
    }

    @Test
    public void test08936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08936");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test08937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08937");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "##################################################################################################################################################################################################              h         class [ljava.lang.string;class [ljava.lang.string;class [ljava.lang.string;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08938");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", (java.lang.CharSequence) "hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08939");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test08940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!ih", "        hi######hi####################hi####################hi####################hi#        hi######hi####################hi########4444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test08941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08941");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("##aaHiia##############################################...", "!aa#################################################################################################a               ih#################################################################               aa#################################################################################################aiaa#################################################################################################a               ih#################################################################               aa#################################################################################################a");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##aaHiia##############################################..." + "'", str2, "##aaHiia##############################################...");
    }

    @Test
    public void test08942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08942");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("##aaHiia######################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##", "aa", "Hiia", "######################################################################################" });
    }

    @Test
    public void test08943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08943");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#################################################################################################################################          ", 146, 127);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08944");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("I!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!Hh                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI###############################################h", 94, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!HI!HI!HI!HI!..." + "'", str3, "...!HI!HI!HI!HI!...");
    }

    @Test
    public void test08945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08945");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                    hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test08946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("", "                     h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     h!ih!ih!ih                     " + "'", str2, "                     h!ih!ih!ih                     ");
    }

    @Test
    public void test08947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08947");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         HHI!HI!HI!HI!...", (java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test08948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08948");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! ", 247);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08949");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "H         CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", (java.lang.CharSequence) "a############################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08950");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!" + "'", str1, "i!");
    }

    @Test
    public void test08951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08951");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih!Ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test08952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08952");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", "", "", "", "", "", "", "", "", "class", "[Ljava.lang.String;class", "[Ljava.lang.String;class", "[Ljava.lang.String;" });
    }

    @Test
    public void test08953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08953");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h         ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!!!!!!!!!!!!!!!!hi!!!!!!!!!!!!!!!!!                                                                                        ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test08954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08954");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(charSequence0, (java.lang.CharSequence) "A#...44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08955");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "iaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiaiai", charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08956");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                                       a###################################################################                ", (java.lang.CharSequence) "                                                                                   ###############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test08957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08957");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray9);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "h                                                                                                   ", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray9);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "4444444444", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                   ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test08958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08958");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "I!HI!HI!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "I!HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HI!HI!HI!HiI!HI!HI!!" + "'", str3, "HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HiI!HI!HI!!I!HI!HI!HI!HI!HI!HiI!HI!HI!!");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test08959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!" + "'", str2, "i!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
    }

    @Test
    public void test08960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08960");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "   ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          HC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         H", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h         class [Ljava.lang.String;class hI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a#################################################################################################aa               #################################################################hi               a#################################################################################################aaia#################################################################################################aa               #################################################################hi               a#################################################################################################aa!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!h", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444hi44444444444444444                                                                                         ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test08961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08961");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...!Hi!Hi...", 33, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 33 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "class", "[Ljava.lang.String;class", "[Ljava.lang.String;class", "[Ljava.lang.String;" });
    }

    @Test
    public void test08962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08962");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...", (java.lang.CharSequence) "!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!4H4i4!#######################################################################################################################################################################################################################################################################################################################################################################################################################################################", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08963");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "Hi!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "h", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h         class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###############################h                                ###############################", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "h                                                                                                   ", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#################################", charArray8);
        java.lang.Class<?> wildcardClass17 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test08964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08964");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hhi!                              ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 127 + "'", int1 == 127);
    }

    @Test
    public void test08965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08965");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("..........", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".........." + "'", str2, "..........");
    }

    @Test
    public void test08966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08966");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "...       ", (java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI! HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08967");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                 hI!hI!hI", "!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 hI!hI!hI" + "'", str2, "                                 hI!hI!hI");
    }

    @Test
    public void test08968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!HI!HI!HI!HI!HI!HI!HI!HIi!H                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HIi!H");
    }

    @Test
    public void test08969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("a##################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a##################################" + "'", str2, "a##################################");
    }

    @Test
    public void test08970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08970");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! " + "'", str1, "! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! HIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHIa!aHHIa!! i! i! i! i! i! ");
    }

    @Test
    public void test08971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("#################################################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################..." + "'", str1, "#################################################################################################...");
    }

    @Test
    public void test08972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih                                " + "'", str1, "...iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!iH!ih                                ");
    }

    @Test
    public void test08973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08973");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444", "HIhIhI444444444444444444444444444444444444444444444444444444444", "hIhIh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444");
    }

    @Test
    public void test08974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!h!!!!!!!!!!!!!!!!!!!!!!!!!!h!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "44444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test08975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('#', 143);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################################################################################################################" + "'", str2, "###############################################################################################################################################");
    }

    @Test
    public void test08976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08976");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("H         CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;H         CLASS [lJAVA.LANG.sT         I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;HCLASS[lJAVA.LANG.sTI" + "'", str1, "HCLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;CLASS[lJAVA.LANG.sTRING;HCLASS[lJAVA.LANG.sTI");
    }

    @Test
    public void test08977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08977");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08978");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aa#hi               a#aa               #a", (java.lang.CharSequence) "h !haaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08979");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih 0 0.001 1- !ih 1-");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih 0 0.001 1- !ih 1-" + "'", str1, "!ih 0 0.001 1- !ih 1-");
    }

    @Test
    public void test08980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08980");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HiHiHHI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08981");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "hI!                          ...", (java.lang.CharSequence) "                      Hi!                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("4444444444444444hi44444444444444444                                                                                        ", "                                                                                                                            hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444hi44444444444444444                                                                                        " + "'", str2, "4444444444444444hi44444444444444444                                                                                        ");
    }

    @Test
    public void test08983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08983");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "AA#################################################################################################A", (java.lang.CharSequence) "AA#################################################################################################A", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test08984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("a#################################################################################################aa", "                                hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test08985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08985");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#################################################################################################", (java.lang.CharSequence[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("hI!", "                                hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("!", strArray5, strArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "a#################################################################################################aa", (java.lang.CharSequence[]) strArray9);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "                                                 hi!");
        boolean boolean14 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "!Hi!Hi...", (java.lang.CharSequence[]) strArray9);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" });
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "I" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!" + "'", str10, "!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "I" + "'", str13, "I");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test08986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("        hI######Hi####################Hi####################Hi####################Hi#", "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH !IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        hI######Hi####################Hi####################Hi####################Hi#" + "'", str3, "        hI######Hi####################Hi####################Hi####################Hi#");
    }

    @Test
    public void test08987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08987");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!...IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!I", (java.lang.CharSequence) "####################################################################A###################################################################       444444444444444444444444444####################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test08988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH" + "'", str2, "!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHIHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IHH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH");
    }

    @Test
    public void test08989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08989");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 62);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test08990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!hI!hI!hI!hI!hI!hI...", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!h..." + "'", str2, "!h...");
    }

    @Test
    public void test08991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       ");
    }

    @Test
    public void test08992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08992");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("H                                H                                H", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                                H                                H" + "'", str2, "H                                H                                H");
    }

    @Test
    public void test08993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08993");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "H         clss [Ljv.lng.String;clss [Ljv.lng.String;clss [Ljv.lng.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08994");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "######################################################################################aiiHaa##");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test08995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08995");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444");
    }

    @Test
    public void test08996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08996");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                 ", "aiii!ii!ii!i", 85);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08997");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ihIhIhIhIA...HIhIhIhIhIh", "                                HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ihIhIhIhIA...HIhIhIhIhIh" + "'", str2, "ihIhIhIhIA...HIhIhIhIhIh");
    }

    @Test
    public void test08998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08998");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) ".........................................................h         ", (java.lang.CharSequence) "................................i..................................................................");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test08999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test08999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444", 91, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "4444444444444444444444444444444444444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test09000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test09000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi..." + "'", str2, ";GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC;GNIRTS.GNAL.AVAJL[ SSALC         Hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi...");
    }
}

