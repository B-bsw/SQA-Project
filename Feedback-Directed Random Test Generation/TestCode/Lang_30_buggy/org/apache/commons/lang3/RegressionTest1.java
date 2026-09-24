package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

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
    public void test00501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00501");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  4444444444444444444444444444444444444444444444!   ", "444hi!4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  4444444444444444444444444444444444444444444444!   " + "'", str2, "  4444444444444444444444444444444444444444444444!   ");
    }

    @Test
    public void test00503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00503");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                   ", "#############################################HI!HI!#############################################", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HI" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test00505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00505");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "Hi!hiHi!hiH########################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00506");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hI!HI                           ", (java.lang.CharSequence) "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test00507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00507");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaah", " ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00508");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!hi!", "...                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00509");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444HI!HI!", (int) '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str3, "4444444444444444444444444444444444444444444444HI!HI!");
    }

    @Test
    public void test00510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test00511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00511");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Hi!hiHi!hiH########################", "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiHi!hi" + "'", str2, "Hi!hiHi!hi");
    }

    @Test
    public void test00512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00512");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 35 + "'", int1 == 35);
    }

    @Test
    public void test00513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00513");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HIhI!HIhiHI!HIhI!HI", 32, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HI" + "'", str3, "HI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test00514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00514");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, '4');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00515");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "         h", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("################################", "hi!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!                                                                                                 ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                                 " + "'", str2, "hi!                                                                                                 ");
    }

    @Test
    public void test00518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00518");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hiHi!hi" + "'", str1, "Hi!hiHi!hi");
    }

    @Test
    public void test00519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00519");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI", 'a', 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("#############################################hi!hi", "         h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################hi!hi" + "'", str2, "#############################################hi!hi");
    }

    @Test
    public void test00521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00521");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("###############################################", "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00522");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00523");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#############################################hi!hi", "hi!                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################hi!hi" + "'", str2, "#############################################hi!hi");
    }

    @Test
    public void test00524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00524");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "H", (java.lang.CharSequence) "hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00525");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#############################################HI!HI!#############################################", 10, "hI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################HI!HI!#############################################" + "'", str3, "#############################################HI!HI!#############################################");
    }

    @Test
    public void test00526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00526");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00527");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###############################################", "HI#HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###############################################" + "'", str2, "###############################################");
    }

    @Test
    public void test00529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00529");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!                                                                                                 ", "Hi!hiHi!hiH########################", "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                                 " + "'", str3, "HI!                                                                                                 ");
    }

    @Test
    public void test00530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00530");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HI!                                                                                                 ", "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                                 " + "'", str2, "HI!                                                                                                 ");
    }

    @Test
    public void test00531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00531");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00532");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!                                                                                                 ", "...                                ", "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test00533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00533");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444444HI!HI!", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00534");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!                                                                                                 ", 43);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!                                                                                                 " + "'", str2, "HI!                                                                                                 ");
    }

    @Test
    public void test00535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00535");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih" + "'", str1, "!ih!ih");
    }

    @Test
    public void test00536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00537");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi!hi                           Hi!hi                           H################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "Hi", "!", "hi", "                           ", "Hi", "!", "hi", "                           ", "H", "################################" });
    }

    @Test
    public void test00538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00538");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                    ", strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00539");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("#############################################HI!HI", ' ', (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00540");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H" + "'", str1, "HI!H");
    }

    @Test
    public void test00541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HI" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test00542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "###############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################" + "'", str1, "###############################################");
    }

    @Test
    public void test00543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00543");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("HI!HIhI!HIhiHI!HIhI!HI", "4444444444444444444444444444444444444444444444HI!HI!", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00544");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("###############################################", "aaaaaaaaah", "");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                    ", "444hi!4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hi!4444" + "'", str2, "444hi!4444");
    }

    @Test
    public void test00546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00546");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("#############################################hi!hi", "#############################################HI!HI!#############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#############################################hi!hi" + "'", str2, "#############################################hi!hi");
    }

    @Test
    public void test00547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi", "...                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test00548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00548");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI!HI!HI", (java.lang.CharSequence) "aaaaaaaaah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 11 + "'", int2 == 11);
    }

    @Test
    public void test00549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00549");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "#############################################HI!HI!##############################################", "#############################################HI!HI!##############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00550");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00551");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!hi!", (java.lang.CharSequence) "#############################################hi!hi");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!hi!" + "'", charSequence2, "hi!hi!");
    }

    @Test
    public void test00552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00552");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hi!hiHi!hiH########################", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiHi!hiH########################" + "'", str2, "Hi!hiHi!hiH########################");
    }

    @Test
    public void test00553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00553");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", '#', 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00554");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "...                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                                " + "'", str1, "...                                ");
    }

    @Test
    public void test00555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00555");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi" + "'", str1, "hi!hihi!hi");
    }

    @Test
    public void test00556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00556");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI", "HI!HI!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00557");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hI!HI                           hI!HI             hi", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00558");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00559");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!HI                           ", ' ', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00560");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00561");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!", '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test00562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00562");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "", "###############################################");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00563");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("IH!IH#############################################", "###############################################", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00564");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!hiHi!hiH################################", (int) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!hiHi!hiH################################" + "'", str3, "Hi!hiHi!hiH################################");
    }

    @Test
    public void test00565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("h", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test00566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00566");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#############################################HI!HI", "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00567");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444444444444444444444444444444444444444444444!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str2, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test00568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444!", (int) (byte) 100, "HI!HIhI!HIhiHI!HIhI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str3, "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }

    @Test
    public void test00569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00569");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str1, "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }

    @Test
    public void test00570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00570");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI#HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00571");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI!HI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI" + "'", str1, "HI!HI!HI!HI");
    }

    @Test
    public void test00572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00572");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI                           hI!HI             hi", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "aaaaaaaaah", "IH!IH#############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00574");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test00575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00575");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str1, "!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test00576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00576");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00577");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI!HI", (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00578");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!hi                           Hi!hi                           H################################", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi                           Hi!hi                           H################################" + "'", str2, "Hi!hi                           Hi!hi                           H################################");
    }

    @Test
    public void test00579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00579");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#############################################HI!HI!##############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00580");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!                                                                                                 ", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00581");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("", "aaaaaaaaah");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                                   ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00583");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00584");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00585");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test00586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hI!HI                           hI!HI                           h################################", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00587");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", "H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test00588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00588");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00589");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("HI!HIhI!HIhiHI!HIhI!HI", "...                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00590");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "I!HI                           hI!HI            hiHI!HI                           hI!HI            ", "hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00591");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("h################################ hI!HI HI!HI", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00592");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI!", 'a', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00593");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "#############################################HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444!", 0, "#############################################HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str3, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test00596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00596");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("         H", "HI!HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00597");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "444hi!4444", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "                                   ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertArrayEquals(charArray7, new char[] {});
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00598");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI#HI", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00599");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("         h", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00600");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         h", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         h" + "'", str3, "         h");
    }

    @Test
    public void test00601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00601");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 97 + "'", int1 == 97);
    }

    @Test
    public void test00602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00602");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaaah", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00603");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00604");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00605");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hI!HI                           hI!HI             hi", "", "hI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI                           hI!HI             hi" + "'", str3, "hI!HI                           hI!HI             hi");
    }

    @Test
    public void test00606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00606");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf("H", "Hi!hi                           Hi!hi                           H################################", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00607");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("################################", (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#" + "'", str3, "#");
    }

    @Test
    public void test00608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00608");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00609");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" ", "HI!HI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { " " });
    }

    @Test
    public void test00610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00610");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00611");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("################################", "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00612");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#############################################hi!hi", 97, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       #############################################hi!hi                        " + "'", str3, "                       #############################################hi!hi                        ");
    }

    @Test
    public void test00613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00613");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaah", "4444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00614");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hi!hiHi!hi", " ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiHi!hi" + "'", str2, "Hi!hiHi!hi");
    }

    @Test
    public void test00615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00615");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("...                                ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                " + "'", str2, "...                                ");
    }

    @Test
    public void test00616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00616");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hI!HI                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI" + "'", str1, "hI!HI");
    }

    @Test
    public void test00617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00617");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00618");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   ", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                   " });
    }

    @Test
    public void test00619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00619");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h", "#####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00620");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!hi!", 10, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00621");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "#############################################HI!HI!##############################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00622");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h################################ hI!HI HI!HI", "HI!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00623");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "                       #############################################hi!hi                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00625");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!hiHi!hiH########################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hiHi!hiH########################" + "'", str1, "Hi!hiHi!hiH########################");
    }

    @Test
    public void test00626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00626");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444444HI!HI!", ' ');
        java.lang.Object[] objArray3 = new java.lang.Object[] { "4444444444444444444444444444444444444444444444HI!HI!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join(objArray3, "                                   ", (int) (short) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "4444444444444444444444444444444444444444444444HI!HI!" });
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[4444444444444444444444444444444444444444444444HI!HI!]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[4444444444444444444444444444444444444444444444HI!HI!]");
    }

    @Test
    public void test00627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00627");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!ih!ih", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
    }

    @Test
    public void test00628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00628");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#hi" + "'", str1, "hi#hi");
    }

    @Test
    public void test00629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00629");
        java.lang.CharSequence charSequence0 = null;
        int int1 = org.apache.commons.lang3.StringUtils.length(charSequence0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test00631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00631");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00632");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!", 43, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
    }

    @Test
    public void test00633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00633");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", "h################################ hI!HI HI!HI", "hi!                                ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str4, "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test00634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00634");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hiHi!hiH########################", "hi!                                                                                                 ", 43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00635");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                              " + "'", str1, "hi!                              ");
    }

    @Test
    public void test00636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00636");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00637");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!                              ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test00638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00638");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("         h", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         h" + "'", str2, "         h");
    }

    @Test
    public void test00639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00639");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444HI!HI!", " ", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00640");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hi!hi                           Hi!hi                           H################################", "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00641");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("         h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         H" + "'", str1, "         H");
    }

    @Test
    public void test00642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00642");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("       ################################        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ################################        " + "'", str1, "       ################################        ");
    }

    @Test
    public void test00643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00643");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hi!hihi!hi", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hihi!hi" + "'", str2, "!hihi!hi");
    }

    @Test
    public void test00644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("###############################################", "hI!HI", "Hi!hiHi!hiH########################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00645");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "         H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00646");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test00647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00647");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("IH!IH#############################################", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH#############################################" + "'", str2, "IH!IH#############################################");
    }

    @Test
    public void test00648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00648");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h################################ hI!HI HI!HI", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00649");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00650");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI", ' ');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00651");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#####", "h", "!hihi!hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00652");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI!HI", (int) (short) 100, "hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                            hI!HIhi!                                             " + "'", str3, "hi!                                            hI!HIhi!                                             ");
    }

    @Test
    public void test00653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00653");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaaah", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaah" + "'", str2, "aaaaaaaaah");
    }

    @Test
    public void test00654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00654");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00655");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#############################################HI!HI!##############################################", "H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00656");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!hihi!hi", "################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00657");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI ! HI ! HI ! HI", (int) (byte) 10, "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI ! HI ! HI ! HI" + "'", str3, "HI ! HI ! HI ! HI");
    }

    @Test
    public void test00658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00658");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "                                   ", "hi#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00659");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("#############################################HI!HI!##############################################", "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("#############################################HI!HI!#############################################", "                                   ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################HI!HI!#############################################" + "'", str3, "#############################################HI!HI!#############################################");
    }

    @Test
    public void test00661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00661");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444444444444444444444444444444444444444444!", "################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str2, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test00662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00662");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi" + "'", str1, "hi!hi");
    }

    @Test
    public void test00663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00663");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", "4444444444444444444444444444444444444444444444HI!HI!", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00664");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi", "#####", "HI#HI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00666");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00667");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", "#############################################HI!HI!#############################################", "#####");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00668");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                                                                                    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test00669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00669");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test00671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00671");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hI!HI                           hI!HI                           h################################", "hI!HI", "hi!hihi!hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00672");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00673");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!                                                                                                 ", 3, "IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                                 " + "'", str3, "HI!                                                                                                 ");
    }

    @Test
    public void test00674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00674");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
    }

    @Test
    public void test00676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00676");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!HI!", "", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00677");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00678");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00679");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!                                ", "HI!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                " + "'", str2, "hi!                                ");
    }

    @Test
    public void test00680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00680");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI", "4444444444444444444444444444444444444444444444!");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI", "HI" });
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00681");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!hiHi!hiH########################", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00682");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("", "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", 3, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str4, "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }

    @Test
    public void test00683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00683");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hI!HI", "hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI" + "'", str2, "hI!HI");
    }

    @Test
    public void test00684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00684");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!ih!ih", "HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00686");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444!", "", "hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str3, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test00687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00687");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hi", "4444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi" + "'", str2, "hi!hi");
    }

    @Test
    public void test00688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00688");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi", "hi", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00689");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "  4444444444444444444444444444444444444444444444!   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00690");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "                       #############################################hi!hi                        ", "hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00691");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444!", "hI!HI", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!                                            hI!HIhi!                                             ", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                            hI!HIhi!                                             " + "'", str2, "hi!                                            hI!HIhi!                                             ");
    }

    @Test
    public void test00693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00693");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###############################################", 5, "!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################################" + "'", str3, "###############################################");
    }

    @Test
    public void test00694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00694");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#############################################HI!HI!#############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################HI!HI!#############################################" + "'", str1, "#############################################HI!HI!#############################################");
    }

    @Test
    public void test00696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00696");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00697");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Hi!hi                           Hi!hi                           H################################");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "Hi!hiHi!hiH########################", 43, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 43 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
    }

    @Test
    public void test00698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00698");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!4444444444444444444444444444444444444444444444", "#############################################HI!HI", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00699");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "hI!HI", (java.lang.CharSequence) "h################################ hI!HI HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00700");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!hiHi!hiH################################", "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00701");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "HI", "!", "HI", "                           ", "h", "I", "!", "HI", "                           ", "h", "################################" });
    }

    @Test
    public void test00702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00702");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hi!hiHi!hiH########################", "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hiHi!hiH########################" + "'", str2, "Hi!hiHi!hiH########################");
    }

    @Test
    public void test00703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00703");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!hi", "  4444444444444444444444444444444444444444444444!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi" + "'", str2, "hi!hi");
    }

    @Test
    public void test00704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00704");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI!HIhI!HIhiHI!HIhI!HI", "!4444444444444444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HI" + "'", str3, "HI!HIhI!HIhiHI!HIhI!HI");
    }

    @Test
    public void test00705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00705");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Hi!hiHi!hiH########################", "hI!HI                           hI!HI             hi", "!hihi!hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00706");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!                                                                                                 ", 2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                                                                 " + "'", str3, "hi!                                                                                                 ");
    }

    @Test
    public void test00707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00707");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "#####", 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################################################################" + "'", str3, "##########################################################################################################################################################################");
    }

    @Test
    public void test00708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00708");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "Hi!hiHi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00709");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 1, "hI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test00710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00710");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi" + "'", str1, "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
    }

    @Test
    public void test00711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!                                                                                                 ", 11, "!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                                 " + "'", str3, "HI!                                                                                                 ");
    }

    @Test
    public void test00712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00713");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#############################################HI!HI!##############################################", "h################################ hI!HI HI!HI", "H", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############################################HI!HI!##############################################" + "'", str4, "#############################################HI!HI!##############################################");
    }

    @Test
    public void test00714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00714");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                                                                                    ", "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00715");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                   ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00716");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi!hiHi!hiH########################", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00717");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "hi#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00719");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00720");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "h", (java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00721");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, 'a');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00722");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "h", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00723");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#####", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00724");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test00725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00725");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444!", (int) (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str3, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test00726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00726");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           HI!HI                           H################################" + "'", str1, "HI!HI                           HI!HI                           H################################");
    }

    @Test
    public void test00727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00727");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("#############################################HI!HI", "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                    ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test00729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00729");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI#HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00730");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("         H", "444hi!4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H" + "'", str2, "         H");
    }

    @Test
    public void test00731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00731");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI#HI", "HI!HI                           hI!HI                           h################################", "!ih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!i" + "'", str3, "!i!i");
    }

    @Test
    public void test00732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00732");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("Hi!hi                           Hi!hi                           H################################", "444hi!4444", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00733");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hI!HI                           ", "HI!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00734");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00735");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("         H", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00736");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444hi!4444", (int) (short) 1, "hi!hihi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444hi!4444" + "'", str3, "444hi!4444");
    }

    @Test
    public void test00737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi" + "'", str1, "hi!hi");
    }

    @Test
    public void test00738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00738");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!hiHi!hiH################################", "         h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "Hi!hiHi!hiH################################" });
    }

    @Test
    public void test00739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str1, "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test00740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00740");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!HIhI!HIhiHI!HIhI!HI", "HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00741");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00742");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("H", "         H", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test00743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00743");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("IH!IH#############################################", "hi!                                ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00744");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hI!HI                           hI!HI                           h################################", 6, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                          hI!HI               " + "'", str3, "                          hI!HI               ");
    }

    @Test
    public void test00745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00746");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hI!HI                           hI!HI             hi", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00747");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI!HI!", "hi!                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("I!HI                           hI!HI            hiHI!HI                           hI!HI            ", "hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                                       hiHI!HI                                       " + "'", str2, "I!HI                                       hiHI!HI                                       ");
    }

    @Test
    public void test00749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00749");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!hiHi!hiH################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hih################################" + "'", str1, "hi!hihi!hih################################");
    }

    @Test
    public void test00750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00750");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!hihi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hihi!hi" + "'", str1, "!hihi!hi");
    }

    @Test
    public void test00751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00751");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h################################ hI!HI HI!HI", "HI!HI!", "hi#hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h################################ hi#hi hi#hi" + "'", str3, "h################################ hi#hi hi#hi");
    }

    @Test
    public void test00752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00752");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(charSequence0, (java.lang.CharSequence) "#############################################HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00753");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HIhI!HIhiHI!HIhI!HI", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00754");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!hihi!hi", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00755");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                          hI!HI               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00756");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "h################################ hi#hi hi#hi", (java.lang.CharSequence) "#############################################HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00757");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00758");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("h################################ hi#hi hi#hi", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00759");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00760");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("IH!IH#############################################", "Hi!hi                           Hi!hi                           H################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH!IH#############################################" + "'", str2, "IH!IH#############################################");
    }

    @Test
    public void test00761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00761");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Hi!hiHi!hi", "hi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00762");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(charSequence0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00763");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "!ih!ih", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00764");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00765");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444HI!HI!" + "'", str1, "4444444444444444444444444444444444444444444444HI!HI!");
    }

    @Test
    public void test00766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", "!i!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI           " + "'", str2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
    }

    @Test
    public void test00767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00767");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("#############################################HI!HI!##############################################", "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00768");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#############################################hi!hi", "                          hI!HI               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Hi!hi                           Hi!hi                           H################################", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi                           Hi!hi                           H################################" + "'", str2, "Hi!hi                           Hi!hi                           H################################");
    }

    @Test
    public void test00770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hI!HI                           hI!HI                           h################################", "HIHi!hiHi!hi#Hi!hiHi!hiHI", "444hi!4444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00771");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...                                ", '#', 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00772");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("IH!IH#############################################", "h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00773");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################hi!hi", "4444444444444444444444444444444444444444444444HI!HI!", (int) (short) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "#############################################hi", "hi" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!", "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00775");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!                                                                                                 ", "h################################ hi#hi hi#hi", "                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!                                                                                                 " + "'", str3, "HI!                                                                                                 ");
    }

    @Test
    public void test00776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str2, "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }

    @Test
    public void test00777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00777");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                       #############################################hi!hi                        ", "HI!HI                           HI!HI                           H################################", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00778");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '#', (int) (byte) 1, 5);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test00779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00779");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaah", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00780");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!", "h################################ hI!HI HI!HI", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00781");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH4444444444444444444444444444444444444444444444" + "'", str1, "!IH!IH4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test00782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00782");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", "!ih!ih", "HI!HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str3, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
    }

    @Test
    public void test00783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00783");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("!ih!ih", "h################################ hI!HI HI!HI", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00784");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI", (java.lang.CharSequence) "hI!HI                           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 56 + "'", int2 == 56);
    }

    @Test
    public void test00785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00785");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00786");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("I!HI                                       hiHI!HI                                       ", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", "                                   ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00788");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("I!                                                                                                 ", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!    " + "'", str2, "I!    ");
    }

    @Test
    public void test00789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00789");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("aaaaaaaaah", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00790");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "444hi!4444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00791");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hI!HI                           ", "  4444444444444444444444444444444444444444444444!   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           " + "'", str2, "hI!HI                           ");
    }

    @Test
    public void test00792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                       #############################################hi!hi                        ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00793");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi#hi", "I!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#hi" + "'", str2, "hi#hi");
    }

    @Test
    public void test00794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00794");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00795");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  4444444444444444444444444444444444444444444444!   ", 97, "hi!hihi!hih################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi" + "'", str3, "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
    }

    @Test
    public void test00796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00796");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaah" + "'", str1, "aaaaaaaaah");
    }

    @Test
    public void test00798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00798");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00799");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI                           HI!HI                           H################################", "         h", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test00800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00800");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!", (int) (short) 100, "         H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H         H         H         H        hi!         H         H         H         H         " + "'", str3, "         H         H         H         H        hi!         H         H         H         H         ");
    }

    @Test
    public void test00801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00801");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!                                ", "...                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                " + "'", str2, "hi!                                ");
    }

    @Test
    public void test00802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00802");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444hi!4444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444hi!4444" + "'", str1, "444hi!4444");
    }

    @Test
    public void test00803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00803");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00804");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("IH!IH#############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH!IH#############################################" + "'", str1, "IH!IH#############################################");
    }

    @Test
    public void test00805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00805");
        java.lang.CharSequence charSequence2 = null;
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny(charSequence2, charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) " ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] {});
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00806");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("#", "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test00807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00807");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "HI#HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI#HI" + "'", str1, "hI#HI");
    }

    @Test
    public void test00808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00808");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "HI!                                                                                                 ", (java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00809");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                          hI!HI               ", "hI!HI                           ", "hI!HI                           ", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                          hI!HI               " + "'", str4, "                          hI!HI               ");
    }

    @Test
    public void test00810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00810");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!hi                           Hi!hi                           H################################", "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hi                           Hi!hi                           H################################" + "'", str2, "Hi!hi                           Hi!hi                           H################################");
    }

    @Test
    public void test00811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00811");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hI!HI                           hI!HI             hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("I!HI                                       hiHI!HI                                       ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HI                            " + "'", str2, "I!HI                            ");
    }

    @Test
    public void test00813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00813");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!" + "'", str2, "hi!hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00814");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "...                                ", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00815");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "!IH!IH4444444444444444444444444444444444444444444444", (java.lang.CharSequence) "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00816");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("#############################################HI!HI", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################" + "'", str2, "###################################");
    }

    @Test
    public void test00817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00817");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00818");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI          " + "'", str1, "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ");
    }

    @Test
    public void test00819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444444444444444444444444444444!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444!" + "'", str2, "4444444444444444444444444444444444444444444444!");
    }

    @Test
    public void test00820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00820");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("!4444444444444444444444444444444444444444444444", "!4444444444444444444444444444444444444444444444", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!4444444444444444444444444444444444444444444444" + "'", str3, "!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test00821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00821");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hI#HI", (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00822");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###################", "Hi!hiHi!hiH########################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00823");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hI!HI                           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00824");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "#############################################HI!HI!#############################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00825");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           hi!hi            hihi!hi                           hi!hi            " + "'", str1, "hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
    }

    @Test
    public void test00826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00826");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi!", 6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test00827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00827");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("HI                           hI!HI            hiHI!HI                           hI!HI            ", "HI!HIhI!HIhiHI!HIhI!HI", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00828");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHHI                           !IHHI            !IHIHHI                           !IHHI            " + "'", str1, "HIHHI                           !IHHI            !IHIHHI                           !IHHI            ");
    }

    @Test
    public void test00829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00829");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "444hi!4444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00830");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("         H         H         H         H        hi!         H         H         H         H         ", "!4444444444444444444444444444444444444444444444", "HI!HI                           hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         H         H         H         H        hi!         H         H         H         H         " + "'", str3, "         H         H         H         H        hi!         H         H         H         H         ");
    }

    @Test
    public void test00831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00831");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("         h", "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00832");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi#hi", "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00833");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!", 100, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test00834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00834");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "hi!hihi!hih################################", 47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00835");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("         h", "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00836");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI                           hI!HI            ", (java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", charSequence2, "HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test00837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00837");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hihi!hi", "!IH!IH4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00838");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H", "4444444444444444444444444444444444444444444444!", 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "H" });
    }

    @Test
    public void test00839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("H", "hI!HI                           hI!HI             hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test00840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("I!HI                                       hiHI!HI                                       ", "Hi!hiHi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00841");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("I!HI                            ", "444hi!4444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00842");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("444hi!4444", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444hi!4444" + "'", str2, "444hi!4444");
    }

    @Test
    public void test00844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00844");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hI#HI", "", "HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI#HI" + "'", str3, "hI#HI");
    }

    @Test
    public void test00845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00845");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str1, "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }

    @Test
    public void test00846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00846");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("aaaaaaaaah", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaah" + "'", str2, "aaaaaaaaah");
    }

    @Test
    public void test00847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00847");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "#####", "hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00848");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#############################################HI!HI!##############################################");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "#############################################HI!HI!##############################################" });
    }

    @Test
    public void test00849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00849");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "HI!HI                           hI!HI            hiHI!HI                           hI!HI", (java.lang.CharSequence) "I!    ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", charSequence2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test00850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00850");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HIHHI                           !IHHI            !IHIHHI                           !IHHI            ", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00851");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "#####");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00852");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "h################################ hI!HI HI!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00853");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!H", "hI#HI", "HI!HI!", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!H" + "'", str4, "HI!H");
    }

    @Test
    public void test00854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00854");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!i!i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i!i" + "'", str1, "!i!i");
    }

    @Test
    public void test00855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00855");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " " + "'", str1, " ");
    }

    @Test
    public void test00856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00856");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" ", "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00857");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!                              ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                              " + "'", str2, "hi!                              ");
    }

    @Test
    public void test00858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00858");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!", 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44hi!hi!44" + "'", str3, "44hi!hi!44");
    }

    @Test
    public void test00859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00859");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!", (int) '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test00860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00860");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("h################################ hI!HI HI!HI", "I!HI                                       hiHI!HI                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00861");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("###################", "hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00862");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                   " + "'", str1, "                                                                                                   ");
    }

    @Test
    public void test00863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00863");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "###############################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 47 + "'", int1 == 47);
    }

    @Test
    public void test00864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00864");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "h################################ hi#hi hi#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                          hI!HI               ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00866");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!hi", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00867");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("I!HI                            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00868");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("#", "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test00869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00869");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "" };
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!", strArray6);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" };
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray6, strArray14);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray6);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "" });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "", "hi!", "", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test00870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00870");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!                              ", "I!    ", 6, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!                               " + "'", str4, "hI!                               ");
    }

    @Test
    public void test00871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00871");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00872");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!HIhI!HIhiHI!HIhI!HI", "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00873");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("#####", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00874");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HI!HI!HI", "HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00875");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("HI!HI                           hI!HI            hiHI!HI                           hI!HI           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           " + "'", str1, "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
    }

    @Test
    public void test00877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00877");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI ! HI ! HI ! HI", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI ! HI ! HI ! HI" + "'", str2, "HI ! HI ! HI ! HI");
    }

    @Test
    public void test00878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00878");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                          hI!HI               ", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          hI!HI               " + "'", str2, "                          hI!HI               ");
    }

    @Test
    public void test00879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00879");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!IH!IH4444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00880");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!HI!", "hI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00882");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray3, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!                                " + "'", str8, "hi!                                ");
    }

    @Test
    public void test00883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00883");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("#############################################hi!hi", (int) (short) 10, 43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################hi!hi" + "'", str3, "###################################hi!hi");
    }

    @Test
    public void test00884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00884");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("44hi!hi!44", "#############################################HI!HI");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00885");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00886");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!                                                                                                 " + "'", str1, "I!                                                                                                 ");
    }

    @Test
    public void test00887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00887");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("h################################ hI!HI HI!HI", "hI!                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00888");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("H", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    H     " + "'", str2, "    H     ");
    }

    @Test
    public void test00889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00889");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("#############################################HI!HI", "HI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00890");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!HI", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hI!                               ", (int) (byte) 1, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!HI!HI" });
    }

    @Test
    public void test00891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00891");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI ! HI ! HI ! HI", (int) (short) 1, "4444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI ! HI ! HI ! HI" + "'", str3, "HI ! HI ! HI ! HI");
    }

    @Test
    public void test00893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00893");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                                    ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00894");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI!H", 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444HI!H444" + "'", str3, "444HI!H444");
    }

    @Test
    public void test00895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00895");
        char[] charArray8 = new char[] { 'a', '#', '#' };
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                ", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hI!HI", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "HI!HI!HI!HI", charArray8);
        java.lang.Class<?> wildcardClass14 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { 'a', '#', '#' });
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00896");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 15, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               " + "'", str3, "               ");
    }

    @Test
    public void test00897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00897");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!                                                                                                 ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HI#HI", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] {});
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00898");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00899");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "hi#hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00900");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi                           hi!hi            hihi!hi                           hi!hi           " + "'", str1, "hi!hi                           hi!hi            hihi!hi                           hi!hi           ");
    }

    @Test
    public void test00901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00901");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("!4444444444444444444444444444444444444444444444", "HI!HI                           hI!HI                           h################################", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00902");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "hi!hihi!hi", "hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00903");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hI!HI                           hI!HI                           h################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str2, "hI!HI                           hI!HI                           h################################");
    }

    @Test
    public void test00904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00904");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HIhI!HIhiHI!HIhI!HI", (java.lang.CharSequence) "hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test00905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00905");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                       #############################################hi!hi                        ", "HI!HI", (int) '#', 6);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      HI!HI#################################hi!hi                        " + "'", str4, "      HI!HI#################################hi!hi                        ");
    }

    @Test
    public void test00906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00906");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("###################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###################" + "'", str1, "###################");
    }

    @Test
    public void test00907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00907");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!HI!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00908");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI                           hI!HI            hiHI!HI                           hI!HI            ", (java.lang.CharSequence) "hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test00909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00909");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "...                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00910");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444!", "hi!hi                           hi!hi            hihi!hi                           hi!hi           ", 5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "4444444444444444444444444444444444444444444444!" });
    }

    @Test
    public void test00911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00911");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#############################################HI!HI!##############################################", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################..." + "'", str2, "################################...");
    }

    @Test
    public void test00912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00912");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "         H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("IH!IH#############################################", "HI!HI                           hI!HI            hiHI!HI                           hI!HI            ", "################################...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "         H         H         H         H        hi!         H         H         H         H         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00915");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#############################################hi!hi", "hi!hihi!hih################################", "I!                                                                                                 ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############################################hi!hi" + "'", str4, "#############################################hi!hi");
    }

    @Test
    public void test00916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00916");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", (int) (short) 10, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00917");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (int) '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test00918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00918");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("#####", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####" + "'", str2, "#####");
    }

    @Test
    public void test00919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00919");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####" + "'", str1, "#####");
    }

    @Test
    public void test00920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00920");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00921");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test00922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00922");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "hi!hi", 99);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test00923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00923");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!HIhI!HIhiHI!HIhI!HI", "hi!hihi!hih################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HIhI!HIhiHI!HIhI!HI" });
    }

    @Test
    public void test00924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00924");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###################", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################" + "'", str2, "###################");
    }

    @Test
    public void test00925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00925");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00926");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hI!HI                           hI!HI             hi", "#############################################HI!HI!##############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!HI                           hI!HI             hi" + "'", str2, "hI!HI                           hI!HI             hi");
    }

    @Test
    public void test00927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00927");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI!HI                           hI!HI                           h################################", "#############################################HI!HI!##############################################", 32, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#############################################HI!HI!##############################################hI!HI                           h################################" + "'", str4, "#############################################HI!HI!##############################################hI!HI                           h################################");
    }

    @Test
    public void test00928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("################################", 2, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00929");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444444h44444444444444444444444444444444444444444444444444", 92);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444" + "'", str2, "44444444");
    }

    @Test
    public void test00930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00930");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi#hi", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test00932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00932");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "!", "44hi!hi!44");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00933");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test00934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00934");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hi!", "###############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!" + "'", str2, "hi!hi!");
    }

    @Test
    public void test00935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00935");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("HI#HI", "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI" + "'", str3, "HI#HI");
    }

    @Test
    public void test00936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00936");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "!", "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00937");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize((java.lang.CharSequence) "hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi" + "'", str1, "hi!hi");
    }

    @Test
    public void test00938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00938");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "H", (java.lang.CharSequence) "hi!hihi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00939");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!hihi!hih################################", (int) (short) 10, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hihi!hih################################" + "'", str3, "hi!hihi!hih################################");
    }

    @Test
    public void test00940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                          hI!HI               ", "################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                          hI!HI               " + "'", str2, "                          hI!HI               ");
    }

    @Test
    public void test00941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00941");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("h", "                                                                                                    ", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00942");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence0, "hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00943");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!                                            hI!HIhi!                                             ", (java.lang.CharSequence) "hi!                                            hI!HIhi!                                             ");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!                                            hI!HIhi!                                             " + "'", charSequence2, "hi!                                            hI!HIhi!                                             ");
    }

    @Test
    public void test00944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi#hi", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              hi#hi                                              " + "'", str2, "                                              hi#hi                                              ");
    }

    @Test
    public void test00945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00945");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00946");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase("                                                                                                    ", "hI!HI                           ", 92);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00947");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###################");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "###################" });
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00948");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hI!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!HI" + "'", str1, "hI!HI");
    }

    @Test
    public void test00949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00949");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("I!    ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I!    " + "'", str3, "I!    ");
    }

    @Test
    public void test00950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00950");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("###################", "hi!                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00951");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!hi!", (int) (byte) -1);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                ", "hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ", strArray5, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("I!    ", strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "                                " });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " " + "'", str9, " ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00952");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!hihi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HIHI!HI" + "'", str1, "!HIHI!HI");
    }

    @Test
    public void test00953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00953");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#############################################HI!HI!##############################################hI!HI                           h################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################HI!HI!##############################################hI!HI                           h################################" + "'", str1, "#############################################HI!HI!##############################################hI!HI                           h################################");
    }

    @Test
    public void test00954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!hi                           Hi!hi            HIhi!hi                           Hi!hi           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "           ih!iH                           ih!ihIH            ih!iH                           ih!ih" + "'", str1, "           ih!iH                           ih!ihIH            ih!iH                           ih!ih");
    }

    @Test
    public void test00955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                   ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" });
    }

    @Test
    public void test00956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00956");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################", "Hi!hiHi!hiH################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00957");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("HI!HI                           hI!HI            hiHI!HI                           hI!HI", "  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI" + "'", str2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
    }

    @Test
    public void test00958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("HI!HI                           hI!HI            hiHI!HI                           hI!HI          ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI                           hI!HI            hiHI!HI                           hI!HI          " + "'", str2, "HI!HI                           hI!HI            hiHI!HI                           hI!HI          ");
    }

    @Test
    public void test00959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00959");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("###################################hi!hi", 56, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################hi!hi################" + "'", str3, "###################################hi!hi################");
    }

    @Test
    public void test00960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00960");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!HI", '#', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00961");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!", " ");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', (int) 'a', 0);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("H", strArray3, strArray6);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "hi!", (int) (byte) 10);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray17, ' ');
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.stripAll(strArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!hihi!hi", strArray13, strArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "H" + "'", str12, "H");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "", "" });
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " " + "'", str19, " ");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertArrayEquals(strArray20, new java.lang.String[] { "", "" });
    }

    @Test
    public void test00962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("################################", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test00963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00963");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "HI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hihI!HI  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hih################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI ! HI ! HI ! HI", "!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00965");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI ! HI ! HI ! HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00966");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444444444444444444444444444444444444444444HI!HI!", "I!HI                           hI!HI            hiHI!HI                           hI!HI            ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00967");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h", "H", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "h" });
    }

    @Test
    public void test00968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00968");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!HI!", "         H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         H" + "'", str2, "         H");
    }

    @Test
    public void test00969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00969");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi                           hi!hi            hihi!hi                           hi!hi            " + "'", str1, "Hi!hi                           hi!hi            hihi!hi                           hi!hi            ");
    }

    @Test
    public void test00970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00970");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hihi!hihihi!hihi!hihi!h4444444444444444444444444444444444444444444444!hi!hihi!hihihi!hihi!hihi!hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00971");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44hi!hi!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!44" + "'", str1, "44hi!hi!44");
    }

    @Test
    public void test00972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00972");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "4444444444444444444444444444444444444444444444HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00973");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("#####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####" + "'", str1, "#####");
    }

    @Test
    public void test00974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00974");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00975");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00976");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi!hi", "###############################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00977");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("HI                           hI!HI            hiHI!HI                           hI!HI            ", "##########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI                           hI!HI            hiHI!HI                           hI!HI            " + "'", str2, "HI                           hI!HI            hiHI!HI                           hI!HI            ");
    }

    @Test
    public void test00978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00978");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!i!i", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00979");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!                                                                                                 ", "HI!HI", 52);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test00980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00980");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("#############################################HI!HI!#############################################", "HI!HI                           hI!HI            hiHI!HI                           hI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00981");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!4444444444444444444444444444444444444444444444HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", (java.lang.CharSequence) "    H     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test00982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                       ###############################################hi#!#hi#                        ", "###############################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       ###############################################hi#!#hi#                        " + "'", str2, "                       ###############################################hi#!#hi#                        ");
    }

    @Test
    public void test00983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00983");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!                                ", strArray4, strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("HI!HI!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] {});
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi", "!", "hi", "!" });
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!                                " + "'", str9, "hi!                                ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00984");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize((java.lang.CharSequence) "                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test00985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00985");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI", "hI!HI                           ", "hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI" + "'", str3, "hI!HIhI!HIhiHI!HIhI!HIHI!H4444444444444444444444444444444444444444444444!HI!HIhI!HIhiHI!HIhI!HIHI!HI");
    }

    @Test
    public void test00987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00987");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  4444444444444444444444444444444444444444444444!   hi!hihi!hih################################hi", (int) (short) -1, 5);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00988");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                   ", "#####");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00989");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("#############################################HI!HI!##############################################", "hI!                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00990");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI!HI                           hI!HI                           h################################", (int) '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!HI                           hI!HI                           h################################" + "'", str3, "hI!HI                           hI!HI                           h################################");
    }

    @Test
    public void test00991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00991");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###############################################", (int) (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444###############################################444444444444444444444444444" + "'", str3, "44444444444444444444444444###############################################444444444444444444444444444");
    }

    @Test
    public void test00992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00992");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!ih!ih", (int) 'a', (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00993");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                       #############################################hi!hi                        ", "HIHi!hiHi!hi#Hi!hiHi!hiHI");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                       ", "                        " });
    }

    @Test
    public void test00994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00994");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("HI!HI!HI!HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00995");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00996");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hI#HI", "HI!H", (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI" + "'", str3, "hI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HIHI!HhI#HI");
    }

    @Test
    public void test00997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00997");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "Hi!hi                           Hi!hi                           H################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00998");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase("         H         H         H         H        hi!         H         H         H         H         ", "HI!HI                           hI!HI            hiHI!HI                           hI!HI           ", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test00999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                    ", "4444444444444444444444444444444444444444444444!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test01000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test01000");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHI!HI!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}

