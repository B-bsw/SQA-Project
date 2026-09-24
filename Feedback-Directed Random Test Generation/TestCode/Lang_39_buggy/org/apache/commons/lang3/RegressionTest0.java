package org.apache.commons.lang3;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("10", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("10", "10", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("10", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 0, "1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("1", "10", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!", "1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("10", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("1", "10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("1", "10");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("10", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("10", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", (int) (byte) -1, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String[] strArray10 = new java.lang.String[] { "10", "hi!", "", "10", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("10", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "10", "hi!", "", "10", "hi!" });
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10", "hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("10", "", "10", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10" + "'", str4, "10");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("00hi!", "00hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("1", "10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("00hi!", "10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("00hi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("00hi!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00hi!" + "'", str2, "00hi!");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("00hi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "00", "hi", "!" });
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!", (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "00hi!", 3, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00" + "'", str2, "00");
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("00", "1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00" + "'", str2, "00");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("00hi!", "00hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (short) 10 };
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join(objArray1, '4');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join(objArray1, 'a');
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[10]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("", "10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!", "1", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1", "10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) 'a', "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "00hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 3, "00hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h" + "'", str3, "00h");
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1", (int) (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00" + "'", str1, "00");
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        char[] charArray4 = new char[] { 'a', ' ' };
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray4);
        java.lang.Class<?> wildcardClass7 = charArray4.getClass();
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertArrayEquals(charArray4, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                                                                 ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("1", "00hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                 ", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("10", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10" + "'", str2, "                                                                                               10");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("", "00hi!", "00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00", "10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00" + "'", str2, "00");
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("1", "00", (int) ' ', (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100" + "'", str4, "100");
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.lang.String[] strArray3 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) '#', 3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "1");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, "", (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00hi!" + "'", str11, "00hi!");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                 ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("10", "");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("10", strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "10" });
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("10", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                               10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                               10" + "'", str1, "                                                                                               10");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("100", "                                                                                               10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "10", (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "100", (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("10", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("1", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("10", (int) (byte) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("10", (-1), 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "00hi!", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                                                                                               10", "00");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("1", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("00h", "                                                                                               10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("00", "                                                                                               10", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.apache.commons.lang3.StringUtils stringUtils0 = new org.apache.commons.lang3.StringUtils();
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00" + "'", str1, "00");
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!", "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                               10", "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 95 + "'", int2 == 95);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                               10", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("1", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00hi!", '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00hi!" + "'", str3, "00hi!");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", (int) (short) 1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10                                                                                               1010                                                                                               10hi!", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "00hi!", "00h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10                                                                                               1010                                                                                               10hi!", 95, "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str3, "10                                                                                               1010                                                                                               10hi!");
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                               10", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("10", "00");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("00", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("00h", "", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h" + "'", str3, "00h");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                               10", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("100", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                 ", "10", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", (int) (short) 10, "100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("100", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "100", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] {});
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                               10", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("10", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!" };
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray3, strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "", "hi!" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] {});
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("00h", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h" + "'", str2, "00h");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00hi!", "1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("1", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        java.lang.String str0 = org.apache.commons.lang3.StringUtils.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("00hi!", "                                                                                               10", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("00h", "00hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h" + "'", str2, "00h");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("00", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0000000000000000000000000000000000000000000000000000000000000000000000", "00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str1, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("10                                                                                               1010                                                                                               10hi", (int) (byte) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str3, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi!10hi!hi!" + "'", str1, "10hi!10hi!hi!");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "00hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10" + "'", str1, "10");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00" + "'", str1, "00");
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                                                                                               10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("0000000000000000000000000000000000000000000000000000000000000000000000", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000000000000000" + "'", str2, "00000000000000000000000000000000000");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str1, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("10                                                                                               1010                                                                                               10hi!", ' ', 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str1, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00h", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h" + "'", str2, "00h");
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str1, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00hi!" + "'", str1, "00hi!");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("1", (int) (short) 10, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         1" + "'", str3, "         1");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("10hi!10hi!hi!", "         1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 13 + "'", int2 == 13);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                 ", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!", "100", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                 ", "1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("10                                                                                               1010                                                                                               10hi", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str2, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "00h", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str3, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("100", "         1", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00" + "'", str3, "00");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00h00h00h00h00h00h00h00h00h", "", 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 27 + "'", int3 == 27);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("0000000000000000000000000000000000000000000000000000000000000000000000", "", "00h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("0000000000000000000000000000000000000000000000000000000000000000000000", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("10hi!10hi!hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10hi!hi!" + "'", str2, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("         1", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         1" + "'", str3, "         1");
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("10hi!10hi!hi!", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("10hi!10hi!hi!", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                       10hi!10hi!hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00000000000000000000000000000000000", "                                                                                               10", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("00", 95, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("         1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("00h00h00h00h00h00h00h00h00h", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str2, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("10                                                                                               1010                                                                                               10hi!", "100", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("         1", "hi!", "00");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         1" + "'", str3, "         1");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10hi!10hi!hi!", "10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("00hi!", "00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10hi!10hi!hi!", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("         1", "10                                                                                               1010                                                                                               10hi!", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "            00H00H00H00H00H00H00H00H00H             " + "'", str1, "            00H00H00H00H00H00H00H00H00H             ");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi!10hi!hi!" + "'", str1, "10hi!10hi!hi!");
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("0000000000000000000000000000000000000000000000000000000000000000000000", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 ", "00");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "         1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "                                                                                                 " });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "" });
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("00h00h00h00h00h00h00h00h00h", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str2, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("1", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("10hi!10hi!hi!", "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("10                                                                                               1010                                                                                               10hi", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str2, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                                                                                               10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("10                                                                                               1010                                                                                               10hi", "1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                       10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("00hi!", "hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("10                                                                                               1010                                                                                               10hi", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                                                               10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("0404hi!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404hi!                                               " + "'", str2, "                                              0404hi!                                               ");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                               10", ' ', 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 13 + "'", int3 == 13);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.lang.String[] strArray4 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) '#', 3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "1");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11, '4');
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.split("10", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                               10", strArray11, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0404hi!" + "'", str13, "0404hi!");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "10" });
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("00h", (int) (short) 100, (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                               10", (int) (byte) 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               10" + "'", str3, "                                                                                               10");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00h", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                               10", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("00000000000000000000000000000000000", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "000" + "'", str2, "000");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                               10", "Hi!", "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               10" + "'", str3, "                                                                                               10");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("1", "000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("10                                                                                               1010                                                                                               10hi", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10                                                                                               1010                                                                                               10hi" + "'", str2, "10                                                                                               1010                                                                                               10hi");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!", "00hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        int int0 = org.apache.commons.lang3.StringUtils.INDEX_NOT_FOUND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        char[] charArray6 = new char[] { 'a', ' ' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("1", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertArrayEquals(charArray6, new char[] { 'a', ' ' });
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("000", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                       10hi!10hi!hi!", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00h", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h" + "'", str3, "00h");
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("1", "0404hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("100", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("10", '#');
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                                                                               10", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                               10" + "'", str5, "                                                                                               10");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("            00h00h00h00h00h00h00h00h00h             ", "00h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00h", "0404hi!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("000", "                                       10hi!10hi!hi!", 10, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                       10hi!10hi!hi!" + "'", str4, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10                                                                                               1010                                                                                               10hi!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("00", "10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("0404hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("00h");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: The stripAccents(String) method is not supported until Java 1.6");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("00000000000000000000000000000000000", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10                                                                                               1010                                                                                               10hi", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi 1010 10" + "'", str2, "10hi 1010 10");
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "                                              0404hi!                                               ", "         1", 95);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("10                                                                                               1010                                                                                               10hi", "100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("", "                                              0404hi!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("         1", (int) (short) -1, "10hi 1010 10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "         1" + "'", str3, "         1");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "00hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                               10", (int) (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               10" + "'", str3, "                                                                                               10");
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("         1", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                              0404hi!                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!", "10hi!10hi!hi!", 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!" });
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("1", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                              0404hi!                                               ", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                       10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       10hi!10hi!hi!" + "'", str1, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                               10", "100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10" + "'", str2, "                                                                                               10");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("00h", "         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h" + "'", str2, "00h");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                       10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("000", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                 ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "                                                                                                 ", "                                              0404hi!                                               ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str4, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("00");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                 ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                               10");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hi!", "                                       10hi!10hi!hi!", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                       10hi!10hi!hi!", "10hi 1010 10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                               10", "00h", "00000000000000000000000000000000000");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("0404hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                       10hi!10hi!hi!", "                                       10hi!10hi!hi!", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               10" + "'", str3, "                                                                                               10");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih01" + "'", str1, "!ih!ih01!ih01");
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("00hi!", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "", (int) '#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444444");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                       10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0404hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0404hi!" + "'", str1, "0404hi!");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("00000000000000000000000000000000000", "Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00000000000000000000000000000000000" + "'", str2, "00000000000000000000000000000000000");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("00h00h00h00h00h00h00h00h00h", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str2, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                 ", 2, "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("!ih!ih01!ih01");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("10hi 1010 10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("00hi!", "00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("1", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("         1", "!ih!ih01!ih01");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertArrayEquals(strArray1, new java.lang.String[] { "1" });
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "            00H00H00H00H00H00H00H00H00H             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("            00H00H00H00H00H00H00H00H00H             ", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00000000000000000000000000000000000", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "            00h00h00h00h00h00h00h00h00h             ", 2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00000000000000000000000000000000000" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("000", "                                              0404hi!                                               ", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   " + "'", str3, "   ");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                                                                                               10", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("10                                                                                               1010                                                                                               10hi!", "", "000", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str4, "10                                                                                               1010                                                                                               10hi!");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str1, "10                                                                                               1010                                                                                               10hi!");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                              0404hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              0404HI!                                               " + "'", str1, "                                              0404HI!                                               ");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                              0404HI!                                               ", "!ih!ih01!ih01", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "00hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("00h", "00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!ih!ih01!ih01", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("44444444444444444444444444444444444", "                                       10hi!10hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.lang.String[] strArray3 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) '#', 3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "1");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10, '4');
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "!ih!ih01!ih01");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0404hi!" + "'", str12, "0404hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str15, "0!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10hi!10hi!hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi!10hi!hi!" + "'", str2, "10hi!10hi!hi!");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("            00H00H00H00H00H00H00H00H00H             ", "000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                              0404hi!                                               ", "100", "100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404hi!                                               " + "'", str3, "                                              0404hi!                                               ");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("00000000000000000000000000000000000", "00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("10hi 1010 10", 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10hi 1010 10" });
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00hi!", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00hi!" + "'", str3, "00hi!");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "00h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("10hi!10hi!hi!", "00h00h00h00h00h00h00h00h00h", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "144i!144i!4i!" + "'", str3, "144i!144i!4i!");
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("00hi!", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                              0404hi!                                               ", 0, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                              0404hi!                                               " + "'", str3, "                                              0404hi!                                               ");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("            00H00H00H00H00H00H00H00H00H             ", "10                                                                                               1010                                                                                               10hi!", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("0000000000000000000000000000000000000000000000000000000000000000000000", "                                              0404HI!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str2, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("0!ih!ih01!ih010!ih!ih01!ih01hi!", "00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str2, "!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!ih!ih01!ih01", "00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("         1", 12, "                                              0404HI!                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          1 " + "'", str3, "          1 ");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!", "   ", 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                               10", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               10" + "'", str2, "                                                                                               10");
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("0000000000000000000000000000000000000000000000000000000000000000000000", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                              0404hi!                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                              0404hi!                                               " + "'", str1, "                                              0404hi!                                               ");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("0!ih!ih01!ih010!ih!ih01!ih01hi!", "Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 29 + "'", int2 == 29);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("10hi!10hi!hi!", "                                       10hi!10hi!hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("Hi!", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("000", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("000", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "000" + "'", str3, "000");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("10                                                                                               1010                                                                                               10hi!", "144i!144i!4i!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("100", "          1 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("!ih!ih01!ih01", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("00", "00h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                              0404HI!                                               ", "!ih!ih01!ih01", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10hi 1010 10", "                                                                                               10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "         1", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] {});
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                              0404hi!                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        int int1 = org.apache.commons.lang3.StringUtils.length("00");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("1", "          1 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("00hi!", '4');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "00hi!" });
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                       10hi!10hi!hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10" + "'", str2, "                                       10hi!10");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("            00h00h00h00h00h00h00h00h00h             ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("100", "!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("   ", (int) '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################   #########################" + "'", str3, "########################   #########################");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("00hi!", "00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        char[] charArray8 = new char[] { '#', ' ', '4', ' ', 'a', 'a' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("   ", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertArrayEquals(charArray8, new char[] { '#', ' ', '4', ' ', 'a', 'a' });
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("00", 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("10hi!10hi!hi!", (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("          1 ", "000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          1 " + "'", str2, "          1 ");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.lang.String[] strArray3 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) '#', 3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "1");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "00hi!" + "'", str11, "00hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertArrayEquals(strArray12, new java.lang.String[] { "0", "0", "hi!" });
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("########################   #########################", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################   #########################" + "'", str2, "########################   #########################");
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("         1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("            00h00h00h00h00h00h00h00h00h             ", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                       10hi!10", "00");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10" + "'", str2, "                                       10hi!10");
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str1, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00h00h00h00h00h00h00h00h00h", 0, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str3, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                               10", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("00h00h00h00h00h00h00h00h00h", "0404hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("10", "          1 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("          1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          1 " + "'", str1, "          1 ");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("                                       10hi!10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("            00h00h00h00h00h00h00h00h00h             ", "!ih!ih01!ih01");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str2, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                                 ", "0404hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("          1 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("10hi 1010 10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!", "                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 " + "'", str1, "                                                                                                 ");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("Hi!", "00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "00h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("00h", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                              0404HI!                                               ", "!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!", "!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444410" + "'", str2, "4444444410");
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("0404hi!", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("0404hi!", "1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.lang.String[] strArray4 = new java.lang.String[] { "10", "10", "hi!" };
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', (int) '#', 3);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "1");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("00hi!", "");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.stripAll(strArray15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("1", strArray11, strArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10", "10", "hi!" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "0", "0", "hi!" });
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "00hi!" + "'", str12, "00hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "00hi!" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "00hi!" });
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("10hi 1010 10", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10hi 1010 10" + "'", str2, "10hi 1010 10");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("144i!144i!4i!", "10hi 1010 10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                 ", "0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("100", "00h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("10", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("00000000000000000000000000000000000", "!ih!ih01!ih01", "            00h00h00h00h00h00h00h00h00h             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                              0404HI!                                               ", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              0404HI!                                               " + "'", str2, "                                              0404HI!                                               ");
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("00h00h00h00h00h00h00h00h00h", "            00H00H00H00H00H00H00H00H00H             ", "########################   #########################");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("100", 0, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "100" + "'", str3, "100");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("            00H00H00H00H00H00H00H00H00H             ", "          1 ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("10", "1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        int int1 = org.apache.commons.lang3.StringUtils.length("10hi 1010 10");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        int int1 = org.apache.commons.lang3.StringUtils.length("144i!144i!4i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 13 + "'", int1 == 13);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("   ", "                                              0404HI!                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("00hi!", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00hi!" + "'", str2, "00hi!");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00000000000000000000000000000000000" + "'", str1, "00000000000000000000000000000000000");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str1, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("00h00h00h00h00h00h00h00h00h", (int) (byte) 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str3, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                       10hi!10hi!hi!", "10                                                                                               1010                                                                                               10hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                       10hi!10hi!hi!" + "'", str2, "                                       10hi!10hi!hi!");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("10                                                                                               1010                                                                                               10hi!", "         1");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 191 + "'", int2 == 191);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hi!", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("0000000000000000000000000000000000000000000000000000000000000000000000", "                                              0404hi!                                               ", "00h00h00h00h00h00h00h00h00h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0000000000000000000000000000000000000000000000000000000000000000000000" + "'", str3, "0000000000000000000000000000000000000000000000000000000000000000000000");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("00hi!", "          1 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10hi!10hi!hi!" + "'", str1, "10hi!10hi!hi!");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("00000000000000000000000000000000000", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                       10hi!10", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                       10hi!10");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                       10HI!10" + "'", str1, "                                       10HI!10");
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!", "   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("         1", "000", (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("########################   #########################", "                                       10hi!10", "                                                                                               10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########################   #########################" + "'", str3, "########################   #########################");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("10                                                                                               1010                                                                                               10hi!", "0000000000000000000000000000000000000000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("00h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00H" + "'", str1, "00H");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("0000000000000000000000000000000000000000000000000000000000000000000000", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", 191, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("00000000000000000000000000000000000", (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("10", "0000000000000000000000000000000000000000000000000000000000000000000000", "                                              0404hi!                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10" + "'", str3, "10");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str2, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("0!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str1, "0!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih!ih01!ih010!ih!ih01!ih01hi!", "00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str2, "!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "                                       10hi!10hi!hi!", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("########################   #########################", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "########################   #########################" + "'", str2, "########################   #########################");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("4444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444410" + "'", str1, "4444444410");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("00h00h00h00h00h00h00h00h00h", "                                              0404HI!                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h00h00h00h00h00h00h00h00h" + "'", str2, "00h00h00h00h00h00h00h00h00h");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   ", 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444   " + "'", str3, "4444444   ");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "4444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("10hi!10hi!hi!", "1", 29, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "11" + "'", str4, "11");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("144i!144i!4i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("00h", "100");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00h" + "'", str2, "00h");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("########################   #########################", "!ih!ih01!ih010!ih!ih01!ih01hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("00hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00hi!" + "'", str2, "00hi!");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("00");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "00" + "'", str1, "00");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("100", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" + "'", str2, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100" + "'", str1, "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", "!", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                   ", "                                              0404hi!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("10                                                                                               1010                                                                                               10hi", "                                              0404hi!                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10                                                                                               1010                                                                                               10hi!" + "'", str1, "10                                                                                               1010                                                                                               10hi!");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("11", "44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "11" + "'", str2, "11");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("100", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("0!ih!ih01!ih010!ih!ih01!ih01hi!", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                                                                                 ", "0404hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!", "100", 0, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "100" + "'", str4, "100");
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("########################   #########################", "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410");
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("100", "00hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ih!ih01!ih010!ih!ih01!ih01hi!", (int) (short) 100, "4444444410");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444" + "'", str3, "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444410", "!ih!ih01!ih01", "00h");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("0404hi!", "                                       10HI!10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("            00h00h00h00h00h00h00h00h00h             ", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00" + "'", str2, "            00h00h00h00h00h00");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("00hi!", "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "00hi!" + "'", str2, "00hi!");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("10", "hi!", (int) (short) 10);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "10" });
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "10" + "'", str5, "10");
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("11", "                                       10hi!10", "                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "11" + "'", str3, "11");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("144i!144i!4i!", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!", "          1 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("00H", "00H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("00H", "                                                                                               10");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "11");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("          1 ", "1", "100100100100100100100100100100100100100100100100100100100100100100100100100100100100100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 " + "'", str3, "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("   ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("00h", "100");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih!ih01!ih010!ih!ih01!ih01hi!", 191, "11");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str3, "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("100", "44444444104444444410444444441044444!ih!ih01!ih010!ih!ih01!ih01hi!44444444104444444410444444441044444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("1", "                                       10HI!10");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "   ", 13);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("1", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertArrayEquals(strArray4, new java.lang.String[] { "Hi!" });
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                                       10hi!10hi!hi!", "00000000000000000000000000000000000");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("!ih!ih01!ih010!ih!ih01!ih01hi!", "4444444410");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!" + "'", str2, "!ih!ih01!ih010!ih!ih01!ih01hi!");
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("000", (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("11", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              11" + "'", str2, "                              11");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("10");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("         1", "            00h00h00h00h00h00h00h00h00h             ", (int) (byte) 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("00H", strArray2, strArray6);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "10" });
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "         1" });
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "         1" + "'", str8, "         1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "00H" + "'", str9, "00H");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!", (int) (short) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!                                                                                                 " + "'", str3, "Hi!                                                                                                 ");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("            00h00h00h00h00h00h00h00h00h             ", "10hi!10hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "            00h00h00h00h00h00h00h00h00h             " + "'", str2, "            00h00h00h00h00h00h00h00h00h             ");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("00H", "100");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("         1", (int) 'a', "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 4444444444444444444444         1" + "'", str3, "                                                                 4444444444444444444444         1");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                                                                 44444444444444444444444444444444444", "10hi!10hi!hi!", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 44444444444444444444444444444444444" + "'", str3, "                                                                 44444444444444444444444444444444444");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("   ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hi!", "000", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                                                 4444444444444444444444         1", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 4444444444444444444444         1" + "'", str2, "                                                                 4444444444444444444444         1");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                              11", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                              11" + "'", str2, "                              11");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("00H", "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", 2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H" + "'", str3, "00H!ih!ih01!ih010!ih!ih01!ih01hi!1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111100H");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111" + "'", str1, "!ih!ih01!ih010!ih!ih01!ih01hi!11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Hi!", "10                                                                                               1010                                                                                               10hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("                                                                 4444444444444444444444         1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                 4444444444444444444444         1" + "'", str1, "                                                                 4444444444444444444444         1");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("!", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                               10");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("hi!", "00000000000000000000000000000000000");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("10hi 1010 10", 0, "                                                                 44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10hi 1010 10" + "'", str3, "10hi 1010 10");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ", "         1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 " + "'", str2, "          100100100100100100100100100100100100100100100100100100100100100100100100100100100100100 ");
    }
}

