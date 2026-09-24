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
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "...hihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02502");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                  Hi");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02503");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("       ", "HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02504");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", "!!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02505");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02506");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!!!!!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02507");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("h!!HI!HI!                                 ", "HHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02508");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHH" + "'", str1, "HHHHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test02510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ", 898);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          " + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ");
    }

    @Test
    public void test02511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02511");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str1, "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test02512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02512");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02513");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HIHIHIHIH                                  !IHIHIHIH", "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02514");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", 87, "HIhi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H");
    }

    @Test
    public void test02515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02515");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ", "!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02516");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hih       ", "   !ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!!ih                             !!ih                             !ih                    " + "'", str2, "!ih!ih!!ih                             !!ih                             !ih                    ");
    }

    @Test
    public void test02518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02518");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!                                                                                                                              !                                  ", "!!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hihihihih!ihihihih", "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", "hihihih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihih!ihihihih" + "'", str3, "hihihihih!ihihihih");
    }

    @Test
    public void test02520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    " + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ");
    }

    @Test
    public void test02521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02521");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444444444444444444", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test02522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02522");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("44444444444444444444444444444444444444444444444444444444444444444444                             HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             HI" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444                             HI");
    }

    @Test
    public void test02523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02523");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str1, "                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test02524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                44444444444444444444444444444444444444444444444444444444444444444444          ...", "h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", "                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02526");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("       ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       " + "'", str2, "       ");
    }

    @Test
    public void test02527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test02528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02528");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hihihi!                      ...", "             !                                                                                                                     ", "                                !                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihi!                      ..." + "'", str3, "hihihi!                      ...");
    }

    @Test
    public void test02529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02529");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02530");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                             hi!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02531");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!                               ", "hih                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02533");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "         !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         !" + "'", str1, "         !");
    }

    @Test
    public void test02534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02534");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "Hi!hi!hi!h                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02535");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "4hi", 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02536");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                !                   ", "################################################H################################################", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02537");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                                                 Hi                                                 ", "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02538");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "########################!         ", (java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "########################!         " + "'", charSequence2, "########################!         ");
    }

    @Test
    public void test02539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02539");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("   !ih!ih!ihih!i!!h!ih!ih!ih", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   !ih!ih!ihih!i!!h!ih!ih!ih" + "'", str2, "   !ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test02540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02540");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!", "                 HIHIHIHI!                                  HIHIHIHIH                  ", 165);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02541");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                               " + "'", str1, "                                                               ");
    }

    @Test
    public void test02542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02542");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", "44444444444444444444444444444444444444444444444444444444444444444444                             hi!", 99);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("44444444444444444444444444444444444444444444444444444444444444444444                           ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                " });
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test02543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02543");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                                                             hih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02544");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "####################################HHH####################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "i", "!I", "!I", "!I", "!I", "!I", "I", "!I!!", "!I", "!I", "!I" });
    }

    @Test
    public void test02545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02545");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("   !ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "   ", "!", "ih", "!", "ih", "!", "ihih", "!", "i", "!!", "h", "!", "ih", "!", "ih", "!", "ih" });
    }

    @Test
    public void test02546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02546");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!!!!!", "                                                                                             hih", "hihihihih!ihihihih");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02547");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4hi", "4 4 4 4 HH 4 4 4 4 4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02548");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "!                                  ", 0);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("#############################hi", strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test02549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02550");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ", 24, "!!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      " + "'", str3, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ");
    }

    @Test
    public void test02551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02551");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                              ", "Hi!hi!hi!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                       Hi!hi!hi!                                                                                                                                        ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                              " });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 250 + "'", int4 == 250);
    }

    @Test
    public void test02552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02552");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ", "                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02553");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02554");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h", "!!                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h" + "'", str2, "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h");
    }

    @Test
    public void test02555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02555");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaHi", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02556");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("HI!", "", 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test02557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                !                                !                                !                                !", "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02558");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hI!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test02559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02559");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             " + "'", str2, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
    }

    @Test
    public void test02560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02560");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!4!4!4!4!HH   !4!4!4!4!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!4!4!4!4!HH   !4!4!4!4!4" + "'", str1, "!4!4!4!4!HH   !4!4!4!4!4");
    }

    @Test
    public void test02561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02561");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                !                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                !                  " + "'", str1, "                                !                  ");
    }

    @Test
    public void test02562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02562");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!!hi!" + "'", str1, "hi!!hi!");
    }

    @Test
    public void test02563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02563");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4hi", 898, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02564");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4hi", "                                                              ! ", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02565");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02566");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       " + "'", str1, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       ");
    }

    @Test
    public void test02567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02567");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                 !Ih", 22, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 !Ih" + "'", str3, "                                                                                                 !Ih");
    }

    @Test
    public void test02569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02569");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!ih!ih!ihih!i!!h!ih!ih!ih", "!                                !                                !                                !                                !                                ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str3, "!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test02570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02571");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay(" #########", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", (int) (byte) 0, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########" + "'", str4, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########");
    }

    @Test
    public void test02572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                          ", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                ..." + "'", str2, "                                                                ...");
    }

    @Test
    public void test02573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "                                                                                                 !Ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!" + "'", str2, "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
    }

    @Test
    public void test02574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02574");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!h", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02575");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!4!4!4!4!HH   !4!4!4!4!4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!                                                                                             ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02577");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", 96, 68);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str4, "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test02578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02578");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                !", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02579");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                                ", "! h                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                " + "'", str2, "                                                                                                ");
    }

    @Test
    public void test02580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!!                               ", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!                               " + "'", str2, "!!                               ");
    }

    @Test
    public void test02581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02581");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 168 + "'", int3 == 168);
    }

    @Test
    public void test02582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02582");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02583");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!                                                                                                   ", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                                                                               ..." + "'", str2, "!                                                                                               ...");
    }

    @Test
    public void test02585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02585");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" });
    }

    @Test
    public void test02586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02586");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h" + "'", str1, "hi!hi!hi!h");
    }

    @Test
    public void test02587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("..                             ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..                             " + "'", str2, "..                             ");
    }

    @Test
    public void test02588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02588");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!hi!hi!h!!i!hihi!hi!hi!", "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("HI! 44444444444444444444444444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02590");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02592");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("Hi", strArray3, strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi" + "'", str7, "Hi");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test02593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02593");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02594");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hIhi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!!", "#############################hi", 90);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02595");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02596");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             " + "'", str2, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
    }

    @Test
    public void test02598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         " + "'", str1, "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ");
    }

    @Test
    public void test02599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02599");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("########################!         ", "HHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################!         " + "'", str2, "########################!         ");
    }

    @Test
    public void test02600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02600");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("H                                 ", "                                !                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02601");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########", "                                                                                                                                       Hi!hi!hi!                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02602");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HIhi!hi!", 33, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444HIhi!hi!" + "'", str3, "4444444444444444444444444HIhi!hi!");
    }

    @Test
    public void test02603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02603");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str2, "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test02604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02604");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02605");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                44444444444444444444444444444444444444444444444444444444444444444444                ", "!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########" + "'", str1, "#########");
    }

    @Test
    public void test02607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                               ", 31, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               " + "'", str3, "                                                               ");
    }

    @Test
    public void test02608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02608");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02609");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hI!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02610");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("   !ih!ih!ihih!i!!h!ih!ih!ih", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02611");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih                            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02612");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HIHIHIHIH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHIH!" + "'", str1, "HIHIHIHIH!");
    }

    @Test
    public void test02613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02613");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h!!i!hihi!hi!hi!", "!HI!H!!IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi", "hi", "hi", "h", "i", "hihi", "hi", "hi" });
    }

    @Test
    public void test02614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!!hi!", "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!!hi!" + "'", str2, "hi!!hi!");
    }

    @Test
    public void test02615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!", "Hi!hi!hi!h                                                                                                    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02616");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!", "########################!         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02618");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02619");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", "                                                 Hi                                                 ");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8, "!");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", strArray4, strArray8);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", 95);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEach("IH", strArray4, strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                " });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" + "'", str11, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "IH" + "'", str16, "IH");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test02620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02620");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02621");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih", "                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str2, "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test02622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02622");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("                                                               ", "!hihihihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               " + "'", str1, "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ");
    }

    @Test
    public void test02624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test02625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02625");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!h!h!h!h!hh!h!h!h!h!", "hihihih!ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!h!h!h!h!hh!h!h!h!h!" });
    }

    @Test
    public void test02626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02626");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!" });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!" + "'", str4, "!");
    }

    @Test
    public void test02627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02627");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("     ", "HI! 44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02629");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  " + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
    }

    @Test
    public void test02630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                               hihihih!ih                        hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "             !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test02631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02631");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih" + "'", str1, "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
    }

    @Test
    public void test02632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HIHIHIHIH                                  !IHIHIHIH", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "!!HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIH                                  !IHIHIHIH" + "'", str3, "HIHIHIHIH                                  !IHIHIHIH");
    }

    @Test
    public void test02633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02633");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "###############################################################!!!!!###############################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02634");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02635");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ", "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02636");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#######          #######", "                                !!h!h!h!h!hh!h!h!h!h!                                ", 28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02637");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!", 96, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!" + "'", str3, "!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
    }

    @Test
    public void test02638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ", "44444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          " + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ");
    }

    @Test
    public void test02639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02639");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hihihihih!", "", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
    }

    @Test
    public void test02640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02640");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "#######          #######", (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!#######          #######     " + "'", str3, "hi!hi!#######          #######     ");
    }

    @Test
    public void test02641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02642");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "i", "H", "!", "IH", "!", "IH", "!", "IH", "!", "IH", "!", "IHIH", "!", "I", "!!", "H", "!", "IH", "!", "IH", "!", "I" });
    }

    @Test
    public void test02643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02643");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("HHHHHHHHHHHHHHHHHHHHHH", "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02644");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                                                 !Ih", (java.lang.CharSequence) "                                !                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 49 + "'", int2 == 49);
    }

    @Test
    public void test02645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02645");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ", ' ', 168);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 99 + "'", int3 == 99);
    }

    @Test
    public void test02646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                !                   ", "                                                 Hi                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                   " + "'", str2, "                                !                   ");
    }

    @Test
    public void test02647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi");
    }

    @Test
    public void test02648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02648");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("################################################H################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02649");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(charSequence0, (java.lang.CharSequence) " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02650");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "!                                                                                                ", 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test02651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str2, "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
    }

    @Test
    public void test02652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02652");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!                                                                                                                              !                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                                                                                                              !" + "'", str1, "hi!                                                                                                                              !");
    }

    @Test
    public void test02653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02653");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h!ih!ih!ih", "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "", "" });
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test02654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02654");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("          !ih                             ");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "          ", "!", "ih", "                             " });
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02655");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                                                                       Hi!hi!hi!                                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!" + "'", str1, "Hi!hi!hi!");
    }

    @Test
    public void test02656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                 HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHIHIHI!                                  HIHIHIHIH" + "'", str1, "HIHIHIHI!                                  HIHIHIHIH");
    }

    @Test
    public void test02657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02657");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "                             hi", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02658");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", (java.lang.CharSequence) "HIHIHIHIH                                  !IHIHIHIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test02659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02659");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("h!!HI!HI!                                 ", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!                                                                                                !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!!HI!HI!                                 " + "'", str2, "h!!HI!HI!                                 ");
    }

    @Test
    public void test02660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02660");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02661");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                  ", "HHHHH", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!HI!H!!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!H!!IH" + "'", str1, "!HI!H!!IH");
    }

    @Test
    public void test02663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!                                                                                               ...", "hi!hi!hi!h!!i!hihi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02664");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#########", "hi!hi!hi!h!!i!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02665");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                      ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  ", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                      " + "'", str4, "                                      ");
    }

    @Test
    public void test02666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02666");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HHHHHHHHHHHHHHHHHHHHHH", "hi                                                                 !                                                                                               !                              hi                                                                 !                              ", 100, 131);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              " + "'", str4, "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test02667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02667");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("                       !!HI!HI!H", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ", 66);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02668");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) (short) 100, "!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str3, "!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test02669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02669");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hihI!Hi!                                                                                       hi", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test02670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02670");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", 67, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02671");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", "44444444444444444444444444444444444444444444444444444444444444444444", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02672");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hihihihih                                  !", "                               hihihih!ih                        hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02673");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hihihihi!                                  hihihihih", "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02674");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase(" #########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02675");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("             !", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02676");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44444444444444444444444444444444444444444444444444444444444444444444                             HI!", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", 73);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI" + "'", str2, "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
    }

    @Test
    public void test02678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02678");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02679");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "!ih                            ", 5, 100);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test02680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02680");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02681");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!Hi!                                                                                       ", "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02682");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", " ", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02683");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hihihihih!", "                                  !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02684");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#################################################", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################" + "'", str2, "#################################################");
    }

    @Test
    public void test02685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02685");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!!!!!!!...", "                                  !", 131);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02686");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("44444444444444444444444444444444444444444444444444444444444444444444                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "aaaaaaaaHi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", 969);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444");
    }

    @Test
    public void test02689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02690");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                 ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test02691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!ih!ih!ihih!i!!h!ih!ih!ih", "!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str2, "!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test02692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02692");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!ih                        ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                        ..." + "'", str1, "!ih                        ...");
    }

    @Test
    public void test02693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02693");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "#########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                !!h!h!h!h!hh!h!h!h!h!                                ", 0, "         !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                !!h!h!h!h!hh!h!h!h!h!                                " + "'", str3, "                                !!h!h!h!h!hh!h!h!h!h!                                ");
    }

    @Test
    public void test02695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02695");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                               ", "HIHIHIHIH                                  !IHIHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               " + "'", str2, "                                                                                               ");
    }

    @Test
    public void test02696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02696");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                                                                   ", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                   " + "'", str2, "                                                                                                                                   ");
    }

    @Test
    public void test02697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02697");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                ", "                                                 Hi                                                 ");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray9, "!");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", strArray5, strArray9);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", 95);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("IH", strArray5, strArray16);
        int int18 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...hihih", strArray16);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "                                !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                " });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" + "'", str12, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "IH" + "'", str17, "IH");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test02698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02698");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "4", (java.lang.CharSequence) "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "4" + "'", charSequence2, "4");
    }

    @Test
    public void test02699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02699");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44444444444444444444444444444444444444444444444444444444444444444444                             HI!", "!ih                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02700");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi!                                                                                                                              !", 280);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                                                              !" + "'", str2, "hi!                                                                                                                              !");
    }

    @Test
    public void test02701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02701");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "          ", "                                                                                                                                       Hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02702");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                                            !!hi!hi!                                            ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HIhi!hi!", 66);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          HIhi!hi!" + "'", str2, "                                                          HIhi!hi!");
    }

    @Test
    public void test02704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02704");
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!4!4!4!4!HH   !4!4!4!4!4", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!!HI!HI!H", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test02705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("44444444444444444444444444444444444444444444444444444444444444444444                             HI!", "", "                 HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444                             HI!" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444                             HI!");
    }

    @Test
    public void test02706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02706");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hihihihih                                  !ihihihih", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02707");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                ", "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02708");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("h!ih!ih!ih", 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02709");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!                                                                                               ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02710");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "                                            !!hi!hi!                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i", "HH   ", "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
    }

    @Test
    public void test02712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02712");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!                                                                                             ", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "!!!!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                             " + "'", str3, "hi!                                                                                             ");
    }

    @Test
    public void test02713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02713");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "   !ih!ih!ihih!i!!h!ih!ih!ih", (java.lang.CharSequence) "!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "   !ih!ih!ihih!i!!h!ih!ih!ih" + "'", charSequence2, "   !ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test02714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02714");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", "", "                                                                ...", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih" + "'", str4, "!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test02715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02715");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!         !         !         !         !                                                       ", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", "                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     " + "'", str3, "     ");
    }

    @Test
    public void test02716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02716");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("", "!hihihihih", 280);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02717");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!HI!h!!ih");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "!HI!h!!ih" });
    }

    @Test
    public void test02718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02718");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                !                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!" + "'", str1, "!");
    }

    @Test
    public void test02719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02719");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ", (java.lang.CharSequence) "4 4 4 4 HH 4 4 4 4 4");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 542 + "'", int2 == 542);
    }

    @Test
    public void test02720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02720");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "             !");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02721");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                                  ", (java.lang.CharSequence) "hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 66 + "'", int2 == 66);
    }

    @Test
    public void test02722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02722");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("...HIHIH", "!ih                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...HIHIH" + "'", str2, "...HIHIH");
    }

    @Test
    public void test02723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test02724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hihihihih                                  !ihihihih", 30);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihih                                  !ihihihih" + "'", str2, "hihihihih                                  !ihihihih");
    }

    @Test
    public void test02725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02725");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02726");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hihihihih!                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02727");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      ", "HI! 44444444444444444444444444444444444444444444444444444444444444444444", 250);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "HI!HIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIHHIHIHIHI!                                  HIHIHIHIH      " });
    }

    @Test
    public void test02728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02728");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 49, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str3, "                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test02729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02729");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!#######          #######     ", "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02730");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02731");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02732");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                       !!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02733");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hihihih!ih", "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02734");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!!h!h!h!h!hh!h!h!h!h!", "                              !                                                                 IH                              !                                                                                               !                                                                 IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!h!h!h!h!hh!h!h!h!h!" + "'", str2, "!!h!h!h!h!hh!h!h!h!h!");
    }

    @Test
    public void test02735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02735");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH", "hihihi!                                  hihihihih", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH" + "'", str3, "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH");
    }

    @Test
    public void test02736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 29, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################" + "'", str3, "#############################");
    }

    @Test
    public void test02737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              " + "'", str2, "                                                                                              ");
    }

    @Test
    public void test02738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02738");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                              !                                  ", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02739");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hihihihih                                  !ihihihih", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02740");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("..                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..                             " + "'", str1, "..                             ");
    }

    @Test
    public void test02742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02742");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444HIhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02743");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test02744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02744");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "HIHIHIHIH                                  !IHIHIHIH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" });
    }

    @Test
    public void test02745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02745");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!                                !                                !                                !                                !                                ", 63, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!                                !                                !                                !                                !                                " + "'", str3, "!                                !                                !                                !                                !                                ");
    }

    @Test
    public void test02746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02746");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!                                ", "                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                " + "'", str2, "!                                ");
    }

    @Test
    public void test02747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02747");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "!                                !                                !                                !                                !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                   ", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        " + "'", str2, "                        ");
    }

    @Test
    public void test02749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02749");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i", "H!IH!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  " + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh  ");
    }

    @Test
    public void test02751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02751");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                              !                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02752");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih!!ih", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!!ih" + "'", str2, "!ih!!ih");
    }

    @Test
    public void test02753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02753");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hH", "!                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hH" });
    }

    @Test
    public void test02754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02754");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" #########", "                              !                                                                 ih                              !                                                                                               !                                                                 ih", "!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " #########" + "'", str3, " #########");
    }

    @Test
    public void test02755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02755");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("HIhi!hi!", "                                                           ", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02756");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih", (-1), "                 HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih" + "'", str3, "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
    }

    @Test
    public void test02757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02757");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02758");
        java.lang.String[] strArray3 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "                                  ");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.split("", "", 0);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray13, "!                                  ");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("hi!!hi!", strArray7, strArray15);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15, "!ih                             ");
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                  " + "'", str9, "                                  ");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!!hi!" + "'", str17, "hi!!hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] {});
    }

    @Test
    public void test02759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                    !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02760");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hihihihih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02761");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                              !                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02762");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                              !                                                                 ih                              !                                                                                               !                                                                 ih", "!                                ", "                           ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02764");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("h                              !                                                                HI!h                              !                                                                                               !                                                                 ih                                 !                                                                                               !                              hi                                                                 !                              ", 73, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       HI!h" + "'", str3, "                       HI!h");
    }

    @Test
    public void test02765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ", "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02766");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hihihi!                      ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02767");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  444444444444444444444444444444", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                                                                                        ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02769");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("..                             ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02770");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!", "hihihih!ih", (int) (short) 10);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                             4!                                                               4", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "HI", "HI", "HI", "HI", "HIHI", "HI", "HI", "HI", "HI" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test02771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH", 24, "                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH" + "'", str3, "HIHIHIHIH                         Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!HIHIHIHIH");
    }

    @Test
    public void test02772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02772");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hih                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02773");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!         !         !         !         !                                                       ", "                                  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02774");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test02775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02775");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!         ", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!         " + "'", str2, "!         ");
    }

    @Test
    public void test02776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02776");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih" + "'", str1, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
    }

    @Test
    public void test02777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02778");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test02779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02779");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hihihih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02780");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                !                                !                                !                                !", "!                                  ", (int) (short) 0, 5);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!                                                             !                                !                                !                                !" + "'", str4, "!                                                             !                                !                                !                                !");
    }

    @Test
    public void test02781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02781");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 30, 32);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02783");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                           ...", "                                                          HIhi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02784");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih", 49, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02785");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02786");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                      hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!!                             hi!                             hi!!                             hi!!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test02787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02787");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02788");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    " + "'", str1, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ");
    }

    @Test
    public void test02789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02789");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "                                                          HIhi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", "                                !", 94);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str3, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test02791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02791");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("HHHHHHHHHHHHHHHHHHHHHH", "HIH                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02792");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!  HH   Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "!                                  ", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  " + "'", str2, "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ");
    }

    @Test
    public void test02794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       " + "'", str1, "       ");
    }

    @Test
    public void test02795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02795");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                  !", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########", 93);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02796");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              " + "'", str1, "hHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
    }

    @Test
    public void test02797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02797");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", "                             h", 100, 280);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h" + "'", str4, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h");
    }

    @Test
    public void test02798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02798");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("###############################################################!!!!!###############################################################", "44444444444444444444444444444444444444444444444444444444444444444444                             HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02799");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!hi!hi!", "", 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "Hi!hi!hi!" });
    }

    @Test
    public void test02800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02800");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!!!!!!!...", "!         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test02801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02801");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                                                                                             hih", "                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hih" });
    }

    @Test
    public void test02802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02802");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         " + "'", str2, "HIHIHIHIH                         HI!HI!HI!HI!HIHI!HI!HI!HI!HI!HI!HIHIHIHIH                         ");
    }

    @Test
    public void test02803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02803");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test02804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02804");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                             4hi", "                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  4hi" + "'", str2, "  4hi");
    }

    @Test
    public void test02805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02805");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hih       ", "HHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                  ", "!!!!!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "                                  " });
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                  " + "'", str3, "                                  ");
    }

    @Test
    public void test02807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", 542, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH" + "'", str3, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
    }

    @Test
    public void test02808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02808");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                             hi", strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hihI!Hi!                                                                                       hi", (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test02809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02809");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                 H                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test02810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "                                  !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi");
    }

    @Test
    public void test02811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02811");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("4hi", "                                                                                                                                     hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4" + "'", str2, "4");
    }

    @Test
    public void test02813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02813");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       .." + "'", str1, "       ..");
    }

    @Test
    public void test02814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02814");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i", 35, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!i" + "'", str3, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!i");
    }

    @Test
    public void test02815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02815");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hI!Hi!                                                                                       ", "hihihihi!                                  hihihihih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02816");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                    ", 5, "                44444444444444444444444444444444444444444444444444444444444444444444          ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test02817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02817");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "          ", "!i");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02818");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                                                                        ", (java.lang.CharSequence) "                                                                                               ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                                                                        " + "'", charSequence2, "                                                                        ");
    }

    @Test
    public void test02819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02819");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                 Hi                                                 ", "#############################hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("####################################HHH####################################", 31);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################" + "'", str2, "###############################");
    }

    @Test
    public void test02821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02821");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
    }

    @Test
    public void test02822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02822");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "HHHHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02823");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", (int) (byte) 1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "                                                                                                                                          " });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                          " + "'", str4, "                                                                                                                                          ");
    }

    @Test
    public void test02824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!h!!i!hihi!hi!hi", "!!                               ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ", "!hihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    " + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ");
    }

    @Test
    public void test02826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02826");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ", "hi!                                                                                                 ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("", "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02828");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!         !         !         !         !                                                       ", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02829");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterType("!         ");
        java.lang.String[] strArray6 = new java.lang.String[] { "                              !                                                                 ", "Hi!" };
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("!ih!!ih", strArray3, strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hihihi!                                  hihihihih", (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("i", strArray6, strArray11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "!", "         " });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "                              !                                                                 ", "Hi!" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                              !                                                                 ih                              !                                                                                               !                                                                 ih" + "'", str7, "                              !                                                                 ih                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "i" + "'", str12, "i");
    }

    @Test
    public void test02830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02830");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                !!h!h!h!h!hh!h!h!h!h!                                ", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !!h!h!h!h!hh!h!h!h!h!                                " + "'", str2, "                                !!h!h!h!h!hh!h!h!h!h!                                ");
    }

    @Test
    public void test02831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("     ", "!ih                             ", "                           ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     " + "'", str3, "     ");
    }

    @Test
    public void test02832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaa", "###############################################################!!!!!###############################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02833");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HHH", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHH" + "'", str2, "HHH");
    }

    @Test
    public void test02834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02834");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hihi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                   hi!                                                                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI!Hi!                                                                                       ", "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!Hi!                                                                                       " + "'", str2, "HI!Hi!                                                                                       ");
    }

    @Test
    public void test02836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("         !ih!!ihaaa         ", "!h");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02838");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hI!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test02839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hihihihih                                  !", "                44444444444444444444444444444444444444444444444444444444444444444444          ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02840");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("         !ih!!ihaaa         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         !ih!!ihaaa         " + "'", str1, "         !ih!!ihaaa         ");
    }

    @Test
    public void test02841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02841");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 HI                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ", (java.lang.CharSequence) " ihhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02842");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         !", 250);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               " + "'", str2, "                                                                                               ");
    }

    @Test
    public void test02845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02845");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI!Hi!                                                                                       ", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02846");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02847");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02848");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HIHIHIHI!                                  HIHIHIHIH", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!H", "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHIHIHI!                                  HIHIHIHIH" + "'", str3, "HIHIHIHI!                                  HIHIHIHIH");
    }

    @Test
    public void test02849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02849");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hihI!Hi!                                                                                       hi", (java.lang.CharSequence) "!         hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02850");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02851");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "!!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02852");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("#############################hi", "...HIHIH!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02853");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!", 99, "hihihihih                                  !ihihihih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str3, "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test02854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02854");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "!hihihihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!hi!hi!hi!hihi!hi!hi!hi!hi!                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test02856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                             4hi", "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             4hi" + "'", str2, "                             4hi");
    }

    @Test
    public void test02857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02857");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "", "                             hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test02858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HIHIHIHIH                                  !IHIHIHIH", 30, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02860");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!HI!H!!IH", "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "", "", "I", "", "", "", "I", "" });
    }

    @Test
    public void test02861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02861");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("i", "!HI!h!!ih", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02862");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02863");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                       !!HI!HI!H", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02864");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02865");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h!         hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hhi!hi!hi!h");
    }

    @Test
    public void test02866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02866");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "!!ih!ih!ihih!i!!h!ih!ih!ih", (java.lang.CharSequence) "                                !                  ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "!!ih!ih!ihih!i!!h!ih!ih!ih" + "'", charSequence2, "!!ih!ih!ihih!i!!h!ih!ih!ih");
    }

    @Test
    public void test02867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02867");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                                !", "                                !!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                             4!                                                               4", "i!hi!hi!hi!hihi!hi!hi!hi!hi!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4!                                                               4" + "'", str2, "4!                                                               4");
    }

    @Test
    public void test02869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih" + "'", str1, "!ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih                             !ih");
    }

    @Test
    public void test02870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02870");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HHHHHHHHHHHHHHHHHHHHHHhi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              " + "'", str1, "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
    }

    @Test
    public void test02871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02871");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                                                        !ih!ih!ih!ih!ihih!ih!ih!ih!ih", "                                !                                !                                !                                !", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HHHHH", "                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHH" + "'", str2, "HHHHH");
    }

    @Test
    public void test02873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02873");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", "aaaaa                                                               ", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test02875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02875");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("###############################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###############################" });
    }

    @Test
    public void test02876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02876");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI! 44444444444444444444444444444444444444444444444444444444444444444444", "!!                               ", "!                                ", 33);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI! 44444444444444444444444444444444444444444444444444444444444444444444" + "'", str4, "HI! 44444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test02877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02877");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!h!!i!hihi!hi!hi", 90, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!                                  ", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                  " + "'", str2, "!                                  ");
    }

    @Test
    public void test02879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02879");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02880");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!hi!hi!", "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!" + "'", str2, "Hi!hi!hi!");
    }

    @Test
    public void test02881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ", 289);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      " + "'", str2, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ");
    }

    @Test
    public void test02882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02882");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "###############################################################!!!!!###############################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                !                                !                                !                                !", "!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                !                                !                                !                                !" + "'", str2, "                                !                                !                                !                                !");
    }

    @Test
    public void test02884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02884");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                            !!hi!hi!                                            ", "!!h!h!h!h!hh!h!h!h!h!       ...       ...       ...       ...       ...       ...       ...  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02885");
        char[] charArray9 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!         ", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!                                                                                                 ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertArrayEquals(charArray9, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test02886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02886");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "                                 !IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!IH                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02887");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", (java.lang.CharSequence) "...HIHIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test02888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02888");
        java.lang.CharSequence charSequence0 = null;
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, charSequence1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!ih", "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test02890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02890");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4 4 4 4 HH 4 4 4 4 4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02891");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                        ", "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02892");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test02893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02893");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!                                                                                             ", 542, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!                                                                                             aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02894");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !      ", "!ih!ih!ih!ih!ih!ihih!ih!ih!ih!iH", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02895");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!4!4!4!4!HH   !4!4!4!4!4", "hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("4!                                                               4", "                                !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4!                                                               4" + "'", str2, "4!                                                               4");
    }

    @Test
    public void test02897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02897");
        char[] charArray11 = new char[] { '4', 'a', ' ', 'a', '4' };
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!", charArray11);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi", charArray11);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                       ", charArray11);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHH", charArray11);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!i", charArray11);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "H                                 ", charArray11);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertArrayEquals(charArray11, new char[] { '4', 'a', ' ', 'a', '4' });
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test02898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02898");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!ih!!ihaaa", 63);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!!ihaaa" + "'", str2, "!ih!!ihaaa");
    }

    @Test
    public void test02899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02899");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str2, "hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test02900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02900");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########", "!ih      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02901");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!                                                                                                 ", "hihI!Hi!                                                                                       hi                                                       HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02902");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "! h                             ", (java.lang.CharSequence) "Ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test02903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02903");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!h!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02904");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "                44444444444444444444444444444444444444444444444444444444444444444444                ", (java.lang.CharSequence) "!!!                               ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "                44444444444444444444444444444444444444444444444444444444444444444444                " + "'", charSequence2, "                44444444444444444444444444444444444444444444444444444444444444444444                ");
    }

    @Test
    public void test02905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02905");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "!ih!ih!!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !!ih                             !ih                             !!ih                             !!ih                             !!ih                             !!ih                                      !", "!!ih!ih!ihih!i!!h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02906");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...hihih", "                                                 H                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("h!!HI!HI!                                 ", "!!!                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!!HI!HI" + "'", str2, "h!!HI!HI");
    }

    @Test
    public void test02908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02908");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI! 44444444444444444444444444444444444444444444444444444444444444444444", (int) (byte) 100, 542);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02909");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi" + "'", str1, "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihi");
    }

    @Test
    public void test02910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("################################################H################################################", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02912");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("...hihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hihih" + "'", str1, "...hihih");
    }

    @Test
    public void test02913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02913");
        java.lang.String[] strArray2 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "                                                                  Hi");
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test02914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02914");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!                                !                                !                                !                                !", "aaaaaaaaH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!                                !                                !                                !                                !" });
    }

    @Test
    public void test02915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi", 23, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02916");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI", "                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02917");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", "hH", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test02918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02918");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("       ", "                 HIHIHIHI!                                  HIHIHIHIH                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02919");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "!!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02920");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4 4 4 4 HH 4 4 4 4 4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4 4 4 4 HH 4 4 4 4 4" + "'", str1, "4 4 4 4 HH 4 4 4 4 4");
    }

    @Test
    public void test02921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02921");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#######          #######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#######          #######" + "'", str1, "#######          #######");
    }

    @Test
    public void test02922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02922");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                              ", "                       HI!h", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02923");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("#################################################", "                                !                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02924");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!" + "'", str1, "h!ih!HI!HI!HI!HI!HIHI!HI!HI!HI!HI!");
    }

    @Test
    public void test02925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!!HI!HI!", "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02926");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("H", "hihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih", 66, 87);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih" + "'", str4, "Hhihihihi!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!hhihihihih");
    }

    @Test
    public void test02927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02927");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH", "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH" + "'", str3, "iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!I                                                                                                                                                            hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!hiH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I #########iH!IH!IH");
    }

    @Test
    public void test02928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02928");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                               !", "hihihihih!                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihih!                                                                                          " + "'", str2, "hihihihih!                                                                                          ");
    }

    @Test
    public void test02929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02929");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test02930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02930");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi", "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi                                  hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test02931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02931");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!ih", "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02932");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!         !         !         !         !         ", "HH   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test02933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02933");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4!                                                               4", "                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4!                                                               4" + "'", str2, "4!                                                               4");
    }

    @Test
    public void test02934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02934");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 3, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test02935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02935");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("#########", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########" + "'", str2, "#########");
    }

    @Test
    public void test02936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02936");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                   ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test02937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02937");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "!ih                        ...", "             !                                                                                                                     ", 95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str4, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test02938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02938");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("IH!IH!IH!IH!IH!IHIH!I!!H!IH!IH!I", "!                                                                HI!h                              !                                                                                               !                                                                 ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!!!                               ", 96, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "!!!                               aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test02940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!" + "'", str1, "hI!");
    }

    @Test
    public void test02941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02941");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !" + "'", str1, "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !");
    }

    @Test
    public void test02942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02942");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h", "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02943");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hihihihih                                  !ihihihihhihihihih       !!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02944");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih!ih!ih!ih!ihih!i!!h!ih!ih!i!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02945");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!" + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!");
    }

    @Test
    public void test02946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02946");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("44444444444444444444444444444444444444444444444444444444444444444444                             HI!", 542);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02947");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                              !                                  ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test02948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!" + "'", str1, "!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!44!44!44!44!44!44!4444!44!44!44!");
    }

    @Test
    public void test02949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02949");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("! h                             ", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "! h                             " + "'", str3, "! h                             ");
    }

    @Test
    public void test02950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02950");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                           hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!", "                                                           ", 3);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" + "'", str4, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!" });
    }

    @Test
    public void test02951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02951");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!                                                                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!                                                                                                " + "'", str1, "!                                                                                                ");
    }

    @Test
    public void test02952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02952");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("          !ih                             ", "                !ih!ih!ih!ih!ihih!ih!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          !ih                             " + "'", str2, "          !ih                             ");
    }

    @Test
    public void test02953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02953");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        " + "'", str2, "                                                                                        ");
    }

    @Test
    public void test02954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02954");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("", "!ih      ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test02955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02955");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!i", 95, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!i" + "'", str3, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!i");
    }

    @Test
    public void test02956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02956");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HH   ", "          ", "                                                 Hi                                                 ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test02957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02957");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hi!hi!h!!i!hihi!hi!hi!", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test02958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02958");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!i", "i", 96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test02959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "h!ih!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02960");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!   ", 75);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       " + "'", str2, "                    hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                       ");
    }

    @Test
    public void test02961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02961");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!!h", "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02962");
        java.lang.String[] strArray2 = new java.lang.String[] { "!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "####################################HHH####################################", 168, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "!", "" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test02963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi" + "'", str2, "hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi");
    }

    @Test
    public void test02964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02964");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "!hihihihih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hihihihih!" + "'", str1, "!hihihihih!");
    }

    @Test
    public void test02965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02965");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hI!Hi!                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!Hi!" + "'", str1, "hI!Hi!");
    }

    @Test
    public void test02966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02966");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test02967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02967");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                              !                                                                HI!h                              !                                                                                               !                                                                 ih", 67, 90);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       " + "'", str3, "                       ");
    }

    @Test
    public void test02968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02968");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str1, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test02969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02969");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h", 165);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      " + "'", str2, "!hi!hi!hi!hihi!hi!hi!hi!hi!hi!                                h                                                                                                      ");
    }

    @Test
    public void test02970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02970");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("4 4 4 4 HH 4 4 4 4 4");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "4", " ", "4", " ", "4", " ", "4", " ", "HH", " ", "4", " ", "4", " ", "4", " ", "4", " ", "4" });
    }

    @Test
    public void test02971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("####################################HHH####################################", 33);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################HHH####################################" + "'", str2, "####################################HHH####################################");
    }

    @Test
    public void test02972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02972");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 67 + "'", int1 == 67);
    }

    @Test
    public void test02973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                ..." + "'", str1, "                                                                ...");
    }

    @Test
    public void test02974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02974");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!!h!h!h!h!hh!h!h!h!h!", "                              ", "      !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                               H     !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!!h!h!h!h!hh!h!h!h!h!" + "'", str4, "!!h!h!h!h!hh!h!h!h!h!");
    }

    @Test
    public void test02975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi!hi!hi!hi!hihi!hi!hi!hi!hi!", "!IH                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!" + "'", str2, "Hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
    }

    @Test
    public void test02976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "!                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !     H                               !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !                                !    ", "!                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 63, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                               " + "'", str3, "                                                               ");
    }

    @Test
    public void test02978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02978");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("####################################HHH####################################", 23, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################HHH####################################" + "'", str3, "####################################HHH####################################");
    }

    @Test
    public void test02979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test02980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02980");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "####################################HHH####################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02981");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HIHIHIHIH                                  !IHIHIHIH", "!!hi!hi!hi!hi!hihi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test02982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!", "...HIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!" + "'", str2, "!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hi!hi!");
    }

    @Test
    public void test02983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02983");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!4", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02984");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!                                                                                                                              !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test02985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02985");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi                                                                 !                                                                                               !                              hi                                                                 !                              ", (java.lang.CharSequence) "                                                                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test02986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02986");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih!ih!!ih                             !!ih                             !ih                    ", "hiihiihiihiihihiihiihiihiihii");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih!!ih                             !!ih                             !ih                    " + "'", str2, "!ih!ih!!ih                             !!ih                             !ih                    ");
    }

    @Test
    public void test02987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02987");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h" + "'", str1, "hi!hi!hi!h!!i!hihi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test02988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02988");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hI!Hi!                                                                                       ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02989");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!                                ", "IH", 250);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test02990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02990");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("       ...", "hi                                                                 !                                                                                               !                              hi                                                                 !                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test02991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02991");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      " + "'", str1, "      ");
    }

    @Test
    public void test02992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02992");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         !", ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                   ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "", "", "", "", "", "", "", "", "!" });
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test02993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02993");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ", "HIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              " + "'", str2, "HHHHHHHHHHHHHHHHHHHHHHHI                                                                 !                                                                                               !                              HI                                                                 !                              ");
    }

    @Test
    public void test02994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02994");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       " + "'", str1, "HI!HI!HI!HI!HIHI!HI!HI!HI!HI!                                                                       ");
    }

    @Test
    public void test02995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02995");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("                       !!HI!HI!H", "hiihiihiihiihihiihiihiihiihii", 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H" + "'", str3, "                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!Hhiihiihiihiihihiihiihiihiihii                       !!HI!HI!H");
    }

    @Test
    public void test02996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02996");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "!ih!!ihaaa", (java.lang.CharSequence) "                           ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 30 + "'", int2 == 30);
    }

    @Test
    public void test02997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02997");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "                                                                                                  " });
    }

    @Test
    public void test02998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02998");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                  ", (int) (short) 1, "HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI                                  HI!HI!HI!H!!I!HIHI!HI!HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  " + "'", str3, "                                                                                                  ");
    }

    @Test
    public void test02999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test02999");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test03000");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }
}

