package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

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
    public void test02501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02501");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...###################################hi#!#hi#", "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "", 71);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...###################################hi#!#hi#" + "'", str4, "...###################################hi#!#hi#");
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#################################hi!                               #################################", "                hi                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HhI!HI                           hI!HI                           h################################HI", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI                           hI!HI                           h################################HI" + "'", str2, "HhI!HI                           hI!HI                           h################################HI");
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("##############################################################################################################################################################################################################################################################################################################################################################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          ", "  4444444444444444444444444444444444444444444444!   ", "         H         H         H         H        hi!         H         H         H         H      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                              hI!HIhI!HIh################################", 7, "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              hI!HIhI!HIh################################" + "'", str3, "                                              hI!HIhI!HIh################################");
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           hi!hi                           h################################" + "'", str1, "hi!hi                           hi!hi                           h################################");
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!hiHi!hiH########################", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!                               ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                               " + "'", str2, "hi!                               ");
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#", "444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                              I!", "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              I!" + "'", str2, "                                                                                              I!");
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("####################################################################################################", "H!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 874 + "'", int2 == 874);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "HhI!HI                           hI!HI                           h################################HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("I!HI                            ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaa", "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#############################################HI!HI!##############################################", "hi!aa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HhI!HI                           hI!HI                           h################################HI", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                              hi#hi                                              ", "                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II" + "'", str1, "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("         h####################################", "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       ################################        ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "", "", "", "", "", "", "", "################################", "", "", "", "", "", "", "", "" });
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!HI!H", "HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H" + "'", str2, "HI!HI!HI!H");
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "HI!HI                           hI!HI                           h################################", (java.lang.CharSequence) "##############################################################################################hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444###############################################444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444###############################################444444444444444444444444444" + "'", str2, "44444444444444444444444444###############################################444444444444444444444444444");
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 1, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str3, "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "h################################ hi#hi hi#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("...##########################################################################################...", 56);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#####################################################" + "'", str2, "...#####################################################");
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Ih!iH                           ih!ihIH            ih!iH                           ih!ih", "                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hih!ihih!ih############################### hi#hi hi#hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", "hI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hih!ihih!ih############################### hi#hi hi#hi" + "'", str3, "hih!ihih!ih############################### hi#hi hi#hi");
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                              I!", 15);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              I!" + "'", str2, "                                                                                              I!");
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str1, "!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hih!ihih!ih############################### hi#hi hi#hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih#ih ih#ih ###############################hi!hihi!hih" + "'", str1, "ih#ih ih#ih ###############################hi!hihi!hih");
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#############################################hi!hi!#############################################", "!ihhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI#################################hi!hi         ", "I!                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                   I!                        ", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                   I!                        " + "'", str2, "                   I!                        ");
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi" + "'", str1, "hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hihi!hi#####!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!##########!#####hi!hi");
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("         H", "!hi!hi                           Hi!hi            HIhi!hi              ", "HI   Hi!hiHi!hiH################################    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H" + "'", str3, "         H");
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("      HI!HI#################################hi!hi                        ", "HI!HI!HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "      ", "#################################hi", "hi                        " });
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI#HI", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("############...", "##############################################", 89);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("               ", "###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih" + "'", str1, "!ih!ih");
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH", "#############################################HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                       #############################################hi!hi                        ", "ih!ih", 11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "I!HI                                       hiHI!HI", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#############################################HI!HI!##########################################...", "hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HI!", (java.lang.CharSequence) "HI!HI      4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444             hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI!" + "'", charSequence2, "HI!HI!");
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("I!HI                                       hiHI!HI                                       ", "4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!HIHI!HI", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HIHI!HI" + "'", str2, "!HIHI!HI");
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################" + "'", str1, "#################################################################################################");
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("####################################################################################################", "#############################################HI!HI!##########################################...", 261);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!HI!HI!HI!HI!                              ", "h################################ hI!HI HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "    H  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("#############################################HI!HI!##########################################...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################HI!HI!##########################################..." + "'", str2, "#############################################HI!HI!##########################################...");
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4", "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "###############################################hi#!#hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 55 + "'", int2 == 55);
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("    H     ", "                44hi!hi!4444hi!hi!4444hi!hi!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    H     " + "'", str2, "    H     ");
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!hiHi!hiH########################", 26, "...                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hiH########################" + "'", str3, "Hi!hiHi!hiH########################");
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!IH#############################################", "#############################################HI!HI!#############################################", (int) ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI#################################hi!hi         ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###################" + "'", str5, "###################");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!HI                           hI!HI             hi", "HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("H", "I!HI                                       hiHI!HI                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...", "ih!ih###################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("#############################################hi!hi", "", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "HI!HI                           HI!HI                           H################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi" + "'", str1, "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi");
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#############################################", "", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################" });
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hI#HI", "     4444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444      " + "'", str2, "     4444444444444444444444444444444444444444444444      ");
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#############################################HI!HI!#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444");
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################################################################################################################################################################################################################################" + "'", str1, "####################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("##############444hi!4444     ###############");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############444hi!4444     ###############" + "'", str1, "##############444hi!4444     ###############");
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                         ", 39, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaa                         aaaaaaa" + "'", str3, "aaaaaaa                         aaaaaaa");
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!" + "'", str6, "!");
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!hi!hi                           Hi!hi            HIhi!hi              ", "HI!                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi                           Hi!hi            HIhi!hi" + "'", str2, "!hi!hi                           Hi!hi            HIhi!hi");
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hI!HI                           hI!HI                           h################################", (java.lang.CharSequence) "                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!HI                           hI!HI                           h################################", "HI!HI#################################hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hiHi!hiH########################", "HI   Hi!hiHi!hiH################################", 24);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "############" });
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi                           hi!hi            hihi!hi                           hi!hi            ", (int) (byte) 0, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi                           hi!hi       ..." + "'", str3, "hi!hi                           hi!hi       ...");
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "...                           hi!hi            hihi!hi                           hi!hi           ", charSequence1);
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "...                           hi!hi            hihi!hi                           hi!hi           " + "'", charSequence2, "...                           hi!hi            hihi!hi                           hi!hi           ");
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH", "hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH" });
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("    H     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI                           hI!HI            ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI            ..." + "'", str1, "HI!HI                           HI!HI            ...");
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####################################################################################################################################################################################################################################################################" + "'", str1, "####################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("IH!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH!IH!IH" + "'", str1, "IH!IH!IH!IH");
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("###############################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           " + "'", str2, "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", 94, "                          !IHHI            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi" + "'", str3, "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi");
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hI!HI                           ", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           " + "'", str2, "hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "44444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444" + "'", str1, "44444444");
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#############################################HI!HI!##############################################hI!HI                           h################################", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                         ", "", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i" });
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#############################################HI!HI!##############################################", "HI ! HI ! HI ! HI");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "##########################################################################################################################################################################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("I!                 ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################", "##############################################" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#####################################################################################################################################################################################################################################################################" + "'", str5, "#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "###################" });
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("##############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##############################################" + "'", str1, "##############################################");
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ih#ih ih#ih ###############################hi!hihi!hih", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hi                           hi!hi       ...", "#############################################hi!hi!#############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "aaaaaaa                         aaaaaaa");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("###############################################", "HI!HI                           HI!HI                           H################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################" + "'", str2, "###############################################");
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI" + "'", str1, "HI#HI");
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("I!HI                           hI!HI                           h###############################", "I!HI                                       hiHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI                           h###############################" + "'", str2, "I!HI                           hI!HI                           h###############################");
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "h    h    h    h    h    h                                             h    h    h    h    h    h   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "H         H         H         H        HI!         H         H         H         H", (java.lang.CharSequence) "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 45 + "'", int2 == 45);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray14);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "" };
        int int22 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray21);
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str30 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray21, strArray29);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray14, strArray21);
        java.lang.String str33 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray21, "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        java.lang.Class<?> wildcardClass34 = strArray21.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertArrayEquals(strArray29, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str33, "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!                               ", "#############################################HI!HI!##############################################hI!HI                           h################################", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("I!HI                           hI!HI            hiHI!HI                           hI!H...", "!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!H..." + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!H...");
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HhI!HI                           hI!HI                           h################################HI", (int) (short) 0, 19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HhI!HI             " + "'", str3, "HhI!HI             ");
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI   HI!HIHI!HIH################################    ", 45);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HIHI!HIH################################    " + "'", str2, "!HIHI!HIH################################    ");
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!HIHI!HI", "hI!HI                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444444444444444444444444444444!   ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "hI!HI                           ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH!IH#############################################", strArray7, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI                           hI!HI                           h################################", strArray2, strArray7);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "         H         H         H         H        hi!         H         H         H         H      ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IH!IH#############################################" + "'", str13, "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str14, "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                         " + "'", str2, "                                                                                         ");
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!H", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...###################################hi#!#hi#", "HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444", 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!HI                           hI!HI                           h################################", "###########HI!H", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!HI", "...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI" + "'", str2, "HI!HI");
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!hi!hi!aa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!AA" + "'", str1, "HI!HI!HI!AA");
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("###########HI!H", "!hi!hi                           Hi!hi            HIhi!hi              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###########HI!H" + "'", str2, "###########HI!H");
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("...#####################################################", "                44HI!HI!4444HI!HI!4444HI!HI!44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!                               ", "!i!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!                                                                                                 ", 3, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                 " + "'", str3, "hi!                                                                                                 ");
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                                                                                    ", "HI#HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "###################################HI!HI################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                              hi#hi                                              ", "         H         H         H         H        HI!         H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444" + "'", str1, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 33, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH" + "'", str3, "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################HI!HI!##############################################hI!HI                           h################################", "HI!HI                           hI!HI      !IH!IH4444444444444444444444444444444444444444444444   hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44444444444444444444444444###############...", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!hihi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi" + "'", str1, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi");
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!HI                           hI!HI            hiHI!HI                           hI!HI          ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI                           hI!HI            hiHI!HI                           hI!HI          " });
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ih!ih###################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih###################################" + "'", str2, "ih!ih###################################");
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("###################################HI!HI################", "##############################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                        ", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("      HI!HI#################################hi!hi                        ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "...                                ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str3, "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!aa", 47, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                hi                 ", "###############################################hi#!#hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("    H                                      ", "         H         H         H         H        hi!         H         H         H         H      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "h    h    h    h    h    h                                             h    h    h    h    h    h   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("I!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HIhI!HIh################################" + "'", str1, "I!HIhI!HIh################################");
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 7, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                       a#############################################ahia!ahia", "...###################################hi#!#hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", "IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!hi!hi                           Hi!hi            HIhi!hi", "HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!H" + "'", str2, "HI!HI!HI!H");
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("#############################################hi!hi!#############################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#############################################hi!hi!#############################################" });
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!hi                           hi!hi                           h################################", "4", "HI#HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi                           hi!hi                           h################################" + "'", str3, "hi!hi                           hi!hi                           h################################");
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                   I!                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44444444444444444444444444###############...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444hihI!HIhI!HIh################################!hi", "hI!HI                           ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...                           hi!hi            hihi!hi                           hi!hi           ", 19, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                           hi!hi            hihi!hi                           hi!hi           " + "'", str3, "...                           hi!hi            hihi!hi                           hi!hi           ");
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#############################################HI!HI", "!HIHI!HIH################################    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", "", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("4", "Hi!hiHi!hi", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4" + "'", str3, "4");
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("###################################hi!hi", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################hi!hi" + "'", str2, "###################################hi!hi");
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "AAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAHAAAAAAAAAH" });
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("aaaaaaa", "HI!H", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ", (java.lang.CharSequence) "#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 261 + "'", int2 == 261);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!HIHI!HIH################################    ", ' ', 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 44 + "'", int3 == 44);
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h" + "'", str1, "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###################################hi!hi", "                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################hi!hi" + "'", str2, "###################################hi!hi");
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                        ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] {});
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("!hi!hi                           Hi!hi            HIhi!hi");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HIHHI", "!IHHI", "!IHIHHI", "!IHHI" });
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                              I", "hi        ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              I" + "'", str3, "                                                                                              I");
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HIhI!HIhiHI!HIhI!HI", "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HI" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("     4444444444444444444444444444444444444444444444 hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444 hI!HI" + "'", str1, "4444444444444444444444444444444444444444444444 hI!HI");
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hI!HI", "#############################################HI!HI!##############################################");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI!HI" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###################################hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################################hi!hi" + "'", str1, "###################################hi!hi");
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("  4444444444444444444444444444444444444444444444!   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str1, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi                           hi!hi            hihi!hi                           hi!hi", "hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", 47);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "#");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi                           hi!hi            hihi!hi                           hi!hi" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!hi                           hi!hi            hihi!hi                           hi!hi" });
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("H", "H", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ", (java.lang.CharSequence) "HI ! HI ! HI ! HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 84 + "'", int2 == 84);
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("I!HI                           hI!HI                           h###############################", "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI                           h###############################" + "'", str2, "I!HI                           hI!HI                           h###############################");
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("##############################################", "                               ###################", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444");
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("       ################################        ", "HI!HI                           HI!HI            ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("###################################", "Hi!hiHi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "I!HI                           hI!HI                           h###############################", "#############################################HI!HI!##############################################hI!HI                           h################################", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444", "                                                                                                                                                                                                                                                                                                                                                              ", 100, 46);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              " + "'", str4, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                       #############################################hi!hi                        ", "HI!HIHI!HIH44444444444444444444444444444444", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...#####################################################", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "...#####################################################" });
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) (short) 100, "###############################################hi#!#hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################hi#!#hi##############################################" + "'", str3, "###############################################hi#!#hi##############################################");
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                                ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 34 + "'", int2 == 34);
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("...                           hi!hi            hihi!hi                           hi!hi           ", 89, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "HI!HIHI!HIH################################", 162);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 159 + "'", int3 == 159);
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("I!", "                       a#############################################ahia!ahia                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ih!ihih!ih", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ihih!ih" + "'", str2, "ih!ihih!ih");
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI ! HI ! HI ! HI", "##############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI ! HI ! HI ! HI" + "'", str2, "HI ! HI ! HI ! HI");
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI                           hI!HI            hiHI!HI                           hI!HI            ", 94, "ih!ihih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str3, "HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hI!HI                           hI!HI             hi", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI             hi" + "'", str2, "hI!HI                           hI!HI             hi");
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "                                                                                         ", (int) (byte) 1, 99);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("####################################################################################################################################################################################################################################################################", "HI!HI                           hI!HI                           h################################", 45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "Hi!hiHi!hiH################################", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "I!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("HI!HI                           hI!HI                           h################################", "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI                           h################################" + "'", str2, "HI!HI                           hI!HI                           h################################");
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!hi!hi                           Hi!hi            HIhi!hi", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#############################################HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################HI!HI" + "'", str1, "#############################################HI!HI");
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#############################################HI!HI", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################HI!HI" + "'", str2, "#############################################HI!HI");
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "IH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IHIH!Ih                           IH!IHih            IH!Ih                           IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str2, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4444444444444444444444444444444444444444444444HI!HI!", "#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str2, "4444444444444444444444444444444444444444444444HI!HI!");
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HI" + "'", str1, "HI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444###############...", 0, "HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444###############..." + "'", str3, "44444444444444444444444444###############...");
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI", "!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI" + "'", str2, "HI!HI!HI!HI");
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!i!i", "444444444444444444444444hi!4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!i" + "'", str2, "!i!i");
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI", 97, "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################HI################################################" + "'", str3, "###############################################HI################################################");
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        char[] charArray6 = new char[] { 'a', '#', '#' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "ih!iH                           ih!ihIH            ih!iH                           ih!ih", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!", "####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("    H                                      ", 2, "          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    H                                      " + "'", str3, "    H                                      ");
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "                                   ", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hihi!hih################################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "hI!HI                           ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH!IH#############################################", strArray7, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI                           hI!HI                           h################################", strArray2, strArray7);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IH!IH#############################################" + "'", str13, "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str14, "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Hi!hiHi!hiH########################" + "'", str15, "Hi!hiHi!hiH########################");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Hi!hiHi!hiH########################" + "'", str16, "Hi!hiHi!hiH########################");
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("           ih!iH                           ih!ihIH            ih!iH                           ih!ih", ' ');
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("aaaaaaaaah", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HIHi!hiHi!hi#Hi!hiHi!hiHI", 261, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HIHi!hiHi!hi#Hi!hiHi!hiHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                       #############################################hi!hi                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                 ", "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                  " });
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4", "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...                   4444444444444444444444444444444444444444444444HI!HI!...", '#', 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", "##############444hi!4444     ###############");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hI!HI                           ", "HI!HI#################################hi!hi", "HI!HI!HI!AA", 9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!HI                           " + "'", str4, "hI!HI                           ");
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   ", "", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                   " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   " + "'", str4, "                                   ");
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("###############################################hi#!#hi##############################################", "hi!hi                           hi!hi       ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################hi#!#hi##############################################" + "'", str2, "###############################################hi#!#hi##############################################");
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!HI                           hI!HI            ...", "ih!ih###################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            ..." + "'", str2, "HI!HI                           hI!HI            ...");
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444hi!4444", 0, "###############################################hi#!#hi##############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hi!4444" + "'", str3, "444hi!4444");
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444!");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4444444444444444444444444444444444444444444444!" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HIHi!hiHi!hi#Hi!hiHi!hiH", "I!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI", "                          !IHHI            ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "             hI!HI             hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi!hi                           hi!hi            hihi!hi                           hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "HI!                                                                                                 ", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "...                                ", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] {});
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                               ###################", "!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               ###################" + "'", str2, "                               ###################");
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                          !IHHI            ", "!hi!hi                           Hi!hi            HIhi!hi              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          !IHHI            " + "'", str2, "                          !IHHI            ");
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("I!", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             I!                                             " + "'", str2, "                                             I!                                             ");
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                44hi!hi!4444hi!hi!4444hi!hi!44");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444hi!4444", 67, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                44HI!HI!4444HI!HI!4444HI!HI!44", "    H                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                       a###                44hi!hi!4444hi!hi!4444hi!hi!44                       a###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "###############################################HI################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("aaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaahaaaaaaaaah", "!4444444444444444444444444444444444444444444444", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!hi                           hi!hi            hihi!hi                           hi!hi           ", "HI   Hi!hiHi!hiH################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi                           hi!hi            hihi!hi                           hi!hi           " + "'", str2, "hi!hi                           hi!hi            hihi!hi                           hi!hi           ");
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", "I!    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   " + "'", str3, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 43, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###########################################" + "'", str3, "###########################################");
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 34);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                  " + "'", str2, "                                  ");
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI                           hI!HI            hiHI!HI                           hI!HI            ", "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!hiHi!hiH################################", strArray4);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                   I!                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                   4444444444444444444444444444444444444444444444HI!HI!...                    " + "'", str1, "...                   4444444444444444444444444444444444444444444444HI!HI!...                    ");
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...#####################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###############################################HI################################################", 44, "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################HI################################################" + "'", str3, "###############################################HI################################################");
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("################################...", "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################..." + "'", str2, "################################...");
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI!HI#################################hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "HI!HHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaa", "HI!HI                           hI!HI            ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI" + "'", str3, "HI");
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444444444444444444444444444!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!hi!hi                           Hi!hi            HIhi!hi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi                           Hi!hi            HIhi!hi" + "'", str2, "!hi!hi                           Hi!hi            HIhi!hi");
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "4444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("    h     ", "hI!                               ", "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    h     " + "'", str3, "    h     ");
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                   ", "##############444hi!4444     ###############", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("44444444444444444444444444444444444", (-1), "###############################################hi#!#hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444");
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HhI!HI             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("           ih!iH                           ih!ihIH            ih!iH                           ih!ih", "HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str2, "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("          IH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH                           IH!IHIH            IH!IH                           IH!IH" + "'", str1, "IH!IH                           IH!IHIH            IH!IH                           IH!IH");
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "HI!HI                           HI!HI            ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("         H         H         H         H        hi!         H         H         H         H      ", "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                         ", "HI!HHHHHHHHHHHHHHHHHHHHHHH", "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("         H         H         H         H        hi!         H         H         H         H         ", 349, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                           HI!HI                           H################################", "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("h################################ hi#hi hi#hi", "HI#HI", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                          !IHHI            ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IHHI" + "'", str2, "!IHHI");
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", 26, "ih!ihih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str3, "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("       ################################        ", "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    h     ", "", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("###################################hi!hi", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################hi!hi" + "'", str2, "##################################hi!hi");
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI                           HI!HI            HIHI!HI                           HI!HI          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str1, "HI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "         h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444                                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444" + "'", str1, "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####", (int) (short) 0, 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444" + "'", str4, "4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI#####4444444444444444444444444h44444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                hi                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 92, 11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "I!HI                                       hiHI!HI                                       ", "HIHi!hiHi!hi#Hi!hiHi!hiH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(objArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!HIHI!HIH################################", 67, 26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!IH!IH4444444444444444444444444444444444444444444444", "###############################################hi#!#hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##############################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "##############################################################################################################################################################################################################################################################################################################################################################" });
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444", "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...###################################hi#!#hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...###################################hi#!#hi" + "'", str1, "...###################################hi#!#hi");
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "...###################################hi#!#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hI!HI", "    H                                      ", 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI" + "'", str3, "hI!HI");
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("    H     ", "aaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "44hi!hi!44", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################" + "'", str1, "###################");
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444!", "4444444444444444444444444444444444444444444444!hi!hihi!hih################################hi", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str1, "hI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Ih!iH                           ih!ihIH            ih!iH                           ih!ih", "!HIHI!HI", 100, 162);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI" + "'", str4, "Ih!iH                           ih!ihIH            ih!iH                           ih!ih!HIHI!HI");
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih#####################...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi                           Hi!hi                           H################################", "", 350);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!hi                           Hi!hi                           H################################" });
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAhi!hi!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "hi!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" });
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("    H     hi!hi                 ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    H     hi!hi                 " + "'", str2, "    H     hi!hi                 ");
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("###############################################hi#!#hi#", strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("     4444444444444444444444444444444444444444444444      ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!" + "'", str7, "hi!hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "###############################################hi#!#hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI!HI!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!" + "'", str2, "HI!HI!");
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI" + "'", str1, "HI#HI");
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("IH!IH#############################################", "#############################################HI!HI!#############################################", (int) ' ');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("ih!iH                           ih!ihIH            ih!iH                           ih!ih", strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "###################" + "'", str5, "###################");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI                           hI!HI            hiHI!HI                           hI!HI            ", "################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                  ", (java.lang.CharSequence) "HI#HI#I#HI##HI#HI#I#HIHI#H44444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                  ", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hI!HIhI!HIhI!HIhI!HIhI!HIhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H" + "'", str2, "IhI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!hI!HIhI!HIhI!HIhI!HIhI!HIhI!H");
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "I!HIhI!HIh################################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("...###################################hi#!#hi", "I!HI                           hI!HI            hiHI!HI                           hI!HI            ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) "hi!hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hihi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("I!                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!                 " + "'", str1, "I!                 ");
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!hi                           hi!hi            hihi!hi                           hi!hi            ", "4444444444444444444444444444444444444444444444HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH", 24, "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH" + "'", str3, "Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hi#####!#####Hi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiHi!hiH");
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("#############################################HI!HI!##############################################hI!HI                           h################################", "HI!HI!HI!H", "   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hI!HI                           HI!HI            HIHI!HI                           HI!HI", "HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str2, "hI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444");
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                    ", "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                    " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                              hi#hi                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#hi" + "'", str1, "hi#hi");
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hI!                               ");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "h", "I", "!", "                               " });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!                               " + "'", str2, "hI!                               ");
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "Ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "4444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH" + "'", str2, "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaa                         aaaaaaa", 63);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "4444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Ih!iH                           ih!ihIH            ih!iH                           ih!ih", "HI!HI#################################hi!hi         ", 159);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "                                                                                              I!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                              I!" + "'", str1, "                                                                                              I!");
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...#####################################################", "hI!HI                           hI!HI                           h################################", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                hi                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II", "I!HI                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II" + "'", str2, "                IIHI!HI!IIIIHI!HI!IIIIHI!HI!II");
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hihi!hi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi" + "'", str2, "hi!hihi!hi");
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "44444444444444444444444444###############################################444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!                                            hI!HIhi!                                             ", "#####################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                            hI!HIhi!                                             " + "'", str2, "hi!                                            hI!HIhi!                                             ");
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("I!                                                                                                 ", "#############################################HI!HI!#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!                                                                                                 " + "'", str2, "I!                                                                                                 ");
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("4444444444444444444444444444444444444444444444HIHi!hiHi!hiH################################!HI", "         H         H         H         H        hi!         H         H         H         H         ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hI!HI                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("    H     ", "         h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                       a#############################################ahia!ahia                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                       a#############################################ahia!ahia                        " + "'", str1, "                       a#############################################ahia!ahia                        ");
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI          ", (java.lang.CharSequence) "HI!HI  4444444444444444444444444444444444444444#############################################HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("###########HI!H", "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!                               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                               " + "'", str2, "HI!                               ");
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!HI#################################hi!hi", "44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("          IH!IH                           IH!IHIH            IH!IH                           IH!IH", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HI!HI                           HI!HI            HIHI!HI                           HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaah");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444444444444444444444444444444444444444!", "!hihi!hi", "                               ###################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str3, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                         ", (java.lang.CharSequence) "I!HI                                       hiHI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "                       ###############################################hi#!#hi#                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("4444444444444444444444444444444444444444444", "ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!i!i", 63, "hI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i" + "'", str3, "hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i");
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "         H         H         H         H        hi!         H         H         H         H      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str1, "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", "HI!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi" + "'", str2, "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("H", "", "                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!hihi!hi", 92, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!HIhI!H!i!i", "                44hi!hi!4444hi!hi!4444hi!hi!44", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI", "4444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("#############################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!hi!hi                           Hi!hi            HIhi!hi              ", "I!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi                           Hi!hi            HIhi!hi              " + "'", str2, "!hi!hi                           Hi!hi            HIhi!hi              ");
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaa", "#############################################", "#############################################hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44hi!hi!44", "aaHI#HIaaa", "#####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44hi!hi!44" + "'", str3, "44hi!hi!44");
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi!4444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "###################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                             I!                                             ", "hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhihiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaIhiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa44444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "ih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ihih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("h################################ hi#hi hi#hi", "     4444444444444444444444444444444444444444444444      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h################################ hi#hi hi#hi" + "'", str2, "h################################ hi#hi hi#hi");
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI!                                                                                                 ", "                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("ih!ih###################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH###################################" + "'", str1, "IH!IH###################################");
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!hi                           Hi!hi                           H################################");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "         H         H         H         H        HI!         H         H         H         H         ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "...                                ", (int) ' ', 9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HIHi!hiHi!hi#Hi!hiHi!hiHI", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HIHI!HIHIHI!HIHI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIHI!HIHIHI!HIHI!HIHI!HI", "IH!IH###################################", 92);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                       a#############################################ahia!ahia                        ", "###################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "IH!IH#############################################", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "...#####################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 56 + "'", int1 == 56);
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "       ################################        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ################################        " + "'", str1, "       ################################        ");
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                              I!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI  444   4444hI!HI                           hI!HI   " + "'", str2, "I!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "            hiHI!HI                           ", (java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444hi!4444     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("", "      HI!HI#################################hi!hi                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                       ###############################################hi#!#hi#                        ", "                                             I!                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       ###############################################hi#!#hi#                        " + "'", str2, "                       ###############################################hi#!#hi#                        ");
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...                                !ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                !ih!ih!ih!ih!ih!ih!ih" + "'", str1, "...                                !ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("    H                                      ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444HI!HI", "                          !IHHI            ", 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI" });
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...                                !ih!ih!ih!ih!ih!ih!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HIhI!HIh################################", '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           " + "'", str1, "HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           HI!HI                           ");
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                                                                                                   ", "I!HHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                   " + "'", str3, "                                                                                                   ");
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                              hI!HIhI!HIh################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HIhI!HIh################################" + "'", str1, "hI!HIhI!HIh################################");
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("I!HI                           hI!HI            hiHI!HI                           hI!HI            #", 'a', 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str1, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI!HI!AA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!HI                           HI!HI            HIHI!HI                           HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI            HIHI!HI                           HI!HI" + "'", str1, "HI!HI                           HI!HI            HIHI!HI                           HI!HI");
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("  4444444444444444444444444444444444444444444444!   ", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "HI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAHI!HI!AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", "                                             I!                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("Hi!hiHi!hiH########################", "aaaaaaa                         aaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!", (java.lang.CharSequence) "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!HI                           hI!HI                           h################################", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hI!HI                           hI!HI                           h################################" });
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "                                             I!                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("HI", "#############################################HI!HI!#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI" + "'", str2, "HI");
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "###################################hi!hi", 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###################" });
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI#################################hi!hi", 42, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI#################################hi!hi" + "'", str3, "HI!HI#################################hi!hi");
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "         h", (java.lang.CharSequence) "!hi!hi                           Hi!hi            HIhi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI ! HI ! HI ! HI");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("                                 hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                  ", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("  4444444444444444444444444444444444444444444444!   ", strArray2, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 7 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "!", "HI", "!", "HI", "!", "HI" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!hi!hi                           Hi!hi            HIhi!hi              ", (java.lang.CharSequence) "hi!                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("     4444444444444444444444444444444444444444444444 hI!HI                           ", "hi#hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     4444444444444444444444444444444444444444444444 hI!HI                           " + "'", str2, "     4444444444444444444444444444444444444444444444 hI!HI                           ");
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!                                ", "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("          IH!IH                           IH!IHIH            IH!IH                           IH!IH", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          IH!IH                           IH!IHIH            IH!IH                           IH!IH" + "'", str3, "          IH!IH                           IH!IHIH            IH!IH                           IH!IH");
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "!hihi!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                           hI!HI            hiHI!HI                           hI!HI            #", 162);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hihi#hi", "hi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                   ", "I!HIhI!HIh################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH", "hI!HI                           HI!HI            HIHI!HI                           HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "HhI!HI                           hI!HI                           h################################HI");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("#############################################HI!HI!##############################################", "#############################################HI!HI!#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("h################################ hI!HI HI!HI", strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i", "HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i" + "'", str2, "!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i");
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!hi!hi                           Hi!hi            HIhi!hi              ", "!HIHI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "Hi!hiHi!hiH################################", "          IH!IH                           IH!IHIH            IH!IH                           IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ", "hI#HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   " + "'", str2, "hI!HI                           hI!HI  444   4444hI!HI                           hI!HI   ");
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "ih!ihih!ih");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 3, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("HI!HIhI!HIhiHI!HIhI!HIHI!H44444444444444444", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!H" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HIHI!H");
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         H", "Hi!hi                           Hi!hi                           H################################", 6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("HI!HI", "#############################################hi!hi");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!", strArray10, strArray14);
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.split("hi!hi!", "hi!hi!", (int) (byte) 10);
        java.lang.String[] strArray27 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray30 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray27, strArray30);
        java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray22, strArray27);
        java.lang.String[] strArray35 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str36 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray35);
        java.lang.String str40 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray35, '#', (int) (short) 10, 5);
        java.lang.String str41 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                                                                                 ", strArray27, strArray35);
        boolean boolean42 = org.apache.commons.lang3.StringUtils.startsWithAny("                       #############################################hi!hi                        ", strArray27);
        java.lang.String str43 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray14, strArray27);
        java.lang.String str44 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", strArray5, strArray27);
        boolean boolean45 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444", strArray27);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "         H" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!hi!" + "'", str15, "hi!hi!");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + " " + "'", str31, " ");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!                                " + "'", str32, "hi!                                ");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertArrayEquals(strArray35, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!                                                                                                 " + "'", str41, "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + " " + "'", str43, " ");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!" + "'", str44, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!IHHI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" });
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###################################HI!HI################", 19);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################HI!HI################" + "'", str2, "################HI!HI################");
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444HI!H444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi                           hi!hi            hihi!hi                           hi!hi", "HIHi!hiHi!hi#Hi!hiHi!hiHI", 6);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                           ", "            ", "                           " });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                           4            4                           " + "'", str5, "                           4            4                           ");
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("...                                !ih!ih!ih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                !ih!ih!ih!ih!ih!ih!ih" + "'", str1, "...                                !ih!ih!ih!ih!ih!ih!ih");
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI ! HI ! HI ! HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "I!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h", 19, "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h" + "'", str3, "44hi!hih!iH                           ih!ihIH            ih!iH                           ih!ih44hi!h");
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h", 45, "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h" + "'", str3, "4444444444444444444444444444444444444444444444!   hi!hihi!hih################################h");
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!                              ", "HI!HIhI!HIhiHI!HIhI!HI", (int) ' ');
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!                              " });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "         H", "hHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str3, "HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("I!HI                                       hiHI!HI", "   hiHI!HI                           hI!HI          ", "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!HI                                       hiHI!HI" + "'", str3, "I!HI                                       hiHI!HI");
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       ih!iH                           ih!ih", 0, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     " + "'", str3, "     ");
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "...                   4444444444444444444444444444444444444444444444HI!HI!...", (java.lang.CharSequence) "!IHHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!hiHi!hiH########################");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", (int) (byte) 0);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '4');
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.split("", "hI!HI                           ");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("IH!IH#############################################", strArray7, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("hI!HI                           hI!HI                           h################################", strArray2, strArray7);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray7);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH########################" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "IH!IH#############################################" + "'", str13, "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str14, "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HhI!HI             ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HhI!HI             " + "'", str2, "HhI!HI             ");
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                              hI!HIhI!HIh################################", "hih!ihih!ih############################### hi#hi hi#hi", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "I!HI                           hI!HI                           h###############################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################" + "'", str2, "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("...                           hi!hi            hihi!hi                           hi!hi           ", "aaaaaaaaah", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }
}

