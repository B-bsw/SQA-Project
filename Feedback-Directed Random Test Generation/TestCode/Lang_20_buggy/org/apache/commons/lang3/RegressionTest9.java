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
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                                                                                .", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04502");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            ", (java.lang.CharSequence) "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test04503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04503");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("               a               ", 28, "44444444444444444444444444444444444    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               a               " + "'", str3, "               a               ");
    }

    @Test
    public void test04504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04504");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "       #hi#!", (java.lang.CharSequence) "AAHI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04505");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               aaaaaaaaaaaaaaaaaaaaaaa                                                 " + "'", str2, "                                               aaaaaaaaaaaaaaaaaaaaaaa                                                 ");
    }

    @Test
    public void test04506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04506");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                                                                             Hi!                                                                                                                                                               ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             Hi!                                                                                                                                                               " + "'", str2, "                                                                                                                                                             Hi!                                                                                                                                                               ");
    }

    @Test
    public void test04508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04508");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "...####aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaa...", (java.lang.CharSequence) "                                                                                          aHi       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04509");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    ", '#');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "###AAAAAAAAAAAAAAaahiAAAAAAAAAAAAAAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 5, 319);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    " + "'", str4, "    ");
    }

    @Test
    public void test04510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04510");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04511");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04512");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                !ih                ", "  hi ##########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                !ih                " });
    }

    @Test
    public void test04513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "a hi!        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test04514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!...", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     hi!..." + "'", str2, "                     hi!...");
    }

    @Test
    public void test04515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04515");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "#########aahia##########aahia#####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04516");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Aahi####", 35, "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###AAAAAAAAAAAahi#######AAAAAAAAAAA" + "'", str3, "###AAAAAAAAAAAahi#######AAAAAAAAAAA");
    }

    @Test
    public void test04517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!");
    }

    @Test
    public void test04518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04519");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa A aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi" + "'", str2, "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
    }

    @Test
    public void test04521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04521");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                             aaaaaaaaaaaaaaaaaaaaaaaa                     ", (java.lang.CharSequence) "Ahi##########HI", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04522");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", "                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", 53);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test04523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                !ih                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                !ih                                                                              " + "'", str1, "                !ih                                                                              ");
    }

    @Test
    public void test04524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("AHi", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHi" + "'", str2, "AHi");
    }

    @Test
    public void test04525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04525");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "               hi!                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04526");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######################################################################" + "'", str1, "#######################################################################");
    }

    @Test
    public void test04527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04527");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0, 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("a  aahi4", "##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", "          Hi!           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H  HH! 4" + "'", str3, "H  HH! 4");
    }

    @Test
    public void test04529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04529");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "                a                  ");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "##hi#aaaaaaaaaa                  ", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04530");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("####aahia##########aahia##########aahia#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####aahia##########aahia##########aahia####" + "'", str1, "####aahia##########aahia##########aahia####");
    }

    @Test
    public void test04531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04531");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                 hi          !A             ", "hi!##########                                            444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 hi          !A             " + "'", str2, "                 hi          !A             ");
    }

    @Test
    public void test04533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04533");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hi4   a  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04534");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi4", (java.lang.CharSequence) "Ahi!!ih", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04535");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("    aahi4!", "a#hi!!ih################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "    aahi4!" });
    }

    @Test
    public void test04536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04536");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!##########                                            444444444444444444444444", "HICLASS...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!##########                                            444444444444444444444444" + "'", str2, "hi!##########                                            444444444444444444444444");
    }

    @Test
    public void test04538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04538");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AIH                                                                                                 ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AIH" });
    }

    @Test
    public void test04539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04539");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04540");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               A                ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A", (java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "#######################################################################################       hi!", (int) (short) 10, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "A", "" });
    }

    @Test
    public void test04541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04541");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("a  aahi4", 42, 969);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04542");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ih A", (java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################", "AAHIAAAAAAAAAAAAA######################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!ihaa                                                     ", 968);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ihaa                                                     " + "'", str2, "!ihaa                                                     ");
    }

    @Test
    public void test04545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04546");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                              hi!", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                              hi!" + "'", str3, "                                                                              hi!");
    }

    @Test
    public void test04547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                                                                             A HI                                                                                                                                                              ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             A HI                                                                                                                                                              " + "'", str2, "                                                                                                                                                             A HI                                                                                                                                                              ");
    }

    @Test
    public void test04548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04548");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "#############################################################", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04549");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "##########", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                            ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "A                                  ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                 a  aahi4", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test04550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04550");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA#####################################################################" + "'", str1, "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA#####################################################################");
    }

    @Test
    public void test04551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04551");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAAAAHIAAAAAAAAAAAAAAAAA", 10, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04552");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "4444444444444444444444444444444", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04553");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;", "############################################               a               ############################################", (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;" });
    }

    @Test
    public void test04554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04555");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahia##########", "################################################################################################################################################################################################################################################################################################################################");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444444444444444444444444444444444444444444", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahia##########" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04556");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "a", (java.lang.CharSequence) "                                                                              hi!                ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "a" + "'", charSequence2, "a");
    }

    @Test
    public void test04557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04557");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "#############################################################", "44444444444444444444444444444444444444444444444444444444", "               hi!                " };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaa    ", charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test04558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                               aaaaaaaaaaaaaaaaaaaaaaa                                                 ", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       ..." + "'", str2, "                                       ...");
    }

    @Test
    public void test04559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04559");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("               a hi!               ", 767, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str3, "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test04560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                           ##########                                            ###", 319, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                        ##########                                            ###                                                                                                              " + "'", str3, "                                                                                                                                                        ##########                                            ###                                                                                                              ");
    }

    @Test
    public void test04561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aahi4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04562");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("a4hi!", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     a4hi!     " + "'", str2, "     a4hi!     ");
    }

    @Test
    public void test04563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("    aahi4!", "aahi########## #..                                                 a  aahi4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    aahi4!" + "'", str2, "    aahi4!");
    }

    @Test
    public void test04564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04564");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04565");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("AAHI", "Hi!", 969);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                a                  ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("A hi", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 3");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "AA", "I" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "AA", "I" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "a", "" });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test04566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04566");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaa", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaa" + "'", str2, "aaaa");
    }

    @Test
    public void test04567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("a hi!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi!" + "'", str2, "a hi!");
    }

    @Test
    public void test04568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04568");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "A               ", (java.lang.CharSequence) "444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04569");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04570");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        " + "'", str1, "4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
    }

    @Test
    public void test04571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04572");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                     aa                                                     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aa" });
    }

    @Test
    public void test04573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04573");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Aaaaaaaaaaaaaaa", "                 hi          !", 5);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHH...", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Aaaaaaaaaaaaaaa" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test04574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04574");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04576");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(".");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "." + "'", str1, ".");
    }

    @Test
    public void test04577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04577");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "Aahi####", (java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04578");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04579");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444", "aaaaa          aaaaa", "AAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04580");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                                                                                                                                                                                A HI                                                                                                                                                                                             a hi!               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A HI                                                                                                                                                                                             a hi!" + "'", str1, "A HI                                                                                                                                                                                             a hi!");
    }

    @Test
    public void test04581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("AAHI######!IH                                                                 AAHI######!IH      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH" + "'", str1, "AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test04582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04582");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;class [Ljava.lang.Str#ng;", "########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "cl", "ss [Lj", "v", ".l", "ng.Str", "ng;cl", "ss [Lj", "v", ".l", "ng.Str", "ng;cl", "ss [Lj", "v", ".l", "ng.Str", "ng;cl", "ss [Lj", "v", ".l", "ng.Str", "ng;" });
    }

    @Test
    public void test04583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04583");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "44444               A               444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04584");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                         ######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         #####################################################################" + "'", str1, "                                         #####################################################################");
    }

    @Test
    public void test04585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4ih" + "'", str1, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4ih");
    }

    @Test
    public void test04586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04586");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "       ...", (java.lang.CharSequence) "A HI                                                                                                                                                                                             a hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04587");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               hi!                ", 27);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04588");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                           ##########                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                           ##########                                            " + "'", str1, "                                           ##########                                            ");
    }

    @Test
    public void test04589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04589");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...##########################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "  aahi4   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  ", "4              hI!               44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04592");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aa", (-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04593");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "##hi#aaaaaaaaa", (java.lang.CharSequence) "4IHAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04594");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("4A4A4A4A4A4A4A4A4A4A4A4A4A4A4", strArray6, strArray12);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("               A               ", "aahi!", 4);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray18);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("aaaaaaaaaa", strArray6, strArray18);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4" + "'", str13, "4A4A4A4A4A4A4A4A4A4A4A4A4A4A4");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "               A               " });
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "aaaaaaaaaa" + "'", str20, "aaaaaaaaaa");
    }

    @Test
    public void test04595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04595");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "##########################################A##########################################", (java.lang.CharSequence) "              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04596");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 42, "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str3, "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test04597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04597");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("     ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04598");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                !ih           ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa  4                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 16 + "'", int2 == 16);
    }

    @Test
    public void test04599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aaaaaaaaaa", "Aahi####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test04600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04600");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "#################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04601");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("####################################################################################################", "A hi!!ih", "                !ih           ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04602");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                              ", (int) (short) 100, 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04603");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "    aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HICLASS...", "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test04605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04605");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("##hi#aaaaaaaaa", "hi4", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04606");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04607");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##########                                            444444444444444444444444", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!               ", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test04608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04609");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                   ", (java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aahi######!ih                                                                 ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahi######!ih                                                                 " + "'", str2, "aahi######!ih                                                                 ");
    }

    @Test
    public void test04611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", "44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444                      ##########44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04612");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ", "  ...", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              " + "'", str3, "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
    }

    @Test
    public void test04613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04613");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("A hi", 44, 111);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A hi" + "'", str3, "A hi");
    }

    @Test
    public void test04614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("I", "444444444444444444444444                                            ##########                                                                             ##########                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test04615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04615");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444                                            ##########                                                                             ##########                                                     ", "A HI                                                                                                                                                                                             a hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "444444444444444444444444", "##########", "##########" });
    }

    @Test
    public void test04616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04616");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AAHI######!IH                                                                 AAHI######!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH" + "'", str1, "AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test04617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04617");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str2, "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG  AAHI4   LASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test04618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aahi4444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "#######################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "                 hi          !A             ", (java.lang.CharSequence) "hi!IHAA                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ");
    }

    @Test
    public void test04621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04621");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "##hi#aaaaaaaaaa                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 33 + "'", int1 == 33);
    }

    @Test
    public void test04622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("...C;GNIRTS.4               ...", "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########" + "'", str2, "aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########");
    }

    @Test
    public void test04623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04623");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                               ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04624");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 9, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           " + "'", str3, "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
    }

    @Test
    public void test04625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04625");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!ih                                                                                                ", 111, "                                                     aa                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "            !ih                                                                                                " + "'", str3, "            !ih                                                                                                ");
    }

    @Test
    public void test04626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04626");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", (java.lang.CharSequence) "                                !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04627");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "###############a################", (java.lang.CharSequence) "################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04628");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aahiaahia!!", (java.lang.CharSequence) "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04629");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH" + "'", str1, "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH");
    }

    @Test
    public void test04630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04630");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("               ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test04631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04631");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "         4", (java.lang.CharSequence) "A HI                                                                                                                                                                                             a hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 189 + "'", int2 == 189);
    }

    @Test
    public void test04632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04632");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ", (java.lang.CharSequence) "                              ####aahia##########aahia##########aahia#####                              ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi" + "'", str1, "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi");
    }

    @Test
    public void test04634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHH...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                " + "'", str1, "hi!                ");
    }

    @Test
    public void test04636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04636");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04637");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                            a  aahi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test04638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04638");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04639");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("CLASS [LJAVA.LANG.STRING;#######...CLASS [C#######...CLASS [LJAVA.LANG.STRING;#######...CLASS [LJAVA.LANG.STRING;", 969, 93);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04641");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                         #####################################################################", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04642");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", " aHi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih" + "'", str2, "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih");
    }

    @Test
    public void test04643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... " + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH  ... ");
    }

    @Test
    public void test04644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04644");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", 638);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04645");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "aahi");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) " #..                                                 a  aahi4 #..                                                 a  aahi4", (java.lang.CharSequence[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, '#', 94, 68);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;", 31, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;" + "'", str3, "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test04647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                    hi!                ", "...    ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    hi!                " + "'", str2, "                                    hi!                ");
    }

    @Test
    public void test04648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04648");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "              " + "'", str1, "              ");
    }

    @Test
    public void test04649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04649");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aahi4", "                                                                                                                                                                                    ", "hi4                                                                                              ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04650");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A", "Hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "    aahi4!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 53, 5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "A" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "A" + "'", str4, "A");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test04651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04651");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str1, "aHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test04652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                     ##########                                                                             ##########                                            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                                                             ##########" + "'", str1, "##########                                                                             ##########");
    }

    @Test
    public void test04653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04653");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                !ih", 99, "aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                !ihaaaaaaaaaaaaaaaaaaaaaaaa                                  A     " + "'", str3, "                                !ihaaaaaaaaaaaaaaaaaaaaaaaa                                  A     ");
    }

    @Test
    public void test04654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04654");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                   A hi", 18);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04655");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "               A               ", 0);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("a hi!", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("####################aaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 87 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "a", "hi!" });
    }

    @Test
    public void test04656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04656");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#########aahia##########aahia#####", 1, "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#########aahia##########aahia#####" + "'", str3, "#########aahia##########aahia#####");
    }

    @Test
    public void test04657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04657");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "aahi########## #..                                                 a  aahi4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04658");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaa#######################################################################aaaaaaaaaa#a#", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04659");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                ", "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                " + "'", str2, "                                                                                                ");
    }

    @Test
    public void test04660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04660");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("a4!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4a" + "'", str2, "!4a");
    }

    @Test
    public void test04661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#################################################################aaaaaaaaaaaaa", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################aaaaaaaaaaaaa" + "'", str2, "#################################################################aaaaaaaaaaaaa");
    }

    @Test
    public void test04662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04662");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########aahia##########", 97, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...######aahia##########aahia###..." + "'", str3, "...######aahia##########aahia###...");
    }

    @Test
    public void test04663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04663");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04664");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444" });
    }

    @Test
    public void test04665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04665");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04666");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi" + "'", str2, "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
    }

    @Test
    public void test04667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04667");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi" + "'", str1, "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
    }

    @Test
    public void test04668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!", "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!" + "'", str2, "AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa4hi!");
    }

    @Test
    public void test04669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("####aahia##########aahia##########aahia####", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aahia##########aahia####" + "'", str2, "aahia##########aahia####");
    }

    @Test
    public void test04670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("               a               ", "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "               #######...A#######...                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               a               " + "'", str3, "               a               ");
    }

    @Test
    public void test04671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04671");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
    }

    @Test
    public void test04672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04672");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "aahi!", 34);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 56, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 56 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test04673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04673");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", 32, 93);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    " + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaa       A##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA    ");
    }

    @Test
    public void test04674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04674");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!");
    }

    @Test
    public void test04675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  ...", 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  ...                                                                              " + "'", str2, "  ...                                                                              ");
    }

    @Test
    public void test04676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                           ##########                                            ###", 32);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test04677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04677");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#################################################################################################", 24, 104);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("AAHI!i", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAHI!i" + "'", str2, "AAHI!i");
    }

    @Test
    public void test04679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test04680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04680");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                             A HI                                                                                                                                                              ", "", 97);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          ", (java.lang.CharSequence[]) strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                                                                                                                                             A HI                                                                                                                                                              " });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test04681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444" + "'", str3, "444");
    }

    @Test
    public void test04682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04682");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                a               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                a               " + "'", str1, "                a               ");
    }

    @Test
    public void test04683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04683");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str1, "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test04684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04684");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "##########                                                                             ##########                                            AAAAAAAAAAAAAAAAAAAAAAAA", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04685");
        java.lang.CharSequence charSequence3 = null;
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny(charSequence3, charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "class [Ljava.lang.String;...                             ##########class [Ljava.lang.String;...                             ##########class [Ljava.lang.String;...                             ##########class [Ljava.lang.String;", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { '4' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test04686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04686");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04687");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "          ", (java.lang.CharSequence) "               A               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04688");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                         aaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                 4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 928 + "'", int2 == 928);
    }

    @Test
    public void test04689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04690");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#######################################################################################       hi!", (java.lang.CharSequence) "...    ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04691");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "AA", 111);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  " + "'", str2, "##########################################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
    }

    @Test
    public void test04693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("  ... ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  ... " + "'", str1, "  ... ");
    }

    @Test
    public void test04694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04694");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "ahi!aaahi!a", (java.lang.CharSequence) "ahi!aaahi!a                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04695");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04696");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "AAHI######!IHAAHI######!IHAAHI######!IHAAHI######!IH", (java.lang.CharSequence) "                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04697");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "hi######!ih                                                                 ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04698");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih", "              Hi!               ", (int) (byte) 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "...#######A...#######");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!ih" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "!ih" });
    }

    @Test
    public void test04699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4 A 4", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04700");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                              hi!", (java.lang.CharSequence) "###########################A                                  ##########################################                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 892 + "'", int2 == 892);
    }

    @Test
    public void test04701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04701");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04702");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("          Hi!          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          Hi!          " + "'", str1, "          Hi!          ");
    }

    @Test
    public void test04703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "aHi       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("#########aahia##########aahia#####", "               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04705");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "a hi!", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04706");
        java.lang.String[] strArray2 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("##", strArray2, strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                a                  ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "");
        int int13 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "A", (java.lang.CharSequence[]) strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                                                                                             a hi                                                                                                                                                              ", strArray2, strArray12);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##" + "'", str5, "##");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "", "a", "" });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                                                                             a hi                                                                                                                                                              " + "'", str14, "                                                                                                                                                             a hi                                                                                                                                                              ");
    }

    @Test
    public void test04707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04707");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "aahiaahia", (java.lang.CharSequence) "                                                                                                ", 319);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test04708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04708");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (int) (byte) -1, "  hi ##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str3, "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test04710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###aaaaaaaaaaaaaaAAHIaaaaa...", 319, "                                                     aahi!                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###aaaaaaaaaaaaaaAAHIaaaaa...                                                     aahi!                                                                                                          aahi!                                                                                                          aahi!          " + "'", str3, "###aaaaaaaaaaaaaaAAHIaaaaa...                                                     aahi!                                                                                                          aahi!                                                                                                          aahi!          ");
    }

    @Test
    public void test04711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04711");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##hi#aaaaaaaaaa                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##hi#aaaaaaaaaa", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test04712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04712");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("  ", "aahi######ahi##########ahi##########ahi##########ahi", "###AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "########## ########## aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04714");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi!...", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04715");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "a", (java.lang.CharSequence) "#A#", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04716");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "...#######a...#######", (java.lang.CharSequence) "    AAHI4!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04717");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                a                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04719");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AIH                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AIH", "                                                                                                 " });
    }

    @Test
    public void test04720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04720");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                !ihaaaaaaaaaaaaaaaaaaaaaaaa                                  A     ", (java.lang.CharSequence) "a hi!        ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04721");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("A", "                                                 a                                                  ", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahia!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("aahia!", strArray5, strArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "#############################################################", (java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "A" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "aahia!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "aahia!" + "'", str8, "aahia!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test04722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aahi##########", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04723");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test04724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          " + "'", str1, "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test04725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04725");
        java.lang.Class[] classArray1 = new java.lang.Class[0];
        @SuppressWarnings("unchecked")
        java.lang.Class<?>[] wildcardClassArray2 = (java.lang.Class<?>[]) classArray1;
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Class<?>[]) classArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.reflect.GenericDeclaration[]) classArray1);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray1, '#', 638, 56);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray1, '#');
        org.junit.Assert.assertNotNull(classArray1);
        org.junit.Assert.assertArrayEquals(classArray1, new java.lang.Class[] {});
        org.junit.Assert.assertNotNull(wildcardClassArray2);
        org.junit.Assert.assertArrayEquals(wildcardClassArray2, new java.lang.Class[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("44444               A               444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444 A 444444" + "'", str1, "44444 A 444444");
    }

    @Test
    public void test04727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04727");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("AIH                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aIH                                                                                                 " + "'", str1, "aIH                                                                                                 ");
    }

    @Test
    public void test04728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04728");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aahi4!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "AAHI!ih                                                                                                 ", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                !ihaaaaaaaaaaaaaaaaaaaaaaaa                                  A     ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test04729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444" + "'", str2, "4444444444");
    }

    @Test
    public void test04730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "               aAa                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;" + "'", str2, "CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;");
    }

    @Test
    public void test04731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4ih", "s ", "  ...                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4ih" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4ih");
    }

    @Test
    public void test04732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                  " + "'", str1, "                                                                  ");
    }

    @Test
    public void test04733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04733");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###aaaaaaaaaaaaaaAAHIaaaaa...", (java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH", "HHHHHHHHHHHHHHHHHHHHH...", "###AAAAAAAAAAAahi#######AAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           4IH");
    }

    @Test
    public void test04735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04735");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                   ", (java.lang.CharSequence) "                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
    }

    @Test
    public void test04736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04736");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("ahi##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi##########" + "'", str1, "ahi##########");
    }

    @Test
    public void test04737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04737");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                a                  ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!##########                                            444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                ", "a", "                  " });
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "a", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "a", "" });
    }

    @Test
    public void test04738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04738");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444##Hi!", 10, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04739");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("              hi!              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test04740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04740");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444444444444444444444", (int) (short) 100, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04741");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04742");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi########## #..                                                 a  aahi4", "4444444444444444444444444444444444444444444444444444", 111);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "aahi########## #..                                                 a  aahi", "" });
    }

    @Test
    public void test04743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04743");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "##########aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "aahi4", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04744");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Ih A", 55);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04745");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "AIH                                                                                                 ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                             aaaaaaaaaaaaaaaaaaaaaaaa                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                             aaaaaaaaaaaaaaaaaaaaaaaa                     " + "'", str1, "                                             aaaaaaaaaaaaaaaaaaaaaaaa                     ");
    }

    @Test
    public void test04747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "HI!", (java.lang.CharSequence) "          Hi!          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04748");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04749");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AAHI!ih                                                                                                 ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI!ih                                                                                                 " });
    }

    @Test
    public void test04750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04750");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("########## ########## aaaaaaaaaaaaaaaaaaaaaaaa", "                                                                         a hi!               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########## ########## aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "########## ########## aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04751");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#A#", 56);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!", "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!");
    }

    @Test
    public void test04753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04753");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#######################################################################", "##########                      44444444444444444444444444444444444##########                       ", "ahi       ", 968);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#######################################################################" + "'", str4, "#######################################################################");
    }

    @Test
    public void test04754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04755");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 969 + "'", int1 == 969);
    }

    @Test
    public void test04756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("##########                                                                             ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########                                                                             ##########" + "'", str1, "##########                                                                             ##########");
    }

    @Test
    public void test04757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04757");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("aahi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ", "aahi4");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 180, 4);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "#", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!       ", "!  " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test04758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", 93, 970);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
    }

    @Test
    public void test04759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04759");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      !!!!!!!!!!!!!!!!!!!!!!!!       A                                  !!!!!!!!!!!!!!!!!!!!!!!!      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04760");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aahi###", 20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04761");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, 792, 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04762");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                               #... ", 28, "##########################################A");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               #... " + "'", str3, "                                                                                               #... ");
    }

    @Test
    public void test04763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04763");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                a               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04764");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray5 = new char[] { '#', '#' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone(charSequence2, charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "AAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                                                                               #...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertArrayEquals(charArray5, new char[] { '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("a", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test04766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04766");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(" aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, " aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04767");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "##########                                                                             ##########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04768");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "44444               A               444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("A hi!!ih", "HICLASS...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A hi!!ih" + "'", str2, "A hi!!ih");
    }

    @Test
    public void test04770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04770");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("          Hi!           ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          Hi!           " + "'", str2, "          Hi!           ");
    }

    @Test
    public void test04771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04771");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!" + "'", str1, "HI!");
    }

    @Test
    public void test04772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04772");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                              ####aahia##########aahia##########aahia#####                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                              ####aahia##########aahia##########aahia#####                              " + "'", str1, "                              ####aahia##########aahia##########aahia#####                              ");
    }

    @Test
    public void test04773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04773");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AHi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04774");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#" + "'", str4, "#");
    }

    @Test
    public void test04775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04775");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI4" + "'", str1, "HI4");
    }

    @Test
    public void test04776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", "A             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
    }

    @Test
    public void test04777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04777");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("a#hi!!ih#################################################################################################", "#######...", "AAAAAAAAAAAAAAAAHIAAAAAAAAAAAAA######################################################################                                                                                                                                                                                                                          ", 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a#hi!!ih#################################################################################################" + "'", str4, "a#hi!!ih#################################################################################################");
    }

    @Test
    public void test04778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04778");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                  A", (java.lang.CharSequence) "###aaaaaaaaaaaaaaAAHIaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04779");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("              ", "...               4.STRING;C...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "              " + "'", str2, "              ");
    }

    @Test
    public void test04780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04780");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("####################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################################################################" + "'", str1, "####################################################################################################");
    }

    @Test
    public void test04781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04781");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaahi4                                                                                              ", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04782");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       " + "'", str1, "       ");
    }

    @Test
    public void test04783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04783");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", (java.lang.CharSequence) "AAHI!ih                                                                                                 ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04784");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test04785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04785");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "#########aahia##########aahia#####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04787");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa", (java.lang.CharSequence) "...    ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###", (int) (byte) 1, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###" + "'", str3, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa##                                                                                             4aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa######################################################################aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa###");
    }

    @Test
    public void test04789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04789");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444" + "'", str3, "444");
    }

    @Test
    public void test04790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AHI       ", " hi!        ...    a               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI       " + "'", str2, "AHI       ");
    }

    @Test
    public void test04791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                         #####################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         #####################################################################" + "'", str1, "                                         #####################################################################");
    }

    @Test
    public void test04792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04792");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!aahia!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04793");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                                     AAHI!                                                     ", (java.lang.CharSequence) "AHi############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04794");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04795");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I", "#########", "#################################################################################################", 15);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I" + "'", str4, "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I");
    }

    @Test
    public void test04796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04796");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  ##########");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "  ", "##########" });
    }

    @Test
    public void test04797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04797");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                         a hi!               ", (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04798");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "#################################################################################################", (java.lang.CharSequence) "A hi");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "#################################################################################################" + "'", charSequence2, "#################################################################################################");
    }

    @Test
    public void test04799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  ...                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04800");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ", 29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04801");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("  AAHI4   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI4" + "'", str1, "AAHI4");
    }

    @Test
    public void test04802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04802");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ahi##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AHI##########" + "'", str1, "AHI##########");
    }

    @Test
    public void test04804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("i", 16, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04805");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AHI       #######################################################################################", (java.lang.CharSequence) "               a hi!        ...    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04806");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "aahi4!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4                !IH                                                                              44", " ########## aaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                            a  aahi4");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04808");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test04809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                        ##########                                            ###                                                                                                              ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test04810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04810");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("Aahi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Aahi!" + "'", str1, "Aahi!");
    }

    @Test
    public void test04811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04811");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Aahi!", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ", "                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " ahi " + "'", str3, " ahi ");
    }

    @Test
    public void test04812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ", "                                                                   aaaaaaaaaaaaaa    aaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            " + "'", str2, "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ");
    }

    @Test
    public void test04813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                !ih" + "'", str1, "                                !ih");
    }

    @Test
    public void test04814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04814");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   ", (java.lang.CharSequence) "hi4                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!IH                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                                                                                 " + "'", str1, "!ih                                                                                                 ");
    }

    @Test
    public void test04816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "a hi!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04817");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!                                                     ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!I                      AAHI!                                                     " });
    }

    @Test
    public void test04818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("            !ih                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test04819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04819");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
    }

    @Test
    public void test04820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("ih", "###############a#hi!########...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04821");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (-1), "               a hi!               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "                      ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04822");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("############################################               a               ############################################                                                     !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                                                                          !ihaa                                                            ", "!IHAA", "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaa");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04823");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ", "ahi!aaahi!a", "aahia##########aahia####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                " + "'", str3, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ");
    }

    @Test
    public void test04824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ", "aaaaaa##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                              aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test04825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04825");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "##hi#aaaaaaaaaa", (java.lang.CharSequence) "                                                                                                ", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04826");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  aahi4   ", "AAHI", (int) (short) -1);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hi!        ...", (int) '#', 34);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "  aahi4   " });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test04827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "a                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04828");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a hi!!ih                                                         ...", "AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a hi!!ih                                                         ..." });
    }

    @Test
    public void test04829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04829");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "               a                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaa..." + "'", str1, "aaaaaa...");
    }

    @Test
    public void test04831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04831");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("            class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class              ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ".LANG.sTRING;hiCLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;hi", 4, 42);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 30");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04832");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                       hI!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A hi!!ih                                                                                                 ", 792, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A hi!!ih                                                                                                 ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str3, "A hi!!ih                                                                                                 ###############################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test04834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04834");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "    ");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "##########", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "       hi!", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "    ");
        java.lang.Class<?> wildcardClass17 = strArray14.getClass();
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!", "");
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray20, "    ");
        java.lang.Class<?> wildcardClass23 = strArray20.getClass();
        java.lang.reflect.Type[] typeArray24 = new java.lang.reflect.Type[] { wildcardClass5, wildcardClass11, wildcardClass17, wildcardClass23 };
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.join(typeArray24);
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) typeArray24, "#######...");
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) typeArray24, '4', (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) typeArray24, "               a                ", 3, 767);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "aahi!" });
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;" + "'", str25, "class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str27, "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test04835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04835");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("... [LJAVA.L...", "##hi#aaaaaaaaa", "              Hi!               ", 319);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "... [LJAVA.L..." + "'", str4, "... [LJAVA.L...");
    }

    @Test
    public void test04836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04836");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaa44444               A               444444", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444               A               444444" + "'", str3, "444444444444444444               A               444444");
    }

    @Test
    public void test04837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("ih A", 180);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih A" + "'", str2, "ih A");
    }

    @Test
    public void test04838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04838");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("               A                ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A", (java.lang.CharSequence[]) strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               ", "A", "                " });
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "A", "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "               A                " + "'", str6, "               A                ");
    }

    @Test
    public void test04839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04839");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", "                !ih                ");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test04840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04840");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                          aHi       ", "A HI!     ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                          aHi       " });
    }

    @Test
    public void test04841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04841");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test04842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04842");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "aahi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04843");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aahi######", "aaaaaa", "    aahi4!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test04844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", 892);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test04845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04845");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "hi!", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "aahi######ahi##########ahi##########ahi##########ahi", 53, (int) (short) -1);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test04846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" #..                                                 a  aahi4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#..                                                 a  aahi4" + "'", str1, "#..                                                 a  aahi4");
    }

    @Test
    public void test04847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 83);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04848");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################", 1);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "444444444444444444444444AAHI444444444444444444444444", 180, 15);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "ahi", (java.lang.CharSequence[]) strArray4);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str5, "#########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test04849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04849");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                               ################################################################################", (int) '#', 53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################################################" + "'", str3, "#####################################################");
    }

    @Test
    public void test04850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04852");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "!ih                                                                                                 ", (java.lang.CharSequence) "...class              #...class [Ljava.lang.String;#...class [C#            class [Ljava.lang.String;", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04853");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                              hi!                ", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "                                                                                            a  aahi4", (java.lang.CharSequence) "#..                                                 a  aahi4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04855");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "##############################################################A                                  ", (java.lang.CharSequence) "ahi##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04856");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                ", (java.lang.CharSequence) "!IHAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH..." + "'", str3, "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH...");
    }

    @Test
    public void test04858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04858");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                 hi!IHAA");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "!ih                                                                                                 44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################..." + "'", str1, "######################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################...");
    }

    @Test
    public void test04860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04860");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" hi!        ...    a               ", "##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " hi!        ...    a               " });
    }

    @Test
    public void test04861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04861");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04862");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "HiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHiHi", (java.lang.CharSequence) "##hi#aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "                                                                                                                         AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04864");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", "Ih A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih A" + "'", str2, "Ih A");
    }

    @Test
    public void test04865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04865");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("               a hi!        ...    ", "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa            !IH                                                                              ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "aahi4", 5, 767);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "               a hi!        ...    " });
    }

    @Test
    public void test04866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04866");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "A HI!     ", (int) (short) -1, 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04867");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "            !ih                                                                                                ", (java.lang.CharSequence) "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04868");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa", (int) 'a', 970);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa" + "'", str3, "aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa!aihaa");
    }

    @Test
    public void test04869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04869");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "a4CLASS [lJAVA.LANG.sTRING;CLASS [cCLASS [lJAVA.LANG.sTRING;CLASS [lJAVA.LANG.sTRING;", "class[Ljava.lang.String;class[Cclass[Ljava.lang.String;class[Ljava.lang.String;", 319);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test04870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              " + "'", str1, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              ");
    }

    @Test
    public void test04871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04871");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", "A#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hiA#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa");
    }

    @Test
    public void test04872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04872");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                          ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04873");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I", "", "##########################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I" + "'", str3, "I");
    }

    @Test
    public void test04874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04874");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "                                                        ", (java.lang.CharSequence) "                                                                   ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04875");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAHIaaaaaaaaaaaaa######################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHIaaaaaaaaaaaaa#####################################################################" + "'", str1, "AAHIaaaaaaaaaaaaa#####################################################################");
    }

    @Test
    public void test04876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04876");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aHi", (java.lang.CharSequence) "#####################################################ahi###############################################################", 44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04877");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                !ih                                                                              ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 970, 55);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                ", "!", "ih", "                                                                              " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test04878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04878");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("a hi!", "       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "a hi!" });
    }

    @Test
    public void test04879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                   A");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   A" + "'", str2, "                   A");
    }

    @Test
    public void test04880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04880");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444", 99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("AHI       ", "hi!        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AHI       " + "'", str2, "AHI       ");
    }

    @Test
    public void test04882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04882");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", 104, "################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       " + "'", str3, "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ");
    }

    @Test
    public void test04883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04883");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aih                                                                                                 ", (java.lang.CharSequence) "#..                                                 a  aahi4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "a hi!!ih                                                                                                                   AAHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04885");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                         #####################################################################", (java.lang.CharSequence) "aaaaahiaaaaaaaaaaaaaaaaahi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!IHAAhi!I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ", "               a hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            " + "'", str2, "           44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#            ");
    }

    @Test
    public void test04887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ", "##########################################A##########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa       ");
    }

    @Test
    public void test04888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "                                                                                                                  aaaaaaaaaaaaaa", (java.lang.CharSequence) "...aaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "aahi######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04891");
        java.lang.CharSequence charSequence0 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase(charSequence0, (java.lang.CharSequence) "a#hi!!ih#################################################################################################", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04892");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "..." });
    }

    @Test
    public void test04893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04893");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04894");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              ", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04895");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI!##########                                            444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test04896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04896");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("A hi");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "A", " ", "hi" });
    }

    @Test
    public void test04897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04897");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(charSequence0, " ##        Hi!               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04898");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("     ...", 5, "HHHHHHHHHHHHHHHHHHHHH...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     ..." + "'", str3, "     ...");
    }

    @Test
    public void test04899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04899");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "hi!", 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "" });
    }

    @Test
    public void test04900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04900");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "     a4hi!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                        ", 96, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04902");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "     h!                ", (java.lang.CharSequence) "########## ########## aaaaaaaaaaaaaaaaaaaaaaaa", 68);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("##########################################A                                  ##########################################", "  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################A                                  ##########################################" + "'", str2, "##########################################A                                  ##########################################");
    }

    @Test
    public void test04904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04904");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", 638, 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...44444444444444444 ##        Hi!" + "'", str3, "...44444444444444444 ##        Hi!");
    }

    @Test
    public void test04905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04905");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "                   A", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa####################");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                   A" + "'", charSequence2, "                   A");
    }

    @Test
    public void test04906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#########", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test04907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04907");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aAHI!ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04909");
        char[] charArray7 = new char[] { '4', '4', 'a' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aahi##########", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                           ##########                                            ", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                a                  ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] { '4', '4', 'a' });
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test04910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04910");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA##########");
    }

    @Test
    public void test04911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04911");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaAAHIaaaaaaaaaaaaaa", 970, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04912");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA####################", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04913");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04914");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaaa", 100, "                                !ih                                !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                !ih                                !ih                     aaaaaaaaa" + "'", str3, "                                !ih                                !ih                     aaaaaaaaa");
    }

    @Test
    public void test04915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04915");
        char[] charArray6 = new char[] { ' ', '4', 'a', 'a' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "AAHI", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "A hi", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { ' ', '4', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test04916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04916");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                ", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ahi       ", (int) (short) 10, "                                       ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahi       " + "'", str3, "ahi       ");
    }

    @Test
    public void test04918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04918");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', 319, 100);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test04919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04919");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih", "#####################################################", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "AAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihaAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ihAAHI!ih" });
    }

    @Test
    public void test04920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04920");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "a  aahi4", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04921");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;");
    }

    @Test
    public void test04922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04922");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                                                                                                             a hi                                                                                                                                                              ", (java.lang.CharSequence) "####                                      aaaaaaaaaaaaaaaaaaaaaaa                                       ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04923");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "ahi!aaahi!a                                                                                     444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!", (java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444                                            ##########                                                                             ##########                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444                                            ##########                                                                             ##########" + "'", str1, "444444444444444444444444                                            ##########                                                                             ##########");
    }

    @Test
    public void test04925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04925");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a4!", 33, "...                             ##########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...            a4!...            " + "'", str3, "...            a4!...            ");
    }

    @Test
    public void test04926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04926");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "444444444444444444444444                                            ##########                                                                             ##########                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04927");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                     aa                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04928");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaa    ", "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test04929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04929");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "Aahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("               a hi!        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahi!..." + "'", str1, "ahi!...");
    }

    @Test
    public void test04931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04931");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) " hi!        ...    a               ", (java.lang.CharSequence) "                                                     ##########                                                                             ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04932");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "class", " ", "[", "Ljava", ".", "lang", ".", "String", ";#######...", "class", " ", "[", "C", "#######...", "class", " ", "[", "Ljava", ".", "lang", ".", "String", ";#######...", "class", " " });
    }

    @Test
    public void test04933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("a hi!!ih                                                                                                                   AAHI!                                                     aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi!!ih AAHI! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "a hi!!ih AAHI! aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04934");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaa##hi4 hi! hi! hi! hi! hi! hi! hi! hi! hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04935");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi4");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", "##########################################A##########################################", 90);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "i", (java.lang.CharSequence[]) strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "               a hi!               ", 35);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray13);
        java.lang.Class<?> wildcardClass15 = strArray13.getClass();
        java.lang.Class[] classArray16 = new java.lang.Class[] { wildcardClass2, wildcardClass9, wildcardClass15 };
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi4");
        java.lang.Class<?> wildcardClass19 = strArray18.getClass();
        java.lang.String[] strArray24 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", "##########################################A##########################################", 90);
        boolean boolean25 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "i", (java.lang.CharSequence[]) strArray24);
        java.lang.Class<?> wildcardClass26 = strArray24.getClass();
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "               a hi!               ", 35);
        int int31 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray30);
        java.lang.Class<?> wildcardClass32 = strArray30.getClass();
        java.lang.Class[] classArray33 = new java.lang.Class[] { wildcardClass19, wildcardClass26, wildcardClass32 };
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aahi4");
        java.lang.Class<?> wildcardClass36 = strArray35.getClass();
        java.lang.String[] strArray41 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" ", "##########################################A##########################################", 90);
        boolean boolean42 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "i", (java.lang.CharSequence[]) strArray41);
        java.lang.Class<?> wildcardClass43 = strArray41.getClass();
        java.lang.String[] strArray47 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", "               a hi!               ", 35);
        int int48 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray47);
        java.lang.Class<?> wildcardClass49 = strArray47.getClass();
        java.lang.Class[] classArray50 = new java.lang.Class[] { wildcardClass36, wildcardClass43, wildcardClass49 };
        java.lang.Class[][] classArray51 = new java.lang.Class[][] { classArray16, classArray33, classArray50 };
        java.lang.String str52 = org.apache.commons.lang3.StringUtils.join(classArray51);
        java.lang.String str54 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) classArray51, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "aahi", "4" });
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { " " });
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertArrayEquals(classArray16, new java.lang.Class[] { java.lang.String[].class, java.lang.String[].class, java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "aahi", "4" });
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { " " });
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(classArray33);
        org.junit.Assert.assertArrayEquals(classArray33, new java.lang.Class[] { java.lang.String[].class, java.lang.String[].class, java.lang.String[].class });
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] { "aahi", "4" });
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { " " });
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertArrayEquals(strArray47, new java.lang.String[] { "", "" });
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classArray50);
        org.junit.Assert.assertArrayEquals(classArray50, new java.lang.Class[] { java.lang.String[].class, java.lang.String[].class, java.lang.String[].class });
        org.junit.Assert.assertNotNull(classArray51);
    }

    @Test
    public void test04936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04936");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "a4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test04938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04938");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("...               4.STRING;C...", "               a hi!        ...    ", 4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "...               4.STRING;C..." });
    }

    @Test
    public void test04939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04939");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Aaaaaaaaaaaaaaa", "                              ", 111);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Aaaaaaaaaaaaaaa" });
    }

    @Test
    public void test04940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH" + "'", str1, "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH");
    }

    @Test
    public void test04941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04941");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi", "                                                                                            a  aahi4", 319);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi" + "'", str3, "ahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahiahi");
    }

    @Test
    public void test04942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04942");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("class [Ljava.lang.String;class [Cclass [Ljava.lang.String;class [Ljava.lang.String;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", "                 hi          !", 27);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class", "[Ljava.lang.Str", "ng;class", "[Cclass", "[Ljava.lang.Str", "ng;class", "[Ljava.lang.Str", "ng;" });
    }

    @Test
    public void test04943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("a hi", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a hi" + "'", str2, "a hi");
    }

    @Test
    public void test04944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("a hi!!ih                                                         ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a hi!!ih                                                         ..." + "'", str1, "a hi!!ih                                                         ...");
    }

    @Test
    public void test04945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi", 68);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi" + "'", str2, "A hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hiA hi");
    }

    @Test
    public void test04946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04946");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4" + "'", str1, "A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4");
    }

    @Test
    public void test04947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04947");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) " A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ", (java.lang.CharSequence) "                               ################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04948");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                               #... ", (java.lang.CharSequence) "444444444444444", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04949");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##########", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 0);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "##########" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test04950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04950");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "a4hi!", 78);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                                                                             Hi!                                                                                                                                                               ", (int) (byte) 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                             Hi!                                                                                                                                                               " + "'", str3, "                                                                                                                                                             Hi!                                                                                                                                                               ");
    }

    @Test
    public void test04952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04952");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "               a hi!        ...    ", "...                             ##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "!IH                                                                                                 ", (java.lang.CharSequence) "[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04954");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAHI", "######!", "IH", "                                                                 ", "AAHI", "######!", "IH", "                                                                 ", "AAHI", "######!", "IH", "                                                                 ", "AAHI", "######!", "IH", "                                                              " });
    }

    @Test
    public void test04955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aahi#...", (java.lang.CharSequence) "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04956");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04958");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       " + "'", str1, "       ");
    }

    @Test
    public void test04959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "AAHI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               4               A               ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               " + "'", str3, " A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               #               A               ");
    }

    @Test
    public void test04961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04961");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi######ahi##########ahi##########ahi##########ahi", "                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aahi######ahi##########ahi##########ahi##########ahi" });
    }

    @Test
    public void test04962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04962");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AAHI!AA              #######################################################################################################################################################################################################..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04963");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "                                         aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04964");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      " + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa      ");
    }

    @Test
    public void test04965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04965");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!IHAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04966");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ", (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04967");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("  hi ##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI ##########" + "'", str1, "  HI ##########");
    }

    @Test
    public void test04968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04968");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "###" });
    }

    @Test
    public void test04969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI4                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test04970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04970");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aahi4!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test04971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                 hi!", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                hi!" + "'", str2, "                                                                                                hi!");
    }

    @Test
    public void test04972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04972");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                                   A hi", (java.lang.CharSequence) "              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04973");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "a4!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test04974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04974");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "###aaaaaaaaaaaaaaAAHIaaaaa...                                                     aahi!                                                                                                          aahi!                                                                                                          aahi!          ", (java.lang.CharSequence) "aaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("##########                                            444444444444444444444444", "                                                                              hi!                ", "##hi4       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!       hi!  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######################################################444444444444444444444444" + "'", str3, "######################################################444444444444444444444444");
    }

    @Test
    public void test04976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04976");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfBlank("aaaaaa    ", "                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaa    " + "'", str2, "aaaaaa    ");
    }

    @Test
    public void test04977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04977");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "a hi!!ih                                                                                                 ", (java.lang.CharSequence) "                               AHi############                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test04978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04978");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("44444 A 444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                                 AAHI######!IH                                                              ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04979");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "...######aahia##########aahia###...", (java.lang.CharSequence) "                                                                                                ", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04980");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("44444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa      aaaaaaaaaaaaaaaaaaaaaaaa                                  A       aaaaaaaaaaaaaaaaaaaaaaaa", 55);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test04981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04981");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ahi!aaahi!a                                                                                     ", "#..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "ahi!aaahi!a                                                                                     " });
    }

    @Test
    public void test04982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("[LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", "hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hiclass [ljava.lang.string;class [cclass [ljava.lang.string;class [ljava.lang.string;hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str2, "LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test04983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04983");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "...aaa#######################################################################aaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04984");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hi######!ih                                                                 aahi######!ih                                                                 aahi######!ih                                                                 aahi######!ih", 68);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test04985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               ", "hhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       !ih               ");
    }

    @Test
    public void test04986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04986");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                           ##########                                            aaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "                                                                                             4", 18);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test04987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa       ...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaa       A                                  aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test04988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 0, "aahi4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test04989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04989");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##########    ##########    AAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaa", "AAHI4");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test04990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04990");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test04991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ##        Hi!");
    }

    @Test
    public void test04992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AHI       ", "  ... ", "##hi#aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AHI       " + "'", str3, "AHI       ");
    }

    @Test
    public void test04993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04993");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;", '4');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "         aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa          aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "class [Ljava.lang.String;#######...class [C#######...class [Ljava.lang.String;#######...class [Ljava.lang.String;" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test04994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04994");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("AHI                                                                                                   4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI", (int) (short) 100, 970);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI" + "'", str3, "  4.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HICLASS [LJAVA.LANG.STRING;CLASS [CCLASS [LJAVA.LANG.STRING;CLASS [LJAVA.LANG.STRING;HI");
    }

    @Test
    public void test04995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04995");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "44444444444444444444444444444444444", (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test04996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04996");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "                                                                                             4", (java.lang.CharSequence) "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test04997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04997");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAA####################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 44 + "'", int1 == 44);
    }

    @Test
    public void test04998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04998");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "a", "hi!" };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.endsWithAny(charSequence0, charSequenceArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charSequenceArray3, ' ');
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) charSequenceArray3, "#a#", 189, 32);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "a hi!" + "'", str6, "a hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test04999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test04999");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("##hi#aaaaaaaaa", (int) (byte) 100, "A               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A               A               A          ##hi#aaaaaaaaaA               A               A          " + "'", str3, "A               A               A          ##hi#aaaaaaaaaA               A               A          ");
    }

    @Test
    public void test05000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test05000");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", "aaaaahiaaaaaaaaaaaaaaaaa");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 99, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "444444444444444", 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }
}

